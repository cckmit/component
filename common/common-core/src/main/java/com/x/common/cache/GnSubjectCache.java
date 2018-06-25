package com.x.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.GnSubject;
import com.x.common.service.business.subject.IGnSubjectBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.GnSubjectUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.cache.base.AbstractCache;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.CollectionUtil;

/**
 * 科目编码和科目类型缓存类 <br>
 * 缓存key为subjectId 缓存对象融合了FUN_SUBJECT和FUN_SUBJECT_FUND <br>
 * Date: 2015年8月19日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
@Component
public class GnSubjectCache extends AbstractCache {

    private static final Logger logger = LogManager.getLogger(GnSubjectCache.class);

    @Autowired
    private IGnSubjectBusiSV funSubjectBusiSV;

    @Override
    public void write() throws Exception {
        List<GnSubject> funSubjectList = funSubjectBusiSV.queryGnSubject();
        if (CollectionUtil.isEmpty(funSubjectList)) {
            return;
        }
        List<ICacheClient> cacheClientList=new ArrayList<ICacheClient>();
        String[] areas=PaaSConfUtil.getAllSrvArea();
        if(areas!=null&&areas.length>0){
        	for(String srvarea:areas){
        		ICacheClient cacheClient=CacheFactoryUtil.getCacheClient(srvarea+"."+CacheNSMapper.CACHE_GN_SUBJECT);
        		cacheClientList.add(cacheClient);
        	}
        }
      
        Map<String, List<GnSubject>> subjectTypeMap = new HashMap<String, List<GnSubject>>();
        for (GnSubject funSubject : funSubjectList) {
            logger.debug("缓存GnSubject科目:行业{},租户ID{},科目ID{},名称{}", funSubject.getIndustryCode(),
                    funSubject.getTenantId(), funSubject.getSubjectId(),
                    funSubject.getSubjectName());
            String key1 = GnSubjectUtil.generateKey(funSubject.getIndustryCode(),
                    funSubject.getTenantId(), funSubject.getSubjectId());
           
            // 缓存key1数据
            for(ICacheClient cacheClient:cacheClientList){
               cacheClient.hset(CacheNSMapper.CACHE_GN_SUBJECT, key1, JSON.toJSONString(funSubject));
            }
            // 组装key2数据
            String key2 = GnSubjectUtil.generateKey(funSubject.getIndustryCode(),
                    funSubject.getTenantId(), funSubject.getSubjectType());
            if (!subjectTypeMap.containsKey(key2)) {
                List<GnSubject> subject = new ArrayList<GnSubject>();
                subjectTypeMap.put(key2, subject);
            }
            subjectTypeMap.get(key2).add(funSubject);
        }
        // 缓存key2
        for (Entry<String, List<GnSubject>> subjectTypeEntry : subjectTypeMap.entrySet()) {
            logger.debug("缓存GnSubject科目【按照科目类型缓存】行业+租户ID+科目类型{},科目数量{}", subjectTypeEntry.getKey(),
                    subjectTypeEntry.getValue().size());
            String key2 = subjectTypeEntry.getKey();
            for(ICacheClient cacheClient:cacheClientList){
            	cacheClient.hset(CacheNSMapper.CACHE_GN_SUBJECT, key2,JSON.toJSONString(subjectTypeEntry.getValue()));
            }
            
        }
    }

}

package com.x.common.cache;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.GnSubjectFund;
import com.x.common.service.business.subject.IGnSubjectBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.GnSubjectUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.cache.base.AbstractCache;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.CollectionUtil;

/**
 * 资金科目定义表FUN_SUBJECT_FUND <br>
 * 缓存key为subjectId 缓存对象FUN_SUBJECT_FUND <br>
 * Date: 2015年8月19日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
@Component
public class GnSubjectFundCache extends AbstractCache {

    private static final Logger logger = LogManager.getLogger(GnSubjectFundCache.class);

    @Autowired
    private IGnSubjectBusiSV funSubjectBusiSV;

    @Override
    public void write() throws Exception {
        List<GnSubjectFund> funSubjectFundList = funSubjectBusiSV.queryGnSubjectFund();
        if (CollectionUtil.isEmpty(funSubjectFundList)) {
            return;
        }
        List<ICacheClient> cacheClientList=new ArrayList<ICacheClient>();
        String[] areas=PaaSConfUtil.getAllSrvArea();
        if(areas!=null&&areas.length>0){
        	for(String srvarea:areas){
        		ICacheClient cacheClient=CacheFactoryUtil.getCacheClient(srvarea+"."+CacheNSMapper.CACHE_GN_SUBJECT_FUND);
        		cacheClientList.add(cacheClient);
        	}
        }
        for (GnSubjectFund funSubjectFund : funSubjectFundList) {
            logger.info("缓存GnSubjectFund资金科目定义:行业{},租户ID{},科目ID{}",
                    funSubjectFund.getIndustryCode(), funSubjectFund.getTenantId(),
                    funSubjectFund.getSubjectId());
            String key = GnSubjectUtil.generateKey(funSubjectFund.getIndustryCode(),
                    funSubjectFund.getTenantId(), funSubjectFund.getSubjectId());
            JSONObject subjectJson = JSON.parseObject(JSON.toJSONString(funSubjectFund));
            for(ICacheClient cacheClient:cacheClientList){
            	cacheClient.hset(CacheNSMapper.CACHE_GN_SUBJECT_FUND, key, subjectJson.toJSONString());
            }
        }
    }

}

package com.x.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.x.common.api.cache.param.SysParam;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.GnSysParam;
import com.x.common.dao.mapper.bo.GnSysParamCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.cache.base.AbstractCache;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.CollectionUtil;

@Component
public class GnSysParamCache extends AbstractCache {
   // private static final Logger logger = LogManager.getLogger(GnSysParamCache.class);

    @Override
    public void write() throws Exception {
        GnSysParamCriteria sql = new GnSysParamCriteria();
        sql.setOrderByClause(" dispord asc");
        List<GnSysParam> paramList = MapperFactory.getGnSysParamMapper().selectByExample(sql);
        if (CollectionUtil.isEmpty(paramList)) {
            return;
        }
        List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
        String[] areas=PaaSConfUtil.getAllSrvArea();
        if(areas!=null&&areas.length>0){
        	for(String srvarea:areas){
        		ICacheClient cacheClient=CacheFactoryUtil.getCacheClient(srvarea+"."+CacheNSMapper.CACHE_GN_SYS_PARAM);
        		cacheClientList.add(cacheClient);
        	}
        }
       
        Map<String, List<SysParam>> map = new HashMap<String, List<SysParam>>();

        for (GnSysParam gnSysParam : paramList) {
            SysParam sysParam = new SysParam();
            BeanUtils.copyProperties(sysParam, gnSysParam);
            String tenantId = gnSysParam.getTenantId();
            setSingleCache(cacheClientList, map, gnSysParam, sysParam, tenantId);
           
        }
        for (Map.Entry<String, List<SysParam>> entry : map.entrySet()) {
        	 for(ICacheClient cacheClient:cacheClientList){
        		  cacheClient.hset(CacheNSMapper.CACHE_GN_SYS_PARAM, entry.getKey(),JSON.toJSONString(entry.getValue()));
        	 }
          
        }
    }

    private void setSingleCache(List<ICacheClient> cacheClientList, Map<String, List<SysParam>> map,
            GnSysParam gnSysParam, SysParam sysParam, String tenantId) {
        StringBuilder keyOne = new StringBuilder();
        StringBuilder keyTwo;
        String strKeyOne;
        String strKeyTwo;
        strKeyOne = keyOne.append(gnSysParam.getTypeCode()).append(".")
                .append(gnSysParam.getParamCode()).append(".").append(tenantId).toString()
                .toUpperCase();
        keyTwo = new StringBuilder(keyOne);
        strKeyTwo = keyTwo.append(".").append(gnSysParam.getColumnValue()).toString().toUpperCase();
        if (!map.containsKey(strKeyOne)) {
            map.put(strKeyOne, new ArrayList<SysParam>());
        }
        map.get(strKeyOne).add(sysParam);
        for(ICacheClient cacheClient:cacheClientList){
        	 cacheClient.hset(CacheNSMapper.CACHE_GN_SYS_PARAM, strKeyTwo, JSON.toJSONString(sysParam));
        }
       
    }
}

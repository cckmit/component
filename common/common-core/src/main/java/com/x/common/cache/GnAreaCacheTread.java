package com.x.common.cache;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.GnArea;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;

public class GnAreaCacheTread extends Thread{
    private List<GnArea> resultList;
    List<ICacheClient> cacheClientList=new ArrayList<ICacheClient>();
    public GnAreaCacheTread(List<GnArea> resultList){
        this.resultList=resultList;
        String[] areas=PaaSConfUtil.getAllSrvArea();
        if(areas!=null&&areas.length>0){
        	for(String srvarea:areas){
        		ICacheClient cacheClient=CacheFactoryUtil.getCacheClient(srvarea+"."+CacheNSMapper.CACHE_GN_AREA);
        		cacheClientList.add(cacheClient);
        	}
        }
    }
    @Override
    public void run() {
        for (GnArea area : resultList) {          
            String key=area.getAreaCode().toUpperCase();
            for(ICacheClient cacheClient:cacheClientList){
            	cacheClient.hset(CacheNSMapper.CACHE_GN_AREA, key, JSON.toJSONString(area));
            }
        } 
        //System.out.println("【"+Thread.currentThread().getName()+"】");
    } 
}

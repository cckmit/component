package com.x.common.cache;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.GnServiceNum;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;

public class GnServiceNumCacheTread extends Thread{
    private List<GnServiceNum> resultList;
    List<ICacheClient> cacheClientList=new ArrayList<ICacheClient>();
    public GnServiceNumCacheTread(List<GnServiceNum> resultList){
        this.resultList=resultList;
        String[] areas=PaaSConfUtil.getAllSrvArea();
        if(areas!=null&&areas.length>0){
        	for(String srvarea:areas){
        		ICacheClient cacheClient=CacheFactoryUtil.getCacheClient(srvarea+"."+CacheNSMapper.CACHE_GN_SERVICE_NUM);
        		cacheClientList.add(cacheClient);
        	}
        }
    }
    @Override
    public void run() {
    	System.out.println("开始刷新缓存"+"【"+Thread.currentThread().getName()+"】");
        for (GnServiceNum svnum : resultList) {          
            String key=svnum.getServiceNumCode().toUpperCase();
            for(ICacheClient cacheClient:cacheClientList){
            	  cacheClient.hset(CacheNSMapper.CACHE_GN_SERVICE_NUM, key, JSON.toJSONString(svnum));
            }
        } 
        System.out.println("刷新缓存OK"+"【"+Thread.currentThread().getName()+"】");
    } 
}

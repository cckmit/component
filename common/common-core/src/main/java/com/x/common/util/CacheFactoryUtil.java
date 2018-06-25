package com.x.common.util;

import java.util.ArrayList;
import java.util.List;

import com.x.common.constants.CacheNSMapper;
import com.x.sdk.mcs.MCSClientFactory;
import com.x.sdk.mcs.interfaces.ICacheClient;

public final class CacheFactoryUtil {

    private CacheFactoryUtil() {
    }

    public static ICacheClient getCacheClient(String namespace) {
        return MCSClientFactory.getCacheClient(namespace);
    }

    public static List<ICacheClient> getCacheClientList(){
        List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
        String[] areas = PaaSConfUtil.getAllSrvArea();
        if (areas != null && areas.length > 0) {
            for (String srvarea : areas) {
                ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(
                        srvarea + "."+ CacheNSMapper.CACHE_SYS_DOMAIN_RULE);
                cacheClientList.add(cacheClient);
            }
        }
        return cacheClientList;
    }


}

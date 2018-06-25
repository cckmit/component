package com.x.common.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.x.common.api.region.key.RegionCacheKey;
import com.x.common.api.region.model.RegionInfo;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.GnRegion;
import com.x.common.service.atom.region.IGnRegionAtomSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.sdk.cache.base.AbstractCache;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;

/**
 * 刷新区域信息
 * Created by liutong on 16/12/9.
 */
@Component
public class GnRegionCache extends AbstractCache {
    private static final Logger logger = LoggerFactory.getLogger(GnRegionCache.class);
    @Autowired
    IGnRegionAtomSV gnRegionAtomSV;
    @Override
    public void write() throws Exception {
        logger.info("Start flush gnRegion cache");
        //查询所有行政区域信息
        List<GnRegion> regionList = gnRegionAtomSV.selectAllRegion();
        logger.info("regiontCount={}",regionList.size());
        //国家代码
        List<String> countryCodes = new ArrayList<>();
        //父子关系
        Map<String,List<String>> parentCodes = new HashMap<>();
        ICacheClient cacheClient= CacheFactoryUtil.getCacheClient(CacheNSMapper.CACHE_GN_REGION);
        //添加所有的区域
        for (GnRegion gnRegion:regionList){
            //如果是国家
            if (RegionCacheKey.RegionLevel.COUNTRY == gnRegion.getRegionLevel()){
                countryCodes.add(gnRegion.getRegionCode());
            }//进行父子检查
            else{
                List<String> chileCodes = parentCodes.get(gnRegion.getParentRegionCode());
                if (chileCodes==null) {
                    chileCodes = new ArrayList<>();
                    parentCodes.put(gnRegion.getParentRegionCode(),chileCodes);
                }
                chileCodes.add(gnRegion.getRegionCode());
            }

            RegionInfo regionInfo = new RegionInfo();
            BeanUtils.copyProperties(regionInfo,gnRegion);
            cacheClient.hset(RegionCacheKey.GN_REGION_INFO_KEY,gnRegion.getRegionCode(), JSON.toJSONString(regionInfo));
        }
        logger.info("countryCount={}",countryCodes.size());
        //添加国家,使用set，排除重复
        cacheClient.sadd(RegionCacheKey.GN_REGION_COUNTRY_KEY,countryCodes.toArray(new String[countryCodes.size()]));
        //添加父子关系
        for (Map.Entry<String,List<String>> entry:parentCodes.entrySet()){
            logger.info("parentCode:{},childNum:{}",entry.getKey(),entry.getValue().size());
            cacheClient.hset(RegionCacheKey.GN_REGION_PARENT_KEY,entry.getKey(),JSON.toJSONString(entry.getValue()));
        }
        logger.info("Stop flush gnRegion cache");
    }
}

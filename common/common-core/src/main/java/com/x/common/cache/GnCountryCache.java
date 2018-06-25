/**
 * 
 */
package com.x.common.cache;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.country.param.CountryRequest;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.GnCountry;
import com.x.common.service.business.country.IGnCountryBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.cache.base.AbstractCache;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.CollectionUtil;

/**
 * @Description: 写国家到缓存<br>
 * Date: 2016年11月28日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
@Component
public class GnCountryCache  extends AbstractCache {
	 private static final Logger logger = LoggerFactory.getLogger(GnCountryCache.class);
	@Autowired
	IGnCountryBusiSV gnCountryBusiSV;
	@Override
	public void write() throws Exception {
		List<GnCountry> list = gnCountryBusiSV.queryCountry(new CountryRequest());
		if (CollectionUtil.isEmpty(list)) {
            return;
        }
		logger.info("写入国家缓存开始");
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (!CollectionUtil.isEmpty(areas)) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_GN_COUNTRY);
				cacheClientList.add(cacheClient);
			}
		}
		String countryListStr = JSON.toJSONString(list);
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.COUNTRY_L_KEY,CacheKey.COUNTRY_L_KEY,countryListStr);
		}
		for(GnCountry country:list){
			String countryStr = JSON.toJSONString(country);
			String  id = String.valueOf(country.getId());
			String countryCode = country.getCountryValue();
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.COUNTRY_D_KEY,id,countryStr);
				cacheClient.hset(CacheKey.COUNTRY_D_KEY,countryCode,countryStr);
			}
		}
		logger.info("写入国家缓存结束");
	}

}

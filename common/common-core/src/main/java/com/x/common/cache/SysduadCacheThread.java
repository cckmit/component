package com.x.common.cache;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.SysDuad;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;

public class SysduadCacheThread extends Thread {
	
	

	private List<SysDuad> duads;

	private String orderType;

	List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();

	public SysduadCacheThread(List<SysDuad> duads, String orderType) {
		super();
		this.duads = duads;
		this.orderType = orderType;
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_DUAD_RULE);
				cacheClientList.add(cacheClient);
			}
		}
	}

	@Override
	public void run() {
		super.run();
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.DUAD_L_KEY, orderType,JSON.toJSONString(duads));
		}
		for (SysDuad duad : duads) {
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.DUAD_D_KEY, duad.getDuadId(),JSON.toJSONString(duad));
			}
		}

	}

}

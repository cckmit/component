package com.x.common.service.business.cacheserice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.constants.CacheNSMapper;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysPurpose;
import com.x.common.service.atom.syspurpose.ISysPurposeAtomSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.cache.base.AbstractCache;
import com.x.sdk.mcs.interfaces.ICacheClient;

/**
 * @Description: 写用途到缓存
 * @author auth
 * @date 2016年11月21日 下午3:45:22 
 * @version V1.0
 */
@Component
public class SysPurposeCaches extends AbstractCache{
	
	@Autowired
	private ISysPurposeAtomSV iSysPurposeAtomSV;

	@Override
	public void write() throws Exception {
		List<SysPurpose> purposes =	iSysPurposeAtomSV.querySysPurposeList(Constants.ZH_CN);
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_PURPOSE_RULE);
				cacheClientList.add(cacheClient);
			}
		}
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.PURPOSE_L_KEY, CacheKey.PURPOSE_L_KEY,JSON.toJSONString(purposes));
		}
		for(SysPurpose purpose:purposes){
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.PURPOSE_D_KEY, purpose.getPurposeId(),JSON.toJSONString(purpose));
			}
		}
	}

}

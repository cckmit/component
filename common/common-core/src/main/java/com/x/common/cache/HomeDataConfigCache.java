package com.x.common.cache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.cachekey.model.HomeDataConfig;
import com.x.common.constants.CacheNSMapper;
import com.x.common.dao.mapper.bo.SysConfig;
import com.x.common.service.atom.sysconfig.ISysConfigAtomSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.cache.base.AbstractCache;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;

/**
 * @Description: 写首页配置数据到缓存
 * @author auth
 * @date 2016年11月21日 下午4:00:45 
 * @version V1.0
 */
@Component
public class HomeDataConfigCache extends AbstractCache{
	
	@Autowired
	private ISysConfigAtomSV iSysConfigAtomSV;

	@Override
	public void write() throws Exception {
		SysConfig config =  iSysConfigAtomSV.selectOne();
		if(config!=null){
			HomeDataConfig hConfig = new HomeDataConfig();
			BeanUtils.copyProperties(hConfig, config);
			List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
			String[] areas = PaaSConfUtil.getAllSrvArea();
			if (areas != null && areas.length > 0) {
				for (String srvarea : areas) {
					ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_HOME_DATA_CONFIG_RULE);
					cacheClientList.add(cacheClient);
				}
			}
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.HOME_DATA_CONFIG_KEY, CacheKey.HOME_DATA_CONFIG_KEY,JSON.toJSONString(hConfig));
			}
		}
	}

}

package com.x.common.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.common.service.business.sysseomanager.impl.QuerySysSeoManagerBusiSVImpl;
import com.x.sdk.cache.base.AbstractCache;

/**
 * @Description: 写SEO到缓存
 * @author auth
 * @version V1.0
 */
@Component
public class SysSeoManagerCache extends AbstractCache{
	
	@Autowired
	private QuerySysSeoManagerBusiSVImpl iQuerySysSeoManagerBusiSVImpl;

	@Override
	public void write() throws Exception {
		iQuerySysSeoManagerBusiSVImpl.write();
	}
	
}

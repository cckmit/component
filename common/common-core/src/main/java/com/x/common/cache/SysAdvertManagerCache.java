package com.x.common.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.common.service.business.sysadvertmanager.impl.QuerySysAdvertManagerBusiSVImpl;
import com.x.sdk.cache.base.AbstractCache;

/**
 * @Description: 写SEO到缓存
 * @author auth
 * @version V1.0
 */
@Component
public class SysAdvertManagerCache extends AbstractCache{
	
	@Autowired
	private QuerySysAdvertManagerBusiSVImpl iQuerySysAdvertManagerBusiSVImpl;

	@Override
	public void write() throws Exception {
		iQuerySysAdvertManagerBusiSVImpl.write();
	}
	
}

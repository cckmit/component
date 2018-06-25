package com.x.common.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.common.service.business.syspurpose.impl.QuerySysPurposeBusiSVImpl;
import com.x.sdk.cache.base.AbstractCache;

/**
 * @Description: 写用途到缓存
 * @author auth
 * @date 2016年11月21日 下午3:45:22 
 * @version V1.0
 */
@Component
public class SysPurposeCache extends AbstractCache{
	
	@Autowired
	private QuerySysPurposeBusiSVImpl iQuerySysPurposeBusiSVImpl;

	@Override
	public void write() throws Exception {
		iQuerySysPurposeBusiSVImpl.write();
	}
	
}

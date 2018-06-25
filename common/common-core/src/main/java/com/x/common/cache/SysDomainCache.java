package com.x.common.cache;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.common.service.business.sysdomain.impl.IQuerySysDomainBusiSVImpl;
import com.x.sdk.cache.base.AbstractCache;

/**
 * @Description: 写领域到缓存
 * @author auth
 * @date 2016年11月21日 下午3:44:44 
 * @version V1.0
 */
@Component
public class SysDomainCache extends AbstractCache {
	
	@Autowired
	private IQuerySysDomainBusiSVImpl iQuerySysDomainBusiSVImpl;

	@Override
	public void write() throws Exception {
		iQuerySysDomainBusiSVImpl.write();
	}


}

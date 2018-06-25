package com.x.common.api.menu.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.menu.interfaces.ISysMenuQuerySV;
import com.x.common.api.menu.param.SysMenuListQueryRequest;
import com.x.common.api.menu.param.SysMenuListQueryResponse;
import com.x.common.service.business.menu.ISysMenuBusinessService;
import com.x.common.util.SystemValidateUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class SysMenuQueryImpl implements ISysMenuQuerySV {

	@Autowired
	ISysMenuBusinessService iSysMenuBusinessService;

	@Override
	public SysMenuListQueryResponse queryMenuByUserId(SysMenuListQueryRequest request)
			throws BusinessException, SystemException {
		SystemValidateUtil.validateCompleteSysMenu(request);
		return iSysMenuBusinessService.queryMenuByUserId(request);
	}
	
	


}

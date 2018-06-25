package com.x.common.api.office.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseInfo;
import com.x.common.api.office.interfaces.ISysOfficeQuerySV;
import com.x.common.api.office.param.OfficeAllQueryResponse;
import com.x.common.api.office.param.OfficeChildrenListQueryRequest;
import com.x.common.api.office.param.OfficeChildrenListQueryResponse;
import com.x.common.api.office.param.OfficeDetailQueryRequest;
import com.x.common.api.office.param.OfficeDetailQueryResponse;
import com.x.common.api.office.param.OfficeParentListQueryRequest;
import com.x.common.api.office.param.OfficeParentListQueryResponse;
import com.x.common.service.business.office.ISysOfficeBusinessService;
import com.x.common.util.SystemValidateUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class SysOfficeQueryImpl implements ISysOfficeQuerySV {

	@Autowired
	ISysOfficeBusinessService iSysofficeBusinessService;
	
	@Override
	public OfficeDetailQueryResponse queryOfficeDetail(OfficeDetailQueryRequest queryRequest) throws BusinessException,
			SystemException {
		SystemValidateUtil.validateQueryOfficeDetail(queryRequest);
		return iSysofficeBusinessService.queryOfficeDetail(queryRequest);
	}

	@Override
	public OfficeParentListQueryResponse queryParentOfficeList(
			OfficeParentListQueryRequest queryRequest)
			throws BusinessException, SystemException {
		SystemValidateUtil.validateQueryParentOfficeList(queryRequest);
		return iSysofficeBusinessService.queryParentOfficeList(queryRequest);
	}

	@Override
	public OfficeChildrenListQueryResponse queryChildrenOfficeList(
			OfficeChildrenListQueryRequest queryRequest)
			throws BusinessException, SystemException {
		SystemValidateUtil.validateQueryChildrenOfficeList(queryRequest);
		return iSysofficeBusinessService.queryChildrenOfficeList(queryRequest);
	}

	@Override
	public OfficeAllQueryResponse queryOfficeAll(BaseInfo queryRequest)
			throws BusinessException, SystemException {
		SystemValidateUtil.validateQueryOfficeAll(queryRequest);
		return iSysofficeBusinessService.queryOfficeAll(queryRequest);
	}


}

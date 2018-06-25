package com.x.common.api.waitjobs.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.waitjobs.interfaces.ISysWaitjobsMangeSV;
import com.x.common.api.waitjobs.param.WaitjobsCompleteRequset;
import com.x.common.api.waitjobs.param.WaitjobsInsertRequest;
import com.x.common.api.waitjobs.param.WaitjobsInsertResponse;
import com.x.common.service.business.waitjobs.ISysWaitjobsBusinessService;
import com.x.common.util.SystemValidateUtil;
import com.alibaba.dubbo.config.annotation.Service;

@Service
@Component
public class SysWaitjobsMangeImpl implements ISysWaitjobsMangeSV{

	@Autowired
	ISysWaitjobsBusinessService iSysWaitjobsBusinessService;
	
	@Override
	public WaitjobsInsertResponse insertWaitjobs(WaitjobsInsertRequest insertRequest) throws BusinessException,SystemException {
		SystemValidateUtil.validateInsertWaitjobs(insertRequest);
		return iSysWaitjobsBusinessService.insertWaitjobs(insertRequest);
	}

	@Override
	public BaseResponse completeWaitjobs(WaitjobsCompleteRequset completeRequest)throws BusinessException, SystemException {
		SystemValidateUtil.validateCompleteWaitjobs(completeRequest);
		return iSysWaitjobsBusinessService.completeWaitjobs(completeRequest);
	}

}

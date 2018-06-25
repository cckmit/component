package com.x.common.api.sysMail.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysmail.interfaces.ISysMailSV;
import com.x.common.api.sysmail.param.SysMailCountResponse;
import com.x.common.api.sysmail.param.SysMailInfo;
import com.x.common.api.sysmail.param.SysMailPageQueryResponse;
import com.x.common.api.sysmail.param.SysMailRequest;
import com.x.common.service.business.sysmail.impl.SysMailBusiServiceImpl;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;
@Service
@Component
public class SysMailSVImpl implements ISysMailSV {
	
	@Autowired
	private SysMailBusiServiceImpl sysMailBusiSV;
	
	@Override
	public SysMailPageQueryResponse getSysMailPageList(SysMailRequest request)
			throws BusinessException, SystemException {
		SysMailPageQueryResponse response = new SysMailPageQueryResponse();
		if(StringUtil.isBlank(request.getUserId())){
			throw new BusinessException("用户ID不能为空");
		}
		try {
			PageInfo<SysMailInfo> pageInfo = sysMailBusiSV.getSysMailPageList(request);
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "查询消息成功"));
			response.setPageInfo(pageInfo);
		} catch (Exception e) {
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "查询消息失败"));
		}
		return response;
	}

	@Override
	public BaseResponse updateSysMail(SysMailRequest request)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		if(StringUtil.isBlank(request.getId())){
			throw new BusinessException("消息ID不能为空");
		}
		try {
			sysMailBusiSV.updateSysMail(request);
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "更新消息成功"));
		} catch (Exception e) {
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "更新消息失败"));
		}
		
		return response;
	}

	@Override
	public BaseResponse batchDelSysMail(SysMailRequest request)
			throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		if(CollectionUtil.isEmpty(request.getMailIds())) {
			throw new BusinessException("消息ID不能为空");
		}
		try {
			sysMailBusiSV.deleteSysMail(request);
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "删除消息成功"));
		} catch (Exception e) {
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "删除消息失败"));
		}
		return response;
	}

	@Override
	public SysMailCountResponse count(SysMailRequest request) throws BusinessException,
			SystemException {
		SysMailCountResponse response = new SysMailCountResponse();
		try {
			int count = sysMailBusiSV.count(request);
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "删除消息成功"));
			response.setCount(String.valueOf(count));
		} catch (Exception e) {
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "删除消息失败"));
		}
		return response;
	}

}

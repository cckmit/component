package com.x.common.api.sysmailinformation.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysmailinformation.interfaces.ISysMailInformationSV;
import com.x.common.api.sysmailinformation.param.InvoiceMailQueryResponse;
import com.x.common.api.sysmailinformation.param.MailInfoResponse;
import com.x.common.api.sysmailinformation.param.MailInformationDeleteRequest;
import com.x.common.api.sysmailinformation.param.MailInformationQueryRequest;
import com.x.common.api.sysmailinformation.param.MailInformationRequest;
import com.x.common.dao.mapper.bo.SysMailInformation;
import com.x.common.service.atom.sysmailinformation.ISysMailInformationAtomSV;
import com.x.common.service.business.sysmailinformation.ISysMailInformationBusiSV;
import com.x.common.util.VoValidateUtils;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.StringUtil;

@Service
@Component
public class SysMailInformationImplSV implements ISysMailInformationSV {
	
	private static final Logger logger=LoggerFactory.getLogger(SysMailInformationImplSV.class);
	
	@Autowired
	private ISysMailInformationBusiSV sysMailInformationBusiSV;
	@Autowired
	private ISysMailInformationAtomSV informationAtomSV;

	@Override
	public BaseResponse save(MailInformationRequest request) throws BusinessException, SystemException {
		//参数校验
		VoValidateUtils.validateSysMailInformationSave(request);
		//
		BaseResponse response = new BaseResponse();
		sysMailInformationBusiSV.save(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "保存成功"));
		return response;
	}

	@Override
	public BaseResponse modify(MailInformationRequest request) throws BusinessException, SystemException {
		//参数校验
		VoValidateUtils.validateSysMailInformationSave(request);
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("邮寄信息ID不能为空");
		}
		BaseResponse response=new BaseResponse();
		//根据id查询邮寄信息
		SysMailInformation mailInformation = informationAtomSV.query(request.getId());
		if(mailInformation==null) {
			logger.error("邮寄信息为空,邮寄id:"+request.getId());
			throw new BusinessException("邮寄信息为空");
		}
		BeanUtils.copyProperties(mailInformation, request);
		//
		sysMailInformationBusiSV.modify(mailInformation);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "修改成功"));
		return response;
	}

	@Override
	public BaseResponse delete(MailInformationDeleteRequest request) throws BusinessException, SystemException {
		//
		if (null==request) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("邮寄信息ID不能为空");
		}
		BaseResponse response=new BaseResponse();
		//
		sysMailInformationBusiSV.delete(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "删除成功"));
		return response;
	}

	@Override
	public InvoiceMailQueryResponse queryList(MailInformationQueryRequest request)
			throws BusinessException, SystemException {
		if (null==request) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException("用户ID不能为空");
		}
		InvoiceMailQueryResponse response=sysMailInformationBusiSV.queryList(request.getUserId());
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询成功"));
		return response;
	}

	@Override
	public MailInfoResponse query(MailInformationDeleteRequest request) throws BusinessException, SystemException {
		if (null==request) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("邮寄信息ID不能为空");
		}
		MailInfoResponse response=sysMailInformationBusiSV.query(request.getId());
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询成功"));
		return response;
	}
}

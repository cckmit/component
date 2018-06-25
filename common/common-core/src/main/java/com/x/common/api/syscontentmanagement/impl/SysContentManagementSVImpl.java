package com.x.common.api.syscontentmanagement.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.syscontentmanagement.interfaces.ISysContentManagementSV;
import com.x.common.api.syscontentmanagement.param.ContentQueryDetailRequest;
import com.x.common.api.syscontentmanagement.param.ContentQueryDetailResponse;
import com.x.common.api.syscontentmanagement.param.ContentQueryListRequest;
import com.x.common.api.syscontentmanagement.param.ContentQueryListResponse;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckRequest;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckResponse;
import com.x.common.api.syscontentmanagement.param.ContentSubmitRequest;
import com.x.common.service.business.syscontentmanagement.ISysContentManagementBusiSV;
import com.x.common.util.VoValidateUtils;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.StringUtil;
@Service
@Component
public class SysContentManagementSVImpl implements ISysContentManagementSV {
	
	private static final Logger log=LoggerFactory.getLogger(SysContentManagementSVImpl.class);
	
	@Autowired
	private ISysContentManagementBusiSV contentManagementBusiSV;

	@Override
	public ContentQueryListResponse queryList(ContentQueryListRequest request)
			throws BusinessException, SystemException {
		// 参数校验
		if (null==request) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (request.getPageNo()==null || (request.getPageNo()!=null && request.getPageNo()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageNo不能为空且必须大于0");
		}
		if (request.getPageSize()==null || (request.getPageSize()!=null && request.getPageSize()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageSize不能为空且必须大于0");
		}
		// 2.查询一级标题列表信息
		ContentQueryListResponse response=contentManagementBusiSV.queryList(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询列表成功"));
		return response;
	}

	@Override
	public ContentQueryDetailResponse queryDetail(ContentQueryDetailRequest request)
			throws BusinessException, SystemException {
		// 参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("一级标题id不能为空");
		}
		ContentQueryDetailResponse response=contentManagementBusiSV.queryDetail(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询成功"));
		return response;
	}

	@Override
	public BaseResponse save(ContentSubmitRequest request) throws BusinessException, SystemException {
		// 参数校验
		VoValidateUtils.validateContentSubmitRequest(request);
		if(StringUtil.isBlank(request.getAditor())) {
			throw new BusinessException("创建人不能为空");
		}
		BaseResponse response=new BaseResponse();
		try {
			contentManagementBusiSV.save(request);
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "保存成功"));
		}catch(BusinessException e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					e.getErrorCode(), e.getErrorMessage()));
		}catch (Exception e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "添加内容管理信息失败"));
		}
		return response;
	}

	@Override
	public BaseResponse edit(ContentSubmitRequest request) throws BusinessException, SystemException {
		// 参数校验
		VoValidateUtils.validateContentSubmitRequest(request);
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("二级标题id不能为空");
		}
		BaseResponse response=new BaseResponse();
		try {
			contentManagementBusiSV.edit(request);
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "编辑成功"));
		}catch(BusinessException e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					e.getErrorCode(), e.getErrorMessage()));
		}catch (Exception e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "编辑内容管理信息失败"));
		}
		return response;
	}

	@Override
	public BaseResponse delete(ContentQueryDetailRequest request) throws BusinessException, SystemException {
		// 参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("二级标题id不能为空");
		}
		BaseResponse response=new BaseResponse();
		try {
			contentManagementBusiSV.delete(request.getId());
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "删除成功"));
		}catch(BusinessException e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					e.getErrorCode(), e.getErrorMessage()));
		}catch (Exception e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "删除内容管理信息失败"));
		}
		return response;
	}

	@Override
	public ContentSortCheckResponse duplicateCheck(ContentSortCheckRequest request)
			throws BusinessException, SystemException {
		// 参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		ContentSortCheckResponse response=contentManagementBusiSV.duplicateCheck(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "校验成功"));
		return response;
	}

}

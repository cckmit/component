package com.x.common.api.systitle.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.systitle.interfaces.ISysTitleSV;
import com.x.common.api.systitle.param.QueryTitleRequest;
import com.x.common.api.systitle.param.TitleQueryDetailRequest;
import com.x.common.api.systitle.param.TitleQueryDetailResponse;
import com.x.common.api.systitle.param.TitleQueryListRequest;
import com.x.common.api.systitle.param.TitleQueryListResponse;
import com.x.common.api.systitle.param.TitleQueryResponse;
import com.x.common.api.systitle.param.TitleSortCheckRequest;
import com.x.common.api.systitle.param.TitleSortCheckResponse;
import com.x.common.api.systitle.param.TitleSubmitRequest;
import com.x.common.service.business.systitle.ISysTitleBuiSV;
import com.x.common.util.VoValidateUtils;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.StringUtil;

@Service
@Component
public class SysTitleSVImpl implements ISysTitleSV {
	
	private static final Logger log=LoggerFactory.getLogger(SysTitleSVImpl.class);
	
	@Autowired
	private ISysTitleBuiSV sysTitleBuiSV;
	
	@Override
	public TitleQueryListResponse queryList(TitleQueryListRequest request) 
			throws BusinessException,SystemException {
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
		TitleQueryListResponse response=sysTitleBuiSV.queryList(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询列表成功"));
		return response;
	}

	@Override
	public TitleQueryDetailResponse queryDetail(TitleQueryDetailRequest request) 
			throws BusinessException,SystemException{
		// 参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("一级标题id不能为空");
		}
		TitleQueryDetailResponse response=sysTitleBuiSV.queryDetail(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询成功"));
		return response;
	}

	@Override
	public BaseResponse save(TitleSubmitRequest request) throws BusinessException, SystemException {
		// 参数校验
		VoValidateUtils.validateSysTitleRequest(request);
		if(StringUtil.isBlank(request.getAditor())) {
			throw new BusinessException("创建人不能为空");
		}
		BaseResponse response=new BaseResponse();
		try {
			sysTitleBuiSV.save(request);
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "保存成功"));
		}catch(BusinessException e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					e.getErrorCode(), e.getErrorMessage()));
		}catch (Exception e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "添加一级标题失败"));
		}
		return response;
	}

	@Override
	public BaseResponse edit(TitleSubmitRequest request) throws BusinessException, SystemException {
		// 参数校验
		VoValidateUtils.validateSysTitleRequest(request);
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("一级标题id不能为空");
		}
		BaseResponse response=new BaseResponse();
		try {
			sysTitleBuiSV.edit(request);
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "编辑成功"));
		}catch(BusinessException e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					e.getErrorCode(), e.getErrorMessage()));
		}catch (Exception e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "修改一级标题失败"));
		}
		return response;
	}

	@Override
	public BaseResponse delete(TitleQueryDetailRequest request) throws BusinessException, SystemException {
		// 参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("一级标题id不能为空");
		}
		BaseResponse response=new BaseResponse();
		try {
			sysTitleBuiSV.delete(request.getId());
			response.setResponseHeader(new ResponseHeader(true, 
					ExceptionCodeConstant.SUCCESS, "删除成功"));
		}catch(BusinessException e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					e.getErrorCode(), e.getErrorMessage()));
		}catch (Exception e) {
			log.error(e.getMessage());
			response.setResponseHeader(new ResponseHeader(false, 
					ExceptionCodeConstant.SYSTEM_ERROR, "删除一级标题失败"));
		}
		return response;
	}

	@Override
	public TitleSortCheckResponse duplicateCheck(TitleSortCheckRequest request)
			throws BusinessException, SystemException {
		// 参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		TitleSortCheckResponse response=sysTitleBuiSV.duplicateCheck(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "校验成功"));
		return response;
	}

	@Override
	public TitleQueryResponse queryTitle(QueryTitleRequest request) throws BusinessException, SystemException {
		// 参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		TitleQueryResponse response=sysTitleBuiSV.queryTitle(request.getRegionalLanguage());
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询成功"));
		return response;
	}

}

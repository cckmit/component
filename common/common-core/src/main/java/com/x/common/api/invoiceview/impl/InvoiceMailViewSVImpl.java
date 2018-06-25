package com.x.common.api.invoiceview.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.invoiceview.interfaces.IInvoiceMailViewSV;
import com.x.common.api.invoiceview.param.InvoiceMailViewRequest;
import com.x.common.api.invoiceview.param.InvoiceMailViewResponse;
import com.x.common.api.invoiceview.param.InvoiceOrderViewResponse;
import com.x.common.service.business.invoiceview.IInvoiceMailViewBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.StringUtil;
@Service
@Component
public class InvoiceMailViewSVImpl implements IInvoiceMailViewSV {
	
	@Autowired
	private IInvoiceMailViewBusiSV invoiceMailViewBusiSV;
	
	@Override
	public InvoiceMailViewResponse view(InvoiceMailViewRequest request) throws BusinessException, SystemException {
		//参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getCorporaId()) && 
				StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException("企业id和用户id不能都为空");
		}
		if(!StringUtil.isBlank(request.getCorporaId()) && 
				!StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException("企业id和用户id不能都存在");
		}
		if (request.getPageNo()==null || (request.getPageNo()!=null && request.getPageNo()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageNo不能为空且必须大于0");
		}
		if (request.getPageSize()==null || (request.getPageSize()!=null && request.getPageSize()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageSize不能为空且必须大于0");
		}
		//
		InvoiceMailViewResponse response = invoiceMailViewBusiSV.view(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询成功"));
		return response;
	}

	@Override
	public InvoiceOrderViewResponse load(InvoiceMailViewRequest request) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getCorporaId()) && 
				StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException("企业id和用户id不能都为空");
		}
		if(!StringUtil.isBlank(request.getCorporaId()) && 
				!StringUtil.isBlank(request.getUserId())) {
			throw new BusinessException("企业id和用户id不能都存在");
		}
		if (request.getPageNo()==null || (request.getPageNo()!=null && request.getPageNo()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageNo不能为空且必须大于0");
		}
		if (request.getPageSize()==null || (request.getPageSize()!=null && request.getPageSize()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageSize不能为空且必须大于0");
		}
		InvoiceOrderViewResponse response=invoiceMailViewBusiSV.load(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询成功"));
		return response;
	}

}

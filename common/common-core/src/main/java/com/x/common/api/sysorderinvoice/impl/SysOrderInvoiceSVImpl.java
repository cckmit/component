package com.x.common.api.sysorderinvoice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysorderinvoice.interfaces.ISysOrderInvoiceSV;
import com.x.common.api.sysorderinvoice.param.InvoiceBatchInspectRequest;
import com.x.common.api.sysorderinvoice.param.InvoiceBillMailRequest;
import com.x.common.api.sysorderinvoice.param.InvoicePlatformApplyRequest;
import com.x.common.api.sysorderinvoice.param.InvoicePlatformApplyResponse;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceApplyRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceInspectRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryDetailRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryDetailResponse;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryResponse;
import com.x.common.service.business.sysorderinvoice.ISysOrderInvoiceBusiSV;
import com.x.common.util.VoValidateUtils;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;
@Service
@Component
public class SysOrderInvoiceSVImpl implements ISysOrderInvoiceSV {
	
	@Autowired
	private ISysOrderInvoiceBusiSV sysOrderInvoiceBusiSV;

	@Override
	public OrderInvoiceQueryResponse queryList(OrderInvoiceQueryRequest request)
			throws BusinessException, SystemException {
		// 参数校验
		VoValidateUtils.validateSysInvoiceQueryList(request);
		// 
		OrderInvoiceQueryResponse response=sysOrderInvoiceBusiSV.queryList(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询列表成功"));
		return response;
	}

	@Override
	public BaseResponse apply(OrderInvoiceApplyRequest request) throws BusinessException, SystemException {
		// 简单参数校验(订单个数.订单状态是否满足要求前台校验)
		VoValidateUtils.validateSysInvoiceApply(request);
		BaseResponse response=new BaseResponse();
		//
		sysOrderInvoiceBusiSV.apply(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "保存成功"));
		return response;
	}
	

	@Override
	public OrderInvoiceQueryDetailResponse queryDetail(OrderInvoiceQueryDetailRequest request)
			throws BusinessException, SystemException {
		//参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getInvoiceId())) {
			throw new BusinessException("订单发票号不能为空");
		}
		//发票信息查询 
		OrderInvoiceQueryDetailResponse response=sysOrderInvoiceBusiSV.queryDetail(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询详情成功"));
		return response;
	}

	@Override
	public BaseResponse inspect(OrderInvoiceInspectRequest request) throws BusinessException, SystemException {
		// 参数校验
		VoValidateUtils.validateSysInvoiceInspect(request);
		BaseResponse response=new BaseResponse();
		sysOrderInvoiceBusiSV.inspect(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "信息更改成功"));
		return response;
	}

	@Override
	public BaseResponse batchInspect(InvoiceBatchInspectRequest request) throws BusinessException, SystemException {
		// 参数校验
		if (null==request) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(request.getAditor())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "审核人不能为空");
		}
		if(StringUtil.isBlank(request.getInspectSign())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "通过或锁定标识不能为空");
		}
		List<String> invoiceIds = request.getInvoiceIds();
		if(CollectionUtil.isEmpty(invoiceIds)) {
			throw new BusinessException("订单发票号不能为空");
		}
		BaseResponse response=new BaseResponse();
		sysOrderInvoiceBusiSV.batchInspect(invoiceIds,request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "批量通过成功"));
		return response;
	}

	@Override
	public InvoicePlatformApplyResponse platformApply(InvoicePlatformApplyRequest request) throws BusinessException, SystemException {
		// 参数校验 
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getOrderNumber())) {
			throw new BusinessException("订单号不能为空");
		}
		if(StringUtil.isBlank(request.getProposer())) {
			throw new BusinessException("申请人不能为空");
		}
		if(StringUtil.isBlank(request.getInvoiceType())) {
			throw new BusinessException("发票类型不能为空");
		}
		InvoicePlatformApplyResponse response=sysOrderInvoiceBusiSV.platformApply(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "信息新增成功"));
		return response;
	}

	@Override
	public BaseResponse invoiceBillMail(InvoiceBillMailRequest request) throws BusinessException, SystemException {
		// 参数检验
		VoValidateUtils.validateInvoiceBillMailRequest(request);
		BaseResponse response=new BaseResponse();
		sysOrderInvoiceBusiSV.invoiceBillMail(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "保存成功"));
		return response;
	}
}

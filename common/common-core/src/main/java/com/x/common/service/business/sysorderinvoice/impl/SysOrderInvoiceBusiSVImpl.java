package com.x.common.service.business.sysorderinvoice.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.exception.BusinessException;
import com.x.base.vo.PageInfo;
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
import com.x.common.api.sysorderinvoice.param.SysOrdInvoiceSearchInfo;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysMailInformation;
import com.x.common.dao.mapper.bo.SysOrderInvoice;
import com.x.common.service.atom.sysmailinformation.ISysMailInformationAtomSV;
import com.x.common.service.atom.sysorderinvoice.ISysOrderInvoiceAtomSV;
import com.x.common.service.business.sysorderinvoice.ISysOrderInvoiceBusiSV;
import com.x.common.util.SequenceUtil;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.DateUtil;
import com.x.sdk.util.StringUtil;

@Service
@Transactional
public class SysOrderInvoiceBusiSVImpl implements ISysOrderInvoiceBusiSV {
	
	private static final Logger logger = LoggerFactory.getLogger(SysOrderInvoiceBusiSVImpl.class);
	
	@Autowired
	private ISysOrderInvoiceAtomSV sysOrderInvoiceAtomSV;
	@Autowired
	private ISysMailInformationAtomSV mailInformationAtomSV;
	
	@Override
	public OrderInvoiceQueryResponse queryList(OrderInvoiceQueryRequest request) {
		logger.info("订单发票列表查看......");
		OrderInvoiceQueryResponse response=new OrderInvoiceQueryResponse();
		PageInfo<SysOrdInvoiceSearchInfo> pageInfo=new PageInfo<SysOrdInvoiceSearchInfo>();
		//查询数量
		int count = sysOrderInvoiceAtomSV.count(request);
		//反馈信息
		List<SysOrdInvoiceSearchInfo> result=new ArrayList<SysOrdInvoiceSearchInfo>();
		List<SysOrderInvoice> queryList = sysOrderInvoiceAtomSV.queryList(request);
		if(!CollectionUtil.isEmpty(queryList)) {
			for (SysOrderInvoice sysOrderInvoice : queryList) {
				SysOrdInvoiceSearchInfo info=new SysOrdInvoiceSearchInfo();
				BeanUtils.copyProperties(info, sysOrderInvoice);
				result.add(info);
			}
		}
		pageInfo.setCount(count);
		//总页数
		pageInfo.setPageCount((count + request.getPageSize() - 1) / request.getPageSize());
		pageInfo.setPageNo(request.getPageNo());
		pageInfo.setPageSize(request.getPageSize());
		pageInfo.setResult(result);
		response.setPageInfo(pageInfo);
		return response;
	}

	@Override
	public void apply(OrderInvoiceApplyRequest request) {
		// 订单号拆分校验是否存在已经开具发票
		String orderNumber = request.getOrderNumber();
		String[] orderAttrays = orderNumber.split(",");
		for (String orderId : orderAttrays) {
			//
			decideInvoiceState(orderId,"");
		}
		//查询邮寄信息
		SysMailInformation information = mailInformationAtomSV.query(request.getId());
		if(information==null) {
			logger.error("邮寄信息为空,邮寄信息id:"+request.getId());
			throw new BusinessException("邮寄信息为空");
		}
		// 
		SysOrderInvoice orderInvoice=new SysOrderInvoice();
		BeanUtils.copyProperties(orderInvoice, information);
		BeanUtils.copyProperties(orderInvoice, request);
		//
		String invoiceId = SequenceUtil.createSysOrderInvoiceId();
		orderInvoice.setInvoiceId(invoiceId);
		//邮寄信息id
		orderInvoice.setMailInformationId(information.getId());
		orderInvoice.setCreateTime(DateUtil.getSysDate());
		orderInvoice.setProposer(request.getUsername());
		orderInvoice.setState(Constants.InvoiceState.PENDING_AUDIT);
		// 
		sysOrderInvoiceAtomSV.insert(orderInvoice);
		//更新订单发票状态--避免远程异常
		for (String orderId : orderAttrays) {
			this.updateInvoiceState(orderId,Constants.FrontInvoiceState.FRONT_BILLING);
		}
	}

	@Override
	public OrderInvoiceQueryDetailResponse queryDetail(OrderInvoiceQueryDetailRequest request) {
		//
		logger.info("订单发票详情查看......");
		OrderInvoiceQueryDetailResponse resp=new OrderInvoiceQueryDetailResponse();
		String invoiceId = request.getInvoiceId();
		SysOrderInvoice invoice=sysOrderInvoiceAtomSV.selectById(invoiceId);
		if(invoice==null) {
			logger.error("订单发票信息为空,订单发票id:"+invoiceId);
			throw new BusinessException("订单发票信息为空");
		}
		BeanUtils.copyProperties(resp, invoice);
		return resp;
	}

	@Override
	public void inspect(OrderInvoiceInspectRequest request) {
		//
		String invoiceId = request.getInvoiceId();
		String state = request.getState();
		Timestamp sysDate = DateUtil.getSysDate();
		SysOrderInvoice invoice=sysOrderInvoiceAtomSV.selectById(invoiceId);
		BeanUtils.copyProperties(invoice, request);
		//待审核-审核通过
		if(Constants.InvoiceState.PENDING_AUDIT.equals(state) &&
				Constants.InspectSign.AUDITED.equals(request.getInspectSign())) {
			invoice.setState(Constants.InvoiceState.PENDING_BILLING);
			invoice.setAuditTime(sysDate);
		}else if(Constants.InvoiceState.PENDING_AUDIT.equals(state) &&
				Constants.InspectSign.NOT_AUDITED.equals(request.getInspectSign())) {
			//待审核--审核不通过
			invoice.setState(Constants.InvoiceState.LOCKING);
			invoice.setAuditTime(sysDate);
			//审核不通过,订单中的发票状态改回前台待开票状态
			updateInvoiceState(invoice.getOrderNumber(), Constants.FrontInvoiceState.FRONT_PENDING_BILLING);
		}else if(Constants.InvoiceState.PENDING_BILLING.equals(state)) {
			//待开票
			invoice.setState(Constants.InvoiceState.TO_POST);
			invoice.setBillingTime(sysDate);
		}else if(Constants.InvoiceState.TO_POST.equals(state)) {
			//待邮寄
			invoice.setState(Constants.InvoiceState.COMPLETED);
			//订单中的发票状态改为前台已开票
			updateInvoiceState(invoice.getOrderNumber(), Constants.FrontInvoiceState.FRONT_INVOICED);
		}
		sysOrderInvoiceAtomSV.update(invoice);
	}

	@Override
	public void batchInspect(List<String> invoiceIds,InvoiceBatchInspectRequest request) {
		for (String id : invoiceIds) {
			SysOrderInvoice orderInvoice = sysOrderInvoiceAtomSV.selectById(id);
			//信息判断
			infoValidate(orderInvoice,id);
			//更新状态
			if(Constants.InspectSign.AUDITED.equals(request.getInspectSign())) {
				orderInvoice.setState(Constants.InvoiceState.PENDING_BILLING);
			}else if(Constants.InspectSign.NOT_AUDITED.equals(request.getInspectSign())) {
				orderInvoice.setState(Constants.InvoiceState.LOCKING);
				//审核不通过,订单中的发票状态改回前台待开票状态
				updateInvoiceState(orderInvoice.getOrderNumber(), 
						Constants.FrontInvoiceState.FRONT_PENDING_BILLING);
			}
			orderInvoice.setAuditTime(DateUtil.getSysDate());
			orderInvoice.setAditor(request.getAditor());
			sysOrderInvoiceAtomSV.update(orderInvoice);
		}
	}
	
	
	@Override
	public InvoicePlatformApplyResponse platformApply(InvoicePlatformApplyRequest request) {
		InvoicePlatformApplyResponse response=new InvoicePlatformApplyResponse();
		String orderNumber = request.getOrderNumber();
		String[] orderAttrays = orderNumber.split(",");
		//总费用
		long totalFee=0l;
		for (String orderId : orderAttrays) {
			//校验订单格式
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(orderId);
		   if( !isNum.matches() ){
			   throw new BusinessException("输入的订单信息格式有误.");
		   }else {
			   long paidFee = decideInvoiceState(orderId,"platformApply");
			   totalFee+=paidFee;
		   }
		}
		if(totalFee<=0) {
			throw new BusinessException("开具订单的发票金额必须大于0");
		}
		//订单状态存在且满足开具发票情况
		SysOrderInvoice invoice=new SysOrderInvoice();
		invoice.setInvoiceId(SequenceUtil.createSysOrderInvoiceId());
		invoice.setInvoiceType(request.getInvoiceType());
		invoice.setOrderNumber(request.getOrderNumber());
		invoice.setInvoiceAmount(totalFee);
		invoice.setCreateTime(DateUtil.getSysDate());
		invoice.setProposer(request.getProposer());
		invoice.setState(Constants.InvoiceState.PENDING_AUDIT);
		invoice.setInvoiceContent(Constants.InvoiceContent.CONTENT);
		sysOrderInvoiceAtomSV.insert(invoice);
		//更新订单发票状态--避免远程异常
		for (String orderId : orderAttrays) {
			this.updateInvoiceState(orderId,Constants.FrontInvoiceState.FRONT_BILLING);
		}
		response.setInvoiceId(invoice.getInvoiceId());
		return response;
	}
	
	
	@Override
	public void invoiceBillMail(InvoiceBillMailRequest request) {
		String invoiceId = request.getInvoiceId();
		String state = request.getState();
		SysOrderInvoice orderInvoice = sysOrderInvoiceAtomSV.selectById(invoiceId);
		if(null==orderInvoice) {
			logger.error("发票信息为空,发票id:"+invoiceId);
			throw new BusinessException("发票信息为空");
		}
		if(Constants.InvoiceState.PENDING_BILLING.equals(state)) {
			//待开票
			orderInvoice.setInvoiceNumber(request.getInvoiceNumber());
			orderInvoice.setInvoiceRemark(request.getInvoiceRemark());
			orderInvoice.setDrawer(request.getDrawer());
			orderInvoice.setBillingTime(DateUtil.getSysDate());
			orderInvoice.setState(Constants.InvoiceState.TO_POST);
		}else if(Constants.InvoiceState.TO_POST.equals(state)) {
			//待邮寄
			orderInvoice.setLogisticsCompany(request.getLogisticsCompany());
			orderInvoice.setLogisticsNumber(request.getLogisticsNumber());
			orderInvoice.setState(Constants.InvoiceState.COMPLETED);
			//订单中的发票状态改为前台已开票
			updateInvoiceState(orderInvoice.getOrderNumber(), 
					Constants.FrontInvoiceState.FRONT_INVOICED);
		}
		sysOrderInvoiceAtomSV.update(orderInvoice);
	}
	
	/**
	 * 申请(前后台)-判断订单状态
	 * @param orderId
	 */
	private long decideInvoiceState(String orderId,String methodSign) {
		logger.info("查询订单信息,进行发票状态判断...");
		long paidFee =0;
//		IOrderQuerySV orderQuerySV=DubboConsumerFactory.getService(IOrderQuerySV.class);
//		QueryOrderRequest request=new QueryOrderRequest();
//		request.setOrderId(Long.valueOf(orderId));
//		request.setPageNo(1);
//		request.setPageSize(1);
//		QueryOrderRsponse rsponse = orderQuerySV.queryOrder(request);
		//
//		if(rsponse!=null && rsponse.getResponseHeader().isSuccess()) {
//			PageInfo<OrdOrderVo> info = rsponse.getPageInfo();
//			List<OrdOrderVo> result = info.getResult();
//			if(CollectionUtil.isEmpty(result)) {
//				logger.error("订单信息不存在,订单id:"+orderId);
//				throw new BusinessException("订单信息不存在");
//			}else {
//				OrdOrderVo orderVo = result.get(0);
//				String invoiceState = orderVo.getInvoiceState();
//				if(!StringUtil.isBlank(invoiceState) 
//						&& (Constants.FrontInvoiceState.FRONT_BILLING.equals(invoiceState)||
//								Constants.FrontInvoiceState.FRONT_INVOICED.equals(invoiceState))) {
//					logger.error("此订单在开票或已开票完成,订单id:"+orderId);
//					throw new BusinessException("此订单在开票或已开票完成");
//				}else {
//					paidFee=this.platformJudge(orderVo,methodSign);
//			//		this.updateInvoiceState(orderId,Constants.FrontInvoiceState.FRONT_BILLING);
					return paidFee;
//				}
//			}
//		}else {
//			logger.error("订单查询失败,订单id:"+orderId);
//			throw new BusinessException("订单查询失败");
//		}
	}
	
	/**
	 * 更新订单发票状态
	 * @param orderId
	 */
	private void updateInvoiceState(String orderId,String state) {
//		IUpdateInvoiceSV updateInvoiceSV=DubboConsumerFactory.getService(IUpdateInvoiceSV.class);
//		UpdateOrderInvoiceRequest req=new UpdateOrderInvoiceRequest();
//		req.setOrderId(orderId);
//		req.setInvoiceState(state);
//		logger.info("更新订单发票状态...,订单id:"+orderId);
//		//
//		updateInvoiceSV.updateOrderInvoice(req);
		
	}

	/**
	 * 后台订单发票申请判断及计算金额
	 * @param orderVo
	 * @param methodSign
	 * @return
	 */
//	private long platformJudge(OrdOrderVo orderVo, String methodSign) {
//		long paidFee=0;
//		if("platformApply".equals(methodSign)) {
//			   String orderState = orderVo.getState();
//			   if(!StringUtil.isBlank(orderState) &&(Constants.OrderState.JUDGED_STATE.equals(orderState)||
//					   Constants.OrderState.WAIT_JUDGE_STATE.equals(orderState))) {
//				   paidFee = orderVo.getPaidFee();
//			   }else {
//				   //不存在或者不满足
//				   throw new BusinessException("订单状态不存在或者不满足申请发票");
//			   }
//		}
//		return paidFee;
//	}

	private void infoValidate(SysOrderInvoice orderInvoice,String id) {
		logger.info("校验订单发票信息是否存在.....发票id:"+id);
		if(null==orderInvoice) {
			throw new BusinessException("订单发票信息不能为空");
		}
		if(StringUtil.isBlank(orderInvoice.getRecipients())) {
			throw new BusinessException("收件人不能为空");
		}
		if(StringUtil.isBlank(orderInvoice.getContactNumber())) {
			throw new BusinessException("联系电话不能为空");
		}
	/*	if(StringUtil.isBlank(orderInvoice.getProvince())) {
			throw new BusinessException("省份为空,发票id:"+id);
		}
		if(StringUtil.isBlank(orderInvoice.getCountry())) {
			throw new BusinessException("城市为空,发票id:"+id);
		}*/
		if(StringUtil.isBlank(orderInvoice.getAddress())) {
			throw new BusinessException("详细地址不能为空");
		}
		if(StringUtil.isBlank(orderInvoice.getInvoiceTitle())) {
			throw new BusinessException("发票抬头不能为空");
		}
		if(StringUtil.isBlank(orderInvoice.getInvoiceType())) {
			 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "发票类型不能为空");
		}else {
			 if(Constants.InvoiceType.ADDED_TAX_INVOICE.equals(orderInvoice.getInvoiceType())) {
				 if(StringUtil.isBlank(orderInvoice.getRegisteredPhone())) {
					 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "注册电话不能为空");
				 }
				 if(StringUtil.isBlank(orderInvoice.getRegisteredAddress())) {
					 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "注册地址不能为空");
				 }
				 if(StringUtil.isBlank(orderInvoice.getBankDeposit())) {
					 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "开户银行不能为空");
				 }
				 if(StringUtil.isBlank(orderInvoice.getBankAccount())) {
					 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "银行账号不能为空");
				 }
				 if(StringUtil.isBlank(orderInvoice.getTaxCertificateUploadId())) {
					 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "税务登记证记录号不能为空");
				 }
				 if(StringUtil.isBlank(orderInvoice.getTaxPageId())) {
					 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "税务登记条码页不能为空");
				 }
				 if(StringUtil.isBlank(orderInvoice.getTaxpayerIdentificationId())) {
					 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "一般纳税人认定书不能为空");
				 }
			 } 
		}
	}
}

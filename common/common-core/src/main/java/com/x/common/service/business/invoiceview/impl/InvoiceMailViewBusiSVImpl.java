package com.x.common.service.business.invoiceview.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.invoiceview.param.InvoiceMailViewRequest;
import com.x.common.api.invoiceview.param.InvoiceMailViewResponse;
import com.x.common.api.invoiceview.param.InvoiceOrderViewResponse;
import com.x.common.api.invoiceview.param.MailInformationInfo;
import com.x.common.api.invoiceview.param.OrderInvoiceInfo;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysMailInformation;
import com.x.common.service.atom.sysmailinformation.ISysMailInformationAtomSV;
import com.x.common.service.business.invoiceview.IInvoiceMailViewBusiSV;
@Service
public class InvoiceMailViewBusiSVImpl implements IInvoiceMailViewBusiSV {
	
	@Autowired
	private ISysMailInformationAtomSV mailInformationAtomSV;

	@Override
	public InvoiceMailViewResponse view(InvoiceMailViewRequest request) {
		//
		InvoiceMailViewResponse response=new InvoiceMailViewResponse();
//		PageInfo<OrderInvoiceInfo> info = new PageInfo<OrderInvoiceInfo>();
//		
//		String corporaId = request.getCorporaId();
//		String userId = request.getUserId();
//		//查询订单列表信息
//		QueryOrderRequest req=new QueryOrderRequest();
//		req.setCorporaId(corporaId);
//		req.setUserId(userId);
//		req.setPageNo(request.getPageNo());
//		req.setPageSize(request.getPageSize());
//		//下单时间 (前一年到当前时间)
//		req.setOrderTimeStart(getBeforeMonth(DateUtil.getSysDate()));
//		//发票状态--前台待开票状态
//		req.setInvoiceState(Constants.FrontInvoiceState.FRONT_PENDING_BILLING);
//		IOrderQuerySV orderQuerySV = DubboConsumerFactory.getService(IOrderQuerySV.class);
//		QueryOrderRsponse orderRsponse = orderQuerySV.queryOrder(req);
//		//
//		List<OrderInvoiceInfo> orderInfos=new ArrayList<OrderInvoiceInfo>();
//		List<MailInformationInfo> mailInfos=new ArrayList<MailInformationInfo>();
//		int count =0;
//		//
//		if(orderRsponse!=null && orderRsponse.getResponseHeader().isSuccess()) {
//			PageInfo<OrdOrderVo> pageInfo = orderRsponse.getPageInfo();
//			count = pageInfo.getCount();
//			List<OrdOrderVo> result = pageInfo.getResult();
//			if(!CollectionUtil.isEmpty(result)) {
//				for (OrdOrderVo ordOrderVo : result) {
//					OrderInvoiceInfo invoiceInfo=new OrderInvoiceInfo();
//					invoiceInfo.setOrderId(String.valueOf(ordOrderVo.getOrderId()));
//					invoiceInfo.setOrderTime(ordOrderVo.getOrderTime());
//					invoiceInfo.setOrderAmount(ordOrderVo.getPaidFee());
//					invoiceInfo.setInvoiceState(ordOrderVo.getInvoiceState());
//					orderInfos.add(invoiceInfo);
//				}
//			}
//		}
//		//查询发票信息
//		List<SysMailInformation> informations;
//		if(StringUtil.isBlank(corporaId)) {
//			 informations = mailInformationAtomSV.queryByUid(userId);
//		}else {
//			informations = mailInformationAtomSV.queryByUid(corporaId);
//		}
//		if(!CollectionUtil.isEmpty(informations)) {
//			for (SysMailInformation sysMailInformation : informations) {
//				MailInformationInfo mailInfo=new MailInformationInfo();
//				BeanUtils.copyProperties(mailInfo, sysMailInformation);
//				mailInfo.setMailInformationId(sysMailInformation.getId());
//				mailInfos.add(mailInfo);
//			}
//		}
//		//封装数据
//		info.setCount(count);
//		//总页数
//		info.setPageCount((count + request.getPageSize() - 1) / request.getPageSize());
//		info.setPageNo(request.getPageNo());
//		info.setPageSize(request.getPageSize());
//		info.setResult(orderInfos);
//		response.setPageInfo(info);
//		response.setMailInfos(mailInfos);
		return response;
	}
	
	
	  /**
     * 当前时间(currentDate)前一年
     */
    private static Timestamp getBeforeMonth(Timestamp currentDate) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(currentDate);
        calender.add(Calendar.MONTH, -12);
        return new Timestamp(calender.getTimeInMillis());
    }


	@Override
	public InvoiceOrderViewResponse load(InvoiceMailViewRequest request) {
		// TODO Auto-generated method stub
		InvoiceOrderViewResponse response=new InvoiceOrderViewResponse();
//		PageInfo<OrderInvoiceInfo> info = new PageInfo<OrderInvoiceInfo>();
//		
//		String corporaId = request.getCorporaId();
//		String userId = request.getUserId();
//		//查询订单列表信息
//		QueryOrderRequest req=new QueryOrderRequest();
//		req.setCorporaId(corporaId);
//		req.setUserId(userId);
//		req.setPageNo(request.getPageNo());
//		req.setPageSize(request.getPageSize());
//		//下单时间 (前一年到当前时间)
//		req.setOrderTimeStart(getBeforeMonth(DateUtil.getSysDate()));
//		//发票状态--前台待开票状态
//		req.setInvoiceState(Constants.FrontInvoiceState.FRONT_PENDING_BILLING);
//		IOrderQuerySV orderQuerySV = DubboConsumerFactory.getService(IOrderQuerySV.class);
//		QueryOrderRsponse orderRsponse = orderQuerySV.queryOrder(req);
//		//
//		List<OrderInvoiceInfo> orderInfos=new ArrayList<OrderInvoiceInfo>();
//		int count =0;
//		//
//		if(orderRsponse!=null && orderRsponse.getResponseHeader().isSuccess()) {
//			PageInfo<OrdOrderVo> pageInfo = orderRsponse.getPageInfo();
//			count = pageInfo.getCount();
//			List<OrdOrderVo> result = pageInfo.getResult();
//			if(!CollectionUtil.isEmpty(result)) {
//				for (OrdOrderVo ordOrderVo : result) {
//					OrderInvoiceInfo invoiceInfo=new OrderInvoiceInfo();
//					invoiceInfo.setOrderId(String.valueOf(ordOrderVo.getOrderId()));
//					invoiceInfo.setOrderTime(ordOrderVo.getOrderTime());
//					invoiceInfo.setOrderAmount(ordOrderVo.getPaidFee());
//					invoiceInfo.setInvoiceState(ordOrderVo.getInvoiceState());
//					orderInfos.add(invoiceInfo);
//				}
//			}
//		}
//		//封装数据
//		info.setCount(count);
//		//总页数
//		info.setPageCount((count + request.getPageSize() - 1) / request.getPageSize());
//		info.setPageNo(request.getPageNo());
//		info.setPageSize(request.getPageSize());
//		info.setResult(orderInfos);
//		response.setPageInfo(info);
		return response;
	}
}

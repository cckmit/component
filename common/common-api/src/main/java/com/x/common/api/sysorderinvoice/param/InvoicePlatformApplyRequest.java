package com.x.common.api.sysorderinvoice.param;

import java.io.Serializable;

public class InvoicePlatformApplyRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//订单号(一个或者多个,逗号隔开)
	private String orderNumber;
	//总金额
	private String invoiceType;
	//申请人
	private String proposer;
	
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getProposer() {
		return proposer;
	}
	public void setProposer(String proposer) {
		this.proposer = proposer;
	}
}

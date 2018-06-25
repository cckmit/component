package com.x.common.api.sysorderinvoice.param;

import java.io.Serializable;

public class OrderInvoiceApplyRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//订单号(一个或者多个)
	private String orderNumber;
	//总金额
	private long invoiceAmount;
	//备注(客户留言)
	private String feedback;
	
	//用户名
	private String username;
	//邮寄信息id
	private String id;
	//发票内容 
	private String invoiceContent;
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public long getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(long invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getInvoiceContent() {
		return invoiceContent;
	}
	public void setInvoiceContent(String invoiceContent) {
		this.invoiceContent = invoiceContent;
	}
}

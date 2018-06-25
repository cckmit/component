package com.x.common.api.invoiceview.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class OrderInvoiceInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//订单号
	private String orderId;
	//订单时间
	private Timestamp orderTime;
	//单个订单对应金额(厘)
	private long orderAmount;
	//订单发票状态-前台
	private String invoiceState;
	
	//扩展
	//单个订单对应金额(元)
	private String amount;
	//订单发票状态展示名称-前台
	private String invoiceStateName;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
	public long getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(long orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getInvoiceState() {
		return invoiceState;
	}
	public void setInvoiceState(String invoiceState) {
		this.invoiceState = invoiceState;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getInvoiceStateName() {
		return invoiceStateName;
	}
	public void setInvoiceStateName(String invoiceStateName) {
		this.invoiceStateName = invoiceStateName;
	}
}

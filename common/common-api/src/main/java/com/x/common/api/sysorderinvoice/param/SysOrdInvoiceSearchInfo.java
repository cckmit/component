package com.x.common.api.sysorderinvoice.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SysOrdInvoiceSearchInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//订单发票号(主键)
	private String invoiceId;
	//订单号
	private String orderNumber;
	//用户名
	private String username;
	//发票类型
	private String invoiceType;
	//发票抬头
	private String invoiceTitle;
	//发票金额
	private long invoiceAmount;
	//收件人
	private String recipients;
	//联系电话
	private String contactNumber;
	//申请时间
	private Timestamp createTime;
	//申请人
	private String proposer;
	//状态
	private String state;
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getInvoiceTitle() {
		return invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}
	public long getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(long invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getRecipients() {
		return recipients;
	}
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getProposer() {
		return proposer;
	}
	public void setProposer(String proposer) {
		this.proposer = proposer;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
}

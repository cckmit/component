package com.x.common.api.sysmailinformation.param;

import java.io.Serializable;

public class MailInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//发票类型
	private String invoiceType;
	//发票抬头
	private String invoiceTitle;
	//国家
	private String country;
	//省份
	private String province;
	//城市
	private String city;
	//邮寄地址
	private String address;
	//收件人
	private String recipients;
	//发票信息id
	private String mailInformationId;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRecipients() {
		return recipients;
	}
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}
	public String getMailInformationId() {
		return mailInformationId;
	}
	public void setMailInformationId(String mailInformationId) {
		this.mailInformationId = mailInformationId;
	}
}

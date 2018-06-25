package com.x.common.api.invoiceview.param;

import java.io.Serializable;

public class MailInformationInfo implements Serializable{

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
	private String cnCity;
	//邮编
	private String postcode;
	//联系电话
	private String contactNumber;
	//邮寄地址
	private String address;
	//收件人
	private String recipients;
	//发票信息id
	private String mailInformationId;
	
	//扩展
	//国家--对应翻译展示名称
	private String countryName;
	//省份--对应翻译展示名称
	private String provinceName;
	//城市--对应翻译展示名称
	private String cnCityName;
	//发票类型--对应翻译展示名称
	private String invoiceTypeName;
	
	
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
	public String getCnCity() {
		return cnCity;
	}
	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
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
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getCnCityName() {
		return cnCityName;
	}
	public void setCnCityName(String cnCityName) {
		this.cnCityName = cnCityName;
	}
	public String getInvoiceTypeName() {
		return invoiceTypeName;
	}
	public void setInvoiceTypeName(String invoiceTypeName) {
		this.invoiceTypeName = invoiceTypeName;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}

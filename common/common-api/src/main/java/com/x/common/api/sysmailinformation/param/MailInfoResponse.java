package com.x.common.api.sysmailinformation.param;

import com.x.base.vo.BaseResponse;

public class MailInfoResponse extends BaseResponse {
	
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
	//税务登记证号
	private String taxCertificateId;
	//注册电话
	private String registeredPhone;
	//注册地址
	private String registeredAddress;
	//开户银行
	private String bankDeposit;
	//银行账号
	private String bankAccount;
	//税务登记证书记录号
	private String taxCertificateUploadId;
	//税务登记条码页
	private String taxPageId;
	//一般纳税人认定书
	private String taxpayerIdentificationId;
    //县区
    private String cnCity;
	//邮编
	private String postcode;
	//联系电话
	private String contactNumber;
	//纳税人识别号
	private String identifyNumber;
	
	//邮寄信息id
	private String id;

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

	public String getTaxCertificateId() {
		return taxCertificateId;
	}

	public void setTaxCertificateId(String taxCertificateId) {
		this.taxCertificateId = taxCertificateId;
	}

	public String getRegisteredPhone() {
		return registeredPhone;
	}

	public void setRegisteredPhone(String registeredPhone) {
		this.registeredPhone = registeredPhone;
	}

	public String getRegisteredAddress() {
		return registeredAddress;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getBankDeposit() {
		return bankDeposit;
	}

	public void setBankDeposit(String bankDeposit) {
		this.bankDeposit = bankDeposit;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getTaxCertificateUploadId() {
		return taxCertificateUploadId;
	}

	public void setTaxCertificateUploadId(String taxCertificateUploadId) {
		this.taxCertificateUploadId = taxCertificateUploadId;
	}

	public String getTaxPageId() {
		return taxPageId;
	}

	public void setTaxPageId(String taxPageId) {
		this.taxPageId = taxPageId;
	}

	public String getTaxpayerIdentificationId() {
		return taxpayerIdentificationId;
	}

	public void setTaxpayerIdentificationId(String taxpayerIdentificationId) {
		this.taxpayerIdentificationId = taxpayerIdentificationId;
	}

	public String getCnCity() {
		return cnCity;
	}

	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
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

	public String getIdentifyNumber() {
		return identifyNumber;
	}

	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

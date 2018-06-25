package com.x.common.api.sysorderinvoice.param;

import java.sql.Timestamp;

import com.x.base.vo.BaseResponse;

public class OrderInvoiceQueryDetailResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//订单发票id
	private String invoiceId;
	//发票内容
	private String invoiceContent;
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
	
	//注册电话
	private String registeredPhone;
	//注册地址
	private String registeredAddress;
	//开户银行
	private String bankDeposit;
	//银行账号
	private String bankAccount;
	//纳税人识别号
	private String identifyNumber;
	//税务登记证书记录号
	private String taxCertificateUploadId;
	//税务登记条码页
	private String taxPageId;
	//一般纳税人认定书
	private String taxpayerIdentificationId;
	
	//邮寄地址
	private String address;
	//省份
	private String province;
	//城市
    private String country;
    //县区
    private String cnCity;
    //物流公司
    private String logisticsCompany;
    //物流单号
    private String logisticsNumber;

    //审核时间
    private Timestamp auditTime;
	//审核人
    private String aditor;
	//开票时间
    private Timestamp billingTime;
	//开票人
    private String drawer;
	//发票号
    private String invoiceNumber;
    //开票备注
    private String invoiceRemark;
    //客户留言
    private String feedback;
    //审核备注
    private String aditorRemark;
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
	public String getInvoiceContent() {
		return invoiceContent;
	}
	public void setInvoiceContent(String invoiceContent) {
		this.invoiceContent = invoiceContent;
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
	public String getIdentifyNumber() {
		return identifyNumber;
	}
	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCnCity() {
		return cnCity;
	}
	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
	}
	public String getLogisticsCompany() {
		return logisticsCompany;
	}
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}
	public String getLogisticsNumber() {
		return logisticsNumber;
	}
	public void setLogisticsNumber(String logisticsNumber) {
		this.logisticsNumber = logisticsNumber;
	}
	public Timestamp getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Timestamp auditTime) {
		this.auditTime = auditTime;
	}
	public String getAditor() {
		return aditor;
	}
	public void setAditor(String aditor) {
		this.aditor = aditor;
	}
	public Timestamp getBillingTime() {
		return billingTime;
	}
	public void setBillingTime(Timestamp billingTime) {
		this.billingTime = billingTime;
	}
	public String getDrawer() {
		return drawer;
	}
	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getInvoiceRemark() {
		return invoiceRemark;
	}
	public void setInvoiceRemark(String invoiceRemark) {
		this.invoiceRemark = invoiceRemark;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getAditorRemark() {
		return aditorRemark;
	}
	public void setAditorRemark(String aditorRemark) {
		this.aditorRemark = aditorRemark;
	}
}

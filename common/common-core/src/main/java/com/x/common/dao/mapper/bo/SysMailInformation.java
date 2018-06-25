package com.x.common.dao.mapper.bo;

public class SysMailInformation {
    private String id;

    private String recipients;

    private String contactNumber;

    private String province;

    private String country;

    private String cnCity;

    private String address;

    private String uid;

    private String registeredAddress;

    private String registeredPhone;

    private String bankDeposit;

    private String bankAccount;

    private String identifyNumber;

    private String taxPageId;

    private String taxCertificateId;

    private String taxCertificateUploadId;

    private String taxpayerIdentificationId;

    private String invoiceType;

    private String invoiceTitle;

    private String postcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients == null ? null : recipients.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCnCity() {
        return cnCity;
    }

    public void setCnCity(String cnCity) {
        this.cnCity = cnCity == null ? null : cnCity.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    public String getRegisteredPhone() {
        return registeredPhone;
    }

    public void setRegisteredPhone(String registeredPhone) {
        this.registeredPhone = registeredPhone == null ? null : registeredPhone.trim();
    }

    public String getBankDeposit() {
        return bankDeposit;
    }

    public void setBankDeposit(String bankDeposit) {
        this.bankDeposit = bankDeposit == null ? null : bankDeposit.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber == null ? null : identifyNumber.trim();
    }

    public String getTaxPageId() {
        return taxPageId;
    }

    public void setTaxPageId(String taxPageId) {
        this.taxPageId = taxPageId == null ? null : taxPageId.trim();
    }

    public String getTaxCertificateId() {
        return taxCertificateId;
    }

    public void setTaxCertificateId(String taxCertificateId) {
        this.taxCertificateId = taxCertificateId == null ? null : taxCertificateId.trim();
    }

    public String getTaxCertificateUploadId() {
        return taxCertificateUploadId;
    }

    public void setTaxCertificateUploadId(String taxCertificateUploadId) {
        this.taxCertificateUploadId = taxCertificateUploadId == null ? null : taxCertificateUploadId.trim();
    }

    public String getTaxpayerIdentificationId() {
        return taxpayerIdentificationId;
    }

    public void setTaxpayerIdentificationId(String taxpayerIdentificationId) {
        this.taxpayerIdentificationId = taxpayerIdentificationId == null ? null : taxpayerIdentificationId.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
}
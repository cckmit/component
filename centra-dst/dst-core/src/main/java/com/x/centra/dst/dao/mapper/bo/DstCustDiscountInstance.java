package com.x.centra.dst.dao.mapper.bo;

import java.sql.Timestamp;

public class DstCustDiscountInstance {
    private String tenantId;

    private String instanceId;

    private String discountId;

    private String discountCode;

    private String ownerCode;

    private String ownerInstanceCode;

    private String custId;

    private Timestamp discountPayDate;

    private String activeStatus;

    private Timestamp activeDate;

    private Timestamp effectiveDate;

    private Timestamp expirationDate;

    private String status;

    private String createUserId;

    private Timestamp createDate;

    private String remark;

    private String remindIndex;

    private String remindState;

    private String custName;

    private String discountName;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId == null ? null : instanceId.trim();
    }

    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId == null ? null : discountId.trim();
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode == null ? null : discountCode.trim();
    }

    public String getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(String ownerCode) {
        this.ownerCode = ownerCode == null ? null : ownerCode.trim();
    }

    public String getOwnerInstanceCode() {
        return ownerInstanceCode;
    }

    public void setOwnerInstanceCode(String ownerInstanceCode) {
        this.ownerInstanceCode = ownerInstanceCode == null ? null : ownerInstanceCode.trim();
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public Timestamp getDiscountPayDate() {
        return discountPayDate;
    }

    public void setDiscountPayDate(Timestamp discountPayDate) {
        this.discountPayDate = discountPayDate;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus == null ? null : activeStatus.trim();
    }

    public Timestamp getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Timestamp activeDate) {
        this.activeDate = activeDate;
    }

    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemindIndex() {
        return remindIndex;
    }

    public void setRemindIndex(String remindIndex) {
        this.remindIndex = remindIndex == null ? null : remindIndex.trim();
    }

    public String getRemindState() {
        return remindState;
    }

    public void setRemindState(String remindState) {
        this.remindState = remindState == null ? null : remindState.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName == null ? null : discountName.trim();
    }
}
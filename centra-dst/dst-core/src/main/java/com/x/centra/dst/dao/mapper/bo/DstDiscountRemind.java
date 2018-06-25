package com.x.centra.dst.dao.mapper.bo;

public class DstDiscountRemind {
    private String tenantId;

    private String discountCode;

    private String remindTime;

    private String remindTimeUnit;

    private String remindInfo;

    private String remindState;

    private String sortIndex;

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode == null ? null : discountCode.trim();
    }

    public String getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime == null ? null : remindTime.trim();
    }

    public String getRemindTimeUnit() {
        return remindTimeUnit;
    }

    public void setRemindTimeUnit(String remindTimeUnit) {
        this.remindTimeUnit = remindTimeUnit == null ? null : remindTimeUnit.trim();
    }

    public String getRemindInfo() {
        return remindInfo;
    }

    public void setRemindInfo(String remindInfo) {
        this.remindInfo = remindInfo == null ? null : remindInfo.trim();
    }

    public String getRemindState() {
        return remindState;
    }

    public void setRemindState(String remindState) {
        this.remindState = remindState == null ? null : remindState.trim();
    }

    public String getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(String sortIndex) {
        this.sortIndex = sortIndex == null ? null : sortIndex.trim();
    }
}
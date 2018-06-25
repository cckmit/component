package com.x.centra.dst.dao.mapper.bo;

public class DstDiscountClass {
    private String classId;

    private String tenantId;

    private String className;

    private String classCode;

    private String classInstructions;

    private String classAreaInstructions;

    private String classUseInstructions;

    private String status;

    private String remark;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    public String getClassInstructions() {
        return classInstructions;
    }

    public void setClassInstructions(String classInstructions) {
        this.classInstructions = classInstructions == null ? null : classInstructions.trim();
    }

    public String getClassAreaInstructions() {
        return classAreaInstructions;
    }

    public void setClassAreaInstructions(String classAreaInstructions) {
        this.classAreaInstructions = classAreaInstructions == null ? null : classAreaInstructions.trim();
    }

    public String getClassUseInstructions() {
        return classUseInstructions;
    }

    public void setClassUseInstructions(String classUseInstructions) {
        this.classUseInstructions = classUseInstructions == null ? null : classUseInstructions.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
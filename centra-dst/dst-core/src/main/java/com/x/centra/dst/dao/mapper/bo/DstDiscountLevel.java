package com.x.centra.dst.dao.mapper.bo;

import java.sql.Timestamp;

public class DstDiscountLevel {
    /**
     * 级别id
     */
    private String levelId;

    /**
     * 租户id
     */
    private String tenantId;

    /**
     * 级别名称
     */
    private String levelName;

    /**
     * 级别编码
     */
    private String levelCode;

    /**
     * 说明
     */
    private String instructions;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建人
     */
    private String createUserId;

    /**
     * 创建日期
     */
    private Timestamp createDate;

    /**
     * 备注
     */
    private String remark;

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId == null ? null : levelId.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode == null ? null : levelCode.trim();
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions == null ? null : instructions.trim();
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
}
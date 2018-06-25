package com.x.centra.cust.web.model.discount;

import java.io.Serializable;
import java.util.List;

public class DiscountInfoSaveVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1370923955134926269L;
	
	/**
	 * 权益id（修改时必填）
	 */
	private String discountId;

	/**
	 * 租户id（必填）
	 */
    private String tenantId;

    /**
     * 权益名称（必填）
     */
    private String discountName;

    /**
     * 权益编码（必填）
     */
    private String discountCode;

    /**
     * 权益所属分类（必填）
     */
    private String classCode;

    /**
     * 权益说明（可选）
     */
    private String discountInstructions;

    /**
     * 权益类型（日卡，月卡，年卡等）（必填）
     */
    private String discountType;

    /**
     * 权益生效时长（必填）
     */
    private String effectiveTime;

    /**
     * 权益生效时长单位（必填）
     */
    private String effectiveUnit;
    
    /**
     * 创建用户（可选）
     */
    private String createUserId;

    /**
     * 创建日期（可选）
     */
    private Long createDate;

    /**
     * 备注（可选）
     */
    private String remark;
    
    /**
     * 级别（可选）
     */
    private DiscountLevelSaveVo levelVo;
    
    /**
     * 权益主体限定关系（可选）
     */
    private List<DiscountOwnerLimitSaveVo> limitVos;

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getDiscountInstructions() {
		return discountInstructions;
	}

	public void setDiscountInstructions(String discountInstructions) {
		this.discountInstructions = discountInstructions;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getEffectiveUnit() {
		return effectiveUnit;
	}

	public void setEffectiveUnit(String effectiveUnit) {
		this.effectiveUnit = effectiveUnit;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public DiscountLevelSaveVo getLevelVo() {
		return levelVo;
	}

	public void setLevelVo(DiscountLevelSaveVo levelVo) {
		this.levelVo = levelVo;
	}

	public List<DiscountOwnerLimitSaveVo> getLimitVos() {
		return limitVos;
	}

	public void setLimitVos(List<DiscountOwnerLimitSaveVo> limitVos) {
		this.limitVos = limitVos;
	}
}

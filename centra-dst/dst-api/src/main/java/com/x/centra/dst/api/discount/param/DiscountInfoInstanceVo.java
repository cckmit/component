package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseInfo;

/**
 * 用户权益instance vo
 * @author wangluyang
 *
 */
public class DiscountInfoInstanceVo extends BaseInfo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 租户Id，必填
	 */
	private String tenantId;
	
	/**
	 * 
	 */
	private String instanceId;

    /**
     * 权益活动id（必填）
     */
    private String discountId;

    /**
     * 权益名称
     */
    private String discountName;

    /**
     * 权益编码
     */
    private String discountCode;
    
    /**
     * 权益类型
     */
    private String discountType;

    /**
     * 权益类型编码
     */
    private String discountTypeCode;

    /**
     * 权益有效时长（必填）
     */
    private String effectiveTime;

    /**
     * 有效时长单位（天/周/月/季度/年 等）（必填）
     */
    private String effectiveUnit;

    /**
     * 权益活动开始时间（必填）
     */
    private Long startDate;

    /**
     * 权益活动结束时间（必填）
     */
    private Long endDate;

    /**
     * 生失效状态（可选）
     */
    private String status;

    /**
     * 需要最低会员等级（可选）
     */
    private String memberLimit;

    /**
     * 最高会员等级（可选）
     */
    private String memberCap;

    /**
     * 限制车辆类型（可选）
     */
    private String carLimit;

    /**
     * 认证状态，是否通过（可选）
     */
    private String verifyState;

    /**
     * 备注（可选）
     */
    private String remark;
    
    /**
     * 权益规则实体类（必填）
     */
    private DiscountRuleInstanceVo ruleInstanceVo;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
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
	
	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getDiscountTypeCode() {
		return discountTypeCode;
	}

	public void setDiscountTypeCode(String discountTypeCode) {
		this.discountTypeCode = discountTypeCode;
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

	public Long getStartDate() {
		return startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}

	public Long getEndDate() {
		return endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMemberLimit() {
		return memberLimit;
	}

	public void setMemberLimit(String memberLimit) {
		this.memberLimit = memberLimit;
	}

	public String getMemberCap() {
		return memberCap;
	}

	public void setMemberCap(String memberCap) {
		this.memberCap = memberCap;
	}

	public String getCarLimit() {
		return carLimit;
	}

	public void setCarLimit(String carLimit) {
		this.carLimit = carLimit;
	}

	public String getVerifyState() {
		return verifyState;
	}

	public void setVerifyState(String verifyState) {
		this.verifyState = verifyState;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public DiscountRuleInstanceVo getRuleInstanceVo() {
		return ruleInstanceVo;
	}

	public void setRuleInstanceVo(DiscountRuleInstanceVo ruleInstanceVo) {
		this.ruleInstanceVo = ruleInstanceVo;
	}
}

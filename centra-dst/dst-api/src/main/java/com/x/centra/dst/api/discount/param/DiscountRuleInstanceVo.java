package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseInfo;

/**
 * 权益规则instance vo
 * @author wangluyang
 *
 */
public class DiscountRuleInstanceVo extends BaseInfo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 租户Id，必填
	 */
	private String tenantId;
	
	/**
	 * 规则id（修改时必填）
	 */
	private String discountRuleId;

	/**
	 * 优惠类型（必填）
	 */
    private String discountType;

    /**
     * 普通优惠时为价格，折扣优惠时为折扣值（必填）
     */
    private String price;

    /**
     * 价格单位编码（必填）
     */
    private String priceUnitCode;

    /**
     * 价格单位名称（必填）
     */
    private String priceUnitName;
    
    /**
     * 优惠策略类型（减/赠/折）（可选）
     */
    private String policyTypeCode;

    /**
     * 策略值（可选）
     */
    private String policyValue;
    
    /**
     * 策略单位编码（可选）
     */
    private String policyUnitCode;
    
    /**
     * 策略单位名称（可选）
     */
    private String policyUnitName;
    
    /**
     * 备注（可选）
     */
    private String remark;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getDiscountRuleId() {
		return discountRuleId;
	}

	public void setDiscountRuleId(String discountRuleId) {
		this.discountRuleId = discountRuleId;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPriceUnitCode() {
		return priceUnitCode;
	}

	public void setPriceUnitCode(String priceUnitCode) {
		this.priceUnitCode = priceUnitCode;
	}

	public String getPriceUnitName() {
		return priceUnitName;
	}

	public void setPriceUnitName(String priceUnitName) {
		this.priceUnitName = priceUnitName;
	}

	public String getPolicyTypeCode() {
		return policyTypeCode;
	}

	public void setPolicyTypeCode(String policyTypeCode) {
		this.policyTypeCode = policyTypeCode;
	}

	public String getPolicyValue() {
		return policyValue;
	}

	public void setPolicyValue(String policyValue) {
		this.policyValue = policyValue;
	}

	public String getPolicyUnitCode() {
		return policyUnitCode;
	}

	public void setPolicyUnitCode(String policyUnitCode) {
		this.policyUnitCode = policyUnitCode;
	}

	public String getPolicyUnitName() {
		return policyUnitName;
	}

	public void setPolicyUnitName(String policyUnitName) {
		this.policyUnitName = policyUnitName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

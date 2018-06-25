package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

public class DiscountRuleVo  implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -1370923955134926269L;

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

    public String getDiscountRuleId() {
        return discountRuleId;
    }

    public void setDiscountRuleId(String discountRuleId) {
        this.discountRuleId = discountRuleId == null ? null : discountRuleId.trim();
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType == null ? null : discountType.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getPriceUnitCode() {
        return priceUnitCode;
    }

    public void setPriceUnitCode(String priceUnitCode) {
        this.priceUnitCode = priceUnitCode == null ? null : priceUnitCode.trim();
    }

    public String getPriceUnitName() {
        return priceUnitName;
    }

    public void setPriceUnitName(String priceUnitName) {
        this.priceUnitName = priceUnitName == null ? null : priceUnitName.trim();
    }

    public String getPolicyTypeCode() {
        return policyTypeCode;
    }

    public void setPolicyTypeCode(String policyTypeCode) {
        this.policyTypeCode = policyTypeCode == null ? null : policyTypeCode.trim();
    }

    public String getPolicyValue() {
        return policyValue;
    }

    public void setPolicyValue(String policyValue) {
        this.policyValue = policyValue == null ? null : policyValue.trim();
    }

    public String getPolicyUnitCode() {
        return policyUnitCode;
    }

    public void setPolicyUnitCode(String policyUnitCode) {
        this.policyUnitCode = policyUnitCode == null ? null : policyUnitCode.trim();
    }

    public String getPolicyUnitName() {
        return policyUnitName;
    }

    public void setPolicyUnitName(String policyUnitName) {
        this.policyUnitName = policyUnitName == null ? null : policyUnitName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
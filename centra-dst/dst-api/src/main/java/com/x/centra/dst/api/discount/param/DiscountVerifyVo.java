package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

/**
 * 权益认证vo
 * @author wangluyang
 *
 */
public class DiscountVerifyVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1370923955134926269L;
	
	/**
	 * 租户Id，必填
	 */
	private String tenantId;
	
	/**
	 * 权益id（必填）
	 */
    private String discountId;
    
    /**
     * 认证状态，是否通过（必填）
     */
    private String verifyState;

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

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
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
}

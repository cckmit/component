package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

public class CustDiscountParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 租户Id，必填
	 */
	private String tenantId;
	
	/**
	 * 客户id
	 */
	private String custId;
	
	private String ownerCode;

	private String ownerInstanceCode;

	/**
	 * 权益信息编码
	 */
    private String discountCode;

    /**
	 * instanceId
	 */
	private String instanceId;
    
    /**
     * 生效状态 1，生效，2，已失效
     */
    private String effectiveStatus;
    
    /**
	 * 权益分类（classCode不为空时客户id必填）
	 */
	private String classCode;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getOwnerCode() {
		return ownerCode;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getOwnerInstanceCode() {
		return ownerInstanceCode;
	}

	public void setOwnerInstanceCode(String ownerInstanceCode) {
		this.ownerInstanceCode = ownerInstanceCode;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getEffectiveStatus() {
		return effectiveStatus;
	}

	public void setEffectiveStatus(String effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
}

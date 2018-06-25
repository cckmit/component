package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

/**
 * 
 * @author wangluyang
 *
 */
public class CustDiscountClassQueryParam implements Serializable{

	
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
}

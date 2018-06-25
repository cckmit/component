package com.x.centra.cust.web.model.discount;

import java.io.Serializable;

public class DiscountOwnerLimitSaveVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主体编码
	 */
	private String ownerCode;
	
	/**
	 * 限定状态
	 */
	private String limitStatus;

	public String getOwnerCode() {
		return ownerCode;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getLimitStatus() {
		return limitStatus;
	}

	public void setLimitStatus(String limitStatus) {
		this.limitStatus = limitStatus;
	}
}

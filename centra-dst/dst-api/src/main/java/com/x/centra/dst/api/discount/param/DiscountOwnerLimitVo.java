package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

/**
 * 权益主体vo
 * @author wangluyang
 *
 */
public class DiscountOwnerLimitVo implements Serializable{

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

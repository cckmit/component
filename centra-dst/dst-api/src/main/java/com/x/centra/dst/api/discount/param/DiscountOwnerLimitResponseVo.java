package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

public class DiscountOwnerLimitResponseVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String discountCode;

    private String ownerCode;

    private String limitStatus;

    private String createUserId;

    private Long createDate;

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

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
	
}

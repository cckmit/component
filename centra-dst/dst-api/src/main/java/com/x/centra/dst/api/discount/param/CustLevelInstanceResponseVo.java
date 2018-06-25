package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

public class CustLevelInstanceResponseVo  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String levelCode;

    private Long effectiveDate;

    private Long expirationDate;

    private Long createDate;

    private String remark;

	private DiscountLevelResponseVo discountLevelResponseVo;

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public Long getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Long effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Long getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Long expirationDate) {
		this.expirationDate = expirationDate;
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

	public DiscountLevelResponseVo getDiscountLevelResponseVo() {
		return discountLevelResponseVo;
	}

	public void setDiscountLevelResponseVo(DiscountLevelResponseVo discountLevelResponseVo) {
		this.discountLevelResponseVo = discountLevelResponseVo;
	}
}

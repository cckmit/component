package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseInfo;

/**
 * 客户权益新增信息
 * @author wangluyang
 *
 */
public class CustDiscountVo extends BaseInfo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 客户id（必填）
	 */
	private String custId;

	/**
	 * 权益活动id（必填）
	 */
    private String discountId;

//    /**
//     * 权益活动编码（必填）
//     */
//    private String discountCode;

    /**
     * 客户级别（可选）
     */
    private String custLevel;

    /**
     * 购买时间（必填）
     */
    private Long discountPayDate;

    /**
     * 购买金额（必填）
     */
    private String discountPayFee;

//    /**
//     * 权益生效日期（必填）
//     */
//    private Long effectiveDate;
//
//    /**
//     * 权益失效日期（必填）
//     */
//    private Long expirationDate;

//    /**
//     * 状态 0:未激活， 1:激活
//     */
//    private String status;

    /**
     * 备注
     */
    private String remark;
    
//    /**
//     * 权益信息instance
//     */
//    private DiscountInfoInstanceVo infoInstanceVo;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

//	public String getDiscountCode() {
//		return discountCode;
//	}
//
//	public void setDiscountCode(String discountCode) {
//		this.discountCode = discountCode;
//	}

	public String getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}

	public Long getDiscountPayDate() {
		return discountPayDate;
	}

	public void setDiscountPayDate(Long discountPayDate) {
		this.discountPayDate = discountPayDate;
	}

//	public Long getEffectiveDate() {
//		return effectiveDate;
//	}
//
//	public void setEffectiveDate(Long effectiveDate) {
//		this.effectiveDate = effectiveDate;
//	}
//
//	public Long getExpirationDate() {
//		return expirationDate;
//	}
//
//	public void setExpirationDate(Long expirationDate) {
//		this.expirationDate = expirationDate;
//	}

	public String getDiscountPayFee() {
		return discountPayFee;
	}

	public void setDiscountPayFee(String discountPayFee) {
		this.discountPayFee = discountPayFee;
	}


//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

//	public DiscountInfoInstanceVo getInfoInstanceVo() {
//		return infoInstanceVo;
//	}
//
//	public void setInfoInstanceVo(DiscountInfoInstanceVo infoInstanceVo) {
//		this.infoInstanceVo = infoInstanceVo;
//	}
}

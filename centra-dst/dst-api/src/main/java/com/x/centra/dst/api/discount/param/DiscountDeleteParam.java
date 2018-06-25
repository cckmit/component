package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseInfo;

/**
 * 权益删除入參
 * @author wangluyang
 *
 */
public class DiscountDeleteParam extends BaseInfo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 权益活动编码（必填）
	 */
    private String discountCode;
    
    /**
     * 备注
     */
    private String remark;

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

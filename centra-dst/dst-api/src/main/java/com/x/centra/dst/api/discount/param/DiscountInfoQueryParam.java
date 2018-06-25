package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseInfo;

/**
 * 权益查询入參
 * @author wangluyang
 *
 */
public class DiscountInfoQueryParam extends BaseInfo{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1370923955134926269L;

	/**
	 * 权益id
	 */
    private String discountId;

    /**
     * 权益名称
     */
    private String discountName;
    
    /**
     * 权益类型
     */
    private String discountType;

    /**
     * 权益编码
     */
    private String discountCode;
    
    /**
     * 认证状态，是否通过
     */
    private String verifyState;
    
    /**
     * 删除状态
     */
    private String status = "1";
    
    /**
     * 权益所属分类编码
     */
    private String classCode;
	
	 /**
     * 当前第几页,必填
     */
    private Integer pageNo;

    /**
     * 每页数据条数,必填
     */
    private Integer pageSize;

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getVerifyState() {
		return verifyState;
	}

	public void setVerifyState(String verifyState) {
		this.verifyState = verifyState;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}

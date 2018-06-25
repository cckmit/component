package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseInfo;

/**
 * 客户权益查询入參
 * @author wangluyang
 *
 */
public class CustDiscountQueryParam extends BaseInfo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 客户id
	 */
	private String custId;
	
	/**
	 * 客户名称
	 */
	private String custName;
	
	private String ownerCode;

	private String ownerInstanceCode;

	/**
	 * 权益信息编码
	 */
    private String discountCode;

	/**
	 * 权益名称
	 */
    private String discountName;

    /**
	 * instanceId
	 */
	private String instanceId;
    
//    /**
//     * 权益级别编码
//     */
//    private String levelCode;
    
    /**
     * 生效状态 1，生效，2，已失效
     */
    private String effectiveStatus;

//    /**
//     * 激活日期
//     */
//    private Long activeDate;
//
//    /**
//     * 购买时间
//     */
//    private Long discountPayDate;
//    
//    /**
//     * 权益生效日期
//     */
//    private Long effectiveDate;
//
//    /**
//     * 权益失效日期
//     */
//    private Long expirationDate;

	/**
	 * 当前第几页,必填
	 */
	private Integer pageNo;

	/**
	 * 每页数据条数,必填
	 */
	private Integer pageSize;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
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

//	public String getLevelCode() {
//		return levelCode;
//	}
//
//	public void setLevelCode(String levelCode) {
//		this.levelCode = levelCode;
//	}

	public String getEffectiveStatus() {
		return effectiveStatus;
	}

	public void setEffectiveStatus(String effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
	}

//	public Long getActiveDate() {
//		return activeDate;
//	}
//
//	public void setActiveDate(Long activeDate) {
//		this.activeDate = activeDate;
//	}
//
//	public Long getDiscountPayDate() {
//		return discountPayDate;
//	}
//
//	public void setDiscountPayDate(Long discountPayDate) {
//		this.discountPayDate = discountPayDate;
//	}
//
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


	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
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

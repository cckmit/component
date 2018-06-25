package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

/**
 * 客户权益详细信息
 * @author wangluyang
 *
 */
public class CustDiscountResponseVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String tenantId;

    private String instanceId;

    private String discountId;

    private String discountCode;

    private String discountName;

    private String ownerCode;

    private String ownerInstanceCode;

    private String custId;

    private String custName;

    private Long discountPayDate;

    private String activeStatus;

    private Long activeDate;

    private Long effectiveDate;

    private Long expirationDate;

    private String createUserId;

    private Long createDate;

    private String remark;
    
    private CustLevelInstanceResponseVo custLevelInstanceResponseVo;

    private DiscountInfoResponseVo discountInfoResponseVo;


	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

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

	public String getOwnerInstanceCode() {
		return ownerInstanceCode;
	}

	public void setOwnerInstanceCode(String ownerInstanceCode) {
		this.ownerInstanceCode = ownerInstanceCode;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Long getDiscountPayDate() {
		return discountPayDate;
	}

	public void setDiscountPayDate(Long discountPayDate) {
		this.discountPayDate = discountPayDate;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public Long getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(Long activeDate) {
		this.activeDate = activeDate;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public CustLevelInstanceResponseVo getCustLevelInstanceResponseVo() {
		return custLevelInstanceResponseVo;
	}

	public void setCustLevelInstanceResponseVo(CustLevelInstanceResponseVo custLevelInstanceResponseVo) {
		this.custLevelInstanceResponseVo = custLevelInstanceResponseVo;
	}

	public DiscountInfoResponseVo getDiscountInfoResponseVo() {
		return discountInfoResponseVo;
	}

	public void setDiscountInfoResponseVo(DiscountInfoResponseVo discountInfoResponseVo) {
		this.discountInfoResponseVo = discountInfoResponseVo;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
}

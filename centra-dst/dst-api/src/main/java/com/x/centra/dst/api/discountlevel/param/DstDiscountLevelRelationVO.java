package com.x.centra.dst.api.discountlevel.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class DstDiscountLevelRelationVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1345969683000568002L;

	/**
	 * 租户id
	 */
	private String tenantId;

	/**
	 * 权益编码
	 */
	private String discountCode;

	/**
	 * 级别编码
	 */
	private String levelCode;

	/**
	 * 关系状态
	 */
	private String relStatus;

	/**
	 * 创建人
	 */
	private String createUserId;

	/**
	 * 创建日期
	 */
	private Timestamp createDate;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId == null ? null : tenantId.trim();
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode == null ? null : discountCode.trim();
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode == null ? null : levelCode.trim();
	}

	public String getRelStatus() {
		return relStatus;
	}

	public void setRelStatus(String relStatus) {
		this.relStatus = relStatus == null ? null : relStatus.trim();
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId == null ? null : createUserId.trim();
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
}
package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

/**
 * 权益类型查询入參
 * @author wangluyang
 *
 */
public class DiscountClassQueryParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 租户Id，必填
	 */
	private String tenantId;	
	
	/**
	 * 权益分类id
	 */
	private String classId;
	
	 /**
     * 分类编码
     */
    private String classCode;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
}

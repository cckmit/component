package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

/**
 * 权益大类返回vo
 * @author wangluyang
 *
 */
public class DiscountClassResponseVo implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String classId;

    private String tenantId;

    private String className;

    private String classCode;

    private String classInstructions;

    private String classAreaInstructions;

    private String classUseInstructions;

    private String status;

    private String remark;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getClassInstructions() {
		return classInstructions;
	}

	public void setClassInstructions(String classInstructions) {
		this.classInstructions = classInstructions;
	}

	public String getClassAreaInstructions() {
		return classAreaInstructions;
	}

	public void setClassAreaInstructions(String classAreaInstructions) {
		this.classAreaInstructions = classAreaInstructions;
	}

	public String getClassUseInstructions() {
		return classUseInstructions;
	}

	public void setClassUseInstructions(String classUseInstructions) {
		this.classUseInstructions = classUseInstructions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

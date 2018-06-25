package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

/**
 * 权益类型入參
 * @author wangluyang
 *
 */
public class DiscountClassVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 权益分类id（修改时必填）
	 */
	private String classId;

	/**
	 * 租户id（必填）
	 */
    private String tenantId;

    /**
     * 分类名称（必填）
     */
    private String className;

    /**
     * 分类编码（必填）
     */
    private String classCode;

    /**
     * 分类描述（可选）
     */
    private String classInstructions;

    /**
     * 使用区域说明（可选）
     */
    private String classAreaInstructions;

    /**
     * 权益使用说明（可选）
     */
    private String classUseInstructions;

    /**
     * 备注（可选）
     */
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

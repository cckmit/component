package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

public class DiscountLevelVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	/**
//	 * 级别id（修改时必填）
//	 */
//	private String levelId;
//	
//	/**
//	 * 权益级别名称（必填）
//	 */
//	private String levelName;

	/**
	 * 权益级别编码（可选）
	 */
    private String levelCode;
    
    /**
     * 关系状态（必填）
     */
    private String relStatus;

//    /**
//     * 说明（可选）
//     */
//    private String instructions;
//	/**
//	 * 备注（可选）
//	 */
//    private String remark;
    
//	public String getLevelId() {
//		return levelId;
//	}
//	public void setLevelId(String levelId) {
//		this.levelId = levelId;
//	}
//	public String getLevelName() {
//		return levelName;
//	}
//	public void setLevelName(String levelName) {
//		this.levelName = levelName;
//	}
	public String getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}
	public String getRelStatus() {
		return relStatus;
	}
	public void setRelStatus(String relStatus) {
		this.relStatus = relStatus;
	}
//	public String getInstructions() {
//		return instructions;
//	}
//	public void setInstructions(String instructions) {
//		this.instructions = instructions;
//	}
//	public String getRemark() {
//		return remark;
//	}
//	public void setRemark(String remark) {
//		this.remark = remark;
//	}
}

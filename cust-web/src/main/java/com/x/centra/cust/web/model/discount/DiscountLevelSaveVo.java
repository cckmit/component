package com.x.centra.cust.web.model.discount;

import java.io.Serializable;

public class DiscountLevelSaveVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 级别id（修改时必填）
	 */
	private String levelId;
	
	/**
	 * 权益级别编码（可选）
	 */
    private String levelCode;
    
    /**
     * 关系状态（必填）
     */
    private String relStatus;

	public String getLevelId() {
		return levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

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
    
}

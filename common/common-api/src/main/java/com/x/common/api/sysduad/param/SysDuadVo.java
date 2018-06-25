package com.x.common.api.sysduad.param;

import java.io.Serializable;

public class SysDuadVo implements Serializable {

	private static final long serialVersionUID = 6022446114669473771L;

	/**
	 * 编号
	 */
	private String duadId;

	/**
	 * 语言
	 */
	private String language;

	/**
	 * 站点
	 */
	private String site;

	/**
	 * 订单类型
	 */
	private String orderType;
	
	private String sourceCode;
	    
	private String targetCode;

	/**
	 * 源语言中文名称
	 */
	private String sourceCn;

	/**
	 * 源语言英文名称
	 */
    private String sourceEn;
    
    /**
     * 目标语言中文名称
     */
    private String targetCn;
    
    /**
     * 目标语言英文名称
     */
    private String targetEn;

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getTargetCode() {
		return targetCode;
	}

	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}

	public String getDuadId() {
		return duadId;
	}

	public void setDuadId(String duadId) {
		this.duadId = duadId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getSourceCn() {
		return sourceCn;
	}

	public void setSourceCn(String sourceCn) {
		this.sourceCn = sourceCn;
	}

	public String getSourceEn() {
		return sourceEn;
	}

	public void setSourceEn(String sourceEn) {
		this.sourceEn = sourceEn;
	}

	public String getTargetCn() {
		return targetCn;
	}

	public void setTargetCn(String targetCn) {
		this.targetCn = targetCn;
	}

	public String getTargetEn() {
		return targetEn;
	}

	public void setTargetEn(String targetEn) {
		this.targetEn = targetEn;
	}

	

}

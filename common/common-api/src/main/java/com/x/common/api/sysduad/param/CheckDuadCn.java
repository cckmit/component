package com.x.common.api.sysduad.param;

import java.io.Serializable;
public class CheckDuadCn implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 语言
	 */
	private String language;
	 /**
	 * 源语言(中文)
	 */
    private String sourceCn;
    /**
	 * 目标语言(中文)
	 */
    private String targetCn;
    /**
     * 主键
     */
    private String duadId;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSourceCn() {
		return sourceCn;
	}
	public void setSourceCn(String sourceCn) {
		this.sourceCn = sourceCn;
	}
	public String getTargetCn() {
		return targetCn;
	}
	public void setTargetCn(String targetCn) {
		this.targetCn = targetCn;
	}
	public String getDuadId() {
		return duadId;
	}
	public void setDuadId(String duadId) {
		this.duadId = duadId;
	}
}

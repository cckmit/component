package com.x.common.api.syspurpose.param;

import java.io.Serializable;
public class CheckPurposeCn implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 语言
	 */
	private String language;
	/**
     * 中文名称
     */
    private String purposeCn;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPurposeCn() {
		return purposeCn;
	}
	public void setPurposeCn(String purposeCn) {
		this.purposeCn = purposeCn;
	}
}

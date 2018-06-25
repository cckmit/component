package com.x.common.api.sysdomain.param;

import java.io.Serializable;
public class CheckDomainCn implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 语言
	 */
	private String language;
	/**
     * 中文名称
     */
    private String domainCn;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDomainCn() {
		return domainCn;
	}
	public void setDomainCn(String domainCn) {
		this.domainCn = domainCn;
	}
}

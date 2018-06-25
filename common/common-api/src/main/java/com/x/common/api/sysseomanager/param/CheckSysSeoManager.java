package com.x.common.api.sysseomanager.param;

import java.io.Serializable;
public class CheckSysSeoManager implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 语言
	 */
	private String regionalLanguage;
	/**
     * 中文名称
     */
    private String pageLocation;
    /**
     * 主键
     */
    private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegionalLanguage() {
		return regionalLanguage;
	}
	public void setRegionalLanguage(String regionalLanguage) {
		this.regionalLanguage = regionalLanguage;
	}
	public String getPageLocation() {
		return pageLocation;
	}
	public void setPageLocation(String pageLocation) {
		this.pageLocation = pageLocation;
	}
}

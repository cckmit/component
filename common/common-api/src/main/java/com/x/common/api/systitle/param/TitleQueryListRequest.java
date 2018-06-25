package com.x.common.api.systitle.param;

import java.io.Serializable;

public class TitleQueryListRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//一级标题
	private String title;
	//地区语言     zh、中文 ; en、英文
	private String regionalLanguage;
	//状态           0、隐藏 ; 1、显示 
	private String state;
	//站点          1、译云PC
	private String site;
	//创建人
	private String aditor;
	// 页码，必填
	private Integer pageNo;
	// 每页大小，必填
	private Integer pageSize;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegionalLanguage() {
		return regionalLanguage;
	}

	public void setRegionalLanguage(String regionalLanguage) {
		this.regionalLanguage = regionalLanguage;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getAditor() {
		return aditor;
	}

	public void setAditor(String aditor) {
		this.aditor = aditor;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}

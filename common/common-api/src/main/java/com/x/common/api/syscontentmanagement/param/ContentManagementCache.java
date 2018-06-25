package com.x.common.api.syscontentmanagement.param;

import java.io.Serializable;

public class ContentManagementCache implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//地区语言  0、中文 ; 1、英文
    private String regionalLanguage;
    //二级标题
    private String subtititle;
    //
    private String url;
    //排序
    private long sort;
    //状态   0、隐藏 ; 1、显示
    private String state;
	public String getRegionalLanguage() {
		return regionalLanguage;
	}
	public void setRegionalLanguage(String regionalLanguage) {
		this.regionalLanguage = regionalLanguage;
	}
	public String getSubtititle() {
		return subtititle;
	}
	public void setSubtititle(String subtititle) {
		this.subtititle = subtititle;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getSort() {
		return sort;
	}
	public void setSort(long sort) {
		this.sort = sort;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}

package com.x.common.api.syscontentmanagement.param;

import java.io.Serializable;

public class ContentQueryListRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//地区语言  0、中文 ; 1、英文
	private String regionalLanguage;
	//一级标题
    private String titleid;
    //二级标题
    private String subtititle;
    //创建人
    private String aditor;
    // 页码，必填
 	private Integer pageNo;
 	// 每页大小，必填
 	private Integer pageSize;
    
	public String getRegionalLanguage() {
		return regionalLanguage;
	}
	public void setRegionalLanguage(String regionalLanguage) {
		this.regionalLanguage = regionalLanguage;
	}
	public String getTitleid() {
		return titleid;
	}
	public void setTitleid(String titleid) {
		this.titleid = titleid;
	}
	public String getSubtititle() {
		return subtititle;
	}
	public void setSubtititle(String subtititle) {
		this.subtititle = subtititle;
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

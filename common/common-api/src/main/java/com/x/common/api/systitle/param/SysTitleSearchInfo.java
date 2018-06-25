package com.x.common.api.systitle.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SysTitleSearchInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//一级标题id
    private String id;
    //地区语言   zh、中文 ; en、英文
    private String regionalLanguage;
    //站点     1、译云PC 
    private String site;
    //一级标题
    private String title;
    //排序
    private int sort;
    //状态    0、隐藏 ; 1、显示 
    private String state;
    //创建人 
    private String aditor;
    //创建时间
    private Timestamp createTime;
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
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAditor() {
		return aditor;
	}
	public void setAditor(String aditor) {
		this.aditor = aditor;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}

package com.x.common.api.syscontentmanagement.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class ContentSearchInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//内容管理id
    private String id;
    //地区语言    0、中文 ; 1、英文
    private String regionalLanguage;
    //一级标题名称
    private String titleName;
    //二级标题
    private String subtititle;
    //排序
    private long sort;
    //状态     0、隐藏 ; 1、显示
    private String state;
    //创建人
    private String aditor;
    //创建时间
    private Timestamp createTime;
    //类型   0、文本框添加 1、链接地址
    private String type;
    //地区语言翻译
    private String regionalLanguageName;
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
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getSubtititle() {
		return subtititle;
	}
	public void setSubtititle(String subtititle) {
		this.subtititle = subtititle;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegionalLanguageName() {
		return regionalLanguageName;
	}
	public void setRegionalLanguageName(String regionalLanguageName) {
		this.regionalLanguageName = regionalLanguageName;
	}
}

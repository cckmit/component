package com.x.common.api.systitle.param;

import java.io.Serializable;

public class TitleCache implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//id
    private String id;
    //一级标题
    private String title;
    //描述
    private String description;
    //排序
    private int sort;
    //状态
    private String state;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
}

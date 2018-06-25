package com.x.common.api.systitle.param;

import java.io.Serializable;

public class TitleQueryInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//一级标题id
    private String id;
    //一级标题名称
    private String title;
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
}

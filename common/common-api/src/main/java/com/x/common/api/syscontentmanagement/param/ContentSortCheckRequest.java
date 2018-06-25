package com.x.common.api.syscontentmanagement.param;

import java.io.Serializable;

public class ContentSortCheckRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//标题
	private String subtititle;
	//排序
	private int sort;
	public String getSubtititle() {
		return subtititle;
	}
	public void setSubtititle(String subtititle) {
		this.subtititle = subtititle;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
}

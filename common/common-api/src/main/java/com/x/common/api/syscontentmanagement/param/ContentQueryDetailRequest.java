package com.x.common.api.syscontentmanagement.param;

import java.io.Serializable;

public class ContentQueryDetailRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//二级标题id
    private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

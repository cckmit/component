package com.x.common.api.sysadvertmanager.param;

import java.io.Serializable;

public class DeleteSysAdvertManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号
	 */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

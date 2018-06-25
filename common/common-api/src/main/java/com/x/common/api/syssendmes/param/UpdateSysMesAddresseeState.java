package com.x.common.api.syssendmes.param;

import java.io.Serializable;

public class UpdateSysMesAddresseeState implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 *主键
	 */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

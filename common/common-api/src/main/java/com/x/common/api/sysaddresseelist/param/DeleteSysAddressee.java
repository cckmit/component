package com.x.common.api.sysaddresseelist.param;

import java.io.Serializable;

public class DeleteSysAddressee implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键
	 */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

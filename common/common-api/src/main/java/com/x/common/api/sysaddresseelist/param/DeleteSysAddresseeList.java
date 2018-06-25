package com.x.common.api.sysaddresseelist.param;

import java.io.Serializable;

public class DeleteSysAddresseeList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键
	 */
	private String listId;

	public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}
}

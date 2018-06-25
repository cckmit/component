package com.x.common.api.sysduad.param;

import java.io.Serializable;

public class QuerySysDuadById implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号
	 */
	private String duadId;

	public String getDuadId() {
		return duadId;
	}

	public void setDuadId(String duadId) {
		this.duadId = duadId;
	}
}

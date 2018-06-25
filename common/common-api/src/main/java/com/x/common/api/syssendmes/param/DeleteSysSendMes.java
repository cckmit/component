package com.x.common.api.syssendmes.param;

import java.io.Serializable;

public class DeleteSysSendMes implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 *主键
	 */
	private String mesId;

	public String getMesId() {
		return mesId;
	}

	public void setMesId(String mesId) {
		this.mesId = mesId;
	}
}

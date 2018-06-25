package com.x.common.api.sysmailinformation.param;

import java.io.Serializable;

public class MailInformationDeleteRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//邮寄信息id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

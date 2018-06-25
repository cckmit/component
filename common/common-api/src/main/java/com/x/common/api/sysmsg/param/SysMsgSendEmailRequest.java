package com.x.common.api.sysmsg.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SysMsgSendEmailRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * sysmsgid 必填
	 */
	private String id;
	
	private Timestamp sendTime;
	
	private String logoUrl;
	
	private String ermaUrl;
	
	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getErmaUrl() {
		return ermaUrl;
	}

	public void setErmaUrl(String ermaUrl) {
		this.ermaUrl = ermaUrl;
	}
	
	public Timestamp getSendTime() {
		return sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}

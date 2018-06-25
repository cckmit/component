package com.x.common.api.sysmail.param;

import java.sql.Timestamp;

public class SysMailInfo {

	private String id;

    private String userId;

    private String sendUserId;

    private String title;

    private String sysMsgId;

    private Timestamp receiveDate;

    private String status;

    private String sendConten;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSendUserId() {
		return sendUserId;
	}

	public void setSendUserId(String sendUserId) {
		this.sendUserId = sendUserId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSysMsgId() {
		return sysMsgId;
	}

	public void setSysMsgId(String sysMsgId) {
		this.sysMsgId = sysMsgId;
	}

	public Timestamp getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Timestamp receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSendConten() {
		return sendConten;
	}

	public void setSendConten(String sendConten) {
		this.sendConten = sendConten;
	}
    
}

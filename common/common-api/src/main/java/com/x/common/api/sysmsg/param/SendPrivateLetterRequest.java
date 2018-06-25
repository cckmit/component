package com.x.common.api.sysmsg.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SendPrivateLetterRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId;

	private String sendUserId;

	private String title;

	private String sysMsgId;

	private String sendConten;

	/**
	 * 发送类型
	 */
	private String sendType;

	/**
	 * 发送时间
	 */
	private Timestamp sendTime;

	private Boolean allUser;

	public Boolean getAllUser() {
		return allUser;
	}

	public void setAllUser(Boolean allUser) {
		this.allUser = allUser;
	}

	public String getUserId() {
		return userId;
	}

	public String getSendType() {
		return sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public Timestamp getSendTime() {
		return sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
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

	public String getSendConten() {
		return sendConten;
	}

	public void setSendConten(String sendConten) {
		this.sendConten = sendConten;
	}
}

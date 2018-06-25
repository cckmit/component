package com.x.common.api.sysmsg.param;

import java.sql.Timestamp;

import com.x.base.vo.BaseResponse;

public class QueryMessageDetailResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String type;

	private String title;

	private String state;

	private String creatPeople;

	private Timestamp creatTime;

	private String sendType;

	private Timestamp sendTime;

	private Boolean allUser;

	private String sendConten;

	private String reviverIds;

	private String reviverNicks;

	public String getId() {
		return id;
	}

	public String getReviverIds() {
		return reviverIds;
	}

	public void setReviverIds(String reviverIds) {
		this.reviverIds = reviverIds;
	}

	public String getReviverNicks() {
		return reviverNicks;
	}

	public void setReviverNicks(String reviverNicks) {
		this.reviverNicks = reviverNicks;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCreatPeople() {
		return creatPeople;
	}

	public void setCreatPeople(String creatPeople) {
		this.creatPeople = creatPeople;
	}

	public Timestamp getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Timestamp creatTime) {
		this.creatTime = creatTime;
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

	public Boolean getAllUser() {
		return allUser;
	}

	public void setAllUser(Boolean allUser) {
		this.allUser = allUser;
	}

	public String getSendConten() {
		return sendConten;
	}

	public void setSendConten(String sendConten) {
		this.sendConten = sendConten;
	}

}

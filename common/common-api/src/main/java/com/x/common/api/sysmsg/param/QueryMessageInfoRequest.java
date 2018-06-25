package com.x.common.api.sysmsg.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class QueryMessageInfoRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String type;

	private String title;

	private String state;

	private String creatPeople;

	private String sendConten;

	/**
	 * 开始时间
	 */
	private Timestamp timeBegin;
	/**
	 * 结束时间
	 */
	private Timestamp timeEnd;

	private Integer pageNo;

	private Integer pageSize;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public String getSendConten() {
		return sendConten;
	}

	public void setSendConten(String sendConten) {
		this.sendConten = sendConten;
	}

	public Timestamp getTimeBegin() {
		return timeBegin;
	}

	public void setTimeBegin(Timestamp timeBegin) {
		this.timeBegin = timeBegin;
	}

	public Timestamp getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Timestamp timeEnd) {
		this.timeEnd = timeEnd;
	}

}

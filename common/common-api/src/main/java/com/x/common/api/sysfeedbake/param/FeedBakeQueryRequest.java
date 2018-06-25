package com.x.common.api.sysfeedbake.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class FeedBakeQueryRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//用户名
	private String userName;
	//手机号
	private String phoneNum;
	//邮箱
	private String mail;
	//来源
	private String source;
	//问题类型
	private String problemType;
	//反馈时间-开始
	private Timestamp feedBakeTimeBegin;
	//反馈时间-结束
	private Timestamp feedBakeTimeEnd;
	//操作人
	private String handlePeople;
	// 页码，必填
	private Integer pageNo;
	// 每页大小，必填
	private Integer pageSize;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getProblemType() {
		return problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}
	public Timestamp getFeedBakeTimeBegin() {
		return feedBakeTimeBegin;
	}
	public void setFeedBakeTimeBegin(Timestamp feedBakeTimeBegin) {
		this.feedBakeTimeBegin = feedBakeTimeBegin;
	}
	public Timestamp getFeedBakeTimeEnd() {
		return feedBakeTimeEnd;
	}
	public void setFeedBakeTimeEnd(Timestamp feedBakeTimeEnd) {
		this.feedBakeTimeEnd = feedBakeTimeEnd;
	}
	public String getHandlePeople() {
		return handlePeople;
	}
	public void setHandlePeople(String handlePeople) {
		this.handlePeople = handlePeople;
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
}

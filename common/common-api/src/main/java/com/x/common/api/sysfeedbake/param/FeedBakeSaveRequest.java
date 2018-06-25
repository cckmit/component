package com.x.common.api.sysfeedbake.param;

import java.io.Serializable;

public class FeedBakeSaveRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//反馈产品
    private String productName;
    //反馈内容
    private String feedbakeConten;
    
    //用户名
  	private String userName;
  	//手机号
  	private String phoneNum;
  	//邮箱
  	private String mail;
  	//来源
  	private String feedbakeSource;
  	//问题类型        0：网站建议; 1：故障问题;2：咨询帮助;3：其他
  	private String problemType;
    
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getFeedbakeConten() {
		return feedbakeConten;
	}
	public void setFeedbakeConten(String feedbakeConten) {
		this.feedbakeConten = feedbakeConten;
	}
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
	public String getProblemType() {
		return problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}
	public String getFeedbakeSource() {
		return feedbakeSource;
	}
	public void setFeedbakeSource(String feedbakeSource) {
		this.feedbakeSource = feedbakeSource;
	}
}

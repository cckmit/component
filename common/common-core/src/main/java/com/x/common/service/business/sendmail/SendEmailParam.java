package com.x.common.service.business.sendmail;

import java.io.Serializable;


public class SendEmailParam  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户 email 必传
	 */
	private String email;
	/**
	 * 标题 必传
	 */
	private String subject;
	/**
	 * 内容  必传
	 */
	private StringBuilder content;
	/**
	 * 用户ID 必传
	 */
	private String userId;
	/**
	 * msg  必传
	 */
	private String msgId;
	/**
	 *    必传
	 */
	private Boolean allUser;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public StringBuilder getContent() {
		return content;
	}
	public void setContent(StringBuilder content) {
		this.content = content;
	}
	public Boolean getAllUser() {
		return allUser;
	}
	public void setAllUser(Boolean allUser) {
		this.allUser = allUser;
	}
	
	
	
	

}

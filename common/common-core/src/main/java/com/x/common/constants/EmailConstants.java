package com.x.common.constants;



public final class EmailConstants {
	private EmailConstants() {

	}
	/** 邮件中文模版 */
	public static final String EMAIL_ZH_CN_TEMPLATE = "email/template/sendEmail_zh_cn-mail.xml";
	public static final String MAIL_SMTP_AUTH = "true";
	public static final String MAIL_SMTP_TIMEOUT = "25000";
	
	public static final int MAX_SEND_COUNT=100;
	
	/**
	 * 
	 * 发送对象
	 */
	public static final class SendObject{
		private SendObject(){}
		/**
		 * 全站用户
		 */
		public static final String ALL_USER = "0";
		/**
		 * 自定义用户
		 */
		public static final String CUSTOMIZE_USER = "1";
	}
	
	 /* 
	 *  用户发送状态
	 */
	public static final class State{
		private State(){}
		/*0：未发送  1：已发送  2:发送失败*/
		public static final String UNSENT = "0";
		public static final String SEND_SUCCESS = "1";
		public static final String SEND_FAILURE = "2";
		
	}
	
	 /* 
	 *  发送状态
	 */
	public static final class MsgState{
		private MsgState(){}
		/*0：未发送  1：已发送 */
		public static final String UNSENT = "0";
		public static final String SEND_SUCCESS = "1";
		
	}
	
	public static final class Type{
		private Type(){}
		/*0：站内信  1：邮件*/
		public static final String STATION_LETTER = "0";
		public static final String EMAIL = "1";
		
	}
	
	public static final class SendType{
		private SendType(){}
		/*1:立即发送  2:指定时间*/
		public static final String IMMEDIATELY = "1";
		public static final String CUSTOMIZE_TIME = "2";
		
	}
	
}

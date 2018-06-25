package com.x.common.service.business.sendmail;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EmailManagSender  implements Callable<Boolean>, Serializable{
	
	private static final Logger logger=LoggerFactory.getLogger(EmailManagSender.class);
	private static final long serialVersionUID = 1L;
	/**
	 * 邮件服务器配置  必传
	 */
	private Map<String,String> emailSetting;
	/**
	 * 必传
	 */
	private List<SendEmailParam> sendEmailParam;

	public EmailManagSender(Map<String, String> emailSetting, List<SendEmailParam> sendEmailParam) {
		super();
		this.emailSetting = emailSetting;
		this.sendEmailParam = sendEmailParam;
	}
	
	public synchronized Boolean call() throws Exception {
		logger.info("线程启动并运行： " + Thread.currentThread().getName());  
		logger.info("开始执行任务 "+SendMail.class.getName());
		Boolean isOk = SendMail.sendEmail(emailSetting, sendEmailParam);
		logger.info("执行任务结果为:"+(isOk==true?"成功":"失败"));
		return isOk;
	}
	
}

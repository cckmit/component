package com.x.common.service.business.sendmail;

//import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
//import java.util.Properties;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.mail.MailException;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//import org.springframework.mail.javamail.MimeMessageHelper;

import com.x.base.exception.BusinessException;
import com.x.common.dao.mapper.bo.SysMsgReceiver;
import com.x.common.dao.mapper.bo.SysMsgReceiverCriteria;
import com.x.common.service.atom.sysmsgreceiver.ISysMsgReceiverAtomSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.StringUtil;
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SendMail {
	
	private static final Logger logger = LoggerFactory.getLogger(SendMail.class);
	
	private static ISysMsgReceiverAtomSV iSysMsgReceiverAtomSV;
	private static ApplicationContext ctx=null;  
	
	static{  
        ctx = new ClassPathXmlApplicationContext("/context/core-context.xml");  
        iSysMsgReceiverAtomSV = (ISysMsgReceiverAtomSV) ctx.getBean(ISysMsgReceiverAtomSV.class);     
    }  
	
	public static Boolean sendEmail(Map<String, String> emailSetting, List<SendEmailParam> sendEmailParam) {
//		logger.info("================【sendEmail start】================");
//		Boolean isOk = false;
//		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
//        // 设置邮件服务器
//        javaMailSender.setHost(emailSetting.get("HostName"));
//        javaMailSender.setPort(Integer.valueOf(emailSetting.get("Smtpport")));
//        javaMailSender.setUsername(emailSetting.get("User"));
//        javaMailSender.setPassword(emailSetting.get("Password"));
//        javaMailSender.setDefaultEncoding(emailSetting.get("Charset"));
//        
//        Properties properties = new Properties();
//        properties.put("mail.smtp.auth",EmailConstants.MAIL_SMTP_AUTH);  // 验证用户名和密码
//        properties.put("mail.smtp.timeout",EmailConstants.MAIL_SMTP_TIMEOUT);
//        int len = sendEmailParam.size();
//		MimeMessage[] mimeMessageList = new MimeMessage[len];	// 注意：是数组类型
//		MimeMessageHelper messageHelper = null;
//		String userId = "";
//		String msgId = "";
//		Boolean allUser=true;
//        try {
//        	for(int i = 0; i < len; ++i) {
//        		SendEmailParam param = new SendEmailParam();
//        		param = sendEmailParam.get(i);
//        		String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";    
//				Pattern regex = Pattern.compile(check); 
//				Matcher matcher = regex.matcher(param.getEmail());    
//				boolean isMatched = matcher.matches();  
//				 if(!isMatched){
//					 logger.info("用户【"+userId+"】邮箱【"+param.getEmail()+"】错误"); 
//					 logger.error("给用户【"+param.getEmail()+"】发送邮件失败。。。。。。。。。。。");
//					 if(!allUser){
//							updateSysMsgState(allUser,msgId,userId,EmailConstants.State.SEND_FAILURE);
//						}
//					 continue;
//				 }
//        		logger.info("开始给用户【"+param.getEmail()+"】发送邮件。。。。。。。。。。。");
//        		userId = param.getUserId();
//        		msgId = param.getMsgId();
//        		allUser = param.getAllUser();
//    			mimeMessageList[i] = javaMailSender.createMimeMessage();
//    			try {
//    				messageHelper = new MimeMessageHelper(mimeMessageList[i], true, "UTF-8");
//					messageHelper.setFrom(emailSetting.get("FromMail"), emailSetting.get("FromName"));
//					messageHelper.setTo(param.getEmail());
//					messageHelper.setSubject(param.getSubject());
//					messageHelper.setText(param.getContent().toString(),true);
//				} catch (UnsupportedEncodingException e) {
//					if(!allUser){
//						updateSysMsgState(allUser,msgId,userId,EmailConstants.State.SEND_FAILURE);
//					}
//					  logger.error("给用户【"+param.getEmail()+"】发送邮件失败。。。。。。。。。。。",e);
//				} catch (MessagingException e) {
//					if(!allUser){
//						updateSysMsgState(allUser,msgId,userId,EmailConstants.State.SEND_FAILURE);
//					}
//					 logger.error("给用户【"+param.getEmail()+"】发送邮件失败。。。。。。。。。。。",e);
//				}
//    	        javaMailSender.setJavaMailProperties(properties);
//                // 发送邮件
//                javaMailSender.send(mimeMessageList[i]);
//                if(!allUser){
//                	updateSysMsgState(allUser,msgId,userId,EmailConstants.State.SEND_SUCCESS);	
//                }
//                logger.info("给用户【"+param.getEmail()+"】发送邮件成功。。。。。。。。。。。");
//    		}
//        	isOk = true;
//        } catch (MailException e) {
//			if(!allUser){
//				updateSysMsgState(allUser,msgId,userId,EmailConstants.State.SEND_FAILURE);
//			}
//        	logger.error("邮件发送失败-- MailException", e);
//		}catch (Exception e) {
//			if(!allUser){
//				updateSysMsgState(allUser,msgId,userId,EmailConstants.State.SEND_FAILURE);
//			}
//			logger.error("邮件发送失败:", e);
//		}
//        logger.info("================【sendEmail end】================");
//        return isOk;
		 return true;
	}
	
	public static void updateSysMsgState(Boolean allUser, String msgId,String userId,String state){
		logger.info("================【updateSysMsgState start】================");
		if(!allUser){
			SysMsgReceiver records = new SysMsgReceiver();
	    	records.setMsgId(msgId);
	    	records.setUserId(userId);
	    	Timestamp time = new Timestamp(System.currentTimeMillis());
	    	records.setSendDate(time);
	    	records.setSendStatus(state);
	    	try {
	    		updateSysMsgReceiverState(records);
	    		logger.info("SysMsgReceiver表参数【msgId="+msgId+";userId="+userId+";】更新状态成功");
			} catch (BusinessException e) {
				logger.error("SysMsgReceiver表参数【msgId="+msgId+";userId="+userId+";】更新状态失败", e);
			}
		}
		logger.info("================【updateSysMsgState end】================");
	}
	
	public static int updateSysMsgReceiverState(SysMsgReceiver record) {
		SysMsgReceiverCriteria example = new SysMsgReceiverCriteria();
		SysMsgReceiverCriteria.Criteria criteria = example.createCriteria();
		if (StringUtil.isBlank(record.getUserId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "用户id不能为空");
		}
		if (StringUtil.isBlank(record.getMsgId()) ) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "msgid不能为空");
		}
		criteria.andMsgIdEqualTo(record.getMsgId());
		criteria.andUserIdEqualTo(record.getUserId());
		return iSysMsgReceiverAtomSV.updateByExampleSelective(record, example);
	}

	
	

}

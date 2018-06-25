package com.x.common.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//import org.apache.commons.mail.EmailException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.x.base.exception.SystemException;
import com.x.sdk.mail.EmailUtil;
import com.x.sdk.util.StringUtil;

public class SendEmailUtil {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(SendEmailUtil.class);

	private static Properties prop = new Properties();

	private SendEmailUtil() {
	}

	public static Map<String,String> getHtmlEmail() {
		String hostName = prop.getProperty("email.hostname");
		String user = prop.getProperty("email.from.user");
		String password = prop.getProperty("email.from.password");
		String mail = prop.getProperty("email.from.mail");
		String name = prop.getProperty("email.from.name");
		String smtpportStr = prop.getProperty("email.smtpport");
		String  smtpport = "25";
		if(!StringUtil.isBlank(smtpportStr)) {
			smtpport = smtpportStr;
		}
		Map<String,String> email = new HashMap<String,String>();
		email.put("Charset", "utf-8");
		email.put("HostName", hostName);
		email.put("User", user);
		email.put("Password", password);
		email.put("FromMail", mail);
		email.put("FromName", name);
		email.put("Smtpport", smtpport);
		if(StringUtil.isBlank(hostName)) {
			email= null;
		}
		return email;
	}

	static {
		InputStream is = EmailUtil.class.getClassLoader().getResourceAsStream("email/email-conf.properties");

		try {
			prop.load(is);
		} catch (IOException var2) {
			LOGGER.error("加载email配置出错",var2);
			throw new SystemException("加载email配置出错", var2);
		}
	}

}

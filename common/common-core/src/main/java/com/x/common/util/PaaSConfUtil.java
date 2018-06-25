package com.x.common.util;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SSO配置文件工具类
 *
 * Date: 2015年11月29日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public final class PaaSConfUtil {

    private static final Logger LOG = LoggerFactory.getLogger(PaaSConfUtil.class);

    //paas-conf.properties属性文件
    private static Properties prop = new Properties();
    
    public static Properties getProp() {
		return prop;
	}
	public static void setProp(Properties prop) {
		PaaSConfUtil.prop = prop;
	}
	private PaaSConfUtil() {
    }

    static {
        try {

            InputStream inStream = PaaSConfUtil.class.getClassLoader().getResourceAsStream(
                    "paas/paas-conf.properties");
            prop.load(inStream);
            LOG.debug("加载paas-conf.properties完毕");
        } catch (Exception e) {
            LOG.error("加载paas-conf.properties失败，具体原因：" + e.getMessage(), e);
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key, "").trim();
    }
    
    public static String getCurrSrvArea(){
    	return getProperty("srvarea.curr");
    }
    
    public static String[] getAllSrvArea(){
    	String allAreas=getProperty("srvarea.all");
    	String[] allAreaArr=allAreas.split(",");
    	return allAreaArr;
    }
    
    public static void main(String[] args) {
		System.out.println(getProperty("srvarea.all"));
		System.out.println(getProperty("srvarea.curr"));
	}

}

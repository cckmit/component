package com.x.common.api.cachekey.model;

import java.io.Serializable;

/**
 * @Description: 首页配置信息
 * @author auth
 * @date 2016年11月4日 上午10:45:25 
 * @version V1.0
 */
public class HomeDataConfig implements Serializable{
	
	private static final long serialVersionUID = -3361514522751551247L;

	/**
	 * 语料数
	 */
	private String lgdataNum;

    /**
     * 客户数
     */
    private String customNum;

    /**
     * 译员数
     */
    private String interpreterNum;

    /**
     * 订单数
     */
    private String orderNum;

    /**
     * 语种数
     */
    private String languageNum;

	public String getLgdataNum() {
		return lgdataNum;
	}

	public void setLgdataNum(String lgdataNum) {
		this.lgdataNum = lgdataNum;
	}

	public String getCustomNum() {
		return customNum;
	}

	public void setCustomNum(String customNum) {
		this.customNum = customNum;
	}

	public String getInterpreterNum() {
		return interpreterNum;
	}

	public void setInterpreterNum(String interpreterNum) {
		this.interpreterNum = interpreterNum;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getLanguageNum() {
		return languageNum;
	}

	public void setLanguageNum(String languageNum) {
		this.languageNum = languageNum;
	}
    
    

}

package com.x.common.api.sysconfig.param;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 首页数据编辑配置
 * @author auth
 * @date 2016年11月1日 下午4:24:34 
 * @version V1.0
 */
public class HomeDataEidtConfig extends BaseResponse {
	
	private static final long serialVersionUID = 2738646326588078437L;

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

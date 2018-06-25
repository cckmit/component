package com.x.common.api.sysduad.param;

import java.io.Serializable;

/**
 * @author auth
 * @date 2016年11月1日 下午7:33:48 
 * @version V1.0
 */
public class QuerySysDuadListReq implements Serializable {
	
	private static final long serialVersionUID = -1224018640025733494L;
	
	  /**
     * 口译
     */
    public static final String ORDER_TYPE_ORAL = "2";

    /**
     * 文档翻译
     */
    public static final String ORDER_TYPE_DOC = "1";

    /**
     * 快速翻译
     */
    public static final String ORDER_TYPE_FAST = "0";

	/**
	 * 语言
	 */
	private String language;
	
	/**
	 * 订单类型，文档翻译：1；口译：2；快速翻译：0 
	 */
	private String orderType;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	
	

}

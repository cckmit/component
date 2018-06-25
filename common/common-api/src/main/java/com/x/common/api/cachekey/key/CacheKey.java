package com.x.common.api.cachekey.key;

import java.io.Serializable;

/**
 * @Description: 缓存键值
 * @author auth
 * @date 2016年11月3日 上午10:35:19 
 * @version V1.0
 */
/**
 * @Description: TODO
 * @author auth
 * @date 2016年11月21日 下午3:19:26 
 * @version V1.0
 */
public class CacheKey implements Serializable {

	private static final long serialVersionUID = 3633287499459454094L;
	
	public final static class OrderType{
		private OrderType(){}
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
	}
	
	/**
	 * 语言对
	 */
	public static final String DUAD_L_KEY = "DUAD_L";
	
	public static final String DUAD_D_KEY = "DUAD_D";
	
	/**
	 * 领域
	 */
    public static final String DOMAIN_L_KEY = "DOMAIN_L"; 
    
	public static final String DOMAIN_D_KEY = "DOMAIN_D";
	
	/**
	 * 用途
	 */
    public static final String PURPOSE_L_KEY = "PURPOSE_L";  
    
	public static final String PURPOSE_D_KEY = "PURPOSE_D";
	
	/**
	 * SEO
	 */
	public static final String SEOMANAGER_D_KEY = "SEOMANAGER_D";
	
	/**
	 * 广告
	 */
	public static final String ADVERTMANAGER_D_KEY = "ADVERTMANAGER_D";
	
	/**
	 *一级标题
	 */
	public static final String TITLE_D_KEY = "TITLE_D";
	/**
	 *内容管理
	 */
	public static final String CONTENTMANAGER_D_KEY = "CONTENTMANAGER_D";
	
	/**
	 * 首页数据配置
	 */
	public static final String HOME_DATA_CONFIG_KEY = "HOME_DATA_CONFIG";
	/**
	 * PC公告信息
	 */
	public static final String NOTICE_PC = "NOTICE_PC";
	/**
	 * WAP公告信息
	 */
	public static final String NOTICE_WAP = "NOTICE_WAP";
	/**
	 * 国家
	 */
    public static final String COUNTRY_L_KEY = "COUNTRY_L"; 
    
	public static final String COUNTRY_D_KEY = "COUNTRY_D";

}

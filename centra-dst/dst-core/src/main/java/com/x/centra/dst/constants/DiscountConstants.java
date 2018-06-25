package com.x.centra.dst.constants;

/**
 * 权益变量表
 * @author wangluyang
 *
 */
public final class DiscountConstants {
	private DiscountConstants(){}
	//客户注册类型
	
	/**
	 * 
	 * @author wangluyang
	 *
	 */
	public static final class Status{
		private Status(){}
		public static final String NON_VERIFY = "0";//0：未激活
		public static final String EFFECTIVE = "1";//1：生效
		public static final String INVALID = "2";//2：过期，失效
	}
	
	public static final class DeleteStatus{
		private DeleteStatus(){}
		public static final String DELETED = "0";//0：删除
		public static final String EFFECTIVE = "1";//1：生效
	}
	
	//认证状态
	public static final class VerifyStatus{
		private VerifyStatus(){}
		public static final String NON_VERIFY="0";//0：未认证
		public static final String VERIFY_SUCESS="1";//1：认证成功
		public static final String VERIFY_FAILURE="2";//2：认证失败
	}
	
	//提醒索引
	public static final class RemindIndex{
		private RemindIndex(){}
		public static final String NON_REMIND="0";//0：未提醒
	}
	
	//提醒状态
	public static final class RemindState{
		private RemindState(){}
		public static final String EFFECTIVE="1";//1：生效
		public static final String INVALID = "2";//2：过期，失效
	}
	
	//提醒状态
	public static final class DiscountRemindState{
		private DiscountRemindState(){}
		public static final String EFFECTIVE="0";//生效时提醒
		public static final String INVALID = "1";//失效后提醒
	}
	
	/**
	 * 时间单位
	 * @author wangluyang
	 *
	 */
	public static final class TimeUnit{
		private TimeUnit(){}
		/**
		 * 小时
		 */
		public static final String HOUR="hour";
		/**
		 * 天
		 */
		public static final String DAY="day";
		/**
		 * 周
		 */
		public static final String WEEK="week";
		/**
		 * 月
		 */
		public static final String MONTH="month";
		/**
		 * 季度
		 */
		public static final String QUARTER="quarter";
		/**
		 * 年
		 */
		public static final String YEAR="year";
	}
	
	public static final class Seq{

		private Seq() {}
		/**
		 * 权益信息表
		 */
		public static final String DST_DISCOUNT_INFO_DISCOUNT_ID_SEQ = "DST_DISCOUNT_INFO$DISCOUNT_ID$SEQ";
		
		/**
		 * 权益规则表
		 */
		public static final String DST_DISCOUNT_RULE_DISCOUNT_RULE_ID_SEQ = "DST_DISCOUNT_RULE$DISCOUNT_RULE_ID$SEQ";
		
		/**
		 * 权益信息实例id
		 */
		public static final String DST_DISCOUNT_RULE_HISTORY_INSTANCE_ID_SEQ = "DST_DISCOUNT_RULE_HISTORY$INSTANCE_ID$SEQ";
		
		/**
		 * 权益类型id
		 */
		public static final String DST_DISCOUNT_CLASS_CLASS_ID_SEQ = "DST_DISCOUNT_CLASS$CLASS_ID$SEQ";
		
		/**
		 * 权益级别id
		 */
		public static final String DST_DISCOUNT_LEVEL_LEVEL_ID_SEQ = "DST_DISCOUNT_LEVEL$LEVEL_ID$SEQ";
		
		/**
		 * 会员权益主体实例id
		 */
		public static final String DST_CUST_DISCOUNT_INSTANCE_INSTANCE_ID_SEQ = "DST_CUST_DISCOUNT_INSTANCE$INSTANCE_ID$SEQ";
	}
	
	/**
	 * 图片存储命名空间
	 */
	public static final String DSS_PATH="com.x.centra.dst";
	
	/**
	 * mds消息消费命名空间
	 */
	public static final String MDS_PROCESSOR_PATH="com.x.centra.dst.mds.processor";
	
	/**
	 * 提醒消息命名空间
	 */
	public static final String MDS_PATH_REMIND_DISCOUNT = "com.x.centra.dst.remindDiscount";
	
	/**
	 * 提醒消息msgVersion
	 */
	public static final String MDS_MSG_VERSION = "1.0";
	
	/** 缓存命名空间 */
    public static final String CACHE_NAMESPACE = "com.x.centra.dst.cache";
    
    /**
     * 提醒map缓存key
     */
    public static final String DISCOUNT_CACHE_REMIND_MAP_KEY_STR = "com.x.centra.dst.cache.discountRemindMap";
	
	public static final String DISCOUNT_CODE_SPLIT = "\\|\\|";
	
}

package com.x.common.constants;

/**
 * Created by astraea on 2015/7/27.
 */
public final class Constants {

    private Constants() {
        // non
    }
    
    public final static String ZH_CN = "zh_CN";
    /**
     * pc站点
     */
    public final static String SITE = "1";
    /**
     * wap站点
     */
    public final static String SITE2 = "2";
    public final static String ZH = "zh";
    public final static String EN = "en";

    public final static class TenantId {
        private TenantId() {
        }

        public final static String ALL_TENANT = "ALL";
    }

    public final static class StaffState {
        private StaffState() {
        }

        public final static String ONLINE = "1";

        public final static String OFFLINE = "0";
    }

    public final static class DepartState {
        private DepartState() {
        }

        public final static String ACTIVITY = "1";

        public final static String INACTIVITY = "0";
    }

    public final static class AreaState {
        private AreaState() {
        }

        public final static String ACTIVITY = "1";

        public final static String INACTIVITY = "0";
    }

    public final static class DepartLevel {
        private DepartLevel() {
        }

        // 全国对应的部门级别
        public final static String NATION = "0";

        // 省级对应的部门级别
        public final static String PROVINCE = "1";

        // 市级对应的部门级别
        public final static String CITY = "2";

        // 区域对应的部门级别
        public final static String AREA = "3";

        // 全国默认地区代码
        public final static String NATION_CODE = "00";

        // 默认省级地区代码
        public final static String PROVINCE_CODE = "000";
    }

    public final static class GnSubject {
        private GnSubject() {
        }

        public final static class SubjectType {
            private SubjectType() {
            }

            // 科目类型，资金科目
            public final static String FUND = "9";
        }

        // 所有行业0
        public final static String ALL_INDUSTRY = "0";
    }

    public final static class ErrorCode {
        private ErrorCode() {
        }

        public static final String RESULT_NULL_ERROR = "10001";

        public static final String RESULT_ERROR = "10002";
    }

    public final static class SEQ {
        private SEQ() {
        }

        public static final String DEPART_ID_SEQ = "GN_DEPART$DEPART_ID$SEQ";

        public static final String STAFF_ID_SEQ = "GN_STAFF$STAFF_ID$SEQ";

        public static final String AREA_CODE_SEQ = "GN_AREA$AREA_CODE$SEQ";
        
        public static final String PURPOSE_ID_SEQ = "SYS$PURPOSE$ID";

        public static final String DOMAIN_ID_SEQ = "SYS$DOMAIN$ID";

        public static final String DUAD_ID_SEQ = "SYS$DUAD$ID";
        
        public static final String ITEMBANK_BID_SEQ = "SYS$ITEMBANK$BID";
        
        public static final String QUESTIONS_QID_SEQ = "SYS$QUESTIONS$QID";
        
        public static final String SENSITIVE_ID_SEQ = "SYS$SENSITIVE$ID";

        public static final String GN_COUNTRY_ID_SEQ = "SYS$GNCOUNTRY$ID";

        public static final String SEOMANAGER_ID_SEQ = "SYS$SEOMANAGER$ID";
        
        public static final String ADVERTMANAGER_ID_SEQ = "SYS$ADVERTMANAGER$ID";
        
        public static final String MESMODEL_MODELID_SEQ = "SYS$MESMODEL$MODELID";
        
        public static final String ADDRESSEELIST_LISTID_SEQ = "SYS$ADDRESSEELIST$LISTID";
        
        public static final String ADDRESSEE_ID_SEQ = "SYS$ADDRESSEE$ID";
        
        public static final String SENDMES_MESID_SEQ = "SYS$SENDMES$MESID";
        
        public static final String MESADDRESSEE_ID_SEQ = "SYS$MESADDRESSEE$ID";
    }
    
    public final static class SysConfig {
        private SysConfig() {
        }

        /**
         * 显示
         */
        public static final String STATE_SHOW = "0";

        /**
         * 隐藏
         */
        public static final String STATE_HIDE = "1";
    }
    
    public final static class SysPurpose {
        private SysPurpose() {
        }

        /**
         * 显示
         */
        public static final String STATE_SHOW = "0";

        /**
         * 隐藏
         */
        public static final String STATE_HIDE = "1";
    }
    
    public final static class SysDuad {
        private SysDuad() {
        }
        
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
         * 显示
         */
        public static final String STATE_SHOW = "0";

        /**
         * 隐藏
         */
        public static final String STATE_HIDE = "1";
    }
    
    //意见反馈处理状态
    public final static class HandleType {
        private HandleType() {}
        /** 已处理*/
        public final static String  ALREADY_PROCESSED  = "1";
        /** 待处理*/
        public final static String PENDING = "0";
    }
    //发票类型
    public final static class InvoiceType {
    	private InvoiceType() {}
    	/** 普通发票*/
    	public final static String  GENERAL_INVOICE  = "0";
    	/** 增值税发票*/
    	public final static String  ADDED_TAX_INVOICE  = "1";
    }
    
    //运营平台发票状态
    public final static class InvoiceState {
    	private InvoiceState() {}
    	/** 待审核*/
    	public final static String  PENDING_AUDIT = "10";
    	/** 审核不通过(锁定)*/
    	public final static String  LOCKING  = "11";
    	/** 待开票*/
    	public final static String  PENDING_BILLING  = "12";
    	/** 待邮寄*/
    	public final static String  TO_POST = "13";
    	/** 已完成*/
    	public final static String  COMPLETED  = "14";
    }
    
    //前台发票显示状态
    public final static class FrontInvoiceState {
    	private FrontInvoiceState() {}
    	/** 待开票-前台*/
    	public final static String  FRONT_PENDING_BILLING = "0";
    	/** 开票中-前台*/
    	public final static String  FRONT_BILLING  = "1";
    	/** 已开票-前台*/
    	public final static String  FRONT_INVOICED  = "2";
    }
    
    //发票审核标识
    public final static class InspectSign {
    	private InspectSign() {}
    	/** 审核通过*/
    	public final static String  AUDITED = "1";
    	/** 审核不通过(锁定)*/
    	public final static String NOT_AUDITED = "0";
    }
    
    //能开具发票的订单状态
    public final static class OrderState {
    	private OrderState() {}
    	  /** 待评价*/
    	public final static String WAIT_JUDGE_STATE = "52";
    	/** 已评价*/
    	public final static String JUDGED_STATE = "53";
    }
    
    //发票内容
    public final static class InvoiceContent {
    	private InvoiceContent() {}
    	public final static String CONTENT = "翻译费";
    }

    public final static class UserResultCode{
    	public UserResultCode(){}
    	  /**
         * 用户侧成功
         */

        public static final String USER_SUCCESS="1";

    }
    
    public final static class MsgCode{
    	public MsgCode(){}
    	/**
    	 * 站内信
    	 */
    	
    	public static final String Msg="0";
    	
    }
    
    public final static class MsgSendTypeCode{
    	public MsgSendTypeCode(){}
    	/**
    	 * 立即发送
    	 */
    	
    	public static final String NOW="1";
    	
    	/**
    	 * 指定時間
    	 */
    	
    	public static final String TIME="2";
    	
    }
    public final static class SendState{
    	public SendState(){}
    	/**
    	 * 未发送
    	 */
    	
    	public static final String NOT_SEND="0";
    	
    	/**
    	 * 已发送
    	 */
    	
    	public static final String SEND="1";
    	
    }
    public final static class RecieveSendState{
    	public RecieveSendState(){}
    	/**
    	 * 未发送
    	 */
    	
    	public static final String NOT_SEND="0";
    	
    	/**
    	 * 已发送
    	 */
    	
    	public static final String SEND="1";
    	/**
    	 * 发送失败
    	 */
    	
    	public static final String SEND_FAIL="2";
    	
    	
    	
    }
    
    public final static class ReadCode{
    	public ReadCode(){}
    	/**
    	 * 未读
    	 */
    	
    	public static final String NOTREAD="0";
    	
    	/**
    	 * 已读
    	 */
    	
    	public static final String READ="1";
    	
    }
    
    public final static class OperationCode{
    	public OperationCode(){}
    	/**
    	 * 运营后台
    	 */
    	
    	public static final String OPERATION_CODE="0";
    	
    }
    public final static class JobPre{
    	public JobPre(){}
    	/**
    	 *	job前缀
    	 */
    	
    	public static final String MSG_JOB="MSG_JOB:";
    	
    }
    
    //帮助中心-状态
    public final static class HelpCenter {
    	private HelpCenter() {}
    	/** 显示*/
    	public final static String  SHOW_STATE = "1";
    	/** 隐藏*/
    	public final static String  HIDDEN_STATE  = "0";
    }
}

package com.x.common.util;

import com.x.sdk.component.sequence.util.SeqUtil;

public final class SequenceUtil {


	/** 意见反馈标识序列*/
	private static final String SYS$SYSFEEDBAKE$ID = "SYS$SYSFEEDBAKE$ID";
	/** 邮寄信息标识序列*/
	private static final String SYS$SYSMAILINFORMATION$ID = "SYS$SYSMAILINFORMATION$ID";
	/** 订单发票标识序列*/
	private static final String SYS$SYSORDERINVOICE$ID = "SYS$SYSORDERINVOICE$ID";
	/** 一级标题标识序列*/
	private static final String SYS$SYSTITLE$ID = "SYS$SYSTITLE$ID";
	/** 内容管理标识序列*/
	private static final String SYS$SYSCONTENTMANAGEMENT$ID = "SYS$SYSCONTENTMANAGEMENT$ID";  

	public static String createSysFeedBakeId() {
		return SeqUtil.getNewId(SYS$SYSFEEDBAKE$ID).toString();
	}
	
	public static String createSysMailInformationId() {
		return SeqUtil.getNewId(SYS$SYSMAILINFORMATION$ID).toString();
	}
	
	public static String createSysOrderInvoiceId() {
		return SeqUtil.getNewId(SYS$SYSORDERINVOICE$ID).toString();
	}
	public static String createSysTitleId() {
		return SeqUtil.getNewId(SYS$SYSTITLE$ID).toString();
	}
	public static String createContentId() {
		return SeqUtil.getNewId(SYS$SYSCONTENTMANAGEMENT$ID).toString();
	}
}

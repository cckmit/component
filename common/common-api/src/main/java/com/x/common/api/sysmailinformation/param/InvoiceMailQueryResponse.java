package com.x.common.api.sysmailinformation.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class InvoiceMailQueryResponse  extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//发票邮寄信息
	private List<MailInfo> mailInfos;

	public List<MailInfo> getMailInfos() {
		return mailInfos;
	}

	public void setMailInfos(List<MailInfo> mailInfos) {
		this.mailInfos = mailInfos;
	}
}

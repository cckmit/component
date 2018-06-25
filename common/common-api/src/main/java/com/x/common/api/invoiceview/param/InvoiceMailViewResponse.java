package com.x.common.api.invoiceview.param;

import java.util.List;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class InvoiceMailViewResponse  extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//订单发票分页数据
	private PageInfo<OrderInvoiceInfo> pageInfo;
	
	//发票邮寄信息
	private List<MailInformationInfo> mailInfos;

	public PageInfo<OrderInvoiceInfo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<OrderInvoiceInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}

	public List<MailInformationInfo> getMailInfos() {
		return mailInfos;
	}

	public void setMailInfos(List<MailInformationInfo> mailInfos) {
		this.mailInfos = mailInfos;
	}
}

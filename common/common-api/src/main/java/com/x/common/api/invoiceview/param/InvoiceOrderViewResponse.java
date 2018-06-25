package com.x.common.api.invoiceview.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class InvoiceOrderViewResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	//订单发票分页数据
	private PageInfo<OrderInvoiceInfo> pageInfo;


	public PageInfo<OrderInvoiceInfo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<OrderInvoiceInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

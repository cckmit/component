package com.x.common.api.sysorderinvoice.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class OrderInvoiceQueryResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 分页数据
	private PageInfo<SysOrdInvoiceSearchInfo> pageInfo;

	public PageInfo<SysOrdInvoiceSearchInfo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<SysOrdInvoiceSearchInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

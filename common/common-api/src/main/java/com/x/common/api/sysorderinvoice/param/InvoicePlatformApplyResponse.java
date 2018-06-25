package com.x.common.api.sysorderinvoice.param;

import com.x.base.vo.BaseResponse;

public class InvoicePlatformApplyResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  //订单发票id
    private String invoiceId;

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
}

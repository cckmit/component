package com.x.common.api.sysorderinvoice.param;

import java.io.Serializable;

public class OrderInvoiceQueryDetailRequest implements Serializable{

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

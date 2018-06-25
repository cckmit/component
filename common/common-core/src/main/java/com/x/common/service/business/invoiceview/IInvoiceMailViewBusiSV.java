package com.x.common.service.business.invoiceview;

import com.x.common.api.invoiceview.param.InvoiceMailViewRequest;
import com.x.common.api.invoiceview.param.InvoiceMailViewResponse;
import com.x.common.api.invoiceview.param.InvoiceOrderViewResponse;

public interface IInvoiceMailViewBusiSV {
	
	public InvoiceMailViewResponse view(InvoiceMailViewRequest request);

	public InvoiceOrderViewResponse load(InvoiceMailViewRequest request);
}

package com.x.common.service.business.sysorderinvoice;

import java.util.List;

import com.x.common.api.sysorderinvoice.param.InvoiceBatchInspectRequest;
import com.x.common.api.sysorderinvoice.param.InvoiceBillMailRequest;
import com.x.common.api.sysorderinvoice.param.InvoicePlatformApplyRequest;
import com.x.common.api.sysorderinvoice.param.InvoicePlatformApplyResponse;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceApplyRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceInspectRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryDetailRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryDetailResponse;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryResponse;

public interface ISysOrderInvoiceBusiSV {
	
	public OrderInvoiceQueryResponse queryList(OrderInvoiceQueryRequest request);

	public void apply(OrderInvoiceApplyRequest request);

	public OrderInvoiceQueryDetailResponse queryDetail(OrderInvoiceQueryDetailRequest request);

	public void inspect(OrderInvoiceInspectRequest request);

	public void batchInspect(List<String> invoiceIds,InvoiceBatchInspectRequest request);

	public InvoicePlatformApplyResponse platformApply(InvoicePlatformApplyRequest request);

	public void invoiceBillMail(InvoiceBillMailRequest request);
}

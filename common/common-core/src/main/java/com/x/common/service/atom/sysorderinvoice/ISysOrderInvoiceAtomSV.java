package com.x.common.service.atom.sysorderinvoice;

import java.util.List;

import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryRequest;
import com.x.common.dao.mapper.bo.SysOrderInvoice;

public interface ISysOrderInvoiceAtomSV {

	int count(OrderInvoiceQueryRequest request);

	List<SysOrderInvoice> queryList(OrderInvoiceQueryRequest request);

	void insert(SysOrderInvoice orderInvoice);

	SysOrderInvoice selectById(String invoiceId);
	
	int update(SysOrderInvoice orderInvoice);

}

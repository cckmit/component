package com.x.common.api.sysorderinvoice.param;

import java.io.Serializable;
import java.util.List;

public class InvoiceBatchInspectRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    //订单发票id(一个或多个)
    private List<String> invoiceIds;
    
    //审核人
    private String aditor;
    //通过或者锁定标识
    private String inspectSign;

	public List<String> getInvoiceIds() {
		return invoiceIds;
	}
	public void setInvoiceIds(List<String> invoiceIds) {
		this.invoiceIds = invoiceIds;
	}
	public String getAditor() {
		return aditor;
	}
	public void setAditor(String aditor) {
		this.aditor = aditor;
	}
	public String getInspectSign() {
		return inspectSign;
	}
	public void setInspectSign(String inspectSign) {
		this.inspectSign = inspectSign;
	}
	
}

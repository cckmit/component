package com.x.common.api.invoiceview.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.invoiceview.param.InvoiceMailViewRequest;
import com.x.common.api.invoiceview.param.InvoiceMailViewResponse;
import com.x.common.api.invoiceview.param.InvoiceOrderViewResponse;

@Path("/orderinvoice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IInvoiceMailViewSV {
	
	/**
     * 订单发票-前台页面所有信息展示
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode INVOICE_VIEW_01
     * @RestRelativeURL orderinvoice/view
	 */
	@POST
	@Path("/view")
	public InvoiceMailViewResponse view(InvoiceMailViewRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 订单发票-加载发票信息
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode INVOICE_VIEW_02
     * @RestRelativeURL orderinvoice/load
	 */
	@POST
	@Path("/load")
	public InvoiceOrderViewResponse load(InvoiceMailViewRequest request) 
			throws BusinessException,SystemException;
	
}

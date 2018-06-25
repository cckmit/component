package com.x.common.api.sysorderinvoice.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
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

@Path("/sysorderinvoice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysOrderInvoiceSV {
	
	/**
     * 订单发票-列表查询
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_INVOICE_0601
     * @RestRelativeURL sysorderinvoice/queryList
	 */
	@POST
	@Path("/queryList")
	public OrderInvoiceQueryResponse queryList(OrderInvoiceQueryRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 订单发票信息-前台申请
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_INVOICE_0602
     * @RestRelativeURL sysorderinvoice/apply
	 */
	@POST
	@Path("/apply")
	public BaseResponse apply(OrderInvoiceApplyRequest request)
			throws BusinessException,SystemException;
	
	/**
     * 订单发票-详情查询
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_INVOICE_0603
     * @RestRelativeURL sysorderinvoice/queryDetail
	 */
	@POST
	@Path("/queryDetail")
	public OrderInvoiceQueryDetailResponse queryDetail(OrderInvoiceQueryDetailRequest request) 
			throws BusinessException,SystemException;
	
	
	/**
     * 订单发票-审核
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_INVOICE_0604
     * @RestRelativeURL sysorderinvoice/inspect
	 */
	@POST
	@Path("/inspect")
	public BaseResponse inspect(OrderInvoiceInspectRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 订单发票-批量审核
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_INVOICE_0605
     * @RestRelativeURL sysorderinvoice/batchInspect
	 */
	@POST
	@Path("/batchInspect")
	public BaseResponse batchInspect(InvoiceBatchInspectRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 订单发票信息-运营平台(后台)申请
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_INVOICE_0606
     * @RestRelativeURL sysorderinvoice/platformApply
	 */
	@POST
	@Path("/platformApply")
	public InvoicePlatformApplyResponse platformApply(InvoicePlatformApplyRequest request)
			throws BusinessException,SystemException;
	
	/**
     * 订单发票信息-1.开票;2.邮寄
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_INVOICE_0607
     * @RestRelativeURL sysorderinvoice/invoiceBillMail
	 */
	@POST
	@Path("/invoiceBillMail")
	public BaseResponse invoiceBillMail(InvoiceBillMailRequest request)
			throws BusinessException,SystemException;
	
	
}

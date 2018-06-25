package com.x.common.api.sysmailinformation.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysmailinformation.param.InvoiceMailQueryResponse;
import com.x.common.api.sysmailinformation.param.MailInfoResponse;
import com.x.common.api.sysmailinformation.param.MailInformationDeleteRequest;
import com.x.common.api.sysmailinformation.param.MailInformationQueryRequest;
import com.x.common.api.sysmailinformation.param.MailInformationRequest;

@Path("/sysmailinformation")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysMailInformationSV {
	
	/**
     * 用户-发票信息保存
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_MAILINFO_0601
     * @RestRelativeURL sysmailinformation/save
	 */
	@POST
	@Path("/save")
	public BaseResponse save(MailInformationRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 用户-发票信息修改
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_MAILINFO_0602
     * @RestRelativeURL sysmailinformation/modify
	 */
	@POST
	@Path("/modify")
	public BaseResponse modify(MailInformationRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 用户-发票信息删除
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_MAILINFO_0603
     * @RestRelativeURL sysmailinformation/delete
	 */
	@POST
	@Path("/delete")
	public BaseResponse delete(MailInformationDeleteRequest request) 
			throws BusinessException,SystemException;
	
	
	/**
     * 用户-发票信息查询
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_MAILINFO_0604
     * @RestRelativeURL sysmailinformation/queryList
	 */
	@POST
	@Path("/queryList")
	public InvoiceMailQueryResponse queryList(MailInformationQueryRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 发票信息查询
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_MAILINFO_0605
     * @RestRelativeURL sysmailinformation/query
	 */
	@POST
	@Path("/query")
	public MailInfoResponse query(MailInformationDeleteRequest request) 
			throws BusinessException,SystemException;
	
	
}

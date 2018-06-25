package com.x.common.api.sysfeedbake.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryResponse;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryResponse;
import com.x.common.api.sysfeedbake.param.FeedBakeSaveRequest;

@Path("/sysfeedbake")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysFeedBakeSV {
	
	/**
     * 意见反馈列表查询
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_0601
     * @RestRelativeURL sysfeedbake/queryList
	 */
	@POST
	@Path("/queryList")
	public FeedBakeQueryResponse queryList(FeedBakeQueryRequest request) 
			throws BusinessException,SystemException; 
	
	/**
     * 意见反馈详情查询
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_0602
     * @RestRelativeURL sysfeedbake/queryById
	 */
	@POST
	@Path("/queryById")
	public FeedBakeDetailQueryResponse queryById(FeedBakeDetailQueryRequest request) 
			throws BusinessException,SystemException; 
	
	/**
     * 意见反馈记录
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_0603
     * @RestRelativeURL sysfeedbake/insert
	 */
	@POST
	@Path("/insert")
	public BaseResponse insert(FeedBakeSaveRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 意见反馈详情处理
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode SYS_0604
     * @RestRelativeURL sysfeedbake/handle
	 */
	@POST
	@Path("/handle")
	public BaseResponse handle(FeedBakeDetailQueryRequest request) 
			throws BusinessException,SystemException; 
}

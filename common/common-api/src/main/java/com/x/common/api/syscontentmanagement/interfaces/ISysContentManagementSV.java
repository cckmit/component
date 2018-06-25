package com.x.common.api.syscontentmanagement.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.syscontentmanagement.param.ContentQueryDetailRequest;
import com.x.common.api.syscontentmanagement.param.ContentQueryDetailResponse;
import com.x.common.api.syscontentmanagement.param.ContentQueryListRequest;
import com.x.common.api.syscontentmanagement.param.ContentQueryListResponse;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckRequest;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckResponse;
import com.x.common.api.syscontentmanagement.param.ContentSubmitRequest;

@Path("/contentmanagement")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysContentManagementSV {
	
	/**
     * 内容管理列表查询
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode CONTENT_MANAGEMENT_01
     * @RestRelativeURL contentmanagement/queryList
	 */
	@POST
	@Path("/queryList")
	public ContentQueryListResponse queryList(ContentQueryListRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 内容管理详情查询
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode CONTENT_MANAGEMENT_02
     * @RestRelativeURL contentmanagement/queryDetail
	 */
	@POST
	@Path("/queryDetail")
	public ContentQueryDetailResponse queryDetail(ContentQueryDetailRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 内容管理新增
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode CONTENT_MANAGEMENT_03
     * @RestRelativeURL contentmanagement/save
	 */
	@POST
	@Path("/save")
	public BaseResponse save(ContentSubmitRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 内容管理编辑
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode CONTENT_MANAGEMENT_04
     * @RestRelativeURL contentmanagement/edit
	 */
	@POST
	@Path("/edit")
	public BaseResponse edit(ContentSubmitRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 内容管理删除
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode CONTENT_MANAGEMENT_05
     * @RestRelativeURL contentmanagement/delete
	 */
	@POST
	@Path("/delete")
	public BaseResponse delete(ContentQueryDetailRequest request) 
			throws BusinessException,SystemException;
	
	/**
	 * 二级标题和排序避免重复
	 * @return 
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode CONTENT_MANAGEMENT_06
	 * @RestRelativeURL contentmanagement/duplicateCheck
	 */
	@POST
	@Path("/duplicateCheck")
	public ContentSortCheckResponse duplicateCheck(ContentSortCheckRequest request) 
			throws BusinessException,SystemException;

}

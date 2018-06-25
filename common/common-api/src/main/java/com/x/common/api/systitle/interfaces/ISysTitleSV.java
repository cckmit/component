package com.x.common.api.systitle.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.systitle.param.QueryTitleRequest;
import com.x.common.api.systitle.param.TitleQueryDetailRequest;
import com.x.common.api.systitle.param.TitleQueryDetailResponse;
import com.x.common.api.systitle.param.TitleQueryListRequest;
import com.x.common.api.systitle.param.TitleQueryListResponse;
import com.x.common.api.systitle.param.TitleQueryResponse;
import com.x.common.api.systitle.param.TitleSortCheckRequest;
import com.x.common.api.systitle.param.TitleSortCheckResponse;
import com.x.common.api.systitle.param.TitleSubmitRequest;

@Path("/systitle")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysTitleSV {
	
	
	/**
     * 一级标题列表查询
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode TITLE_01
     * @RestRelativeURL systitle/queryList
	 */
	@POST
	@Path("/queryList")
	public TitleQueryListResponse queryList(TitleQueryListRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 一级标题详情查询
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode TITLE_02
     * @RestRelativeURL systitle/queryDetail
	 */
	@POST
	@Path("/queryDetail")
	public TitleQueryDetailResponse queryDetail(TitleQueryDetailRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 一级标题新增
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode TITLE_03
     * @RestRelativeURL systitle/save
	 */
	@POST
	@Path("/save")
	public BaseResponse save(TitleSubmitRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 一级标题编辑
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode TITLE_04
     * @RestRelativeURL systitle/edit
	 */
	@POST
	@Path("/edit")
	public BaseResponse edit(TitleSubmitRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 一级标题删除
     * @return 
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode TITLE_05
     * @RestRelativeURL systitle/delete
	 */
	@POST
	@Path("/delete")
	public BaseResponse delete(TitleQueryDetailRequest request) 
			throws BusinessException,SystemException;
	
	/**
	 * 一级标题和排序避免重复
	 * @return 
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode TITLE_06
	 * @RestRelativeURL systitle/duplicateCheck
	 */
	@POST
	@Path("/duplicateCheck")
	public TitleSortCheckResponse duplicateCheck(TitleSortCheckRequest request) 
			throws BusinessException,SystemException;
	
	/**
     * 查询一级标题
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode TITLE_07
     * @RestRelativeURL systitle/queryTitle
	 */
	@POST
	@Path("/queryTitle")
	public TitleQueryResponse queryTitle(QueryTitleRequest request) throws BusinessException,SystemException;

}

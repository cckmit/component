package com.x.common.api.sysseomanager.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysseomanager.param.CheckSysSeoManager;
import com.x.common.api.sysseomanager.param.DeleteSysSeoManager;
import com.x.common.api.sysseomanager.param.QuerySysSeoByIdRes;
import com.x.common.api.sysseomanager.param.QuerySysSeoManagerListRes;
import com.x.common.api.sysseomanager.param.SaveSysSeoManager;
import com.x.common.api.sysseomanager.param.SeoManagerPageQueryRequest;
import com.x.common.api.sysseomanager.param.SeoManagerPageQueryResponse;


/**
 * @Description: seo管理服务
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0.1
 */
@Path("/sysseomanager")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysSeoManagerSV {
	
	
	/**
     * 页面查询服务
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode GN_0503
     * @RestRelativeURL sysseomanager/querySysSeoManagerList
	 */
	@POST
	@Path("/querySysSeoManagerList")
	QuerySysSeoManagerListRes querySysSeoManagerList()throws BusinessException,SystemException;
	
	
	
	/**
     * seo管理列表查询分页
     * @return 用途列表
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysseomanager/querySeoManagerPage
	 */
	@POST
	@Path("/querySeoManagerPage")
	public SeoManagerPageQueryResponse querySeoManagerPage(SeoManagerPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加seo管理
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysseomanager/saveSysSeoManager
     */
	@POST
	@Path("/saveSysSeoManager")
	public BaseResponse saveSysSeoManager(SaveSysSeoManager req)throws BusinessException,SystemException;

	/**
	 * 删除seo管理
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysseomanager/deleteSysSeoManager
     */
	@POST
	@Path("/deleteSysSeoManager")
	public Integer deleteSysSeoManager(DeleteSysSeoManager param)throws BusinessException,SystemException, Exception;

	/**
	 * 修改seo管理
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysseomanager/updateSysSeoManager
     */
	@POST
	@Path("/updateSysSeoManager")
	public BaseResponse updateSysSeoManager(SaveSysSeoManager req)throws BusinessException,SystemException;
	/**
	 * 同语言下的已存在相同位置的SEO不可再次新建
	 * @param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysseomanager/checkSysSeoManager
     */
	@POST
	@Path("/checkSysSeoManager")
    public Integer checkSysSeoManager(CheckSysSeoManager param) throws BusinessException,SystemException;
	
	/**
	 * 根据ID查询seo
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysseomanager/querySysSeoById
     */
	@POST
	@Path("/querySysSeoById")
	public QuerySysSeoByIdRes querySysSeoById(DeleteSysSeoManager param)throws BusinessException,SystemException, Exception;

}

package com.x.common.api.sysadvertmanager.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageQueryRequest;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageQueryResponse;
import com.x.common.api.sysadvertmanager.param.DeleteSysAdvertManager;
import com.x.common.api.sysadvertmanager.param.QuerySysAdvertListRes;
import com.x.common.api.sysadvertmanager.param.SaveSysAdvertManager;


/**
 * @Description: 广告管理服务
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0.1
 */
@Path("/sysadvertmanager")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysAdvertManagerSV {
	
	/**
     * 页面查询服务
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode GN_0503
     * @RestRelativeURL sysadvertmanager/querySysAdvertList
	 */
	@POST
	@Path("/querySysAdvertList")
	QuerySysAdvertListRes querySysAdvertList()throws BusinessException,SystemException;
	
	/**
     * 广告管理列表查询分页
     * @return 广告管理列表
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysadvertmanager/queryAdvertManagerPage
	 */
	@POST
	@Path("/queryAdvertManagerPage")
	public AdvertManagerPageQueryResponse queryAdvertManagerPage(AdvertManagerPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加广告
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysadvertmanager/saveSysAdvertManager
     */
	@POST
	@Path("/saveSysAdvertManager")
	public BaseResponse saveSysAdvertManager(SaveSysAdvertManager req)throws BusinessException,SystemException;
	/**
	 * 删除广告
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysadvertmanager/deleteSysAdvertManager
     */
	@POST
	@Path("/deleteSysAdvertManager")
	public Integer deleteSysAdvertManager(DeleteSysAdvertManager param)throws BusinessException,SystemException, Exception;
	/**
	 * 修改广告
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysadvertmanager/updateSysAdvertManager
     */
	@POST
	@Path("/updateSysAdvertManager")
	public BaseResponse updateSysAdvertManager(SaveSysAdvertManager req)throws BusinessException,SystemException;
	/**
	 * 根据ID查询广告
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysadvertmanager/querySysAdvertById
     */
	@POST
	@Path("/querySysAdvertById")
	public SaveSysAdvertManager querySysAdvertById(DeleteSysAdvertManager param)throws BusinessException,SystemException, Exception;
}

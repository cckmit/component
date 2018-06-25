package com.x.common.api.sysmesmodel.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysmesmodel.param.DeleteSysMesModel;
import com.x.common.api.sysmesmodel.param.MesModelPageQueryRequest;
import com.x.common.api.sysmesmodel.param.MesModelPageQueryResponse;
import com.x.common.api.sysmesmodel.param.MesModelQueryResponse;
import com.x.common.api.sysmesmodel.param.SaveSysMesModel;


/**
 * @Description: 短信模板
 * @author auth
 * @date 2017年6月16日 
 * @version V1.0.1
 */
@Path("/sysmesmodel")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysMesModelSV {
	
	/**
     * 短信模板列表查询分页
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysmesmodel/queryMesModelPage
	 */
	@POST
	@Path("/queryMesModelPage")
	public MesModelPageQueryResponse queryMesModelPage(MesModelPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加短信模板
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysmesmodel/saveSysMesModel
     */
	@POST
	@Path("/saveSysMesModel")
	public BaseResponse saveSysMesModel(SaveSysMesModel req)throws BusinessException,SystemException;

	/**
	 * 删除模板
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysmesmodel/deleteSysMesModel
     */
	@POST
	@Path("/deleteSysMesModel")
	public Integer deleteSysMesModel(DeleteSysMesModel param)throws BusinessException,SystemException, Exception;

	/**
	 * 修改短信模板
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysmesmodel/updateSysMesModel
     */
	@POST
	@Path("/updateSysMesModel")
	public BaseResponse updateSysMesModel(SaveSysMesModel req)throws BusinessException,SystemException;
	
	/**
     * 短信模板列表查询
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysmesmodel/queryMesModel
	 */
	@POST
	@Path("/queryMesModel")
	public MesModelQueryResponse queryMesModel()throws BusinessException,SystemException;
	
	/**
	 * 根据ID查询名称
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysmesmodel/queryNameById
     */
	@POST
	@Path("/queryNameById")
	public SaveSysMesModel queryNameById(DeleteSysMesModel param)throws BusinessException,SystemException, Exception;

}

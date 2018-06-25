package com.x.common.api.syspurpose.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseListResponse;
import com.x.base.vo.BaseResponse;
import com.x.common.api.syspurpose.param.CheckPurposeCn;
import com.x.common.api.syspurpose.param.DeleteSysPurpose;
import com.x.common.api.syspurpose.param.PurposePageQueryRequest;
import com.x.common.api.syspurpose.param.PurposePageQueryResponse;
import com.x.common.api.syspurpose.param.PurposePageVo;
import com.x.common.api.syspurpose.param.QuerySysPurposeDetailsRes;
import com.x.common.api.syspurpose.param.QuerySysPurposeListReq;
import com.x.common.api.syspurpose.param.QuerySysPurposeListRes;
import com.x.common.api.syspurpose.param.SaveSysPurpose;

/**
 * @Description: 用途查询服务
 * @author auth
 * @date 2016年11月1日 下午2:29:36 
 * @version V1.0
 */
@Path("/syspurpose")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysPurposeSV {
	

    /**
     * 用途列表查询
     * @return 用途列表
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode GN_0503
     * @RestRelativeURL syspurpose/querySysPurposeList
	 */
	@POST
	@Path("/querySysPurposeList")
	QuerySysPurposeListRes querySysPurposeList(QuerySysPurposeListReq req)throws BusinessException,SystemException;
	
	/**
     * 用途详情查询
     * @param purposeId 用途ID
     * @return  用途列表
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode GN_0511
     * @RestRelativeURL syspurpose/querySysPurposeDetails
	 */
	@POST
	@Path("/querySysPurposeDetails")
	QuerySysPurposeDetailsRes querySysPurposeDetails(String purposeId)throws BusinessException,SystemException;
	
	/**
     * 用途列表查询分页
     * @return 用途列表
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syspurpose/queryPurposePage
	 */
	@POST
	@Path("/queryPurposePage")
	public PurposePageQueryResponse queryPurposePage(PurposePageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加用途
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syspurpose/saveSysPurpose
     */
	@POST
	@Path("/saveSysPurpose")
	public BaseResponse saveSysPurpose(SaveSysPurpose req)throws BusinessException,SystemException;
	
	/**
	 * 删除
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syspurpose/deleteSysPurpose
     */
	@POST
	@Path("/deleteSysPurpose")
	public Integer deleteSysPurpose(DeleteSysPurpose param)throws BusinessException,SystemException, Exception;
	
	/**
	 * 根据用途ID查询用途
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syspurpose/querySysPurposeById
     */
	@POST
	@Path("/querySysPurposeById")
	public PurposePageVo querySysPurposeById(DeleteSysPurpose param)throws BusinessException,SystemException;
	
	/**
	 * 修改用途
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syspurpose/updateSysPurpose
     */
	@POST
	@Path("/updateSysPurpose")
	public BaseResponse updateSysPurpose(SaveSysPurpose req)throws BusinessException,SystemException;
	
	/**
	 * 同语言下的已存在相同名称的用途不可再次新建
	 * @param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syspurpose/checkPurposeCn
     */
	@POST
	@Path("/checkPurposeCn")
    public Integer checkPurposeCn(CheckPurposeCn param) throws BusinessException,SystemException;
	
	/**
	 * 根据用途ID查询已删除用途
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syspurpose/querySysPurposeByIdFlag
     */
	@POST
	@Path("/querySysPurposeByIdFlag")
	public BaseListResponse<PurposePageVo> querySysPurposeByIdFlag(DeleteSysPurpose param)throws BusinessException,SystemException;
}

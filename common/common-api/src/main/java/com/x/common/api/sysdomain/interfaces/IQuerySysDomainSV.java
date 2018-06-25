package com.x.common.api.sysdomain.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseListResponse;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysdomain.param.CheckDomainCn;
import com.x.common.api.sysdomain.param.DeleteSysDomain;
import com.x.common.api.sysdomain.param.DomainPageQueryResponse;
import com.x.common.api.sysdomain.param.DomainPageVo;
import com.x.common.api.sysdomain.param.DomainQueryRequest;
import com.x.common.api.sysdomain.param.QuerySysDomainDetailsRes;
import com.x.common.api.sysdomain.param.QuerySysDomainListReq;
import com.x.common.api.sysdomain.param.QuerySysDomainListRes;
import com.x.common.api.sysdomain.param.SaveSysDomain;

/**
 * @Description: 领域查询服务
 * @author auth
 * @date 2016年11月1日 下午2:29:36 
 * @version V1.0
 */
@Path("/sysdomain")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysDomainSV {
	
	 /**
     * 领域列表查询
     * @return 领域列表
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode GN_0508
     * @RestRelativeURL sysdomain/querySysDomainList
	 */
	@POST
	@Path("/querySysDomainList")
	QuerySysDomainListRes querySysDomainList(QuerySysDomainListReq req)throws BusinessException,SystemException;
	
	/**
     * 领域详情查询
     * @param domainId 领域ID
     * @return 领域详情
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode GN_0512
     * @RestRelativeURL sysdomain/querySysDomainDetails
	 */
	@POST
	@Path("/querySysDomainDetails")
	QuerySysDomainDetailsRes querySysDomainDetails(String domainId)throws BusinessException,SystemException;
	
	
	/**
     * 领域列表查询分页
     * @return 领域列表
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysdomain/queryDomainPage
	 */
	@POST
	@Path("/queryDomainPage")
	public DomainPageQueryResponse queryDomainPage(DomainQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加领域
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysdomain/saveSysDomain
     */
	@POST
	@Path("/saveSysDomain")
	public BaseResponse saveSysDomain(SaveSysDomain req)throws BusinessException,SystemException;
	
	/**
	 * 删除领域
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysdomain/deleteSysDomain
     */
	@POST
	@Path("/deleteSysDomain")
	public Integer deleteSysDomain(DeleteSysDomain param)throws BusinessException,SystemException, Exception;
	
	/**
	 * 根据领域ID查询用途
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysdomain/querySysDomainById
     */
	@POST
	@Path("/querySysDomainById")
	public DomainPageVo querySysDomainById(DeleteSysDomain param)throws BusinessException,SystemException;
	
	/**
	 * 修改领域
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysdomain/updateSysDomain
     */
	@POST
	@Path("/updateSysDomain")
	public BaseResponse updateSysDomain(SaveSysDomain req)throws BusinessException,SystemException;
	
	/**
	 * 同语言下的已存在相同名称的领域不可再次新建
	 * @param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysdomain/checkDomainCn
     */
	@POST
	@Path("/checkDomainCn")
    public Integer checkDomainCn(CheckDomainCn param) throws BusinessException,SystemException;
	
	/**
	 * 根据领域ID查询已删除用途
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysdomain/querySysDomainByIdFlag
     */
	@POST
	@Path("/querySysDomainByIdFlag")
	public BaseListResponse<DomainPageVo> querySysDomainByIdFlag(DeleteSysDomain param)throws BusinessException,SystemException;
}

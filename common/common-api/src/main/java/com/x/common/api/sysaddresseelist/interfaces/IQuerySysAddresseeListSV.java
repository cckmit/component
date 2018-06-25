package com.x.common.api.sysaddresseelist.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageQueryRequest;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageQueryResponse;
import com.x.common.api.sysaddresseelist.param.AddresseeListQueryResponse;
import com.x.common.api.sysaddresseelist.param.DeleteSysAddressee;
import com.x.common.api.sysaddresseelist.param.DeleteSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.QueryAllSysAddresseeReq;
import com.x.common.api.sysaddresseelist.param.SaveSysAddressee;
import com.x.common.api.sysaddresseelist.param.SaveSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.SysAddresseePageResponse;
import com.x.common.api.sysaddresseelist.param.SysAddresseeQueryRequest;
import com.x.common.api.sysaddresseelist.param.SysAddresseeResp;


/**
 * @Description: 收件人管理
 * @author auth
 * @date 2017年6月16日 
 * @version V1.0.1
 */
@Path("/sysaddresseelist")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysAddresseeListSV {
	
	/**
     * 列表查询
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/queryAddresseeList
	 */
	@POST
	@Path("/queryAddresseeList")
	public AddresseeListQueryResponse queryAddresseeList()throws BusinessException,SystemException;
	
	/**
	 * 根据ID查询名称
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/queryNameById
     */
	@POST
	@Path("/queryNameById")
	public SaveSysAddresseeList queryNameById(DeleteSysAddresseeList param)throws BusinessException,SystemException, Exception;
	
	/**
     * 列表查询分页
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/queryAddresseeListPage
	 */
	@POST
	@Path("/queryAddresseeListPage")
	public AddresseeListPageQueryResponse queryAddresseeListPage(AddresseeListPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 添加
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/saveSysAddresseeList
     */
	@POST
	@Path("/saveSysAddresseeList")
	public BaseResponse saveSysAddresseeList(SaveSysAddresseeList req)throws BusinessException,SystemException;

	/**
	 * 删除
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/deleteSysAddresseeList
     */
	@POST
	@Path("/deleteSysAddresseeList")
	public Integer deleteSysAddresseeList(DeleteSysAddresseeList param)throws BusinessException,SystemException, Exception;
	
	/**
	 *根据列表ID查询管理表数量
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/queryCounyByListId
     */
	@POST
	@Path("/queryCounyByListId")
	public Integer queryCounyByListId(DeleteSysAddresseeList param)throws BusinessException,SystemException, Exception;
	
	/**
	 * 根据列表ID查询管理列表分页
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/queryManByListId
     */
	@POST
	@Path("/queryManByListId")
    public SysAddresseePageResponse queryManByListId(SysAddresseeQueryRequest param) throws BusinessException,SystemException;
	
	/**
	 * 根据列表ID查询管理列表无分页
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/queryAllByListId
     */
	@POST
	@Path("/queryAllByListId")
    public SysAddresseeResp queryAllByListId(QueryAllSysAddresseeReq param) throws BusinessException,SystemException;
	
	/**
	 * 添加管理列表
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/saveSysAddressee
     */
	@POST
	@Path("/saveSysAddressee")
	public BaseResponse saveSysAddressee(SaveSysAddressee req)throws BusinessException,SystemException;
	
	/**
	 * 删除管理列表
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/deleteSysAddressee
     */
	@POST
	@Path("/deleteSysAddressee")
	public Integer deleteSysAddressee(DeleteSysAddressee param)throws BusinessException,SystemException, Exception;
	
	/**
	 * 修改管理列表
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysaddresseelist/updateSysAddressee
     */
	@POST
	@Path("/updateSysAddressee")
	public BaseResponse updateSysAddressee(SaveSysAddressee req)throws BusinessException,SystemException;

}

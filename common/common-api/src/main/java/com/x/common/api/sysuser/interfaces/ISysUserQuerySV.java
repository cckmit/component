package com.x.common.api.sysuser.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.sysuser.param.SysUserListQueryRequest;
import com.x.common.api.sysuser.param.SysUserListQueryResponse;
import com.x.common.api.sysuser.param.SysUserQueryRequest;
import com.x.common.api.sysuser.param.SysUserQueryResponse;
import com.x.common.api.sysuser.param.SysUserThemeRequest;
import com.x.common.api.sysuser.param.SysUserThemeResponse;

@Path("/userservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysUserQuerySV {
	/**
	 * 查询用户信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode PLAT_001
	 * @RestRelativeURL userservice/queryUserInfo
	 */
	@POST
	@Path("/queryUserInfo")
	SysUserQueryResponse queryUserInfo(SysUserQueryRequest request)throws BusinessException,SystemException;
	/**
	 * 查询用户主题
	 * @param userId
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode PLAT_002
	 * @RestRelativeURL userservice/queryUserTheme
	 */
	@POST
	@Path("/queryUserTheme")
	SysUserThemeResponse queryUserTheme(SysUserThemeRequest request)throws BusinessException,SystemException;
	
	/**
	 * 查询部门id下的用户
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode	PLAT_003
	 * @RestRelativeURL userservice/queryUserByOfficeId
	 */
	@POST
	@Path("/queryUserByOfficeId")
	SysUserListQueryResponse queryUserByOfficeId(SysUserListQueryRequest request)throws BusinessException,SystemException;
}

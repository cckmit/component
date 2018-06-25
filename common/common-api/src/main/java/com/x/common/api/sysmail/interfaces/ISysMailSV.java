package com.x.common.api.sysmail.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysmail.param.SysMailCountResponse;
import com.x.common.api.sysmail.param.SysMailPageQueryResponse;
import com.x.common.api.sysmail.param.SysMailRequest;

@Path("/sysMail")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysMailSV {

	/**
	 * 根据用户ID分页查询消息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @RestRelativeURL sysMail/getSysMailPageList
	 */
	@POST
	@Path("/getSysMailPageList")
	public SysMailPageQueryResponse getSysMailPageList(SysMailRequest request) throws BusinessException,SystemException;
	
	/**
	 * 根据消息ID更新消息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @RestRelativeURL sysMail/updateSysMail
	 */
	@POST
	@Path("/updateSysMail")
	public BaseResponse updateSysMail(SysMailRequest request) throws BusinessException,SystemException;
	
	/**
	 * 根据消息IDList批量删除
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @RestRelativeURL sysMail/batchDelSysMail
	 */
	@POST
	@Path("/batchDelSysMail")
	public BaseResponse batchDelSysMail(SysMailRequest request) throws BusinessException,SystemException;
	
	/**
	 * 消息个数
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @RestRelativeURL sysMail/count
	 */
	@POST
	@Path("/count")
	public SysMailCountResponse count(SysMailRequest request) throws BusinessException,SystemException;
}

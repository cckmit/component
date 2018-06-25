package com.x.common.api.syssendmes.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.syssendmes.param.DeleteSysSendMes;
import com.x.common.api.syssendmes.param.QueryStateSendingResponse;
import com.x.common.api.syssendmes.param.SaveSysMesAddressee;
import com.x.common.api.syssendmes.param.SaveSysSendMes;
import com.x.common.api.syssendmes.param.SendMesPageQueryRequest;
import com.x.common.api.syssendmes.param.SendMesPageQueryResponse;
import com.x.common.api.syssendmes.param.SysMesAddresseePageResponse;
import com.x.common.api.syssendmes.param.SysMesAddresseeQueryRequest;
import com.x.common.api.syssendmes.param.UpdateSysMesAddresseeState;


/**
 * @Description: 发送短信
 * @author auth
 * @date 2017年6月16日 
 * @version V1.0.1
 */
@Path("/syssendmes")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IQuerySysSendMesSV {
	
	/**
     * 发送短信查询分页
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssendmes/querySendMesPage
	 */
	@POST
	@Path("/querySendMesPage")
	public SendMesPageQueryResponse querySendMesPage(SendMesPageQueryRequest param)throws BusinessException,SystemException;
	
	/**
	 * 发送短信
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssendmes/doSendMes
     */
	@POST
	@Path("/doSendMes")
	public BaseResponse doSendMes(SaveSysSendMes req)throws BusinessException,SystemException;

	/**
	 * 删除
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssendmes/deleteSysSendMes
     */
	@POST
	@Path("/deleteSysSendMes")
	public Integer deleteSysSendMes(DeleteSysSendMes param)throws BusinessException,SystemException, Exception;
	
	/**
	 * 根据ID查询
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL sysmesmodel/queryTimeById
     */
	@POST
	@Path("/queryTimeById")
	public SaveSysSendMes queryTimeById(DeleteSysSendMes param)throws BusinessException,SystemException, Exception;

	
	/**
	 * 点击发送向短信收件人管理表中添加数据
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssendmes/doMesAddressee
     */
	@POST
	@Path("/doMesAddressee")
	public BaseResponse doMesAddressee(SaveSysMesAddressee req)throws BusinessException,SystemException;
	
	
	/**
	 * 根据发送短信ID查询短信收件人管理表
	 * @param param
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssendmes/queryMesAddresseeByMesId
     */
	@POST
	@Path("/queryMesAddresseeByMesId")
    public SysMesAddresseePageResponse queryMesAddresseeByMesId(SysMesAddresseeQueryRequest param) throws BusinessException,SystemException;
	
	/**
	 * 更改发送状态为成功
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssendmes/updateStateSu
     */
	@POST
	@Path("/updateStateSu")
	public Integer updateStateSu(UpdateSysMesAddresseeState param)throws BusinessException,SystemException, Exception;
	
	/**
	 * 更改发送状态为失败
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssendmes/updateStateEr
     */
	@POST
	@Path("/updateStateEr")
	public Integer updateStateEr(UpdateSysMesAddresseeState param)throws BusinessException,SystemException, Exception;
	
	/**
	 * 查询状态为发送中的
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @throws Exception 
	 * @ApiDocMethod
     * @ApiCode
     * @RestRelativeURL syssendmes/queryStateSending
     */
	@POST
	@Path("/queryStateSending")
	public QueryStateSendingResponse queryStateSending()throws BusinessException,SystemException, Exception;
	
}

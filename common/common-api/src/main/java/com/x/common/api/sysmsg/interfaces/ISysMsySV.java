package com.x.common.api.sysmsg.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.common.api.sysmsg.param.DeleteSysMsgRequest;
import com.x.common.api.sysmsg.param.QueryMessageDetailRequest;
import com.x.common.api.sysmsg.param.QueryMessageDetailResponse;
import com.x.common.api.sysmsg.param.QueryMessageInfoRequest;
import com.x.common.api.sysmsg.param.SaveSysMsg;
import com.x.common.api.sysmsg.param.SaveSysMsgResponse;
import com.x.common.api.sysmsg.param.SendMessageInfoRequest;
import com.x.common.api.sysmsg.param.SendPrivateLetterRequest;
import com.x.common.api.sysmsg.param.SysMsgPageQueryRequest;
import com.x.common.api.sysmsg.param.SysMsgPageQueryResponse;
import com.x.common.api.sysmsg.param.SysMsgSendEmailRequest;
import com.x.common.api.sysmsg.param.UpdateMessageInfoRequest;
import com.x.common.api.sysmsg.param.UpdateSysMsgRequest;

/**
 * @Description: 消息中心
 * @author auth
 * @date 2017年6月12日 
 * @version V1.0.1
 */
@Path("/sysMsySV")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysMsySV {
	/**
     * 保存
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode MSG_0001
     * @RestRelativeURL sysMsySV/saveSysMsg
	 */
	@POST
	@Path("/saveSysMsg")
	SaveSysMsgResponse saveSysMsg(SaveSysMsg saveSysMsg) throws BusinessException,SystemException;
	
	/**
     * 删除
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode MSG_0002
     * @RestRelativeURL sysMsySV/deleteSysMsg
	 */
	@POST
	@Path("/deleteSysMsg")
	BaseResponse deleteSysMsg(DeleteSysMsgRequest request) throws BusinessException,SystemException;
	
	
	/**
     * 更新
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode MSG_0003
     * @RestRelativeURL sysMsySV/updateSysMsg
	 */
	@POST
	@Path("/updateSysMsg")
	BaseResponse updateSysMsg(UpdateSysMsgRequest request) throws BusinessException,SystemException;
	
	
	/**
     * 分页查询
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode MSG_0004
     * @RestRelativeURL sysMsySV/querySysMsyPage
	 */
	@POST
	@Path("/querySysMsyPage")
	SysMsgPageQueryResponse querySysMsyPage(SysMsgPageQueryRequest request) throws BusinessException,SystemException;

	/**
	 * 定时任务动态添加
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode MSG_0006
	 * @RestRelativeURL sysMsySV/updateJob
	 */
	@POST
	@Path("/updateJob")
	BaseResponse updateJob(SysMsgSendEmailRequest request) throws BusinessException,SystemException;
	
	/**
     * 批量删除
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode MSG_0002
     * @RestRelativeURL sysMsySV/batchDelSysMsg
	 */
	@POST
	@Path("/batchDelSysMsg")
	BaseResponse batchDelSysMsg(DeleteSysMsgRequest request) throws BusinessException,SystemException;
	
	/**
     * 查询信息
     * @throws BusinessException,SystemException
     * @RestRelativeURL sysMsySV/queryMessageInfo
	 */
	@POST
	@Path("/queryMessageInfo")
	SysMsgPageQueryResponse queryMessageInfo(QueryMessageInfoRequest request) throws BusinessException,SystemException;
	
	/**
	 * 查询信息
	 * @throws BusinessException,SystemException
	 * @RestRelativeURL sysMsySV/queryMessageDetail
	 */
	@POST
	@Path("/queryMessageDetail")
	QueryMessageDetailResponse queryMessageDetail(QueryMessageDetailRequest request) throws BusinessException,SystemException;
	
	
	/**
	 * 发送站内信
	 * @throws BusinessException,SystemException
	 * @RestRelativeURL sysMsySV/sendMessageInfo
	 */
	@POST
	@Path("/sendMessageInfo")
	BaseResponse sendMessageInfo(SendMessageInfoRequest request) throws BusinessException,SystemException;
	
	/**
	 * 修改站内信
	 * @throws BusinessException,SystemException
	 * @RestRelativeURL sysMsySV/updateMessageInfo
	 */
	@POST
	@Path("/updateMessageInfo")
	BaseResponse updateMessageInfo(UpdateMessageInfoRequest request) throws BusinessException,SystemException;
	
	/**
	 * 发送站内信
	 * @throws BusinessException,SystemException
	 * @RestRelativeURL sysMsySV/sendPrivateLetter
	 */
	@POST
	@Path("/sendPrivateLetter")
	BaseResponse sendPrivateLetter(SendPrivateLetterRequest request) throws BusinessException,SystemException;
	
	
	/**
     * 分页查询发送成功和已读的全用户和非全用户站内消息
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode MSG_0002
     * @RestRelativeURL sysMsySV/queryMessagePageList
	 */
	@POST
	@Path("/queryMessagePageList")
	SysMsgPageQueryResponse queryMessagePageList(SysMsgPageQueryRequest request)throws BusinessException,SystemException;

	
}

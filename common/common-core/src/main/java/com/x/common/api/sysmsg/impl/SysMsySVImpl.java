package com.x.common.api.sysmsg.impl;
//package com.x.common.api.sysmsg.impl;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.x.base.exception.BusinessException;
//import com.x.base.exception.SystemException;
//import com.x.base.vo.BaseResponse;
//import com.x.base.vo.PageInfo;
//import com.x.base.vo.ResponseHeader;
//import com.x.centra.sdk.constant.ExceptionCodeConstant;
//import com.x.centra.sdk.util.BeanUtils;
//import com.x.centra.sdk.util.CollectionUtil;
//import com.x.centra.sdk.util.StringUtil;
//import com.x.common.api.sendemailjobs.param.SendEmailRequest;
//import com.x.common.api.sysmsg.interfaces.ISysMsySV;
//import com.x.common.api.sysmsg.param.DeleteSysMsgRequest;
//import com.x.common.api.sysmsg.param.QueryMessageDetailRequest;
//import com.x.common.api.sysmsg.param.QueryMessageDetailResponse;
//import com.x.common.api.sysmsg.param.QueryMessageInfoRequest;
//import com.x.common.api.sysmsg.param.SaveSysMsg;
//import com.x.common.api.sysmsg.param.SaveSysMsgResponse;
//import com.x.common.api.sysmsg.param.SendMessageInfoRequest;
//import com.x.common.api.sysmsg.param.SendPrivateLetterRequest;
//import com.x.common.api.sysmsg.param.SysMsgPageQueryRequest;
//import com.x.common.api.sysmsg.param.SysMsgPageQueryResponse;
//import com.x.common.api.sysmsg.param.SysMsgPageVo;
//import com.x.common.api.sysmsg.param.SysMsgSendEmailRequest;
//import com.x.common.api.sysmsg.param.UpdateMessageInfoRequest;
//import com.x.common.api.sysmsg.param.UpdateSysMsgRequest;
//import com.x.common.dao.mapper.bo.SysMsg;
//import com.x.common.dao.mapper.bo.SysMsgReceiver;
//import com.x.common.service.business.sysmsg.ISysMsgBusiSV;
//import com.alibaba.dubbo.config.annotation.Service;
//@Service
//@Component
//public class SysMsySVImpl implements ISysMsySV {
//	private static final Logger logger = Logger.getLogger(SysMsySVImpl.class);
//	@Autowired
//	private ISysMsgBusiSV iSysMsgBusiSV;
//
//	@Override
//	public SaveSysMsgResponse saveSysMsg(SaveSysMsg saveSysMsg) throws BusinessException, SystemException {
//		SaveSysMsgResponse response  = new SaveSysMsgResponse();
//		SysMsg sysMsg = new SysMsg();
//		String msgId = "";
//		try {
//			BeanUtils.copyProperties(sysMsg, saveSysMsg);
//			msgId = iSysMsgBusiSV.saveSysMsg(sysMsg);
//			if(!StringUtil.isBlank(saveSysMsg.getUserId())){
//				String userId = saveSysMsg.getUserId();
//				String[] userIds = userId.split("\\;");
//		        for (int i = 0; i < userIds.length; i++) {
//		        	SysMsgReceiver record = new SysMsgReceiver();
//		        	record.setMsgId(msgId);
//		        	record.setUserId(userIds[i]);
//		        	record.setSendDate(saveSysMsg.getSendTime());
//		        	record.setSendStatus(saveSysMsg.getState());
//		        	iSysMsgBusiSV.addSysMsgReceiver(record);
//		        }
//			}
//			response.setSysMsgId(msgId);
//			response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "保存成功"));
//		}catch (Exception e) {
//			//回滚
//			if(!StringUtil.isBlank(msgId)){
//				iSysMsgBusiSV.deleteSysMsg(msgId);
//			}
//			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"保存失败");
//		}
//		return response;
//	}
//	
//
//	@Override
//	public BaseResponse deleteSysMsg(DeleteSysMsgRequest request) throws BusinessException, SystemException {
//		BaseResponse response=new BaseResponse();
//		if(StringUtil.isBlank(request.getId())){
//			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "编号不能为空");
//		}
//		try {
//			SysMsgReceiver sysMsgReceiver = new SysMsgReceiver();
//			sysMsgReceiver.setMsgId(request.getId());
//			iSysMsgBusiSV.deleteSysMsgReceiverBytMsgId(sysMsgReceiver);
//			iSysMsgBusiSV.deleteSysMsg(request.getId());
//			response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "删除成功"));
//		} catch (Exception e) {
//			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"删除失败");
//		}
//		return response;
//	}
//
//	@Override
//	public SysMsgPageQueryResponse querySysMsyPage(SysMsgPageQueryRequest request)
//			throws BusinessException, SystemException {
//		SysMsgPageQueryResponse response = new SysMsgPageQueryResponse();
//		ResponseHeader responseHeader = new ResponseHeader();
//		try {
//            PageInfo<SysMsgPageVo> pageInfo = iSysMsgBusiSV.querySysMsgPage(request);
//            response.setPageInfo(pageInfo);
//            responseHeader.setSuccess(true);
//            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
//            responseHeader.setResultMessage("列表查询成功");
//            response.setResponseHeader(responseHeader);
//        }catch (BusinessException businessException){
//            responseHeader.setResultCode(businessException.getErrorCode());
//            responseHeader.setResultMessage(businessException.getErrorMessage());
//            response.setResponseHeader(responseHeader);
//        }catch (Exception e){
//        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
//            responseHeader.setResultMessage("列表查询失败");
//            response.setResponseHeader(responseHeader);
//        }
//		return response;
//	}
//
//	/**
//	 * 定时任务动态添加
//	 *
//	 * @param request
//	 * @throws BusinessException,SystemException
//	 * @author auth
//	 * @ApiDocMethod
//	 * @ApiCode MSG_0006
//	 * @RestRelativeURL sysMsySV/updateJob
//	 */
//	@Override
//	public BaseResponse updateJob(SysMsgSendEmailRequest request) throws BusinessException, SystemException {
//		SendEmailRequest re = new SendEmailRequest();
//		BeanUtils.copyProperties(re, request);
//		iSysMsgBusiSV.sendEmailJob(re);
//		BaseResponse response = new BaseResponse();
//		response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "更新成功"));
//		return response;
//	}
//
//	@Override
//	public BaseResponse updateSysMsg(UpdateSysMsgRequest request) throws BusinessException, SystemException {
//		BaseResponse response = new BaseResponse();
//		if(StringUtil.isBlank(request.getId())){
//			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "编号不能为空");
//		}
//		try {
//			SysMsg sysMsg  = new SysMsg();
//			BeanUtils.copyProperties(sysMsg, request);
//			iSysMsgBusiSV.updateSysMsg(sysMsg);
//			SysMsgReceiver records = new SysMsgReceiver();
//        	records.setMsgId(request.getId());
//        	iSysMsgBusiSV.deleteSysMsgReceiverBytMsgId(records);
//        	if(!StringUtil.isBlank(request.getUserId())){
//        		String userId = request.getUserId();
//    			String[] userIds = userId.split("\\;");
//    	        for (int i = 0; i < userIds.length; i++) {
//    	        	SysMsgReceiver record = new SysMsgReceiver();
//    	        	record.setMsgId(request.getId());
//    	        	record.setUserId(userIds[i]);
//    	        	record.setSendDate(request.getSendTime());
//    	        	record.setSendStatus(request.getState());
//    	        	iSysMsgBusiSV.addSysMsgReceiver(record);
//    	        }
//			}
//			response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "更新成功"));
//		} catch (Exception e) {
//			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"更新失败");
//		}
//		return response;
//	}
//
//
//	@Override
//	public BaseResponse batchDelSysMsg(DeleteSysMsgRequest request) throws BusinessException, SystemException {
//		BaseResponse response=new BaseResponse();
//		if(CollectionUtil.isEmpty(request.getMsgIds())){
//			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "编号不能为空");
//		}
//		try {
//			iSysMsgBusiSV.batchDelSysMsg(request);
//			response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "删除成功"));
//		} catch (Exception e) {
//			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"删除失败");
//		}
//		return response;
//	}
//
//
//	@Override
//	public SysMsgPageQueryResponse queryMessageInfo(QueryMessageInfoRequest request)
//			throws BusinessException, SystemException {
//		SysMsgPageQueryResponse response = new SysMsgPageQueryResponse();
//		ResponseHeader responseHeader = new ResponseHeader();
//		try {
//            PageInfo<SysMsgPageVo> pageInfo = iSysMsgBusiSV.queryMessageInfo(request);
//            response.setPageInfo(pageInfo);
//            responseHeader.setSuccess(true);
//            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
//            responseHeader.setResultMessage("列表查询成功");
//            response.setResponseHeader(responseHeader);
//        }catch (BusinessException businessException){
//            responseHeader.setResultCode(businessException.getErrorCode());
//            responseHeader.setResultMessage(businessException.getErrorMessage());
//            response.setResponseHeader(responseHeader);
//        }catch (Exception e){
//        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
//            responseHeader.setResultMessage("列表查询失败");
//            response.setResponseHeader(responseHeader);
//        }
//		return response;
//	}
//
//
//	@Override
//	public QueryMessageDetailResponse queryMessageDetail(QueryMessageDetailRequest request)
//			throws BusinessException, SystemException {
//		QueryMessageDetailResponse response=null;
//		try {
//			response = iSysMsgBusiSV.queryMessageDetail(request);
//			response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "查询成功"));
//		} catch (Exception e) {
//			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"查询失败");
//		}
//		return response;
//	}
//
//
//	@Override
//	public BaseResponse sendMessageInfo(SendMessageInfoRequest request) throws BusinessException, SystemException {
//		BaseResponse response=new BaseResponse();
//		try {
//			int result = iSysMsgBusiSV.sendMessageInfo(request);
//			if(result!=1){
//				response.setResponseHeader(new ResponseHeader(false,ExceptionCodeConstant.SYSTEM_ERROR, "发送失败"));
//			}
//			response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "发送成功"));
//		} catch (Exception e) {
//			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//			if(e instanceof BusinessException){
//				throw (BusinessException) e;
//			}else{
//				throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"发送失败");
//			}
//		}
//		return response;
//	}
//
//	@Override
//	public BaseResponse sendPrivateLetter(SendPrivateLetterRequest request) throws BusinessException, SystemException {
//		BaseResponse response=new BaseResponse();
//		try {
//			int result = iSysMsgBusiSV.sendPrivateLetter(request);
//			if(result!=1){
//				response.setResponseHeader(new ResponseHeader(false,ExceptionCodeConstant.SYSTEM_ERROR, "发送失败"));
//			}
//			response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "发送成功"));
//		} catch (Exception e) {
//			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//			if(e instanceof BusinessException){
//				throw (BusinessException) e;
//			}else{
//				throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"发送失败");
//			}
//		}
//		return response;
//	}
//	
//	@Override
//	public SysMsgPageQueryResponse queryMessagePageList(
//			SysMsgPageQueryRequest request) throws BusinessException,SystemException {
//		SysMsgPageQueryResponse response = new SysMsgPageQueryResponse();
//		ResponseHeader responseHeader = new ResponseHeader();
//		if(StringUtil.isBlank(request.getUserId())){
//			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "用户id不能为空");
//		}
//		try {
//            PageInfo<SysMsgPageVo> pageInfo = iSysMsgBusiSV.queryMessagePageList(request);
//            response.setPageInfo(pageInfo);
//            responseHeader.setSuccess(true);
//            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
//            responseHeader.setResultMessage("列表查询成功");
//            response.setResponseHeader(responseHeader);
//        }catch (BusinessException businessException){
//            responseHeader.setResultCode(businessException.getErrorCode());
//            responseHeader.setResultMessage(businessException.getErrorMessage());
//            response.setResponseHeader(responseHeader);
//        }catch (Exception e){
//        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
//            responseHeader.setResultMessage("列表查询失败");
//            response.setResponseHeader(responseHeader);
//        }
//		return response;
//	}
//
//
//	@Override
//	public BaseResponse updateMessageInfo(UpdateMessageInfoRequest request) throws BusinessException, SystemException {
//		BaseResponse response=new BaseResponse();
//		try {
//			int result = iSysMsgBusiSV.updateMessageInfo(request);
//			if(result!=1){
//				response.setResponseHeader(new ResponseHeader(false,ExceptionCodeConstant.SYSTEM_ERROR, "发送失败"));
//			}
//			response.setResponseHeader(new ResponseHeader(true,ExceptionCodeConstant.SUCCESS, "发送成功"));
//		} catch (Exception e) {
//			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
//			if(e instanceof BusinessException){
//				throw (BusinessException) e;
//			}else{
//				throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"发送失败");
//			}
//		}
//		return response;
//	}
//
//}

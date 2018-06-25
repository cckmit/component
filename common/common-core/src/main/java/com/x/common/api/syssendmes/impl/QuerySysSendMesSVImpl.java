package com.x.common.api.syssendmes.impl;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.syssendmes.interfaces.IQuerySysSendMesSV;
import com.x.common.api.syssendmes.param.DeleteSysSendMes;
import com.x.common.api.syssendmes.param.QueryStateSendingResponse;
import com.x.common.api.syssendmes.param.SaveSysMesAddressee;
import com.x.common.api.syssendmes.param.SaveSysSendMes;
import com.x.common.api.syssendmes.param.SendMesPageQueryRequest;
import com.x.common.api.syssendmes.param.SendMesPageQueryResponse;
import com.x.common.api.syssendmes.param.SendMesPageVo;
import com.x.common.api.syssendmes.param.SysMesAddresseePageResponse;
import com.x.common.api.syssendmes.param.SysMesAddresseeQueryRequest;
import com.x.common.api.syssendmes.param.UpdateSysMesAddresseeState;
import com.x.common.service.business.syssendmes.IQuerySysSendMesBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;

/**
 * @Description: 收件人列表管理
 * @author auth
 * @version V1.0
 */
@Service
@Component
public class QuerySysSendMesSVImpl implements IQuerySysSendMesSV {
	private static final Logger logger = Logger.getLogger(QuerySysSendMesSVImpl.class);
	@Autowired
	private transient IQuerySysSendMesBusiSV iQuerySysSendMesBusiSV;
	
	@Override
	public SendMesPageQueryResponse querySendMesPage(SendMesPageQueryRequest param)
			throws BusinessException, SystemException {
		SendMesPageQueryResponse sendMesPageQueryResponse = new SendMesPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<SendMesPageVo> pageInfo = iQuerySysSendMesBusiSV.querySendMesPage(param);
            sendMesPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("查询成功");
            sendMesPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            sendMesPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("查询失败");
            sendMesPageQueryResponse.setResponseHeader(responseHeader);
        }
		return sendMesPageQueryResponse;
	}
	
	@Override
	public BaseResponse doSendMes(SaveSysSendMes req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			Integer doSendMes = iQuerySysSendMesBusiSV.doSendMes(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage(doSendMes.toString());
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加失败");
		}
		return response;
	}
	
	@Override
	public Integer deleteSysSendMes(DeleteSysSendMes param) throws BusinessException, SystemException, Exception {
		return iQuerySysSendMesBusiSV.deleteSysSendMes(param.getMesId());
	}
	
	@Override
	public BaseResponse doMesAddressee(SaveSysMesAddressee req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			Integer doMesAddressee = iQuerySysSendMesBusiSV.doMesAddressee(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage(doMesAddressee.toString());
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加失败");
		}
		return response;
	}
	
	
	@Override
	public SysMesAddresseePageResponse queryMesAddresseeByMesId(SysMesAddresseeQueryRequest param)
			throws BusinessException, SystemException {
		if (param==null){
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
        }
        if (param.getMesId()==null){
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "请求参数iD不能为空");
        }
        return iQuerySysSendMesBusiSV.queryMesAddresseeByMesId(param);
	}

	@Override
	public Integer updateStateSu(UpdateSysMesAddresseeState param)
			throws BusinessException, SystemException, Exception {
		return iQuerySysSendMesBusiSV.updateStateSu(param);
	}

	@Override
	public Integer updateStateEr(UpdateSysMesAddresseeState param)
			throws BusinessException, SystemException, Exception {
		return iQuerySysSendMesBusiSV.updateStateEr(param);
	}

	@Override
	public SaveSysSendMes queryTimeById(DeleteSysSendMes param) throws BusinessException, SystemException, Exception {
		return iQuerySysSendMesBusiSV.queryTimeById(param);
	}

	@Override
	public QueryStateSendingResponse queryStateSending() throws BusinessException, SystemException, Exception {
		return iQuerySysSendMesBusiSV.queryStateSending();
	}
	
	
}

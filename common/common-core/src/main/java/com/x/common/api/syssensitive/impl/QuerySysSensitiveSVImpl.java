package com.x.common.api.syssensitive.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.syssensitive.interfaces.IQuerySysSensitiveSV;
import com.x.common.api.syssensitive.param.DeleteSysSensitive;
import com.x.common.api.syssensitive.param.QuerySysSensitiveListRes;
import com.x.common.api.syssensitive.param.SaveSysSensitive;
import com.x.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.x.common.api.syssensitive.param.SensitivePageQueryResponse;
import com.x.common.api.syssensitive.param.SensitivePageVo;
import com.x.common.service.business.syssensitive.IQuerySysSensitiveBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
@Component
public class QuerySysSensitiveSVImpl implements IQuerySysSensitiveSV {
	private static final Logger logger = Logger.getLogger(QuerySysSensitiveSVImpl.class);
	@Autowired
	private transient IQuerySysSensitiveBusiSV iQuerySysSensitiveBusiSV;


	@Override
	public SensitivePageQueryResponse querySensitivePage(SensitivePageQueryRequest param)
			throws BusinessException, SystemException {
		
		SensitivePageQueryResponse sensitivePageQueryResponse = new SensitivePageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<SensitivePageVo> pageInfo = iQuerySysSensitiveBusiSV.querySensitivePage(param);
            sensitivePageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("敏感词查询成功");
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("敏感词查询失败");
            sensitivePageQueryResponse.setResponseHeader(responseHeader);
        }
		return sensitivePageQueryResponse;
	}


	@Override
	public BaseResponse saveSysSensitive(SaveSysSensitive req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysSensitiveBusiSV.saveSysSensitive(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加敏感词成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加敏感词失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysSensitive(DeleteSysSensitive param) throws BusinessException, SystemException {
		return iQuerySysSensitiveBusiSV.deleteSysSensitive(param.getId());
	}


	@Override
	public BaseResponse updateSysSensitive(SaveSysSensitive req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysSensitiveBusiSV.updateSysSensitive(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改敏感词成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改敏感词失败");
		}
		return response;
	}


	@Override
	public QuerySysSensitiveListRes querySysSensitiveList() throws BusinessException, SystemException {
		ResponseHeader responseHeader = new ResponseHeader();
		QuerySysSensitiveListRes querySysSensitiveListRes = new QuerySysSensitiveListRes();
		try {
			List<SensitivePageVo> sensitivePageVoList = iQuerySysSensitiveBusiSV.querySysSensitiveList();
			querySysSensitiveListRes.setSensitiveVo(sensitivePageVoList);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("敏感词查询成功");
            querySysSensitiveListRes.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            querySysSensitiveListRes.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("敏感词查询失败");
            querySysSensitiveListRes.setResponseHeader(responseHeader);
        }
		return querySysSensitiveListRes;
		
	}
}

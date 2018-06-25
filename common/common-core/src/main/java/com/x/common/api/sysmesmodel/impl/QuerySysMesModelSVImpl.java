package com.x.common.api.sysmesmodel.impl;


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
import com.x.common.api.sysmesmodel.interfaces.IQuerySysMesModelSV;
import com.x.common.api.sysmesmodel.param.DeleteSysMesModel;
import com.x.common.api.sysmesmodel.param.MesModelPageQueryRequest;
import com.x.common.api.sysmesmodel.param.MesModelPageQueryResponse;
import com.x.common.api.sysmesmodel.param.MesModelPageVo;
import com.x.common.api.sysmesmodel.param.MesModelQueryResponse;
import com.x.common.api.sysmesmodel.param.SaveSysMesModel;
import com.x.common.service.business.sysmesmodel.IQuerySysMesModelBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;

/**
 * @Description: 短信模板
 * @author auth
 * @version V1.0
 */
@Service
@Component
public class QuerySysMesModelSVImpl implements IQuerySysMesModelSV {
	private static final Logger logger = Logger.getLogger(QuerySysMesModelSVImpl.class);
	@Autowired
	private transient IQuerySysMesModelBusiSV iQuerySysMesModelBusiSV;
	


	@Override
	public MesModelPageQueryResponse queryMesModelPage(MesModelPageQueryRequest param) throws BusinessException, SystemException {
		MesModelPageQueryResponse mesModelPageQueryResponse = new MesModelPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<MesModelPageVo> pageInfo = iQuerySysMesModelBusiSV.queryMesModelPage(param);
            mesModelPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("列表查询成功");
            mesModelPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            mesModelPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("列表查询失败");
            mesModelPageQueryResponse.setResponseHeader(responseHeader);
        }
		return mesModelPageQueryResponse;
	}


	@Override
	public BaseResponse saveSysMesModel(SaveSysMesModel req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysMesModelBusiSV.saveSysMesModel(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysMesModel(DeleteSysMesModel param) throws BusinessException, SystemException, Exception {
		return iQuerySysMesModelBusiSV.deleteSysMesModel(param.getModelId());
	}


	@Override
	public BaseResponse updateSysMesModel(SaveSysMesModel req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysMesModelBusiSV.updateSysMesModel(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改失败");
		}
		return response;
	}


	@Override
	public MesModelQueryResponse queryMesModel() throws BusinessException, SystemException {
		MesModelQueryResponse mesModelQueryResponse = new MesModelQueryResponse();
		List<MesModelPageVo> questionsPapersVoList = iQuerySysMesModelBusiSV.queryMesModel();
		mesModelQueryResponse.setMesModelVo(questionsPapersVoList);
		return mesModelQueryResponse;
	}


	@Override
	public SaveSysMesModel queryNameById(DeleteSysMesModel param) throws BusinessException, SystemException, Exception {
		return iQuerySysMesModelBusiSV.queryNameById(param);
	}


}

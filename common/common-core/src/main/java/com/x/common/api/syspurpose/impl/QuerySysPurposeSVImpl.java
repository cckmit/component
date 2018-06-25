package com.x.common.api.syspurpose.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseListResponse;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.syspurpose.interfaces.IQuerySysPurposeSV;
import com.x.common.api.syspurpose.param.CheckPurposeCn;
import com.x.common.api.syspurpose.param.DeleteSysPurpose;
import com.x.common.api.syspurpose.param.PurposePageQueryRequest;
import com.x.common.api.syspurpose.param.PurposePageQueryResponse;
import com.x.common.api.syspurpose.param.PurposePageVo;
import com.x.common.api.syspurpose.param.QuerySysPurposeDetailsRes;
import com.x.common.api.syspurpose.param.QuerySysPurposeListReq;
import com.x.common.api.syspurpose.param.QuerySysPurposeListRes;
import com.x.common.api.syspurpose.param.SaveSysPurpose;
import com.x.common.api.syspurpose.param.SysPurposeVo;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysPurpose;
import com.x.common.service.business.syspurpose.IQuerySysPurposeBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.StringUtil;

/**
 * @Description: 用途查询服务
 * @author auth
 * @date 2016年11月1日 下午6:28:30 
 * @version V1.0
 */
@Service
@Component
public class QuerySysPurposeSVImpl implements IQuerySysPurposeSV {
	private static final Logger logger = Logger.getLogger(QuerySysPurposeSVImpl.class);
	
	@Autowired
	private transient IQuerySysPurposeBusiSV iQuerySysPurposeBusiSV;

	@Override
	public QuerySysPurposeListRes querySysPurposeList(QuerySysPurposeListReq req)
			throws BusinessException, SystemException {
		List<SysPurpose> purposes = iQuerySysPurposeBusiSV.querySysPurposeList(req.getLanguage());
		List<SysPurposeVo> vos = new ArrayList<SysPurposeVo>();
		for(SysPurpose purpose:purposes){
			SysPurposeVo vo = new SysPurposeVo();
			BeanUtils.copyProperties(vo, purpose);
			vos.add(vo);
		}
		QuerySysPurposeListRes res = new QuerySysPurposeListRes();
		res.setPurposes(vos);
		logger.info("《《《调用原有服务查询用途列表》》》");
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public QuerySysPurposeDetailsRes querySysPurposeDetails(String purposeId)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(purposeId)){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "用途ID不能为空");
		}
		SysPurpose sysPurpose = iQuerySysPurposeBusiSV.querySysPurposeDetails(purposeId);
		if(sysPurpose==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "用途信息不存在");
		}
		QuerySysPurposeDetailsRes res  = new QuerySysPurposeDetailsRes();
		BeanUtils.copyProperties(res, sysPurpose);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public PurposePageQueryResponse queryPurposePage(PurposePageQueryRequest param)
			throws BusinessException, SystemException {
		
		PurposePageQueryResponse purposePageQueryResponse = new PurposePageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<PurposePageVo> pageInfo = iQuerySysPurposeBusiSV.queryPurposePage(param);
            purposePageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("用途列表查询成功");
            purposePageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            purposePageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("用途列表查询失败");
            purposePageQueryResponse.setResponseHeader(responseHeader);
        }
		return purposePageQueryResponse;
	}

	@Override
	public BaseResponse saveSysPurpose(SaveSysPurpose req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysPurposeBusiSV.saveSysPurpose(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加用途成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加用途失败");
		}
		return response;
	}

	@Override
	public Integer deleteSysPurpose(DeleteSysPurpose param) throws Exception {
		return iQuerySysPurposeBusiSV.deleteSysPurpose(param.getPurposeId());
	}

	@Override
	public PurposePageVo querySysPurposeById(DeleteSysPurpose param)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(param.getPurposeId())){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "编号不能为空");
		}
		SysPurpose sysPurpose = iQuerySysPurposeBusiSV.querySysPurposeById(param);
		if(sysPurpose==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "用途信息不存在");
		}
		PurposePageVo purposePageVo = new PurposePageVo();
		BeanUtils.copyProperties(purposePageVo, sysPurpose);
		purposePageVo.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return purposePageVo;
	}

	@Override
	public BaseResponse updateSysPurpose(SaveSysPurpose req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysPurposeBusiSV.updateSysPurpose(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改用途成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改用途失败");
		}
		return response;
	}

	@Override
	public Integer checkPurposeCn(CheckPurposeCn param) throws BusinessException, SystemException {
		return iQuerySysPurposeBusiSV.checkPurposeCn(param);
	}

	@Override
	public BaseListResponse<PurposePageVo> querySysPurposeByIdFlag(DeleteSysPurpose param)
			throws BusinessException, SystemException {
		BaseListResponse<PurposePageVo> querySysPurposeByIds = new BaseListResponse<>();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			List<PurposePageVo> querySysPurposeById = iQuerySysPurposeBusiSV.querySysPurposeByIdFlag(param);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("用途列表查询成功!");
			querySysPurposeByIds.setResponseHeader(responseHeader);
			querySysPurposeByIds.setResult(querySysPurposeById);
		}catch(Exception e){
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			responseHeader.setSuccess(false);
			responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
			responseHeader.setResultMessage("用途列表查询失败!");
			querySysPurposeByIds.setResponseHeader(responseHeader);
		}
		return querySysPurposeByIds;
	}

}

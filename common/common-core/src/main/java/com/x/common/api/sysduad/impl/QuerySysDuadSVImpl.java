package com.x.common.api.sysduad.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseListResponse;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysduad.interfaces.IQuerySysDuadSV;
import com.x.common.api.sysduad.param.CheckDuadCn;
import com.x.common.api.sysduad.param.DuadPageQueryRequest;
import com.x.common.api.sysduad.param.DuadPageQueryResponse;
import com.x.common.api.sysduad.param.DuadPageVo;
import com.x.common.api.sysduad.param.QuerySysDuadById;
import com.x.common.api.sysduad.param.QuerySysDuadDetailsRes;
import com.x.common.api.sysduad.param.QuerySysDuadListReq;
import com.x.common.api.sysduad.param.QuerySysDuadListRes;
import com.x.common.api.sysduad.param.SaveSysDuad;
import com.x.common.api.sysduad.param.SysDuadVo;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysDuad;
import com.x.common.service.business.sysduad.IQuerySysDuadBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.StringUtil;

/**
 * @Description: 语言对查询服务
 * @author auth
 * @date 2016年11月1日 下午7:42:19 
 * @version V1.0
 */
@Service
@Component
public class QuerySysDuadSVImpl implements IQuerySysDuadSV {
	
	@Autowired
	private transient IQuerySysDuadBusiSV iQuerySysDuadBusiSV;

	@Override
	public QuerySysDuadListRes querySysDuadList(QuerySysDuadListReq req)
			throws BusinessException, SystemException {
		if(req==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数不能为空");
		}
		List<SysDuad> duads = iQuerySysDuadBusiSV.querySysDuadList(req.getLanguage(), req.getOrderType());
		List<SysDuadVo> vos = new ArrayList<SysDuadVo>();
		for(SysDuad duad:duads){
			SysDuadVo vo = new SysDuadVo();
			BeanUtils.copyProperties(vo, duad);
			vos.add(vo);
		}
		QuerySysDuadListRes res = new QuerySysDuadListRes();
		res.setDuads(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public QuerySysDuadDetailsRes querySysDuadDetails(String duadId)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(duadId)){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "编号不能为空");
		}
		SysDuad duad = iQuerySysDuadBusiSV.querySysDuadDetails(duadId);
		if(duad==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "语言对信息不存在");
		}
		QuerySysDuadDetailsRes res = new QuerySysDuadDetailsRes();
		BeanUtils.copyProperties(res, duad);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public DuadPageQueryResponse queryDuadPage(DuadPageQueryRequest param) throws BusinessException, SystemException {
		DuadPageQueryResponse duadPageQueryResponse = new DuadPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<DuadPageVo> pageInfo = iQuerySysDuadBusiSV.queryDuadPage(param);
            duadPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("语言对列表查询成功");
            duadPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            duadPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("语言对列表查询失败");
            duadPageQueryResponse.setResponseHeader(responseHeader);
        }
		return duadPageQueryResponse;
	}

	@Override
	public BaseResponse saveSysDuad(SaveSysDuad req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysDuadBusiSV.saveSysDuad(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加语言对成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加语言对失败");
		}
		return response;
	}

	@Override
	public BaseListResponse<DuadPageVo> querySysDuadById(QuerySysDuadById param)
			throws BusinessException, SystemException {
		BaseListResponse<DuadPageVo> querySysDuadByIds = new BaseListResponse<>();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			List<DuadPageVo> querySysDuadById = iQuerySysDuadBusiSV.querySysDuadById(param);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("语言对列表查询成功!");
			querySysDuadByIds.setResponseHeader(responseHeader);
			querySysDuadByIds.setResult(querySysDuadById);
		}catch(Exception e){
			responseHeader.setSuccess(false);
			responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
			responseHeader.setResultMessage("语言对列表查询失败!");
			querySysDuadByIds.setResponseHeader(responseHeader);
		}
		return querySysDuadByIds;
	}

	@Override
	public BaseResponse updateSysDuad(SaveSysDuad req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysDuadBusiSV.updateSysDuad(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改语言对成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改语言对失败");
		}
		return response;
	}

	@Override
	public Integer checkDuadCn(CheckDuadCn param) throws BusinessException, SystemException {
		return iQuerySysDuadBusiSV.checkDuadCn(param);
	}
}

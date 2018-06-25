package com.x.common.api.sysdomain.impl;

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
import com.x.common.api.sysdomain.interfaces.IQuerySysDomainSV;
import com.x.common.api.sysdomain.param.CheckDomainCn;
import com.x.common.api.sysdomain.param.DeleteSysDomain;
import com.x.common.api.sysdomain.param.DomainPageQueryResponse;
import com.x.common.api.sysdomain.param.DomainPageVo;
import com.x.common.api.sysdomain.param.DomainQueryRequest;
import com.x.common.api.sysdomain.param.QuerySysDomainDetailsRes;
import com.x.common.api.sysdomain.param.QuerySysDomainListReq;
import com.x.common.api.sysdomain.param.QuerySysDomainListRes;
import com.x.common.api.sysdomain.param.SaveSysDomain;
import com.x.common.api.sysdomain.param.SysDomainVo;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysDomain;
import com.x.common.service.business.sysdomain.IQuerySysDomainBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.StringUtil;

/**
 * @Description: 领域查询服务
 * @author auth
 * @date 2016年11月1日 下午5:53:41 
 * @version V1.0
 */
@Service
@Component
public class QuerySysDomainSVImpl implements IQuerySysDomainSV {
	
	@Autowired
	private transient IQuerySysDomainBusiSV querySysDomainBusiSV;
	
	@Override
	public QuerySysDomainDetailsRes querySysDomainDetails(String domainId)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(domainId)){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "领域ID不能为空");
		}
		SysDomain sysDomain = querySysDomainBusiSV.querySysDomainDetails(domainId);
		if(sysDomain==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "领域不存在");
		}
		QuerySysDomainDetailsRes res = new QuerySysDomainDetailsRes();
		BeanUtils.copyProperties(res, sysDomain);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}


	@Override
	public QuerySysDomainListRes querySysDomainList(QuerySysDomainListReq req)
			throws BusinessException, SystemException {
		List<SysDomain> domains = querySysDomainBusiSV.querySysDomainList(req.getLanguage());
		List<SysDomainVo> vos = new ArrayList<SysDomainVo>();
		for(SysDomain domain:domains){
			SysDomainVo vo = new SysDomainVo();
			BeanUtils.copyProperties(vo, domain);
			vos.add(vo);
		}
		QuerySysDomainListRes res = new QuerySysDomainListRes();
		res.setDomainVos(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}


	@Override
	public DomainPageQueryResponse queryDomainPage(DomainQueryRequest param) throws BusinessException, SystemException {
		DomainPageQueryResponse domainPageQueryResponse = new DomainPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<DomainPageVo> pageInfo = querySysDomainBusiSV.queryDomainPage(param);
            domainPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("领域列表查询成功");
            domainPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            domainPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("领域列表查询失败");
            domainPageQueryResponse.setResponseHeader(responseHeader);
        }
		return domainPageQueryResponse;
	}


	@Override
	public BaseResponse saveSysDomain(SaveSysDomain req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			querySysDomainBusiSV.saveSysDomain(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加领域成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加领域失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysDomain(DeleteSysDomain param) throws Exception {
		return querySysDomainBusiSV.deleteSysDomain(param.getDomainId());
	}


	@Override
	public DomainPageVo querySysDomainById(DeleteSysDomain param)
			throws BusinessException, SystemException {
		if(StringUtil.isBlank(param.getDomainId())){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "领域ID不能为空");
		}
		SysDomain sysDomain = querySysDomainBusiSV.querySysDomainById(param);
		if(sysDomain==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "领域不存在");
		}
		DomainPageVo res = new DomainPageVo();
		BeanUtils.copyProperties(res, sysDomain);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}


	@Override
	public BaseResponse updateSysDomain(SaveSysDomain req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			querySysDomainBusiSV.updateSysDomain(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改领域成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改领域失败");
		}
		return response;
	}


	@Override
	public Integer checkDomainCn(CheckDomainCn param) throws BusinessException, SystemException {
		return querySysDomainBusiSV.checkDomainCn(param);
	}


	@Override
	public BaseListResponse<DomainPageVo> querySysDomainByIdFlag(DeleteSysDomain param)
			throws BusinessException, SystemException {
		BaseListResponse<DomainPageVo> querySysDomainByIds = new BaseListResponse<>();
		ResponseHeader responseHeader = new ResponseHeader();
		try{
			List<DomainPageVo> querySysDomainById = querySysDomainBusiSV.querySysDomainByIdFlag(param);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("领域列表查询成功!");
			querySysDomainByIds.setResponseHeader(responseHeader);
			querySysDomainByIds.setResult(querySysDomainById);
		}catch(Exception e){
			responseHeader.setSuccess(false);
			responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
			responseHeader.setResultMessage("领域列表查询失败!");
			querySysDomainByIds.setResponseHeader(responseHeader);
		}
		return querySysDomainByIds;
	}

	
}

package com.x.common.api.sysseomanager.impl;


import java.util.ArrayList;
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
import com.x.common.api.sysseomanager.interfaces.IQuerySysSeoManagerSV;
import com.x.common.api.sysseomanager.param.CheckSysSeoManager;
import com.x.common.api.sysseomanager.param.DeleteSysSeoManager;
import com.x.common.api.sysseomanager.param.QuerySysSeoByIdRes;
import com.x.common.api.sysseomanager.param.QuerySysSeoManagerListRes;
import com.x.common.api.sysseomanager.param.SaveSysSeoManager;
import com.x.common.api.sysseomanager.param.SeoManagerPageQueryRequest;
import com.x.common.api.sysseomanager.param.SeoManagerPageQueryResponse;
import com.x.common.api.sysseomanager.param.SeoManagerPageVo;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysSeoManager;
import com.x.common.service.business.sysseomanager.IQuerySysSeoManagerBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;

/**
 * @Description: SEO管理服务
 * @author auth
 * @date 2016年11月1日 下午6:28:30 
 * @version V1.0
 */
@Service
@Component
public class QuerySysSeoManagerSVImpl implements IQuerySysSeoManagerSV {
	private static final Logger logger = Logger.getLogger(QuerySysSeoManagerSVImpl.class);
	@Autowired
	private transient IQuerySysSeoManagerBusiSV iQuerySysSeoManagerBusiSV;
	
	
	
	@Override
	public QuerySysSeoManagerListRes querySysSeoManagerList()
			throws BusinessException, SystemException {
		List<SysSeoManager> sysseomanagers = iQuerySysSeoManagerBusiSV.querySysSeoManagerList();
		List<SeoManagerPageVo> vos = new ArrayList<SeoManagerPageVo>();
		for(SysSeoManager sysseomanager:sysseomanagers){
			SeoManagerPageVo vo = new SeoManagerPageVo();
			BeanUtils.copyProperties(vo, sysseomanager);
			vos.add(vo);
		}
		QuerySysSeoManagerListRes res = new QuerySysSeoManagerListRes();
		res.setSeomanagerPages(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}
	
	
	
	@Override
	public SeoManagerPageQueryResponse querySeoManagerPage(SeoManagerPageQueryRequest param)
			throws BusinessException, SystemException {
		SeoManagerPageQueryResponse seoManagerPageQueryResponse = new SeoManagerPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<SeoManagerPageVo> pageInfo = iQuerySysSeoManagerBusiSV.querySeoManagerPage(param);
            seoManagerPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("SEO管理列表查询成功");
            seoManagerPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            seoManagerPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("SEO管理列表查询失败");
            seoManagerPageQueryResponse.setResponseHeader(responseHeader);
        }
		return seoManagerPageQueryResponse;
	}


	@Override
	public BaseResponse saveSysSeoManager(SaveSysSeoManager req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysSeoManagerBusiSV.saveSysSeoManager(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加SEO管理成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加SEO管理失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysSeoManager(DeleteSysSeoManager param) throws Exception {
		return iQuerySysSeoManagerBusiSV.deleteSysSeoManager(param.getId());
	}


	@Override
	public BaseResponse updateSysSeoManager(SaveSysSeoManager req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysSeoManagerBusiSV.updateSysSeoManager(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改SEO管理成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改SEO管理失败");
		}
		return response;
	}


	@Override
	public Integer checkSysSeoManager(CheckSysSeoManager param) throws BusinessException, SystemException {
		return iQuerySysSeoManagerBusiSV.checkSysSeoManager(param);
	}



	@Override
	public QuerySysSeoByIdRes querySysSeoById(DeleteSysSeoManager param)
			throws BusinessException, SystemException, Exception {
		return iQuerySysSeoManagerBusiSV.querySysSeoById(param.getId());

	}


}

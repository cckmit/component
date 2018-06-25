package com.x.common.api.sysadvertmanager.impl;


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
import com.x.common.api.sysadvertmanager.interfaces.IQuerySysAdvertManagerSV;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageQueryRequest;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageQueryResponse;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageVo;
import com.x.common.api.sysadvertmanager.param.DeleteSysAdvertManager;
import com.x.common.api.sysadvertmanager.param.QuerySysAdvertListRes;
import com.x.common.api.sysadvertmanager.param.SaveSysAdvertManager;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysAdvertManager;
import com.x.common.service.business.sysadvertmanager.IQuerySysAdvertManagerBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;

/**
 * @Description: 广告管理服务
 * @author auth
 */
@Service
@Component
public class QuerySysAdvertManagerSVImpl implements IQuerySysAdvertManagerSV {
	private static final Logger logger = Logger.getLogger(QuerySysAdvertManagerSVImpl.class);
	@Autowired
	private transient IQuerySysAdvertManagerBusiSV iQuerySysAdvertManagerBusiSV;
	
	
	@Override
	public QuerySysAdvertListRes querySysAdvertList() throws BusinessException, SystemException {
		List<SysAdvertManager> sysadvertmanagers = iQuerySysAdvertManagerBusiSV.querySysAdvertList();
		List<SaveSysAdvertManager> vos = new ArrayList<SaveSysAdvertManager>();
		for(SysAdvertManager sysadvertmanager:sysadvertmanagers){
			SaveSysAdvertManager vo = new SaveSysAdvertManager();
			BeanUtils.copyProperties(vo, sysadvertmanager);
			vos.add(vo);
		}
		QuerySysAdvertListRes res = new QuerySysAdvertListRes();
		res.setAdvertmanagerlists(vos);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}
	
	
	
	@Override
	public AdvertManagerPageQueryResponse queryAdvertManagerPage(AdvertManagerPageQueryRequest param)
			throws BusinessException, SystemException {
		AdvertManagerPageQueryResponse advertManagerPageQueryResponse = new AdvertManagerPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<AdvertManagerPageVo> pageInfo = iQuerySysAdvertManagerBusiSV.queryAdvertManagerPage(param);
            advertManagerPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("广告管理列表查询成功");
            advertManagerPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            advertManagerPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("广告管理列表查询失败");
            advertManagerPageQueryResponse.setResponseHeader(responseHeader);
        }
		return advertManagerPageQueryResponse;
	}
	@Override
	public BaseResponse saveSysAdvertManager(SaveSysAdvertManager req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysAdvertManagerBusiSV.saveSysAdvertManager(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加广告成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加广告失败");
		}
		return response;
	}
	@Override
	public Integer deleteSysAdvertManager(DeleteSysAdvertManager param)
			throws BusinessException, SystemException, Exception {
		return iQuerySysAdvertManagerBusiSV.deleteSysAdvertManager(param.getId());
	}
	@Override
	public BaseResponse updateSysAdvertManager(SaveSysAdvertManager req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysAdvertManagerBusiSV.updateSysAdvertManager(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改广告成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改广告失败");
		}
		return response;
	}
	@Override
	public SaveSysAdvertManager querySysAdvertById(DeleteSysAdvertManager param)
			throws BusinessException, SystemException, Exception {
		return iQuerySysAdvertManagerBusiSV.querySysAdvertById(param.getId());

	}

}

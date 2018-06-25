package com.x.common.api.sysconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysconfig.interfaces.IElasticJobSV;
import com.x.common.cache.HomeDataConfigCache;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.service.atom.sysconfig.ISysConfigAtomSV;
import com.x.sdk.constant.ExceptionCodeConstant;

/** 
 * @author auth
 * @date 创建时间：2017年1月10日 下午3:13:51 
 * @version 
 * @since  
 */
@Service
@Component
public class ElasticJobSVImpl implements IElasticJobSV {

	@Autowired
	private ISysConfigAtomSV iSysConfigAtomSV;
	@Autowired
	private HomeDataConfigCache homeDataConfigCache;
	
	@Override
	public BaseResponse autoIncreaseHomeNum() throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iSysConfigAtomSV.changeOne();
			homeDataConfigCache.write();
			response.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
			//
			//
		} catch (BusinessException | SystemException e) {
			//
			responseHeader.setSuccess(false);
			responseHeader.setResultCode(e.getErrorCode());
			responseHeader.setResultMessage(e.getErrorMessage());
			//
			response.setResponseHeader(responseHeader);
		} catch (Exception e) {
			//
			responseHeader.setSuccess(false);
			responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
			responseHeader.setResultMessage("刷新首页指标数量失败");
			//
			response.setResponseHeader(responseHeader);
		}
		//
		return response;
	}

}

package com.x.common.api.sysconfig.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysconfig.interfaces.IQuerySysConfigSV;
import com.x.common.api.sysconfig.param.CommissionConfig;
import com.x.common.api.sysconfig.param.DonateIntegralConfig;
import com.x.common.api.sysconfig.param.HomeDataEidtConfig;
import com.x.common.api.sysconfig.param.MemberConfig;
import com.x.common.api.sysconfig.param.NoticeConfig;
import com.x.common.api.sysconfig.param.SaveSysConfig;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysConfig;
import com.x.common.service.business.sysconfig.IQuerySysConfigBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;

/**
 * @Description: 会员基本配置查询服务实现
 * @author auth
 * @date 2016年11月1日 下午5:02:32 
 * @version V1.0
 */
@Service
@Component
public class QuerySysConfigSVImpl implements IQuerySysConfigSV {
	private static final Logger logger = Logger.getLogger(QuerySysConfigSVImpl.class);
	@Autowired
	private transient IQuerySysConfigBusiSV iQuerySysConfigBusiSV;

	@Override
	public MemberConfig getMemberConfig() throws BusinessException,
			SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "配置信息不存在");
		}
		MemberConfig res  = new MemberConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
		
	}

	@Override
	public CommissionConfig getCommissionConfig() throws BusinessException,
			SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "配置信息不存在");
		}
		CommissionConfig res  = new CommissionConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
		
	}

	@Override
	public HomeDataEidtConfig getHomeDataEidtConfig() throws BusinessException,
			SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "配置信息不存在");
		}
		HomeDataEidtConfig res  = new HomeDataEidtConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public DonateIntegralConfig getDonateIntegralConfig()
			throws BusinessException, SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "配置信息不存在");
		}
		DonateIntegralConfig res  = new DonateIntegralConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public NoticeConfig getNoticeConfig() throws BusinessException, SystemException {
		SysConfig config = iQuerySysConfigBusiSV.getSysCong();
		if(config==null){
			throw new BusinessException(ExceptionCodeConstant.NO_RESULT, "配置信息不存在");
		}
		NoticeConfig res  = new NoticeConfig();
		BeanUtils.copyProperties(res, config);
		res.setResponseHeader(new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		return res;
	}

	@Override
	public BaseResponse saveSysConfig(SaveSysConfig req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysConfigBusiSV.saveSysConfig(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("保存基本设置成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"保存基本设置失败");
		}
		return response;
	}

	

}

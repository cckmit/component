/**
 * 
 */
package com.x.common.api.country.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.country.interfaces.IGnCountrySV;
import com.x.common.api.country.param.CountryComResponse;
import com.x.common.api.country.param.CountryRequest;
import com.x.common.api.country.param.CountryResponse;
import com.x.common.api.country.param.CountryUpdateRequest;
import com.x.common.api.country.param.CountryVo;
import com.x.common.api.country.param.NullResponse;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.GnCountry;
import com.x.common.service.business.country.IGnCountryBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * <br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
@Service
@Component
public class GnCountrySVImpl implements IGnCountrySV {
	private static final Logger LOGGER = LoggerFactory.getLogger(GnCountrySVImpl.class);
	@Autowired
	IGnCountryBusiSV gnCountryBusiSV;

	@Override
	public CountryResponse queryCountry(CountryRequest request)
			throws BusinessException, SystemException {
		if (request == null) {
			throw new BusinessException(
					ExceptionCodeConstant.PARAM_IS_NULL,
					"获取参数失败:请求参数不能为空");
		}
		CountryResponse res = new CountryResponse();
		res.setResponseHeader(new ResponseHeader(true,
				ResultCodeConstants.SUCCESS_CODE, "查询成功"));
		List<GnCountry> list = gnCountryBusiSV.queryCountry(request);
		if (!CollectionUtil.isEmpty(list)) {
			res.setResult(JSON.parseArray(JSON.toJSONString(list),
					CountryVo.class));
		}
		return res;
	}

	/**
	 * 更新国家信息
	 *
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode COUNTRY_10001
	 * @ApiDocMethod
	 * @RestRelativeURL country/updateCountry
	 */
	@Override
	public CountryComResponse<NullResponse> updateCountry(CountryUpdateRequest request)
			throws BusinessException, SystemException {
		CountryComResponse<NullResponse> response = new CountryComResponse<NullResponse>();
		//检查入参有效性
		try {
			if(StringUtil.isBlank(request.getDomain()) || StringUtil.isBlank(request.getCountry_cn())){
				throw new BusinessException("-1","国家域名和国家地域中文名称均不能为空");
			}
			int num = gnCountryBusiSV.updateCountry(request);
			//更新成功
			if (num > 0){
				response.setCode("1");
				response.setMessage("成功");
			}else{
				throw new BusinessException("-1","更新失败");
			}
		} catch (BusinessException e){
			response.setCode(e.getErrorCode());
			response.setMessage(e.getMessage());
		} catch (Exception e){
			LOGGER.error("更新国家信息失败",e);
			response.setCode("-1");
			response.setMessage("更新失败");
		}
		return response;
	}

}

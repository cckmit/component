package com.x.common.service.business.country.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.exception.BusinessException;
import com.x.common.api.country.param.CountryRequest;
import com.x.common.api.country.param.CountryUpdateRequest;
import com.x.common.dao.mapper.bo.GnCountry;
import com.x.common.dao.mapper.bo.GnCountryCriteria;
import com.x.common.service.atom.country.IGnCountryAtomSV;
import com.x.common.service.business.country.IGnCountryBusiSV;
import com.x.sdk.util.StringUtil;

/**
 * <br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
@Component
@Transactional
public class GnCountryBusiSVImpl implements IGnCountryBusiSV {
	@Autowired
	IGnCountryAtomSV gnCountryAtomSV;

	@Override
	public List<GnCountry> queryCountry(CountryRequest req) {
		GnCountryCriteria criteria = new GnCountryCriteria();
		GnCountryCriteria.Criteria c = criteria.createCriteria();
		if (req.getId() != null) {
			c.andIdEqualTo(req.getId());
		}
		if (!StringUtil.isBlank(req.getCountryNameCn())) {
			c.andCountryNameCnEqualTo(req.getCountryNameCn());
		}

		if (!StringUtil.isBlank(req.getCountryNameEn())) {
			c.andCountryNameEnEqualTo(req.getCountryNameEn());
		}
		if (!StringUtil.isBlank(req.getCountryValue())) {
			c.andCountryValueEqualTo(req.getCountryValue());
		}
		if (!StringUtil.isBlank(req.getCountryCode())) {
			c.andCountryCodeEqualTo(req.getCountryCode());
		}
		criteria.setOrderByClause("ORDER_ID DESC,OPERATION_TIME DESC");
		return gnCountryAtomSV.queryCountry(criteria);
	}

	/**
	 * 更新国家信息
	 *
	 * @param request
	 * @return
	 */
	@Override
	public int updateCountry(CountryUpdateRequest request) {
		GnCountry country = gnCountryAtomSV.queryByCountryValue(request.getDomain());
		//查询国际编码是否已存在
		if(country!=null && !country.getId().equals(request.getCid())){
			throw new BusinessException("-15","国际编码已存在");
		}
		if(country==null)
			country = new GnCountry();
		country.setId(request.getCid());
		country.setCountryValue(request.getDomain());
		country.setCountryCode(request.getCode());
		country.setCountryNameCn(request.getCountry_cn());
		country.setCountryNameEn(request.getCountry_en());
		country.setOperationTime(System.currentTimeMillis());
		country.setOrderId(request.getSortid());
		country.setRegularExpression(request.getRegular());
		int num = 0;
		if(request.getCid()!=null){
			num = gnCountryAtomSV.updateCountryById(country);
		}else {
			num = gnCountryAtomSV.createCountry(country);
		}
		return num;
	}

}

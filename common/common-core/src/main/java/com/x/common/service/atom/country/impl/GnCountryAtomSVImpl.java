package com.x.common.service.atom.country.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.common.dao.mapper.bo.GnCountry;
import com.x.common.dao.mapper.bo.GnCountryCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.service.atom.country.IGnCountryAtomSV;
import com.x.common.util.CommonSeqUtil;
import com.x.sdk.util.CollectionUtil;

/**
 * 实现层<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
@Component
public class GnCountryAtomSVImpl implements IGnCountryAtomSV {

	@Override
	public List<GnCountry> queryCountry(GnCountryCriteria criteria) {

		return MapperFactory.getGnCountryMapper().selectByExample(criteria);
	}

	/**
	 * 通过国家信息标识更新信息
	 *
	 * @param gnCountry
	 * @return
	 */
	@Override
	public int updateCountryById(GnCountry gnCountry) {
		return MapperFactory.getGnCountryMapper().updateByPrimaryKeySelective(gnCountry);
	}

	/**
	 * 添加国家信息
	 *
	 * @param gnCountry
	 * @return
	 */
	@Override
	public int createCountry(GnCountry gnCountry) {
		gnCountry.setId(CommonSeqUtil.getGnCountryId());
		return MapperFactory.getGnCountryMapper().insert(gnCountry);
	}

	/**
	 * 根据国家域名缩写查询国家信息
	 *
	 * @param countryValue
	 * @return
	 */
	@Override
	public GnCountry queryByCountryValue(String countryValue) {
		GnCountryCriteria example = new GnCountryCriteria();
		GnCountryCriteria.Criteria criteria = example.createCriteria();
		criteria.andCountryValueEqualTo(countryValue);
		List<GnCountry> countryList = MapperFactory.getGnCountryMapper().selectByExample(example);
		return CollectionUtil.isEmpty(countryList)?null:countryList.get(0);
	}

}

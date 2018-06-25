/**
 * 
 */
package com.x.common.service.atom.country;

import java.util.List;

import com.x.common.dao.mapper.bo.GnCountry;
import com.x.common.dao.mapper.bo.GnCountryCriteria;

/**
 * 国家查询原子层<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public interface IGnCountryAtomSV {
	public List<GnCountry> queryCountry(GnCountryCriteria criteria);

	/**
	 * 通过国家信息标识更新信息
	 * @param gnCountry
	 * @return
	 */
	public int updateCountryById(GnCountry gnCountry);

	/**
	 * 添加国家信息
	 * @param gnCountry
	 * @return
	 */
	public int createCountry(GnCountry gnCountry);

	/**
	 * 根据国家域名缩写查询国家信息
	 * @param countryValue
	 * @return
	 */
	public GnCountry queryByCountryValue(String countryValue);
}

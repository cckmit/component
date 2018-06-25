/**
 * 
 */
package com.x.common.service.business.country;

import java.util.List;

import com.x.common.api.country.param.CountryRequest;
import com.x.common.api.country.param.CountryUpdateRequest;
import com.x.common.dao.mapper.bo.GnCountry;

/**
 * 国家查询业务层<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public interface IGnCountryBusiSV {
	public List<GnCountry> queryCountry(CountryRequest request);

	/**
	 * 更新国家信息
	 * @param request
	 * @return
	 */
	public int updateCountry(CountryUpdateRequest request);
}

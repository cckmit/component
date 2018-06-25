package com.x.common.api.country.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.country.param.*;

/**
 * 公共域-国家查询<br>
 * Date: 2016年11月7日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
@Path("/country")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IGnCountrySV {
	/**
	 * 查询国家
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode	COUNTRY_10000
	 * @ApiDocMethod
	 * @RestRelativeURL country/queryCountry
	 */
	@POST
	@Path("/queryCountry")
	CountryResponse queryCountry(CountryRequest request)throws BusinessException,SystemException;

	/**
	 * 更新国家信息
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode	COUNTRY_10001
	 * @ApiDocMethod
	 * @RestRelativeURL country/updateCountry
	 */
	@POST
	@Path("/updateCountry")
	CountryComResponse<NullResponse> updateCountry(CountryUpdateRequest request)
			throws BusinessException,SystemException;
}

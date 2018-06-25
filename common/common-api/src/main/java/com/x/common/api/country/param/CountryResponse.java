/**
 * 
 */
package com.x.common.api.country.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 * 国家查询返回 Date: 2016年11月7日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public class CountryResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6230568611297688245L;
	private List<CountryVo> result = null;

	public List<CountryVo> getResult() {
		return result;
	}

	public void setResult(List<CountryVo> result) {
		this.result = result;
	}
}

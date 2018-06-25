package com.x.common.api.parkgps.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 * 查询停车场位置信息 <br>
 * Date: 2018年2月7日 <br>
 * Copyright (c) 2018 bonc.com.cn <br>
 * 
 * @author auth
 */
public class ParkGpsResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ParkGpsVo> result;

	public List<ParkGpsVo> getResult() {
		return result;
	}

	public void setResult(List<ParkGpsVo> result) {
		this.result = result;
	}
}

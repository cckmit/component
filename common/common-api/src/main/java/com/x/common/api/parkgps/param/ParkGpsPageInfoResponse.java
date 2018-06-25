package com.x.common.api.parkgps.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

/**
 * 查询停车场位置信息 <br>
 * Date: 2018年2月7日 <br>
 * Copyright (c) 2018 bonc.com.cn <br>
 * 
 * @author auth
 */
public class ParkGpsPageInfoResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PageInfo<ParkGpsVo> result;

	public PageInfo<ParkGpsVo> getResult() {
		return result;
	}

	public void setResult(PageInfo<ParkGpsVo> result) {
		this.result = result;
	}

}

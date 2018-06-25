package com.x.common.api.area.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class GnAreaResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 地域信息
	 */
	private List<GnAreaVo> gnareas;

	public List<GnAreaVo> getGnareas() {
		return gnareas;
	}

	public void setGnareas(List<GnAreaVo> gnareas) {
		this.gnareas = gnareas;
	}

}

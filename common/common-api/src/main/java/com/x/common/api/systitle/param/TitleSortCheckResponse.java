package com.x.common.api.systitle.param;

import com.x.base.vo.BaseResponse;

public class TitleSortCheckResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//数量
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}

package com.x.common.api.waitjobs.param;

import com.x.base.vo.BaseResponse;

public class WaitjobsInsertResponse extends BaseResponse{
	
	private static final long serialVersionUID = 1L;
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

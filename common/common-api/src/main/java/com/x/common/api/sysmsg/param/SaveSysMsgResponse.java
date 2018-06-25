package com.x.common.api.sysmsg.param;

import com.x.base.vo.BaseResponse;

public class SaveSysMsgResponse extends BaseResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sysMsgId;

	public String getSysMsgId() {
		return sysMsgId;
	}

	public void setSysMsgId(String sysMsgId) {
		this.sysMsgId = sysMsgId;
	}

}

package com.x.common.api.sysseomanager.param;

import com.x.base.vo.BaseInfo;

public class QuerySysSeoManagerListReq extends BaseInfo{

	private static final long serialVersionUID = 1834257059448657467L;
	
	/**
	 * 主键
	 */
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

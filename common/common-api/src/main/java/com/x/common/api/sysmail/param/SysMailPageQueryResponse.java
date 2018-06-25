package com.x.common.api.sysmail.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class SysMailPageQueryResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PageInfo<SysMailInfo> pageInfo;

	public PageInfo<SysMailInfo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<SysMailInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}

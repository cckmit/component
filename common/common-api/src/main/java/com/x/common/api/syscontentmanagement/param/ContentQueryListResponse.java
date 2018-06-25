package com.x.common.api.syscontentmanagement.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class ContentQueryListResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 分页数据
	private PageInfo<ContentSearchInfo> pageInfo;

	public PageInfo<ContentSearchInfo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<ContentSearchInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}
	
	 
}

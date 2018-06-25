package com.x.common.api.systitle.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class TitleQueryListResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 分页数据
	private PageInfo<SysTitleSearchInfo> pageInfo;

	public PageInfo<SysTitleSearchInfo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<SysTitleSearchInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

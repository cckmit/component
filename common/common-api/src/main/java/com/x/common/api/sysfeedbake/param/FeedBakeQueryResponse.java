package com.x.common.api.sysfeedbake.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class FeedBakeQueryResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 分页数据
	private PageInfo<SysFeedbakeSearchInfo> pageInfo;

	public PageInfo<SysFeedbakeSearchInfo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<SysFeedbakeSearchInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}
	
	
	
	

}

package com.x.centra.dst.api.discountlevel.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class DstDisCountLevelListResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2403402612567298633L;
	private PageInfo<DstDiscountLevelVO> pages;

	public PageInfo<DstDiscountLevelVO> getPages() {
		return pages;
	}

	public void setPages(PageInfo<DstDiscountLevelVO> pages) {
		this.pages = pages;
	}

}

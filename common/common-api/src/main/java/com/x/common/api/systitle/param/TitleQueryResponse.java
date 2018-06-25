package com.x.common.api.systitle.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class TitleQueryResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<TitleQueryInfo> titleList;

	public List<TitleQueryInfo> getTitleList() {
		return titleList;
	}

	public void setTitleList(List<TitleQueryInfo> titleList) {
		this.titleList = titleList;
	}
}

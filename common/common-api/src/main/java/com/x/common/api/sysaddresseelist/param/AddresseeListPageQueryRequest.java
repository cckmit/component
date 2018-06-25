package com.x.common.api.sysaddresseelist.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class AddresseeListPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     * 分页时必填
     */
    PageInfo<AddresseeListPageVo> pageInfo;
	public PageInfo<AddresseeListPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<AddresseeListPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

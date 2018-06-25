package com.x.common.api.syssendmes.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class SendMesPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     * 分页时必填
     */
    PageInfo<SendMesPageVo> pageInfo;
	public PageInfo<SendMesPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<SendMesPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

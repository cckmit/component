package com.x.common.api.sysmesmodel.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class MesModelPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     * 分页时必填
     */
    PageInfo<MesModelPageVo> pageInfo;
	public PageInfo<MesModelPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<MesModelPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

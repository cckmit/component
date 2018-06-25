package com.x.common.api.syssendmes.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

/**
 *根据列表ID查询管理列表
 */
public class SysMesAddresseePageResponse extends BaseResponse {


    private static final long serialVersionUID = 1L;

    /**
     * 分页时必填
     */
    PageInfo<SysMesAddresseeResponse> pageInfo;

    public PageInfo<SysMesAddresseeResponse> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<SysMesAddresseeResponse> pageInfo) {
        this.pageInfo = pageInfo;
    }
}
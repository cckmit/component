package com.x.common.api.sysaddresseelist.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

/**
 *根据列表ID查询管理列表
 */
public class SysAddresseePageResponse extends BaseResponse {


    private static final long serialVersionUID = 1L;

    /**
     * 分页时必填
     */
    PageInfo<SysAddresseeResponse> pageInfo;

    public PageInfo<SysAddresseeResponse> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<SysAddresseeResponse> pageInfo) {
        this.pageInfo = pageInfo;
    }
}
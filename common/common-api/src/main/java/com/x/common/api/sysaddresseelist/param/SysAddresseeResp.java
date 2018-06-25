package com.x.common.api.sysaddresseelist.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 *根据列表ID查询管理列表
 */
public class SysAddresseeResp extends BaseResponse {


    private static final long serialVersionUID = 1L;

    /**
     * 分页时必填
     */
    List<SysAddresseeResponse> sysAddresseeResponse;

	public List<SysAddresseeResponse> getSysAddresseeResponse() {
		return sysAddresseeResponse;
	}

	public void setSysAddresseeResponse(List<SysAddresseeResponse> sysAddresseeResponse) {
		this.sysAddresseeResponse = sysAddresseeResponse;
	}
}
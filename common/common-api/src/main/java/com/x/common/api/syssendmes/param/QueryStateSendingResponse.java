package com.x.common.api.syssendmes.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 *根据列表ID查询管理列表
 */
public class QueryStateSendingResponse extends BaseResponse {


    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    List<SysMesAddresseeResponse> mesAddresseeInfo;

	public List<SysMesAddresseeResponse> getMesAddresseeInfo() {
		return mesAddresseeInfo;
	}

	public void setMesAddresseeInfo(List<SysMesAddresseeResponse> mesAddresseeInfo) {
		this.mesAddresseeInfo = mesAddresseeInfo;
	}
}
package com.x.centra.dst.api.discount.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class CustDiscountResponse  extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String tenantId;
	
	private List<CustDiscountInfoVo> infoVos;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public List<CustDiscountInfoVo> getInfoVos() {
		return infoVos;
	}

	public void setInfoVos(List<CustDiscountInfoVo> infoVos) {
		this.infoVos = infoVos;
	}

}

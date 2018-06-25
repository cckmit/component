package com.x.centra.dst.api.discount.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class BaseParamResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 租户ID
     */
	private String tenantId;
	
	private List<BaseParamVo> paramVos;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public List<BaseParamVo> getParamVos() {
		return paramVos;
	}

	public void setParamVos(List<BaseParamVo> paramVos) {
		this.paramVos = paramVos;
	}
	
}

package com.x.centra.dst.api.discount.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 * 权益类型查询返回
 * @author wangluyang
 *
 */
public class DiscountClassQueryResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 租户ID
     */
	private String tenantId;
	
	private List<DiscountClassResponseVo> responseVos;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public List<DiscountClassResponseVo> getResponseVos() {
		return responseVos;
	}

	public void setResponseVos(List<DiscountClassResponseVo> responseVos) {
		this.responseVos = responseVos;
	}
}

package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

/**
 * 权益查询返回
 * @author wangluyang
 *
 */
public class DiscountInfoQueryResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1370923955134926269L;
	
	/**
     * 租户ID
     */
	private String tenantId;
	
	/**
	 * 分页查询结果
	 */
	private PageInfo<DiscountInfoResponseVo> info;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public PageInfo<DiscountInfoResponseVo> getInfo() {
		return info;
	}

	public void setInfo(PageInfo<DiscountInfoResponseVo> info) {
		this.info = info;
	}
}

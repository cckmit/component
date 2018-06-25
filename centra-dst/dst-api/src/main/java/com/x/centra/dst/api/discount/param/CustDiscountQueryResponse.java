package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

/**
 * 客户权益查询出參
 * @author wangluyang
 *
 */
public class CustDiscountQueryResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * 租户ID
     */
	private String tenantId;
	
	/**
	 * 查询结果
	 */
	private PageInfo<CustDiscountResponseVo> info;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public PageInfo<CustDiscountResponseVo> getInfo() {
		return info;
	}

	public void setInfo(PageInfo<CustDiscountResponseVo> info) {
		this.info = info;
	}
}

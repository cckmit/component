package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseResponse;

/**
 * 参数是否存在返回
 * @author wangluyang
 *
 */
public class ExistParamResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 租户ID
     */
	private String tenantId;
	
	/**
	 * true 存在
	 * false 不存在
	 */
	private boolean exist;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}
}

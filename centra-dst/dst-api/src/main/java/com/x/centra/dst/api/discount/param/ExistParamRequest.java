package com.x.centra.dst.api.discount.param;

import java.io.Serializable;

/**
 * 参数是否存在请求入參
 * @author wangluyang
 *
 */
public class ExistParamRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 租户ID
     */
	private String tenantId;
	
	/**
	 * 参数编码
	 */
	private String paramCode;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}
}

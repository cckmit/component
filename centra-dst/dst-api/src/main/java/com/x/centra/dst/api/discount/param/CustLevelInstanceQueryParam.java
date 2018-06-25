package com.x.centra.dst.api.discount.param;

import com.x.base.vo.BaseInfo;

/**
 * 客户权益查询入參
 * @author wangluyang
 *
 */
public class CustLevelInstanceQueryParam extends BaseInfo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


    /**
	 * instanceId
	 */
	private String instanceId;

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
}

package com.x.centra.cust.web.model.product;

import com.x.centra.product.api.normproduct.param.NormProdResponse;

public class NormProdQueryInfo extends NormProdResponse {

	private static final long serialVersionUID = 1L;
	/**
     * 状态名称，页面展示状态名称
     */
	private String stateName;
	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}


}

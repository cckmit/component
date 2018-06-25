package com.x.common.api.sysmesmodel.param;

import java.io.Serializable;

public class DeleteSysMesModel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 *主键
	 */
	private String modelId;

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
}

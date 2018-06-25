package com.x.common.api.sysquestions.param;

import java.io.Serializable;

public class DeleteSysQuestions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号
	 */
	private String qid;

	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid;
	}
}

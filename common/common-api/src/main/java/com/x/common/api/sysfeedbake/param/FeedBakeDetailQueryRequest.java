package com.x.common.api.sysfeedbake.param;

import java.io.Serializable;

public class FeedBakeDetailQueryRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//备注
	private String remarks;
	//处理人
	private String handlePerole;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getHandlePerole() {
		return handlePerole;
	}
	public void setHandlePerole(String handlePerole) {
		this.handlePerole = handlePerole;
	}
}

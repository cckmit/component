package com.x.common.api.invoiceview.param;

import java.io.Serializable;

public class InvoiceMailViewRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// 企业ID
	private String corporaId;
	//用户id
	private String userId;
	// 页码，必填
	private Integer pageNo;
	// 每页大小，必填
	private Integer pageSize;
	public String getCorporaId() {
		return corporaId;
	}
	public void setCorporaId(String corporaId) {
		this.corporaId = corporaId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}

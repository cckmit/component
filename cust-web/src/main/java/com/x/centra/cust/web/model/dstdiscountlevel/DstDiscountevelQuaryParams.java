package com.x.centra.cust.web.model.dstdiscountlevel;

import com.x.base.vo.BaseInfo;

public class DstDiscountevelQuaryParams extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1242430660101103737L;

	/**
	 * 级别编码
	 */
	private String levelCode;
	
	/**
	 * 级别名称
	 */
	private String levelName;

	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 当前第几页,必填
	 */
	private Integer pageNo;

	/**
	 * 每页数据条数,必填
	 */
	private Integer pageSize;

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

package com.x.common.api.parkgps.param;

import com.x.base.vo.BaseInfo;

public class ParkGpsPageInfoRequest extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 停车场关键字
	 */
	private String parkName;

	/**
	 * 当前第几页,必填
	 */
	private Integer pageNo = 0;

	/**
	 * 每页数据条数,必填
	 */
	private Integer pageSize = 5;

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
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

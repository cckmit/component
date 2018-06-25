package com.x.common.api.parkgps.param;

import com.x.base.vo.BaseInfo;

public class ParkGpsRequest extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String parkName;

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

}

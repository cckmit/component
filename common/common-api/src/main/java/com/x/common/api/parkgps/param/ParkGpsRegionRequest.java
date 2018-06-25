package com.x.common.api.parkgps.param;

import java.math.BigDecimal;

import com.x.base.vo.BaseInfo;

public class ParkGpsRegionRequest extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GpsMapPoint gmp;

	private BigDecimal r;

	public GpsMapPoint getGmp() {
		return gmp;
	}

	public void setGmp(GpsMapPoint gmp) {
		this.gmp = gmp;
	}

	public BigDecimal getR() {
		return r;
	}

	public void setR(BigDecimal r) {
		this.r = r;
	}

}

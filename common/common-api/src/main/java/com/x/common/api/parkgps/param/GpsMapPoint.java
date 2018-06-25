package com.x.common.api.parkgps.param;

import java.io.Serializable;
import java.math.BigDecimal;

public class GpsMapPoint implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 经度,竖着的是经度
	 */
	private BigDecimal mapLng;

	/**
	 * 纬度，横着的是纬度
	 */
	private BigDecimal mapLat;

	public BigDecimal getMapLng() {
		return mapLng;
	}

	public void setMapLng(BigDecimal mapLng) {
		this.mapLng = mapLng;
	}

	public BigDecimal getMapLat() {
		return mapLat;
	}

	public void setMapLat(BigDecimal mapLat) {
		this.mapLat = mapLat;
	}

}

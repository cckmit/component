package com.x.common.util;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.x.common.api.parkgps.param.GpsMapPoint;
import com.x.common.constants.GpsConstants;

/**
 * gps操作类
 * 
 * @author auth
 *
 */
public final class GpsUtil {

	private GpsUtil() {
		// do not new me.
	}

	/**
	 * 以入参gmp点为中心，算出边长为2*r的正方形的四个顶点的坐标。
	 * 
	 * @param gmp
	 * @return
	 */
	public static Map<String, GpsMapPoint> get4PointByCac(GpsMapPoint gmp, BigDecimal r) {

		BigDecimal lat = gmp.getMapLat();
		BigDecimal lng = gmp.getMapLng();

		Map<String, GpsMapPoint> result = new HashMap<String, GpsMapPoint>();

		result.put(GpsConstants.Rectangle.TOP, GetlatLon(lat.doubleValue(), lng.doubleValue(), r.doubleValue(), 0d));

		result.put(GpsConstants.Rectangle.RIGHT, GetlatLon(lat.doubleValue(), lng.doubleValue(), r.doubleValue(), 90d));

		result.put(GpsConstants.Rectangle.BOTTOM,
				GetlatLon(lat.doubleValue(), lng.doubleValue(), r.doubleValue(), 180d));

		result.put(GpsConstants.Rectangle.LEFT, GetlatLon(lat.doubleValue(), lng.doubleValue(), r.doubleValue(), 270d));
		return result;
	}

	public static final double Ea = 6378137; // 赤道半径,单位km

	public static final double Eb = 6356725; // 极半径,单位km

	/**
	 * @author auth
	 * @param lat
	 * @param lng
	 * @param distance
	 * @param angle
	 * @return
	 */
	private static GpsMapPoint GetlatLon(double lat, double lng, double distance, double angle) {
		GpsMapPoint gmp = new GpsMapPoint();
		double dx = distance * 1000 * Math.sin(angle * Math.PI / 180.0);

		double dy = distance * 1000 * Math.cos(angle * Math.PI / 180.0);

		double ec = Eb + (Ea - Eb) * (90.0 - lat) / 90.0;

		double ed = ec * Math.cos(lat * Math.PI / 180);
		BigDecimal maplat = new BigDecimal((dy / ec + lat * Math.PI / 180.0) * 180.0 / Math.PI);
		gmp.setMapLat(maplat.setScale(6, BigDecimal.ROUND_HALF_UP));
		BigDecimal maplng = new BigDecimal((dx / ed + lng * Math.PI / 180.0) * 180.0 / Math.PI);
		gmp.setMapLng(maplng.setScale(6, BigDecimal.ROUND_HALF_UP));
		return gmp;

	}

	public static void main(String[] args) {
		GpsMapPoint gmp = new GpsMapPoint();
		BigDecimal mapLat = new BigDecimal("32.146048");
		BigDecimal mapLng = new BigDecimal("119.006611");
		System.out.println(mapLat.doubleValue());
		System.out.println(mapLng.doubleValue());
		gmp.setMapLat(mapLat);
		gmp.setMapLng(mapLng);
		BigDecimal r = new BigDecimal("0.5");
		Map<String, GpsMapPoint> maps = get4PointByCac(gmp, r);
		System.out.println(JSON.toJSONString(maps));
	}

}

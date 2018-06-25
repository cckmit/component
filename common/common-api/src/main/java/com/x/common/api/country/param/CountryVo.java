package com.x.common.api.country.param;

import java.io.Serializable;

public class CountryVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7393030180246845071L;
	/**
	 * ID
	 */
	private Integer id;
	/**
	 * 中文名称
	 */
	private String countryNameCn;
	/**
	 * 英文名称
	 */
	private String countryNameEn;
	/**
	 * 简称
	 */
	private String countryValue;
	/**
	 * 代码
	 */
	private String countryCode;
	/**
	 * 正则校验手机
	 */
	private String regularExpression;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryNameCn() {
		return countryNameCn;
	}

	public void setCountryNameCn(String countryNameCn) {
		this.countryNameCn = countryNameCn == null ? null : countryNameCn
				.trim();
	}

	public String getCountryNameEn() {
		return countryNameEn;
	}

	public void setCountryNameEn(String countryNameEn) {
		this.countryNameEn = countryNameEn == null ? null : countryNameEn
				.trim();
	}

	public String getCountryValue() {
		return countryValue;
	}

	public void setCountryValue(String countryValue) {
		this.countryValue = countryValue == null ? null : countryValue.trim();
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode == null ? null : countryCode.trim();
	}

	public String getRegularExpression() {
		return regularExpression;
	}

	public void setRegularExpression(String regularExpression) {
		this.regularExpression = regularExpression == null ? null
				: regularExpression.trim();
	}
}
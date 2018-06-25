package com.x.common.api.parkfeerule.param;

public class ParkFeeRuleVo {

	/**
	 * 费率版本
	 */
	private String feeStandardId;

	/**
	 * 费率版本描述
	 */
	private String feeStandardDesc;

	/**
	 * 车型描述
	 */
	private String carTypeDesc;

	/**
	 * 收费标准类型描述
	 */
	private String feeStandardLevelDesc;

	/**
	 * 收费标准类型
	 */
	private String feeStandardLevelType;

	/**
	 * 规则状态
	 */
	private String standardStatues;

	public String getFeeStandardId() {
		return feeStandardId;
	}

	public void setFeeStandardId(String feeStandardId) {
		this.feeStandardId = feeStandardId;
	}

	public String getFeeStandardDesc() {
		return feeStandardDesc;
	}

	public void setFeeStandardDesc(String feeStandardDesc) {
		this.feeStandardDesc = feeStandardDesc == null ? null : feeStandardDesc.trim();
	}

	public String getCarTypeDesc() {
		return carTypeDesc;
	}

	public void setCarTypeDesc(String carTypeDesc) {
		this.carTypeDesc = carTypeDesc == null ? null : carTypeDesc.trim();
	}

	public String getFeeStandardLevelDesc() {
		return feeStandardLevelDesc;
	}

	public void setFeeStandardLevelDesc(String feeStandardLevelDesc) {
		this.feeStandardLevelDesc = feeStandardLevelDesc == null ? null : feeStandardLevelDesc.trim();
	}

	public String getFeeStandardLevelType() {
		return feeStandardLevelType;
	}

	public void setFeeStandardLevelType(String feeStandardLevelType) {
		this.feeStandardLevelType = feeStandardLevelType == null ? null : feeStandardLevelType.trim();
	}

	public String getStandardStatues() {
		return standardStatues;
	}

	public void setStandardStatues(String standardStatues) {
		this.standardStatues = standardStatues == null ? null : standardStatues.trim();
	}
}
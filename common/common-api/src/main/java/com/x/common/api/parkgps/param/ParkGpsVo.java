package com.x.common.api.parkgps.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.x.common.api.parkfeerule.param.ParkFeeRuleVo;

public class ParkGpsVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4364926329443960957L;

	/**
	 * 工作组ID
	 */
	private String wgId;

	/**
	 * 工作组名称
	 */
	private String wgName;

	/**
	 * 停车场Id（系统内部）
	 */
	private String parkIdInner;

	/**
	 * 停车场id（系统外部）
	 */
	private String parkIdOuter;

	/**
	 * 停车场名称
	 */
	private String parkName;

	/**
	 * 工作时间（已废弃），请查看“停车工作时长信息”
	 */
	private String workTimes;

	/**
	 * 经度
	 */
	private BigDecimal mapLng;

	/**
	 * 纬度
	 */
	private BigDecimal mapLat;

	/**
	 * 费率版本id
	 */
	private String feeStandardId;

	/**
	 * 费率简述
	 */
	private String publicDepict;

	/**
	 * 地域编码
	 */
	private String areaCode;

	/**
	 * 停车场类型：10路边；20停车场
	 */
	private String parkType;

	/**
	 * 城市编码
	 */
	private String cityCode;

	/**
	 * 城市名称
	 */
	private String cityName;

	/**
	 * 地域名称
	 */
	private String areaName;

	/**
	 * 停车场描述
	 */
	private String parkDesc;

	/**
	 * 用户名称
	 */
	private String userName;

	/**
	 * 用户电话
	 */
	private String userMobile;

	/**
	 * 临时停车位数量
	 */
	private Integer placeTem;

	/**
	 * 停车位总数
	 */
	private Integer placeCount;

	/**
	 * 创建时间
	 */
	private Timestamp createTime;

	/**
	 * 更新时间
	 */
	private Timestamp updateTime;

	/**
	 * 停车工作时长信息
	 */
	private ParkWorkTimeVo parkWorkTimeVo;

	/**
	 * 停车费用描述
	 */
	private ParkFeeRuleVo parkFeeRuleVo;

	public String getWgId() {
		return wgId;
	}

	public void setWgId(String wgId) {
		this.wgId = wgId;
	}

	public String getWgName() {
		return wgName;
	}

	public void setWgName(String wgName) {
		this.wgName = wgName;
	}

	public String getParkIdInner() {
		return parkIdInner;
	}

	public void setParkIdInner(String parkIdInner) {
		this.parkIdInner = parkIdInner;
	}

	public String getParkIdOuter() {
		return parkIdOuter;
	}

	public void setParkIdOuter(String parkIdOuter) {
		this.parkIdOuter = parkIdOuter;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getWorkTimes() {
		return workTimes;
	}

	public void setWorkTimes(String workTimes) {
		this.workTimes = workTimes;
	}

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

	public String getFeeStandardId() {
		return feeStandardId;
	}

	public void setFeeStandardId(String feeStandardId) {
		this.feeStandardId = feeStandardId;
	}

	public String getPublicDepict() {
		return publicDepict;
	}

	public void setPublicDepict(String publicDepict) {
		this.publicDepict = publicDepict;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getParkType() {
		return parkType;
	}

	public void setParkType(String parkType) {
		this.parkType = parkType;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getParkDesc() {
		return parkDesc;
	}

	public void setParkDesc(String parkDesc) {
		this.parkDesc = parkDesc;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public Integer getPlaceTem() {
		return placeTem;
	}

	public void setPlaceTem(Integer placeTem) {
		this.placeTem = placeTem;
	}

	public Integer getPlaceCount() {
		return placeCount;
	}

	public void setPlaceCount(Integer placeCount) {
		this.placeCount = placeCount;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public ParkWorkTimeVo getParkWorkTimeVo() {
		return parkWorkTimeVo;
	}

	public void setParkWorkTimeVo(ParkWorkTimeVo parkWorkTimeVo) {
		this.parkWorkTimeVo = parkWorkTimeVo;
	}

	public ParkFeeRuleVo getParkFeeRuleVo() {
		return parkFeeRuleVo;
	}

	public void setParkFeeRuleVo(ParkFeeRuleVo parkFeeRuleVo) {
		this.parkFeeRuleVo = parkFeeRuleVo;
	}

}
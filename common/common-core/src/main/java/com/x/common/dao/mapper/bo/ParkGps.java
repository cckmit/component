package com.x.common.dao.mapper.bo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ParkGps {
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
     * 工作时间
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
     * 对应gn_area中的AREA_CODE
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

    public String getWgId() {
        return wgId;
    }

    public void setWgId(String wgId) {
        this.wgId = wgId == null ? null : wgId.trim();
    }

    public String getWgName() {
        return wgName;
    }

    public void setWgName(String wgName) {
        this.wgName = wgName == null ? null : wgName.trim();
    }

    public String getParkIdInner() {
        return parkIdInner;
    }

    public void setParkIdInner(String parkIdInner) {
        this.parkIdInner = parkIdInner == null ? null : parkIdInner.trim();
    }

    public String getParkIdOuter() {
        return parkIdOuter;
    }

    public void setParkIdOuter(String parkIdOuter) {
        this.parkIdOuter = parkIdOuter == null ? null : parkIdOuter.trim();
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    public String getWorkTimes() {
        return workTimes;
    }

    public void setWorkTimes(String workTimes) {
        this.workTimes = workTimes == null ? null : workTimes.trim();
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
        this.feeStandardId = feeStandardId == null ? null : feeStandardId.trim();
    }

    public String getPublicDepict() {
        return publicDepict;
    }

    public void setPublicDepict(String publicDepict) {
        this.publicDepict = publicDepict == null ? null : publicDepict.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getParkType() {
        return parkType;
    }

    public void setParkType(String parkType) {
        this.parkType = parkType == null ? null : parkType.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getParkDesc() {
        return parkDesc;
    }

    public void setParkDesc(String parkDesc) {
        this.parkDesc = parkDesc == null ? null : parkDesc.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
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
}
package com.x.common.api.region.model;

/**
 * 区域信息
 *
 * Date: 2015年12月08日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * @author auth
 */
public class RegionInfo {
    /**
     * 区域编码
     */
    private String regionCode;
    /**
     * 区域英文名
     */
    private String regionNameEn;
    /**
     * 区域中文名
     */
    private String regionNameCn;
    /**
     * 区域级别，参考RegionCacheKey.regionLevel
     */
    private Integer regionLevel;
    /**
     * 上级区域编码
     */
    private String parentRegionCode;

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionNameEn() {
        return regionNameEn;
    }

    public void setRegionNameEn(String regionNameEn) {
        this.regionNameEn = regionNameEn;
    }

    public String getRegionNameCn() {
        return regionNameCn;
    }

    public void setRegionNameCn(String regionNameCn) {
        this.regionNameCn = regionNameCn;
    }

    public Integer getRegionLevel() {
        return regionLevel;
    }

    public void setRegionLevel(Integer regionLevel) {
        this.regionLevel = regionLevel;
    }

    public String getParentRegionCode() {
        return parentRegionCode;
    }

    public void setParentRegionCode(String parentRegionCode) {
        this.parentRegionCode = parentRegionCode;
    }
}

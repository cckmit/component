package com.x.common.dao.mapper.bo;

public class GnRegion {
    private String regionCode;

    private String regionNameEn;

    private String regionNameCn;

    private Integer regionLevel;

    private String parentRegionCode;

    private String parentRegionEn;

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getRegionNameEn() {
        return regionNameEn;
    }

    public void setRegionNameEn(String regionNameEn) {
        this.regionNameEn = regionNameEn == null ? null : regionNameEn.trim();
    }

    public String getRegionNameCn() {
        return regionNameCn;
    }

    public void setRegionNameCn(String regionNameCn) {
        this.regionNameCn = regionNameCn == null ? null : regionNameCn.trim();
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
        this.parentRegionCode = parentRegionCode == null ? null : parentRegionCode.trim();
    }

    public String getParentRegionEn() {
        return parentRegionEn;
    }

    public void setParentRegionEn(String parentRegionEn) {
        this.parentRegionEn = parentRegionEn == null ? null : parentRegionEn.trim();
    }
}
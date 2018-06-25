package com.x.common.dao.mapper.bo;

public class GnTDicAreaRegion {
    private String areaCode;

    private Integer lev;

    private String areaCode1;

    private String areaCode2;

    private String areaCode3;

    private String supAreaCode;

    private String areaName;

    private String pinyin;

    private String lang;

    private String regionCode;

    private String areaNameShort;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public String getAreaCode1() {
        return areaCode1;
    }

    public void setAreaCode1(String areaCode1) {
        this.areaCode1 = areaCode1 == null ? null : areaCode1.trim();
    }

    public String getAreaCode2() {
        return areaCode2;
    }

    public void setAreaCode2(String areaCode2) {
        this.areaCode2 = areaCode2 == null ? null : areaCode2.trim();
    }

    public String getAreaCode3() {
        return areaCode3;
    }

    public void setAreaCode3(String areaCode3) {
        this.areaCode3 = areaCode3 == null ? null : areaCode3.trim();
    }

    public String getSupAreaCode() {
        return supAreaCode;
    }

    public void setSupAreaCode(String supAreaCode) {
        this.supAreaCode = supAreaCode == null ? null : supAreaCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getAreaNameShort() {
        return areaNameShort;
    }

    public void setAreaNameShort(String areaNameShort) {
        this.areaNameShort = areaNameShort == null ? null : areaNameShort.trim();
    }
}
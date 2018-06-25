package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;

public class SysSeoManager {
    private String id;

    private String regionalLanguage;

    private String site;

    private String pageLocation;

    private String titile;

    private String keyword;

    private String description;

    private Timestamp createTime;

    private Timestamp updateTime;

    private String aditor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRegionalLanguage() {
        return regionalLanguage;
    }

    public void setRegionalLanguage(String regionalLanguage) {
        this.regionalLanguage = regionalLanguage == null ? null : regionalLanguage.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getPageLocation() {
        return pageLocation;
    }

    public void setPageLocation(String pageLocation) {
        this.pageLocation = pageLocation == null ? null : pageLocation.trim();
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile == null ? null : titile.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public String getAditor() {
        return aditor;
    }

    public void setAditor(String aditor) {
        this.aditor = aditor == null ? null : aditor.trim();
    }
}
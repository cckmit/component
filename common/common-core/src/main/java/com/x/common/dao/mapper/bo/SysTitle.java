package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;

public class SysTitle {
    private String id;

    private String regionalLanguage;

    private String site;

    private String title;

    private String description;

    private int sort;

    private String state;

    private String aditor;

    private Timestamp createTime;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getAditor() {
        return aditor;
    }

    public void setAditor(String aditor) {
        this.aditor = aditor == null ? null : aditor.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
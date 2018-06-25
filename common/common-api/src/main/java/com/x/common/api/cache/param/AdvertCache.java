package com.x.common.api.cache.param;

import java.io.Serializable;

/**
 * 广告缓存信息
 *
 * Date: 2017年6月19日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * @author auth
 */
public class AdvertCache implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    private String id;
    /**
     * 广告名称
     */
    private String advertisingName;
    /**
     * 描述
     */
    private String description;
    /**
     * 缩略图ID
     */
    private String thumbnailId;
    /**
     * 图片类型，如：.jpg,.png
     */
    private String imgType;
    /**
     * HTTP链接
     */
    private String url;
    /**
     * 广告类型
     */
    private String advertisingType;
    /**
     * 排序
     */
    private Integer sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdvertisingName() {
        return advertisingName;
    }

    public void setAdvertisingName(String advertisingName) {
        this.advertisingName = advertisingName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAdvertisingType() {
        return advertisingType;
    }

    public void setAdvertisingType(String advertisingType) {
        this.advertisingType = advertisingType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }
}

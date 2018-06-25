package com.x.common.api.sysadvertmanager.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class AdvertManagerPageVo implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	private String id;
	/**
	 * 站点
	 */
    private String site;
    /**
	 * 广告位置
	 */
    private String advertisingPosition;
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
	 * 状态
	 */
    private String state;
    /**
	 * 创建人
	 */
    private String aditor;
    /**
	 * 创建时间
	 */
    private Timestamp createTime;
    /**
	 * 修改时间
	 */
    private Timestamp updateTime;
    /**
	 * 修改人
	 */
    private String updateaditor;
    /**
	 * 点击量
	 */
    private Long clickRate;
    /**
	 * HTTP链接
	 */
    private String url;
    /**
	 * 地区语言
	 */
    private String regionalLanguage;
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
        this.id = id == null ? null : id.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getAdvertisingPosition() {
        return advertisingPosition;
    }

    public void setAdvertisingPosition(String advertisingPosition) {
        this.advertisingPosition = advertisingPosition == null ? null : advertisingPosition.trim();
    }

    public String getAdvertisingName() {
        return advertisingName;
    }

    public void setAdvertisingName(String advertisingName) {
        this.advertisingName = advertisingName == null ? null : advertisingName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId == null ? null : thumbnailId.trim();
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

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateaditor() {
        return updateaditor;
    }

    public void setUpdateaditor(String updateaditor) {
        this.updateaditor = updateaditor == null ? null : updateaditor.trim();
    }

    public Long getClickRate() {
        return clickRate;
    }

    public void setClickRate(Long clickRate) {
        this.clickRate = clickRate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRegionalLanguage() {
        return regionalLanguage;
    }

    public void setRegionalLanguage(String regionalLanguage) {
        this.regionalLanguage = regionalLanguage == null ? null : regionalLanguage.trim();
    }

    public String getAdvertisingType() {
        return advertisingType;
    }

    public void setAdvertisingType(String advertisingType) {
        this.advertisingType = advertisingType == null ? null : advertisingType.trim();
    }

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
}

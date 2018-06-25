package com.x.common.api.sysadvertmanager.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class AdvertManagerPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 广告位置
	 */
	private String advertisingPosition;
	/**
	 * 广告名称
	 */
	private String advertisingName;
	/**
	 * 状态0，隐藏   1，显示
	 */
	private String state;
	/**
	 * 广告类型
	 */
	private String advertisingType;
	/**
	 * 站点
	 */
	private String site;
	/**
	 * 
	 * 创建人
	 */
	private String aditor;
	/**
	 * 分页时必填
	 */
	PageInfo<AdvertManagerPageVo> pageInfo;

	public String getAdvertisingPosition() {
		return advertisingPosition;
	}

	public void setAdvertisingPosition(String advertisingPosition) {
		this.advertisingPosition = advertisingPosition;
	}

	public String getAdvertisingName() {
		return advertisingName;
	}

	public void setAdvertisingName(String advertisingName) {
		this.advertisingName = advertisingName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAdvertisingType() {
		return advertisingType;
	}

	public void setAdvertisingType(String advertisingType) {
		this.advertisingType = advertisingType;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getAditor() {
		return aditor;
	}

	public void setAditor(String aditor) {
		this.aditor = aditor;
	}

	public PageInfo<AdvertManagerPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<AdvertManagerPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}

package com.x.common.api.sysseomanager.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class SeoManagerPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     * 标题
     */
    private String titile;

	/**
	 * 站点
	 */
	private String site;
	/**
	 * 页面位置
	 */
	private String pageLocation;
	/**
	 * 
	 * 创建人
	 */
	private String aditor;
	/**
     * 分页时必填
     */
    PageInfo<SeoManagerPageVo> pageInfo;
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getPageLocation() {
		return pageLocation;
	}
	public void setPageLocation(String pageLocation) {
		this.pageLocation = pageLocation;
	}
	public String getAditor() {
		return aditor;
	}
	public void setAditor(String aditor) {
		this.aditor = aditor;
	}
	public PageInfo<SeoManagerPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<SeoManagerPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

package com.x.common.api.sysseomanager.param;


import java.sql.Timestamp;

import com.x.base.vo.BaseResponse;

/** 
 * @author auth
 * @date 创建时间：2016年12月2日 下午3:55:15 
 * @version 
 * @since  
 */
public class QuerySysSeoByIdRes extends BaseResponse {
	private static final long serialVersionUID = -92201909614710869L;
	
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 地区语言
	 */
    private String regionalLanguage;
    /**
	 * 站点
	 */
    private String site;
    /**
	 * 页面位置
	 */
    private String pageLocation;
    /**
	 * 标题
	 */
    private String titile;
    /**
	 * 关键字
	 */
    private String keyword;
    /**
	 * 描述
	 */
    private String description;
    /**
	 * 创建时间
	 */
    private Timestamp createTime;
    /**
	 * 修改时间
	 */
    private Timestamp updateTime;
    /**
	 * 创建人
	 */
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

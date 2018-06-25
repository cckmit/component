package com.x.common.api.cachekey.model;

import java.io.Serializable;

/**
 * @Description: 领域
 * @author auth
 * @date 2016年11月3日 上午10:35:08 
 * @version V1.0
 */
public class SysDomain implements Serializable{

	private static final long serialVersionUID = -7191568125734573208L;
	
	/**
	 * 编号
	 */
	private String domainId;

    /**
     * 语言
     */
    private String language;

    /**
     * 站点
     */
    private String site;

    /**
     * 中文名称
     */
    private String domainCn;

    /**
     * 英文名称
     */
    private String domainEn;

    /**
     * 描述
     */
    private String remarks;
    
    private String sort;

    private String state;

    private Long updatetime;

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDomainCn() {
		return domainCn;
	}

	public void setDomainCn(String domainCn) {
		this.domainCn = domainCn;
	}

	public String getDomainEn() {
		return domainEn;
	}

	public void setDomainEn(String domainEn) {
		this.domainEn = domainEn;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Long updatetime) {
		this.updatetime = updatetime;
	}
    
    


}

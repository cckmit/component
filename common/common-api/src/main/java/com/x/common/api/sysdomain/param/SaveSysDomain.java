package com.x.common.api.sysdomain.param;

import java.io.Serializable;

public class SaveSysDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	private String domainId;
	/**
	 * 语言
	 */
	private String language;
	/**
	 * 站点：译云、译见
	 */
	private String site;
	/**
	 * 领域名称(中)
	 */
	private String domainCn;
	/**
	 * 领域名称(英)
	 */
	private String domainEn;
	/**
	 * 描述
	 */
	private String remarks;
	/**
	 * 排序：越大越靠前
	 */
	private String sort;
	/**
	 * 状态：显示：0，隐藏：1
	 */
	private String state;
	/**
	 * 修改时间
	 */
	private Long updatetime;
	/**
	 * 创建人
	 */
	private String createOperator;
	/**
	 * 创建人ID
	 */
	private String createOperatorId;
	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId == null ? null : domainId.trim();
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language == null ? null : language.trim();
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site == null ? null : site.trim();
	}

	public String getDomainCn() {
		return domainCn;
	}

	public void setDomainCn(String domainCn) {
		this.domainCn = domainCn == null ? null : domainCn.trim();
	}

	public String getDomainEn() {
		return domainEn;
	}

	public void setDomainEn(String domainEn) {
		this.domainEn = domainEn == null ? null : domainEn.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort == null ? null : sort.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public Long getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Long updatetime) {
		this.updatetime = updatetime;
	}

	public String getCreateOperator() {
		return createOperator;
	}

	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator;
	}

	public String getCreateOperatorId() {
		return createOperatorId;
	}

	public void setCreateOperatorId(String createOperatorId) {
		this.createOperatorId = createOperatorId;
	}
}

package com.x.common.api.syspurpose.param;

import java.io.Serializable;

public class SaveSysPurpose implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	private String purposeId;
	/**
	 * 语言
	 */
	private String language;
	/**
	 * 站点：译云、译见
	 */
	private String site;
	/**
	 * 用途名称(中)
	 */
	private String purposeCn;
	/**
	 * 用途名称(英)
	 */
	private String purposeEn;
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
	 * 是否起名标语：0：是；1：否
	 */
	private String namedFlag;
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
	public String getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId == null ? null : purposeId.trim();
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

	public String getPurposeCn() {
		return purposeCn;
	}

	public void setPurposeCn(String purposeCn) {
		this.purposeCn = purposeCn == null ? null : purposeCn.trim();
	}

	public String getPurposeEn() {
		return purposeEn;
	}

	public void setPurposeEn(String purposeEn) {
		this.purposeEn = purposeEn == null ? null : purposeEn.trim();
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

	public String getNamedFlag() {
		return namedFlag;
	}

	public void setNamedFlag(String namedFlag) {
		this.namedFlag = namedFlag == null ? null : namedFlag.trim();
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

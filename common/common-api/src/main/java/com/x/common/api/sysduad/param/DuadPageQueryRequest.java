package com.x.common.api.sysduad.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class DuadPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	private String duadId;

	/**
     * 中文名称
     */
    private String language;

	/**
	 * 站点
	 */
	private String site;
	/**
	 * 状态：显示：0，隐藏：1
	 */
	private String state;
	/**
	 * 创建人
	 */
	private String createOperator;
	/**
     * 分页时必填
     */
    PageInfo<DuadPageVo> pageInfo;
	public String getDuadId() {
		return duadId;
	}
	public void setDuadId(String duadId) {
		this.duadId = duadId;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public PageInfo<DuadPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<DuadPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
	public String getCreateOperator() {
		return createOperator;
	}
	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator;
	}
}

package com.x.common.api.syspurpose.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class PurposePageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     * 中文名称
     */
    private String purposeCn;

	/**
	 * 站点
	 */
	private String site;
	/**
	 * 状态：显示：0，隐藏：1
	 */
	private String state;
	/**
	 * 
	 * 创建人
	 */
	private String createOperator;
	/**
     * 分页时必填
     */
    PageInfo<PurposePageVo> pageInfo;
	public String getPurposeCn() {
		return purposeCn;
	}
	public void setPurposeCn(String purposeCn) {
		this.purposeCn = purposeCn;
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
	public PageInfo<PurposePageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<PurposePageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
	public String getCreateOperator() {
		return createOperator;
	}
	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator;
	}
}

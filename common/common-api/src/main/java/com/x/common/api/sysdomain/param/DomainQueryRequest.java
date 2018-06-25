package com.x.common.api.sysdomain.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class DomainQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     * 领域名称(中)
     */
    private String domainCn;

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
    PageInfo<DomainPageVo> pageInfo;
	public String getDomainCn() {
		return domainCn;
	}
	public void setDomainCn(String domainCn) {
		this.domainCn = domainCn;
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
	public PageInfo<DomainPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<DomainPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
	public String getCreateOperator() {
		return createOperator;
	}
	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator;
	}
}

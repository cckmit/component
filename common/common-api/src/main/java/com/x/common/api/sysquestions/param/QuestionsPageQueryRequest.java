package com.x.common.api.sysquestions.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class QuestionsPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
     *  题库ID
     */
    private String bid;

	/**
	 * 题型
	 */
	private String qtype;
	/**
     * 分页时必填
     */
    PageInfo<QuestionsPageVo> pageInfo;
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getQtype() {
		return qtype;
	}
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
	public PageInfo<QuestionsPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<QuestionsPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

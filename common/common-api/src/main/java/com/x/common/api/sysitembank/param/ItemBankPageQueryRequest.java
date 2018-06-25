package com.x.common.api.sysitembank.param;

import java.io.Serializable;

import com.x.base.vo.PageInfo;

public class ItemBankPageQueryRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 *题库名称
	 */
	private String qname;
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
	private String aditor;
	/**
	 * 语言方向
	 */
	private String langDir;
	/**
	 *题型
	 */
	private String questionType;
	/**
     * 分页时必填
     */
    PageInfo<ItemBankPageVo> pageInfo;
	public String getLangDir() {
		return langDir;
	}
	public void setLangDir(String langDir) {
		this.langDir = langDir;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
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
	public String getAditor() {
		return aditor;
	}
	public void setAditor(String aditor) {
		this.aditor = aditor;
	}
	public String getQuestionType() {
		return questionType;
	}
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	public PageInfo<ItemBankPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<ItemBankPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

package com.x.common.api.syspurpose.param;

import com.x.base.vo.BaseResponse;

/**
 * @author auth
 * @date 2016年11月2日 下午2:46:58 
 * @version V1.0
 */
public class QuerySysPurposeDetailsRes extends BaseResponse {
	
	private static final long serialVersionUID = 7039545203523157889L;
	
	/**
	 * 起名标语 是
	 */
	public final static String NAME_FLAG_YES = "0";

	/**
	 * 起名标语 否
	 */
	public final static String NAME_FLAG_NO = "1";

	/**
	 * 用途ID
	 */
	private String purposeId;

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
    private String purposeCn;

    /**
     * 英文名称
     */
    private String purposeEn;

    /**
     * 描述
     */
    private String remarks;

    /**
     * 排序
     */
    private String sort;

    /**
     * 状态  0显示  1隐藏
     */
    private String state;

    /**
     * 是否起名标语：0：是；1：否
     */
    private String namedFlag;

	public String getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
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

	

	public String getPurposeCn() {
		return purposeCn;
	}

	public void setPurposeCn(String purposeCn) {
		this.purposeCn = purposeCn;
	}

	public String getPurposeEn() {
		return purposeEn;
	}

	public void setPurposeEn(String purposeEn) {
		this.purposeEn = purposeEn;
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

	public String getNamedFlag() {
		return namedFlag;
	}

	public void setNamedFlag(String namedFlag) {
		this.namedFlag = namedFlag;
	}
    
    

}

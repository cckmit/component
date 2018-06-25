package com.x.common.api.subjectmaintain.param;

import com.x.base.vo.BaseInfo;

public class GnSubjectKeyParam extends BaseInfo {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 行业编码
     */
    private String industryCode;

    /**
     * 科目ID
     */
    private Long subjectId;

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }
}

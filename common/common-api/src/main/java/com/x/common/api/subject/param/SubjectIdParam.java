package com.x.common.api.subject.param;

import com.x.base.vo.BaseInfo;

/**
 * 科目查询请求参数<br>
 *
 * Date: 2015年9月9日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public class SubjectIdParam extends BaseInfo {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 科目ID
     */
    private long subjectId;

    public SubjectIdParam() {

    }

    public SubjectIdParam(String tenantId, long subjectId) {
        this.setTenantId(tenantId);
        this.subjectId = subjectId;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

}

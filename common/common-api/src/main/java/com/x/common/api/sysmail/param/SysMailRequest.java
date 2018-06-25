package com.x.common.api.sysmail.param;


import java.util.List;

import com.x.base.vo.PageInfo;

public class SysMailRequest {

	private String id;
    private String userId;
    
    private List<String> mailIds;
    
    private String status;

    /**
     * 分页时必填
     */
    PageInfo<SysMailInfo> pageInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PageInfo<SysMailInfo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<SysMailInfo> pageInfo) {
		this.pageInfo = pageInfo;
	}

	public List<String> getMailIds() {
		return mailIds;
	}

	public void setMailIds(List<String> mailIds) {
		this.mailIds = mailIds;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

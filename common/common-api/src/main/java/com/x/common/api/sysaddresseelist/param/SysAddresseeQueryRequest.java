package com.x.common.api.sysaddresseelist.param;


import java.io.Serializable;

/**
 * 
 */
public class SysAddresseeQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
    String listId;
    
    /**
     * 模糊查询
     */
    String phoneAndCode;

    /**
     * 当前第几页,必填
     */
    private Integer pageNo;

    /**
     * 每页数据条数,必填
     */
    private Integer pageSize;

	public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public String getPhoneAndCode() {
		return phoneAndCode;
	}

	public void setPhoneAndCode(String phoneAndCode) {
		this.phoneAndCode = phoneAndCode;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}

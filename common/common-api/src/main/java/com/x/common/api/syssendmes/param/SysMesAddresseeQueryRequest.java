package com.x.common.api.syssendmes.param;


import java.io.Serializable;

/**
 * 明细入参
 */
public class SysMesAddresseeQueryRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    String mesId;
    
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

	public String getMesId() {
		return mesId;
	}

	public void setMesId(String mesId) {
		this.mesId = mesId;
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

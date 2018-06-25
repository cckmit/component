package com.x.common.api.sysaddresseelist.param;


import java.io.Serializable;

/**
 *
 */
public class QueryAllSysAddresseeReq implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    String listId;

	public String getListId() {
		return listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}
    
}

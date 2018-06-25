package com.x.common.api.sysaddresseelist.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SaveSysAddresseeList implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private String listId;
	/**
	 *名称
	 */
    private String listName;
    /**
	 * 创建人
	 */
    private String creatPeople;
    /**
	 * 创建时间
	 */
    private Timestamp creatTime;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId == null ? null : listId.trim();
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName == null ? null : listName.trim();
    }

    public String getCreatPeople() {
        return creatPeople;
    }

    public void setCreatPeople(String creatPeople) {
        this.creatPeople = creatPeople == null ? null : creatPeople.trim();
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }
}

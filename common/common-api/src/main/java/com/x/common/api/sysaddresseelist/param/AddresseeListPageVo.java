package com.x.common.api.sysaddresseelist.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class AddresseeListPageVo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String listId;

	private String listName;

	private String creatPeople;

	private Timestamp creatTime;
	
	private Integer sum;

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

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}

package com.x.common.api.sysmsg.param;

import java.io.Serializable;
import java.util.List;

public class DeleteSysMsgRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String sysMsgReceiverId;
	
	/**
	 * id集合
	 */
	private List<String> msgIds;

	public List<String> getMsgIds() {
		return msgIds;
	}

	public void setMsgIds(List<String> msgIds) {
		this.msgIds = msgIds;
	}

	public String getSysMsgReceiverId() {
		return sysMsgReceiverId;
	}

	public void setSysMsgReceiverId(String sysMsgReceiverId) {
		this.sysMsgReceiverId = sysMsgReceiverId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

	
	
}

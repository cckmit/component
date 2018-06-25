package com.x.common.api.sysmsg.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SaveSysMsg implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

    private String type;

    private String title;

    private String state;

    private String creatPeople;

    private Timestamp creatTime;

    private String sendType;

    private Timestamp sendTime;

    private Boolean allUser;

    private String sendConten;
    
   /**
    * SysMsgReceiver
    */
    
    private String userId;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Boolean getAllUser() {
		return allUser;
	}

	public void setAllUser(Boolean allUser) {
		this.allUser = allUser;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType == null ? null : sendType.trim();
    }

    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    public String getSendConten() {
        return sendConten;
    }

    public void setSendConten(String sendConten) {
        this.sendConten = sendConten == null ? null : sendConten.trim();
    }

	
	



}

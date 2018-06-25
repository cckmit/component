package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;

public class SysMail {
    private String id;

    private String userId;

    private String sendUserId;

    private String title;

    private String sysMsgId;

    private Timestamp receiveDate;

    private String status;

    private String sendConten;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId == null ? null : sendUserId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSysMsgId() {
        return sysMsgId;
    }

    public void setSysMsgId(String sysMsgId) {
        this.sysMsgId = sysMsgId == null ? null : sysMsgId.trim();
    }

    public Timestamp getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Timestamp receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSendConten() {
        return sendConten;
    }

    public void setSendConten(String sendConten) {
        this.sendConten = sendConten == null ? null : sendConten.trim();
    }
}
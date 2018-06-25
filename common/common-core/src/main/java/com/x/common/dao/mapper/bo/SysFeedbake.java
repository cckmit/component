package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;

public class SysFeedbake {
    private String id;

    private String feedbakeSoure;

    private String productName;

    private String problemType;

    private String userName;

    private String phoneNum;

    private String mail;

    private String feedbakeConten;

    private Timestamp feedbakeTime;

    private String reple;

    private String handlePeople;

    private Timestamp handleTime;

    private String handleType;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFeedbakeSoure() {
        return feedbakeSoure;
    }

    public void setFeedbakeSoure(String feedbakeSoure) {
        this.feedbakeSoure = feedbakeSoure == null ? null : feedbakeSoure.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType == null ? null : problemType.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getFeedbakeConten() {
        return feedbakeConten;
    }

    public void setFeedbakeConten(String feedbakeConten) {
        this.feedbakeConten = feedbakeConten == null ? null : feedbakeConten.trim();
    }

    public Timestamp getFeedbakeTime() {
        return feedbakeTime;
    }

    public void setFeedbakeTime(Timestamp feedbakeTime) {
        this.feedbakeTime = feedbakeTime;
    }

    public String getReple() {
        return reple;
    }

    public void setReple(String reple) {
        this.reple = reple == null ? null : reple.trim();
    }

    public String getHandlePeople() {
        return handlePeople;
    }

    public void setHandlePeople(String handlePeople) {
        this.handlePeople = handlePeople == null ? null : handlePeople.trim();
    }

    public Timestamp getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Timestamp handleTime) {
        this.handleTime = handleTime;
    }

    public String getHandleType() {
        return handleType;
    }

    public void setHandleType(String handleType) {
        this.handleType = handleType == null ? null : handleType.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}
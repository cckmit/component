package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;

public class SysItembank {
    private String bid;

    private String qname;

    private String langDir;

    private String questionType;

    private String aditor;

    private String state;

    private Timestamp createTime;

    private String createOperatorId;

    private String flag;

    private String qnumber;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname == null ? null : qname.trim();
    }

    public String getLangDir() {
        return langDir;
    }

    public void setLangDir(String langDir) {
        this.langDir = langDir == null ? null : langDir.trim();
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    public String getAditor() {
        return aditor;
    }

    public void setAditor(String aditor) {
        this.aditor = aditor == null ? null : aditor.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateOperatorId() {
        return createOperatorId;
    }

    public void setCreateOperatorId(String createOperatorId) {
        this.createOperatorId = createOperatorId == null ? null : createOperatorId.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getQnumber() {
        return qnumber;
    }

    public void setQnumber(String qnumber) {
        this.qnumber = qnumber == null ? null : qnumber.trim();
    }
}
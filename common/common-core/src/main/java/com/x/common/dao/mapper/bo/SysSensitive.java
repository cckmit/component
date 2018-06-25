package com.x.common.dao.mapper.bo;

import java.sql.Timestamp;

public class SysSensitive {
    private String id;

    private String sensitiveWords;

    private String replaceWords;

    private String state;

    private String creatPeople;

    private String creatPeopleId;

    private Timestamp creatTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSensitiveWords() {
        return sensitiveWords;
    }

    public void setSensitiveWords(String sensitiveWords) {
        this.sensitiveWords = sensitiveWords == null ? null : sensitiveWords.trim();
    }

    public String getReplaceWords() {
        return replaceWords;
    }

    public void setReplaceWords(String replaceWords) {
        this.replaceWords = replaceWords == null ? null : replaceWords.trim();
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

    public String getCreatPeopleId() {
        return creatPeopleId;
    }

    public void setCreatPeopleId(String creatPeopleId) {
        this.creatPeopleId = creatPeopleId == null ? null : creatPeopleId.trim();
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }
}
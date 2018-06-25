package com.x.common.dao.mapper.bo;

import java.sql.Date;

public class ParkWorkTime {
    private String workId;

    private String parkIdInner;

    private Date startTime;

    private Date endTime;

    private String workFlag;

    private String busyLevel;

    private String status;

    private Integer limitStopTime;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getParkIdInner() {
        return parkIdInner;
    }

    public void setParkIdInner(String parkIdInner) {
        this.parkIdInner = parkIdInner == null ? null : parkIdInner.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getWorkFlag() {
        return workFlag;
    }

    public void setWorkFlag(String workFlag) {
        this.workFlag = workFlag == null ? null : workFlag.trim();
    }

    public String getBusyLevel() {
        return busyLevel;
    }

    public void setBusyLevel(String busyLevel) {
        this.busyLevel = busyLevel == null ? null : busyLevel.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getLimitStopTime() {
        return limitStopTime;
    }

    public void setLimitStopTime(Integer limitStopTime) {
        this.limitStopTime = limitStopTime;
    }
}
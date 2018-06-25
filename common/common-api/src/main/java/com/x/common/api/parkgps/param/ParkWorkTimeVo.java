package com.x.common.api.parkgps.param;

import java.sql.Date;

public class ParkWorkTimeVo {
	/**
	 * 唯一标识
	 */
	private String workId;

	/**
	 * 停车场ID
	 */
	private String parkIdInner;

	/**
	 * 开始时间
	 */
	private Date startTime;

	/**
	 * 截止时间
	 */
	private Date endTime;

	/**
	 * 是否工作，1是0否
	 */
	private String workFlag;

	/**
	 * 繁忙度
	 */
	private String busyLevel;

	/**
	 * 自定义停车时长限制（单位：分钟）
	 */
	private Integer limitStopTime;

	/**
	 * 状态
	 */
	private String status;

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
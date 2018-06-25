package com.x.common.api.syssensitive.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SensitivePageVo implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 编号
	 */
	private String id;
	/**
     *  敏感词
     */
	private String sensitiveWords;
	/**
     *  替换词
     */
	private String replaceWords;
	/**
	 * 状态
	 */
	private String state;
	/**
	 *创建人
	 */
	private String creatPeople;
	/**
	 *创建人ID
	 */
	private String creatPeopleId;
	/**
	 *创建时间
	 */
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

package com.x.common.api.sysitembank.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class ItemBankPageVo implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private String bid;
	/**
	 * 题库名称
	 */
	private String qname;
	/**
	 * 语言方向
	 */
	private String langDir;
	/**
	 * 题型
	 */
	private String questionType;
	/**
	 * 创建人
	 */
	private String aditor;
	/**
	 * 状态
	 */
	private String state;
	/**
	 * 创建时间
	 */
	private Timestamp createTime;
	/**
	 * 创建人ID
	 */
	private String createOperatorId;
	
	/**
	 * 删除标识
	 */
	private String flag;
	/**
	 * 题目数量
	 */
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
		this.qnumber = qnumber;
	}
}

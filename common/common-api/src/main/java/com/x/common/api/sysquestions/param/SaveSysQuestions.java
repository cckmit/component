package com.x.common.api.sysquestions.param;

import java.io.Serializable;
import java.sql.Timestamp;

public class SaveSysQuestions implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	private String qid;
	/**
	 * 题库ID
	 */
	private String bid;
	/**
	 * 题型
	 */
	private String qtype;
	/**
	 * 选择题标题
	 */
	private String choiceQuestion;
	/**
	 * 选择题A
	 */
	private String optiona;
	/**
	 * 选择题B
	 */
	private String optionb;
	/**
	 * 选择题C
	 */
	private String optionc;
	/**
	 * 选择题D
	 */
	private String optiond;
	/**
	 * 正确答案
	 */
	private String answer;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 创建人
	 */
	private String createOperator;
	/**
	 * 创建人ID
	 */
	private String createOperatorId;
	/**
	 * 创建人时间
	 */
	private Timestamp createTime;
	/**
	 * 原文
	 */
	private String original;
	/**
	 * 译文
	 */
    private String translation;
    /**
	 * 删除标识
	 */
	private String flag;
	public String getQid() {
		return qid;
	}

	public void setQid(String qid) {
		this.qid = qid == null ? null : qid.trim();
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid == null ? null : bid.trim();
	}

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype == null ? null : qtype.trim();
	}

	public String getChoiceQuestion() {
		return choiceQuestion;
	}

	public void setChoiceQuestion(String choiceQuestion) {
		this.choiceQuestion = choiceQuestion == null ? null : choiceQuestion.trim();
	}

	public String getOptiona() {
		return optiona;
	}

	public void setOptiona(String optiona) {
		this.optiona = optiona == null ? null : optiona.trim();
	}

	public String getOptionb() {
		return optionb;
	}

	public void setOptionb(String optionb) {
		this.optionb = optionb == null ? null : optionb.trim();
	}

	public String getOptionc() {
		return optionc;
	}

	public void setOptionc(String optionc) {
		this.optionc = optionc == null ? null : optionc.trim();
	}

	public String getOptiond() {
		return optiond;
	}

	public void setOptiond(String optiond) {
		this.optiond = optiond == null ? null : optiond.trim();
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer == null ? null : answer.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public String getCreateOperator() {
		return createOperator;
	}

	public void setCreateOperator(String createOperator) {
		this.createOperator = createOperator == null ? null : createOperator.trim();
	}

	public String getCreateOperatorId() {
		return createOperatorId;
	}

	public void setCreateOperatorId(String createOperatorId) {
		this.createOperatorId = createOperatorId == null ? null : createOperatorId.trim();
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
}

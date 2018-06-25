package com.x.common.api.sysquestions.param;

import java.io.Serializable;

public class QuestionsPapersVo implements Serializable {
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
		this.answer = answer;
	}
}

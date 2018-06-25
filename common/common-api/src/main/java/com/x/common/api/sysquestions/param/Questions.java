package com.x.common.api.sysquestions.param;

import java.io.Serializable;

public class Questions implements Serializable {
	private static final long serialVersionUID = 1L;
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
	 * 题型
	 */
	private String qtype;
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

	public String getQtype() {
		return qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
}

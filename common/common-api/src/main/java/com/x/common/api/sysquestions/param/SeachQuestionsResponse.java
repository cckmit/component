package com.x.common.api.sysquestions.param;


import com.x.base.vo.BaseResponse;

/** 
 * @author auth
 * @date 创建时间：2016年12月2日 下午3:55:15 
 * @version 
 * @since  
 */
public class SeachQuestionsResponse extends BaseResponse {
	private static final long serialVersionUID = -92201909614710869L;
	
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
	/**
	 * 原文
	 */
	private String original;
	/**
	 * 译文
	 */
	private String translation;
	/**
	 * 译员答题结果单选
	 */
	private String answerResult;
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

	public String getAnswerResult() {
		return answerResult;
	}

	public void setAnswerResult(String answerResult) {
		this.answerResult = answerResult;
	}
}

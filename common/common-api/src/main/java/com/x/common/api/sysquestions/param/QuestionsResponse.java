package com.x.common.api.sysquestions.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/** 
 * @author auth
 * @date 创建时间：2016年12月2日 下午3:55:15 
 * @version 
 * @since  
 */
public class QuestionsResponse extends BaseResponse {
	private static final long serialVersionUID = -92201909614710869L;
	private List<SeachQuestionsResponse> questionsList;
	/**
	 * 原文
	 */
	private String original;
	/**
	 * 译文
	 */
	private String translation;
	/**
	 * 题型
	 */
	private String qtype;
	
	
	public List<SeachQuestionsResponse> getQuestionsList() {
		return questionsList;
	}
	public void setQuestionsList(List<SeachQuestionsResponse> questionsList) {
		this.questionsList = questionsList;
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
	public String getQtype() {
		return qtype;
	}
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
}

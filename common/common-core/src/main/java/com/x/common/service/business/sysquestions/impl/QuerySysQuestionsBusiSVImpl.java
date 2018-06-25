package com.x.common.service.business.sysquestions.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.x.common.api.sysquestions.param.QuestionsPageVo;
import com.x.common.api.sysquestions.param.QuestionsPapersResponse;
import com.x.common.api.sysquestions.param.QuestionsPapersVo;
import com.x.common.api.sysquestions.param.SaveSysQuestions;
import com.x.common.api.sysquestions.param.SeachQuestionsResponse;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysQuestionsWithBLOBs;
import com.x.common.service.atom.sysquestions.ISysQuestionsAtomSV;
import com.x.common.service.business.sysquestions.IQuerySysQuestionsBusiSV;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
@Transactional
public class QuerySysQuestionsBusiSVImpl implements IQuerySysQuestionsBusiSV {
	
	@Autowired 
	private transient ISysQuestionsAtomSV  iSysQuestionsAtomSV;


	@Override
	public PageInfo<QuestionsPageVo> queryQuestionsPage(QuestionsPageQueryRequest param) {
		PageInfo<QuestionsPageVo> questionsPageInfo = iSysQuestionsAtomSV.queryQuestionsPage(param);
		return questionsPageInfo;
	}


	@Override
	public Integer saveSysQuestions(SaveSysQuestions req) {
		SysQuestionsWithBLOBs sysQuestionsWithBLOBs = new SysQuestionsWithBLOBs();
		BeanUtils.copyProperties(sysQuestionsWithBLOBs,req);
		Long qId = SeqUtil.getNewId(Constants.SEQ.QUESTIONS_QID_SEQ);
		sysQuestionsWithBLOBs.setQid(String.valueOf(qId));
		return iSysQuestionsAtomSV.saveSysItemBank(sysQuestionsWithBLOBs);
	}


	@Override
	public Integer updateSysQuestions(SaveSysQuestions req) {
		SysQuestionsWithBLOBs sysQuestionsWithBLOBs = new SysQuestionsWithBLOBs();
		BeanUtils.copyProperties(sysQuestionsWithBLOBs,req);
		return iSysQuestionsAtomSV.updateSysQuestions(sysQuestionsWithBLOBs);	
	}


	@Override
	public Integer deleteSysQuestions(String qid) {
		return iSysQuestionsAtomSV.deleteSysQuestions(qid);
	}


	@Override
	public Integer queryQuestionsNumber(QuestionsPageQueryRequest param) {
		return iSysQuestionsAtomSV.queryQuestionsNumber(param);
	}


	@Override
	public List<QuestionsPapersVo> questionsChoicePapers(String bid) {
		List<QuestionsPapersVo> questionsPapersVos = new ArrayList<QuestionsPapersVo>();
		List<QuestionsPapersVo> questionsChoicePapers = iSysQuestionsAtomSV.questionsChoicePapers(bid);
		if (!CollectionUtil.isEmpty(questionsChoicePapers)) {
			questionsPapersVos = new ArrayList<QuestionsPapersVo>();
			for (int i = 0; i < questionsChoicePapers.size(); i++) {
				if(questionsChoicePapers.get(i) != null){
					QuestionsPapersVo questionsPapersVoResponse = new QuestionsPapersVo();
					BeanUtils.copyProperties(questionsPapersVoResponse, questionsChoicePapers.get(i));
					questionsPapersVos.add(questionsPapersVoResponse);
				}
			}
		}
		return questionsPapersVos;
	}


	@Override
	public QuestionsPapersResponse questionsPapers(String bid) {
		return iSysQuestionsAtomSV.questionsPapers(bid);
	}


	@Override
	public SeachQuestionsResponse questionsByQid(String qid) {
		return iSysQuestionsAtomSV.questionsByQid(qid);
	}
}

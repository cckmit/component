package com.x.common.service.business.sysquestions;


import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.x.common.api.sysquestions.param.QuestionsPageVo;
import com.x.common.api.sysquestions.param.QuestionsPapersResponse;
import com.x.common.api.sysquestions.param.QuestionsPapersVo;
import com.x.common.api.sysquestions.param.SaveSysQuestions;
import com.x.common.api.sysquestions.param.SeachQuestionsResponse;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
public interface IQuerySysQuestionsBusiSV {

	PageInfo<QuestionsPageVo> queryQuestionsPage(QuestionsPageQueryRequest param);

	Integer saveSysQuestions(SaveSysQuestions req);

	Integer updateSysQuestions(SaveSysQuestions req);

	Integer deleteSysQuestions(String qid);

	Integer queryQuestionsNumber(QuestionsPageQueryRequest param);

	List<QuestionsPapersVo> questionsChoicePapers(String bid);

	QuestionsPapersResponse questionsPapers(String bid);

	SeachQuestionsResponse questionsByQid(String qid);


}

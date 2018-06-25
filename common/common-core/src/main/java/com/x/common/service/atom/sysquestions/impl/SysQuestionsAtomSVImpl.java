package com.x.common.service.atom.sysquestions.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.PageInfo;
import com.x.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.x.common.api.sysquestions.param.QuestionsPageVo;
import com.x.common.api.sysquestions.param.QuestionsPapersResponse;
import com.x.common.api.sysquestions.param.QuestionsPapersVo;
import com.x.common.api.sysquestions.param.SeachQuestionsResponse;
import com.x.common.dao.mapper.attach.QuestionsAttachMapper;
import com.x.common.dao.mapper.bo.SysQuestionsCriteria;
import com.x.common.dao.mapper.bo.SysQuestionsWithBLOBs;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysQuestionsMapper;
import com.x.common.service.atom.sysquestions.ISysQuestionsAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Component
public class SysQuestionsAtomSVImpl implements ISysQuestionsAtomSV{

	@Autowired
	private QuestionsAttachMapper questionsAttachMapper;

	@Override
	public PageInfo<QuestionsPageVo> queryQuestionsPage(QuestionsPageQueryRequest param) throws BusinessException, SystemException{
		List<QuestionsPageVo> questionsPageVos = new ArrayList<QuestionsPageVo>();
		SysQuestionsCriteria sysQuestionsCriteria = new SysQuestionsCriteria();
		SysQuestionsCriteria.Criteria criteria = sysQuestionsCriteria.createCriteria();
		String orderByClause = "create_time desc";
		sysQuestionsCriteria.setOrderByClause(orderByClause);
		if (!StringUtil.isBlank(param.getBid())) {
			criteria.andBidEqualTo(param.getBid());
		}
		if (!StringUtil.isBlank(param.getQtype())) {
			criteria.andQtypeEqualTo(param.getQtype());
		}
		criteria.andFlagEqualTo("1");
		PageInfo<QuestionsPageVo> pageInfo = new PageInfo<QuestionsPageVo>();
		SysQuestionsMapper mapper = MapperFactory.getSysQuestionsMapper();
		pageInfo.setCount(mapper.countByExample(sysQuestionsCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysQuestionsCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysQuestionsCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		
		 List<SysQuestionsWithBLOBs> selectByExampleWithBLOBs = mapper.selectByExampleWithBLOBs(sysQuestionsCriteria);
		if (!CollectionUtil.isEmpty(selectByExampleWithBLOBs)) {
			for (int i = 0; i < selectByExampleWithBLOBs.size(); i++) {
				QuestionsPageVo questionsPageVo = new QuestionsPageVo();
				BeanUtils.copyProperties(questionsPageVo, selectByExampleWithBLOBs.get(i));
				questionsPageVos.add(questionsPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(questionsPageVos);
		return pageInfo;
	}

	@Override
	public Integer saveSysItemBank(SysQuestionsWithBLOBs sysQuestionsWithBLOBs) {
		SysQuestionsMapper mapper = MapperFactory.getSysQuestionsMapper();
		sysQuestionsWithBLOBs.setFlag("1");
		int insert = mapper.insert(sysQuestionsWithBLOBs);
		return insert;
	}

	@Override
	public Integer updateSysQuestions(SysQuestionsWithBLOBs sysQuestionsWithBLOBs) {
		SysQuestionsCriteria sysQuestionsCriteria = new SysQuestionsCriteria();
		SysQuestionsCriteria.Criteria criteria = sysQuestionsCriteria.createCriteria();
		criteria.andQidEqualTo(sysQuestionsWithBLOBs.getQid());
		SysQuestionsMapper mapper = MapperFactory.getSysQuestionsMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysQuestionsWithBLOBs, sysQuestionsCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public Integer deleteSysQuestions(String qid) {
		SysQuestionsCriteria sysQuestionsCriteria = new SysQuestionsCriteria();
		SysQuestionsCriteria.Criteria criteria = sysQuestionsCriteria.createCriteria();
		criteria.andQidEqualTo(qid);
		SysQuestionsMapper mapper = MapperFactory.getSysQuestionsMapper();
		SysQuestionsWithBLOBs sysQuestionsWithBLOBs = new SysQuestionsWithBLOBs();
		sysQuestionsWithBLOBs.setFlag("0");
		return mapper.updateByExampleSelective(sysQuestionsWithBLOBs, sysQuestionsCriteria);
	}

	@Override
	public Integer queryQuestionsNumber(QuestionsPageQueryRequest param) {
		SysQuestionsCriteria sysQuestionsCriteria = new SysQuestionsCriteria();
		SysQuestionsCriteria.Criteria criteria = sysQuestionsCriteria.createCriteria();
		if (!StringUtil.isBlank(param.getBid())) {
			criteria.andBidEqualTo(param.getBid());
		}
		if (!StringUtil.isBlank(param.getQtype())) {
			criteria.andQtypeEqualTo(param.getQtype());
		}
		criteria.andFlagEqualTo("1");
		SysQuestionsMapper mapper = MapperFactory.getSysQuestionsMapper();
		int countByExample = mapper.countByExample(sysQuestionsCriteria);
		return countByExample;
	}

	@Override
	public List<QuestionsPapersVo> questionsChoicePapers(String bid) {
		List<QuestionsPapersVo> queryQuestionsPapersVo = questionsAttachMapper.getQuestionsChoicePapers(bid);
		return queryQuestionsPapersVo;
	}

	@Override
	public QuestionsPapersResponse questionsPapers(String bid) {
		QuestionsPapersResponse questionsPapersResponse = new QuestionsPapersResponse();
		SysQuestionsWithBLOBs sysQuestionsWithBLOBs = questionsAttachMapper.questionsPapers(bid);
		if(sysQuestionsWithBLOBs != null){
			BeanUtils.copyProperties(questionsPapersResponse, sysQuestionsWithBLOBs);
		}
		return questionsPapersResponse;
	}

	@Override
	public SeachQuestionsResponse questionsByQid(String qid) {
		SeachQuestionsResponse seachQuestionsResponse = new SeachQuestionsResponse();
		SysQuestionsCriteria sysQuestionsCriteria = new SysQuestionsCriteria();
		SysQuestionsCriteria.Criteria criteria = sysQuestionsCriteria.createCriteria();
		criteria.andQidEqualTo(qid);
		SysQuestionsMapper mapper = MapperFactory.getSysQuestionsMapper();
		List<SysQuestionsWithBLOBs> selectByExampleWithBLOBs = mapper.selectByExampleWithBLOBs(sysQuestionsCriteria);
		SysQuestionsWithBLOBs sysQuestionsWithBLOBs = selectByExampleWithBLOBs.get(0);
		BeanUtils.copyProperties(seachQuestionsResponse, sysQuestionsWithBLOBs);
		return seachQuestionsResponse;
	}


}

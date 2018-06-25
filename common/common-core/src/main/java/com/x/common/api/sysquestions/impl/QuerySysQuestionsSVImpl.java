package com.x.common.api.sysquestions.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.x.common.api.sysitembank.param.ItemBankPageVo;
import com.x.common.api.sysquestions.interfaces.IQuerySysQuestionsSV;
import com.x.common.api.sysquestions.param.DeleteSysQuestions;
import com.x.common.api.sysquestions.param.QuestionsPageQueryRequest;
import com.x.common.api.sysquestions.param.QuestionsPageQueryResponse;
import com.x.common.api.sysquestions.param.QuestionsPageVo;
import com.x.common.api.sysquestions.param.QuestionsPapersResponse;
import com.x.common.api.sysquestions.param.QuestionsPapersVo;
import com.x.common.api.sysquestions.param.SaveSysQuestions;
import com.x.common.api.sysquestions.param.SeachQuestionsResponse;
import com.x.common.service.business.sysitembank.IQuerySysItemBankBusiSV;
import com.x.common.service.business.sysquestions.IQuerySysQuestionsBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
@Component
public class QuerySysQuestionsSVImpl implements IQuerySysQuestionsSV {
	
	@Autowired
	private transient IQuerySysQuestionsBusiSV iQuerySysQuestionsBusiSV;
	
	@Autowired
	private transient IQuerySysItemBankBusiSV iQuerySysItemBankBusiSV;


	@Override
	public QuestionsPageQueryResponse queryQuestionsPage(QuestionsPageQueryRequest param)
			throws BusinessException, SystemException {
		
		QuestionsPageQueryResponse questionsPageQueryResponse = new QuestionsPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<QuestionsPageVo> pageInfo = iQuerySysQuestionsBusiSV.queryQuestionsPage(param);
            questionsPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("题目查询成功");
            questionsPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            questionsPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("题目查询失败");
            questionsPageQueryResponse.setResponseHeader(responseHeader);
        }
		return questionsPageQueryResponse;
	}


	@Override
	public BaseResponse saveSysQuestions(SaveSysQuestions req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysQuestionsBusiSV.saveSysQuestions(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加题目成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加题目失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysQuestions(DeleteSysQuestions param) throws BusinessException, SystemException {
		return iQuerySysQuestionsBusiSV.deleteSysQuestions(param.getQid());
	}


	@Override
	public BaseResponse updateSysQuestions(SaveSysQuestions req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysQuestionsBusiSV.updateSysQuestions(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改题目成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改题目失败");
		}
		return response;
	}


	@Override
	public Integer queryQuestionsNumber(QuestionsPageQueryRequest param) throws BusinessException, SystemException {
		return iQuerySysQuestionsBusiSV.queryQuestionsNumber(param);
	}


	@Override
	public QuestionsPapersResponse questionsPapers(ItemBankPageQueryRequest param) throws BusinessException, SystemException {
		if(param==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数不能为空");
		}
		QuestionsPapersResponse questionsPapersResponses = new QuestionsPapersResponse();
		PageInfo<ItemBankPageVo> queryItemBankPage = iQuerySysItemBankBusiSV.queryItemBankPage(param);
		List<ItemBankPageVo> result = queryItemBankPage.getResult();
		for (ItemBankPageVo itemBankPageVo : result) {
			List<QuestionsPapersVo> questionsPapersVoList = iQuerySysQuestionsBusiSV.questionsChoicePapers(itemBankPageVo.getBid());
			questionsPapersResponses.setQiestionsParpersVoList(questionsPapersVoList);
			QuestionsPapersResponse questionsPapersResponse = iQuerySysQuestionsBusiSV.questionsPapers(itemBankPageVo.getBid());
			if(questionsPapersResponse.getOriginal() != null && questionsPapersResponse.getQid()!= null){
				questionsPapersResponses.setOriginal(questionsPapersResponse.getOriginal());
				questionsPapersResponses.setQid(questionsPapersResponse.getQid());
				questionsPapersResponses.setBid(itemBankPageVo.getBid());
			}
		}
		return questionsPapersResponses;
	}


	@Override
	public SeachQuestionsResponse questionsByQid(DeleteSysQuestions param) throws BusinessException, SystemException {
		return iQuerySysQuestionsBusiSV.questionsByQid(param.getQid());
	}
}

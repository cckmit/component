package com.x.common.api.sysfeedbake.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysfeedbake.interfaces.ISysFeedBakeSV;
import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryResponse;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryResponse;
import com.x.common.api.sysfeedbake.param.FeedBakeSaveRequest;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysFeedbake;
import com.x.common.service.atom.sysfeedbake.ISysFeedBakeAtomSV;
import com.x.common.service.business.sysfeedbake.ISysFeedBakeBusiSV;
import com.x.common.util.SequenceUtil;
import com.x.common.util.VoValidateUtils;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.DateUtil;
import com.x.sdk.util.StringUtil;
@Service
@Component
public class SysFeedBakeSVImpl implements ISysFeedBakeSV {
	
	@Autowired
	private ISysFeedBakeBusiSV sysFeedBakeBusiSV;
	@Autowired
	private ISysFeedBakeAtomSV sysFeedBakeAtomSV;
	
	@Override
	public FeedBakeQueryResponse queryList(FeedBakeQueryRequest request) 
			throws BusinessException, SystemException {
		// 1.参数校验
		VoValidateUtils.validateSysFeedBakeQueryList(request);
		// 2.查询意见反馈列表信息
		FeedBakeQueryResponse response=sysFeedBakeBusiSV.queryList(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询列表成功"));
		return response;
	}

	@Override
	public FeedBakeDetailQueryResponse queryById(FeedBakeDetailQueryRequest request)
			throws BusinessException, SystemException {
		// 参数校验
		if(null==request) {
			throw new BusinessException("参数不能为空");
		}
		if(StringUtil.isBlank(request.getId())) {
			throw new BusinessException("意见反馈编号不能为空");
		}
		FeedBakeDetailQueryResponse response=sysFeedBakeBusiSV.queryById(request);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "查询成功"));
		return response;
	}


	@Override
	public BaseResponse insert(FeedBakeSaveRequest request) throws BusinessException, SystemException {
		//参数校验
		VoValidateUtils.validateSysFeedBakeInsert(request);
		BaseResponse response=new BaseResponse();
		//
		SysFeedbake feedbake=new SysFeedbake();
		BeanUtils.copyProperties(feedbake, request);
		//
		String bakeId = SequenceUtil.createSysFeedBakeId();
		feedbake.setId(bakeId);
		feedbake.setFeedbakeSoure(request.getFeedbakeSource());
		//反馈时间
		feedbake.setFeedbakeTime(DateUtil.getSysDate());
		feedbake.setHandleType(Constants.HandleType.PENDING);
		sysFeedBakeBusiSV.insert(feedbake);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "意见反馈保存成功"));
		return response;
	}

	@Override
	public BaseResponse handle(FeedBakeDetailQueryRequest request) throws BusinessException, SystemException {
		// 参数校验
		VoValidateUtils.validateSysFeedBakeHandle(request);
		BaseResponse response=new BaseResponse();
		//更新信息 及状态
		SysFeedbake feedbake = sysFeedBakeAtomSV.selectById(request.getId());
		feedbake.setHandleType(Constants.HandleType.ALREADY_PROCESSED);
		feedbake.setHandleTime(DateUtil.getSysDate());
		feedbake.setHandlePeople(request.getHandlePerole());
		// 备注
		feedbake.setRemarks(request.getRemarks());
		sysFeedBakeBusiSV.handle(feedbake);
		response.setResponseHeader(new ResponseHeader(true, 
				ExceptionCodeConstant.SUCCESS, "意见反馈详情处理成功"));
		return response;
	}
}

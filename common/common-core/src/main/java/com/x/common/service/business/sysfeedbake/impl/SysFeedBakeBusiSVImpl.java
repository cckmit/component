package com.x.common.service.business.sysfeedbake.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryResponse;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryResponse;
import com.x.common.api.sysfeedbake.param.SysFeedbakeSearchInfo;
import com.x.common.dao.mapper.bo.SysFeedbake;
import com.x.common.service.atom.sysfeedbake.ISysFeedBakeAtomSV;
import com.x.common.service.business.sysfeedbake.ISysFeedBakeBusiSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

@Service
public class SysFeedBakeBusiSVImpl implements ISysFeedBakeBusiSV {
	
	@Autowired
	private ISysFeedBakeAtomSV sysFeedBakeAtomSV;
	
	/**
	 * 意见反馈列表查询
	 */
	@Override
	public FeedBakeQueryResponse queryList(FeedBakeQueryRequest request) {
		FeedBakeQueryResponse response=new FeedBakeQueryResponse();
		PageInfo<SysFeedbakeSearchInfo> pageInfo=new PageInfo<SysFeedbakeSearchInfo>();
		//查询数量
		int count = sysFeedBakeAtomSV.count(request);
		//反馈信息
		List<SysFeedbake> queryList = sysFeedBakeAtomSV.queryList(request);
		List<SysFeedbakeSearchInfo> result=new ArrayList<SysFeedbakeSearchInfo>();
		if(!CollectionUtil.isEmpty(queryList)) {
			for (SysFeedbake sysFeedbake : queryList) {
				SysFeedbakeSearchInfo info=new SysFeedbakeSearchInfo();
				BeanUtils.copyProperties(info, sysFeedbake);
				result.add(info);
			}
		}
		pageInfo.setCount(count);
		//总页数
		pageInfo.setPageCount((count + request.getPageSize() - 1) / request.getPageSize());
		pageInfo.setPageNo(request.getPageNo());
		pageInfo.setPageSize(request.getPageSize());
		pageInfo.setResult(result);
		response.setPageInfo(pageInfo);
		return response;
	}
	
	/**
	 * 意见反馈详情查询
	 */
	@Override
	public FeedBakeDetailQueryResponse queryById(FeedBakeDetailQueryRequest request) {
		FeedBakeDetailQueryResponse response=new FeedBakeDetailQueryResponse();
		SysFeedbake sysFeedbake = sysFeedBakeAtomSV.selectById(request.getId());
		if(sysFeedbake!=null) {
			BeanUtils.copyProperties(response, sysFeedbake);
		}
		return response;
	}
	
	
	/**
	 * 意见反馈信息保存
	 */
	@Override
	@Transactional
	public void insert(SysFeedbake feedbake) {
		sysFeedBakeAtomSV.insert(feedbake);
	}
	
	/**
	 * 查看处理
	 */
	@Override
	@Transactional
	public void handle(SysFeedbake feedbake) {
		sysFeedBakeAtomSV.update(feedbake);
	}
	
}

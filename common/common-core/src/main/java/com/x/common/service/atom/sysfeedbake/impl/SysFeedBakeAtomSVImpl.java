package com.x.common.service.atom.sysfeedbake.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.common.api.sysfeedbake.param.FeedBakeQueryRequest;
import com.x.common.dao.mapper.bo.SysFeedbake;
import com.x.common.dao.mapper.bo.SysFeedbakeCriteria;
import com.x.common.dao.mapper.bo.SysFeedbakeCriteria.Criteria;
import com.x.common.dao.mapper.interfaces.SysFeedbakeMapper;
import com.x.common.service.atom.sysfeedbake.ISysFeedBakeAtomSV;
import com.x.sdk.util.StringUtil;

@Service
public class SysFeedBakeAtomSVImpl implements ISysFeedBakeAtomSV{
	
	@Autowired
	private SysFeedbakeMapper sysFeedbakeMapper;

	@Override
	public int insert(SysFeedbake record) {
		return sysFeedbakeMapper.insertSelective(record);
	}

	@Override
	public SysFeedbake selectById(String id) {
		return sysFeedbakeMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysFeedbake> queryList(FeedBakeQueryRequest request) {
		SysFeedbakeCriteria example =this.packAgeCondition(request);
		example.setOrderByClause("feedbake_time desc");
		example.setLimitStart((request.getPageNo() - 1) * request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		return sysFeedbakeMapper.selectByExample(example);
	}

	@Override
	public int count(FeedBakeQueryRequest request) {
		SysFeedbakeCriteria example =this.packAgeCondition(request);
		return sysFeedbakeMapper.countByExample(example);
	}
	
	/**
	 * 封装条件
	 * @param request
	 * @return
	 */
	private SysFeedbakeCriteria packAgeCondition(FeedBakeQueryRequest request) {
		SysFeedbakeCriteria example=new SysFeedbakeCriteria();
		Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(request.getUserName())) {
			criteria.andUserNameLike("%" + request.getUserName().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getPhoneNum())) {
			criteria.andPhoneNumLike("%" + request.getPhoneNum().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getMail())) {
			criteria.andMailLike("%" + request.getMail().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getSource())) {
			criteria.andFeedbakeSoureEqualTo(request.getSource());
		}
		if(!StringUtil.isBlank(request.getProblemType())) {
			criteria.andProblemTypeEqualTo(request.getProblemType());
		}
		if(request.getFeedBakeTimeBegin()!=null && request.getFeedBakeTimeEnd()==null) {
			criteria.andFeedbakeTimeGreaterThan(request.getFeedBakeTimeBegin());
		}
		if(request.getFeedBakeTimeBegin()==null && request.getFeedBakeTimeEnd()!=null) {
			criteria.andFeedbakeTimeLessThan(request.getFeedBakeTimeEnd());
		}
		if(request.getFeedBakeTimeBegin()!=null && request.getFeedBakeTimeEnd()!=null) {
			criteria.andFeedbakeTimeBetween(request.getFeedBakeTimeBegin(), request.getFeedBakeTimeEnd());
		}
		if(!StringUtil.isBlank(request.getHandlePeople())) {
			criteria.andHandlePeopleLike("%" + request.getHandlePeople().trim() + "%");
		}
		return example;
	}

	@Override
	public int update(SysFeedbake record) {
		return sysFeedbakeMapper.updateByPrimaryKeySelective(record);
	}

}

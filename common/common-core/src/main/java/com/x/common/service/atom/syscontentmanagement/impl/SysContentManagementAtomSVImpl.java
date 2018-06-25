package com.x.common.service.atom.syscontentmanagement.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.common.api.syscontentmanagement.param.ContentQueryListRequest;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckRequest;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysContentManagement;
import com.x.common.dao.mapper.bo.SysContentManagementCriteria;
import com.x.common.dao.mapper.bo.SysContentManagementCriteria.Criteria;
import com.x.common.dao.mapper.interfaces.SysContentManagementMapper;
import com.x.common.service.atom.syscontentmanagement.ISysContentManagementAtomSV;
import com.x.sdk.util.StringUtil;
@Service
public class SysContentManagementAtomSVImpl implements ISysContentManagementAtomSV {
	
	@Autowired
	private SysContentManagementMapper managementMapper;
	
	@Override
	public SysContentManagement selectById(String id) {
		return managementMapper.selectByPrimaryKey(id);
	}

	@Override
	public int count(ContentQueryListRequest request) {
		SysContentManagementCriteria example =this.assemblyCondition(request);
		return managementMapper.countByExample(example);
	}

	@Override
	public List<SysContentManagement> queryList(ContentQueryListRequest request) {
		SysContentManagementCriteria example =this.assemblyCondition(request);
		example.setOrderByClause("sort desc");
		example.setLimitStart((request.getPageNo() - 1) * request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		return managementMapper.selectByExample(example);
	}
	
	/**
	 * 组装条件
	 * @param request
	 * @return
	 */
	private SysContentManagementCriteria assemblyCondition(ContentQueryListRequest request) {
		SysContentManagementCriteria example=new SysContentManagementCriteria();
		Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(request.getSubtititle())) {
			criteria.andSubtititleLike("%" + request.getSubtititle().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getRegionalLanguage())) {
			criteria.andRegionalLanguageEqualTo( request.getRegionalLanguage());
		}
		if(!StringUtil.isBlank(request.getTitleid())) {
			criteria.andTitleidEqualTo(request.getTitleid());
		}
		if(!StringUtil.isBlank(request.getAditor())) {
			criteria.andAditorLike("%" + request.getAditor().trim() + "%");
		}
		return example;
	}

	@Override
	public void insert(SysContentManagement management) {
		managementMapper.insertSelective(management);
	}

	@Override
	public void update(SysContentManagement management) {
		managementMapper.updateByPrimaryKeySelective(management);
	}

	@Override
	public int delete(String id) {
		return managementMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int duplicateCheck(ContentSortCheckRequest request) {
		SysContentManagementCriteria example=new SysContentManagementCriteria();
		Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(request.getSubtititle())) {
			criteria.andSubtititleEqualTo(request.getSubtititle().trim());
		}
		if(request.getSort()>0) {
			criteria.andSortEqualTo( request.getSort());
		}
		return managementMapper.countByExample(example);
	}

	@Override
	public List<SysContentManagement> queryContentManagementList() {
		SysContentManagementCriteria example=new SysContentManagementCriteria();
		return managementMapper.selectByExample(example);
	}

	@Override
	public List<SysContentManagement> querySysContentManagementList(String local) {
		SysContentManagementCriteria example=new SysContentManagementCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andRegionalLanguageEqualTo(local);
		criteria.andStateEqualTo(Constants.HelpCenter.SHOW_STATE);
		return managementMapper.selectByExample(example);
	}

	@Override
	public List<SysContentManagement> queryContentBytitleId(String titleid,String local) {
		// TODO Auto-generated method stub
		SysContentManagementCriteria example=new SysContentManagementCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTitleidEqualTo(titleid);
		criteria.andRegionalLanguageEqualTo(local);
		criteria.andStateEqualTo(Constants.HelpCenter.SHOW_STATE);
		example.setOrderByClause("sort desc");
		return managementMapper.selectByExample(example);
	}

	@Override
	public List<SysContentManagement> queryByTitleId(String titleid) {
		SysContentManagementCriteria example=new SysContentManagementCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTitleidEqualTo(titleid);
		return managementMapper.selectByExample(example);
	}
}

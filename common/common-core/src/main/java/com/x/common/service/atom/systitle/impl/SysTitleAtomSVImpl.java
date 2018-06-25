package com.x.common.service.atom.systitle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.common.api.systitle.param.TitleQueryListRequest;
import com.x.common.api.systitle.param.TitleSortCheckRequest;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysTitle;
import com.x.common.dao.mapper.bo.SysTitleCriteria;
import com.x.common.dao.mapper.bo.SysTitleCriteria.Criteria;
import com.x.common.dao.mapper.interfaces.SysTitleMapper;
import com.x.common.service.atom.systitle.ISysTitleAtomSV;
import com.x.sdk.util.StringUtil;
@Service
public class SysTitleAtomSVImpl implements ISysTitleAtomSV {
	
	@Autowired
	private SysTitleMapper sysTitleMapper;
	
	@Override
	public int count(TitleQueryListRequest request) {
		SysTitleCriteria example =this.assemblyCondition(request);
		return sysTitleMapper.countByExample(example);
	}

	@Override
	public List<SysTitle> queryList(TitleQueryListRequest request) {
		SysTitleCriteria example =this.assemblyCondition(request);
		example.setOrderByClause("sort desc");
		example.setLimitStart((request.getPageNo() - 1) * request.getPageSize());
		example.setLimitEnd(request.getPageSize());
		return sysTitleMapper.selectByExample(example);
	}
	
	@Override
	public SysTitle selectById(String id) {
		return sysTitleMapper.selectByPrimaryKey(id);
	}

	@Override
	public void insert(SysTitle sysTitle) {
		sysTitleMapper.insertSelective(sysTitle);
	}

	@Override
	public void update(SysTitle sysTitle) {
		sysTitleMapper.updateByPrimaryKeySelective(sysTitle);
	}

	@Override
	public int delete(String id) {
		return sysTitleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int duplicateCheck(TitleSortCheckRequest request) {
		SysTitleCriteria example=new SysTitleCriteria();
		Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(request.getTitle())) {
			criteria.andTitleEqualTo(request.getTitle().trim());
		}
		if(request.getSort()>0) {
			criteria.andSortEqualTo( request.getSort());
		}
		return sysTitleMapper.countByExample(example);
	}
	
	/**
	 * 组装条件
	 * @param request
	 * @return
	 */
	private SysTitleCriteria assemblyCondition(TitleQueryListRequest request) {
		SysTitleCriteria example=new SysTitleCriteria();
		Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(request.getTitle())) {
			criteria.andTitleLike("%" + request.getTitle().trim() + "%");
		}
		if(!StringUtil.isBlank(request.getRegionalLanguage())) {
			criteria.andRegionalLanguageEqualTo( request.getRegionalLanguage());
		}
		if(!StringUtil.isBlank(request.getState())) {
			criteria.andStateEqualTo(request.getState());
		}
		if(!StringUtil.isBlank(request.getSite())) {
			criteria.andSiteEqualTo(request.getSite());
		}
		if(!StringUtil.isBlank(request.getAditor())) {
			criteria.andAditorLike("%" + request.getAditor().trim() + "%");
		}
		return example;
	}

	@Override
	public List<SysTitle> queryTitle(String regionalLanguage) {
		SysTitleCriteria example=new SysTitleCriteria();
		Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(regionalLanguage)) {
			criteria.andRegionalLanguageEqualTo(regionalLanguage);
		}
		return sysTitleMapper.selectByExample(example);
	}

	@Override
	public List<SysTitle> querySysTitleList(String local, String site) {
		SysTitleCriteria example=new SysTitleCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andRegionalLanguageEqualTo(local);
		criteria.andSiteEqualTo(site);
		criteria.andStateEqualTo(Constants.HelpCenter.SHOW_STATE);
		example.setOrderByClause("sort desc");
		return sysTitleMapper.selectByExample(example);
	}
}

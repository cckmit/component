package com.x.common.service.atom.sysmail.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.common.api.sysmail.param.SysMailRequest;
import com.x.common.dao.mapper.bo.SysMail;
import com.x.common.dao.mapper.bo.SysMailCriteria;
import com.x.common.dao.mapper.interfaces.SysMailMapper;
import com.x.common.service.atom.sysmail.ISysMailAtomService;
import com.x.sdk.util.StringUtil;

@Service
public class SysMailAtomServiceImpl implements ISysMailAtomService {
	
	@Autowired
	private SysMailMapper sysMailMapper;

	@Override
	public int count(SysMailRequest request) {
		SysMailCriteria example = new SysMailCriteria();
		SysMailCriteria.Criteria criteria = example.createCriteria();
		if(!StringUtil.isBlank(request.getUserId())) {
			criteria.andUserIdEqualTo(request.getUserId());
		}
		if(!StringUtil.isBlank(request.getStatus())) {
			criteria.andStatusEqualTo(request.getStatus());
		}
		return sysMailMapper.countByExample(example);
	}
	
	@Override
	public List<SysMail> getSysMailPageList(SysMailRequest request) {
		SysMailCriteria example = new SysMailCriteria();
		SysMailCriteria.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(request.getUserId());
		example.setLimitStart(null == request.getPageInfo() ? 1 : request.getPageInfo().getStartRowIndex());
		example.setLimitEnd(null == request.getPageInfo() ? 10 : request.getPageInfo().getPageSize());
		example.setOrderByClause("RECEIVE_DATE desc");
		return sysMailMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public int updateSysMail(SysMail record) {
		return sysMailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteSysMail(SysMailRequest request) {
		SysMailCriteria example = new SysMailCriteria();
		SysMailCriteria.Criteria criteria = example.createCriteria();
		criteria.andIdIn(request.getMailIds());
		return sysMailMapper.deleteByExample(example);
	}

}

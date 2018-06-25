package com.x.common.service.atom.sysmailinformation.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.common.dao.mapper.bo.SysMailInformation;
import com.x.common.dao.mapper.bo.SysMailInformationCriteria;
import com.x.common.dao.mapper.bo.SysMailInformationCriteria.Criteria;
import com.x.common.dao.mapper.interfaces.SysMailInformationMapper;
import com.x.common.service.atom.sysmailinformation.ISysMailInformationAtomSV;

@Service
public class SysMailInformationAtomSVImpl implements ISysMailInformationAtomSV {
	
	@Autowired
	private SysMailInformationMapper mailInformationMapper;
	
	@Override
	public void save(SysMailInformation information) {
		mailInformationMapper.insertSelective(information);
	}

	@Override
	public SysMailInformation query(String id) {
		return mailInformationMapper.selectByPrimaryKey(id);
	}

	@Override
	public void modify(SysMailInformation mailInformation) {
		mailInformationMapper.updateByPrimaryKeySelective(mailInformation);
	}

	@Override
	public void delete(String id) {
		mailInformationMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<SysMailInformation> queryByUid(String id) {
		// TODO Auto-generated method stub
		SysMailInformationCriteria example=new SysMailInformationCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andUidEqualTo(id);
		return mailInformationMapper.selectByExample(example);
	}
}

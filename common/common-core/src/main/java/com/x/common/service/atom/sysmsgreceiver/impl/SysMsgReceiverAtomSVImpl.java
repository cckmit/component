package com.x.common.service.atom.sysmsgreceiver.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.common.dao.mapper.bo.SysMsgReceiver;
import com.x.common.dao.mapper.bo.SysMsgReceiverCriteria;
import com.x.common.dao.mapper.interfaces.SysMsgReceiverMapper;
import com.x.common.service.atom.sysmsgreceiver.ISysMsgReceiverAtomSV;
import com.x.sdk.component.sequence.util.SeqUtil;
@Service
public class SysMsgReceiverAtomSVImpl implements ISysMsgReceiverAtomSV {
	
	@Autowired
	SysMsgReceiverMapper mapper;

	@Override
	public List<SysMsgReceiver> selectByExample(SysMsgReceiverCriteria example) {
		
		return mapper.selectByExample(example);
	}

	@Override
	public int deleteByExample(SysMsgReceiverCriteria example) {
		return mapper.deleteByExample(example);
	}

	@Override
	public int insertSelective(SysMsgReceiver record) {
		String id = SeqUtil.getNewId("SYS$SYSMSGRECEIVER$ID", 8).toString();
		record.setId(id);
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByExampleSelective(SysMsgReceiver record,SysMsgReceiverCriteria example) {
		return mapper.updateByExampleSelective(record, example);
	}
	
	


}

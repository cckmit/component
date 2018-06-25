package com.x.common.service.atom.sysmsgreceiver;

import java.util.List;

import com.x.common.dao.mapper.bo.SysMsgReceiver;
import com.x.common.dao.mapper.bo.SysMsgReceiverCriteria;

public interface ISysMsgReceiverAtomSV {
	
	List<SysMsgReceiver> selectByExample(SysMsgReceiverCriteria example);
	
	int deleteByExample(SysMsgReceiverCriteria example);

	int insertSelective(SysMsgReceiver record);
	
	int updateByExampleSelective(SysMsgReceiver record,SysMsgReceiverCriteria example);

}

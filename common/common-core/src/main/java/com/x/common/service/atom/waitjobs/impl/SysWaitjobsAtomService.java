package com.x.common.service.atom.waitjobs.impl;

import java.sql.Timestamp;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.x.common.constants.VOConstants.WaitjobsStatusConstant;
import com.x.common.dao.mapper.bo.SysWaitjobs;
import com.x.common.dao.mapper.bo.SysWaitjobsCriteria;
import com.x.common.dao.mapper.bo.SysWaitjobsCriteria.Criteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.service.atom.waitjobs.ISysWaitjobsAtomService;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.util.DateUtil;

@Component
public class SysWaitjobsAtomService implements ISysWaitjobsAtomService{

	@Override
	public String insertWaitjobs(SysWaitjobs waitjobs) {
		String status = waitjobs.getStatus();
		if(StringUtils.isEmpty(status)){
			waitjobs.setStatus(WaitjobsStatusConstant.WAIT);
		}
		Timestamp arriveData = waitjobs.getArriveData();
		if(arriveData == null){
			Timestamp sysDate = DateUtil.getSysDate();
			waitjobs.setArriveData(sysDate);
		}
		String newId = SeqUtil.getNewId("SYS$SYSWAITJOBS$ID").toString();
		waitjobs.setId(newId);
		int insertCount = MapperFactory.getSysWaitjobsMapper().insertSelective(waitjobs);
		if(insertCount>0){
			return newId;
		}else{
			return null;
		}
	}

	@Override
	public int completeWaitjobs(String id, String tenantId) {
		SysWaitjobsCriteria example = new SysWaitjobsCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id.trim());
		criteria.andTenantIdEqualTo(tenantId.trim());
		SysWaitjobs record = new SysWaitjobs();
		record.setStatus(WaitjobsStatusConstant.END);
		return MapperFactory.getSysWaitjobsMapper().updateByExampleSelective(record , example);
	}

}

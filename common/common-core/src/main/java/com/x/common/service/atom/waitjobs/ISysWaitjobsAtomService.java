package com.x.common.service.atom.waitjobs;

import com.x.common.dao.mapper.bo.SysWaitjobs;

public interface ISysWaitjobsAtomService {
	
	public String insertWaitjobs(SysWaitjobs waitjobs);
	
	public int completeWaitjobs(String id, String tenantId);
}

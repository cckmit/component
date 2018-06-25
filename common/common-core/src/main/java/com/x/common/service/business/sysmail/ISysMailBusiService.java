package com.x.common.service.business.sysmail;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysmail.param.SysMailInfo;
import com.x.common.api.sysmail.param.SysMailRequest;

public interface ISysMailBusiService {

	PageInfo<SysMailInfo> getSysMailPageList(SysMailRequest request);
	
	int updateSysMail(SysMailRequest request);
	
	int deleteSysMail(SysMailRequest request);
	
	int count(SysMailRequest request);
}

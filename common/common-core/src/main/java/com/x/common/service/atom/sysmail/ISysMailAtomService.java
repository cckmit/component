package com.x.common.service.atom.sysmail;

import java.util.List;

import com.x.common.api.sysmail.param.SysMailRequest;
import com.x.common.dao.mapper.bo.SysMail;

/**
 * 
 * @author auth
 *
 */
public interface ISysMailAtomService {

	int count(SysMailRequest request);
	
	List<SysMail> getSysMailPageList(SysMailRequest request);
	
	int updateSysMail(SysMail record);
	
	int deleteSysMail(SysMailRequest request);
}

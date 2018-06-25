package com.x.common.service.atom.sysuser;

import java.util.List;

import com.x.common.dao.mapper.bo.SysUser;

public interface ISysUserAtomSV {
	SysUser queryUser(SysUser user);

	String queryUserTheme(String id,String tenantId);
	
	List<SysUser> selectSysUserByOfficeId( String tenantId,String officeId);
}

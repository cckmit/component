package com.x.common.service.business.sysuser;

import com.x.common.api.sysuser.param.SysUserListQueryRequest;
import com.x.common.api.sysuser.param.SysUserListQueryResponse;
import com.x.common.api.sysuser.param.SysUserQueryRequest;
import com.x.common.api.sysuser.param.SysUserQueryResponse;
import com.x.common.api.sysuser.param.SysUserThemeRequest;
import com.x.common.api.sysuser.param.SysUserThemeResponse;


public interface ISysUserBusiSV {
	
	SysUserQueryResponse queryUser(SysUserQueryRequest request);
	
	
	SysUserThemeResponse queryUserTheme(SysUserThemeRequest requst);
	
	SysUserListQueryResponse queryUserByOfficeId(SysUserListQueryRequest request);
}

package com.x.common.service.business.menu;

import com.x.common.api.menu.param.SysMenuListQueryRequest;
import com.x.common.api.menu.param.SysMenuListQueryResponse;

public interface ISysMenuBusinessService {
	SysMenuListQueryResponse queryMenuByUserId(SysMenuListQueryRequest request);

}

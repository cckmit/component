package com.x.common.api.sysadvertmanager.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author auth
 * @date 2017年6月3日 
 * @version V1.0
 */
public class QuerySysAdvertListRes extends BaseResponse{

	private static final long serialVersionUID = -4982972484450590587L;
	
	private List<SaveSysAdvertManager> advertmanagerlists;

	public List<SaveSysAdvertManager> getAdvertmanagerlists() {
		return advertmanagerlists;
	}

	public void setAdvertmanagerlists(List<SaveSysAdvertManager> advertmanagerlists) {
		this.advertmanagerlists = advertmanagerlists;
	}

}

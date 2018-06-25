package com.x.common.api.sysduad.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 列表查询返回参数
 * @author auth
 * @date 2016年11月1日 下午3:14:00 
 * @version V1.0
 */
public class QuerySysDuadListRes extends BaseResponse {

	private static final long serialVersionUID = -1937810117232011430L;
	
	private List<SysDuadVo> duads;

	public List<SysDuadVo> getDuads() {
		return duads;
	}

	public void setDuads(List<SysDuadVo> duads) {
		this.duads = duads;
	}
	
	

}

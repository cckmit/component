package com.x.common.api.syspurpose.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author auth
 * @date 2016年11月1日 下午2:37:26 
 * @version V1.0
 */
public class QuerySysPurposeListRes extends BaseResponse{

	private static final long serialVersionUID = -4982972484450590587L;
	
	private List<SysPurposeVo> purposes;

	public List<SysPurposeVo> getPurposes() {
		return purposes;
	}

	public void setPurposes(List<SysPurposeVo> purposes) {
		this.purposes = purposes;
	}
	
	

}

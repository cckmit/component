package com.x.common.api.syssensitive.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author auth
 * @date 2017年6月3日 
 * @version V1.0
 */
public class QuerySysSensitiveListRes extends BaseResponse{

	private static final long serialVersionUID = -4982972484450590587L;
	
	private List<SensitivePageVo> sensitiveVo;

	public List<SensitivePageVo> getSensitiveVo() {
		return sensitiveVo;
	}

	public void setSensitiveVo(List<SensitivePageVo> sensitiveVo) {
		this.sensitiveVo = sensitiveVo;
	}
}

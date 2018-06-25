package com.x.common.api.sysseomanager.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

/**
 * @Description: 查询返回结果
 * @author auth
 * @date 2017年6月3日 
 * @version V1.0
 */
public class QuerySysSeoManagerListRes extends BaseResponse{

	private static final long serialVersionUID = -4982972484450590587L;
	
	private List<SeoManagerPageVo> seomanagerPages;

	public List<SeoManagerPageVo> getSeomanagerPages() {
		return seomanagerPages;
	}

	public void setSeomanagerPages(List<SeoManagerPageVo> seomanagerPages) {
		this.seomanagerPages = seomanagerPages;
	}
}

package com.x.common.api.sysseomanager.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class SeoManagerPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<SeoManagerPageVo> pageInfo;

	public PageInfo<SeoManagerPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<SeoManagerPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

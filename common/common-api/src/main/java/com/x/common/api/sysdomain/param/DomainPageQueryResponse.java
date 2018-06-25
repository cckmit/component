package com.x.common.api.sysdomain.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class DomainPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<DomainPageVo> pageInfo;

	public PageInfo<DomainPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<DomainPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

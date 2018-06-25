package com.x.common.api.sysduad.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class DuadPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<DuadPageVo> pageInfo;

	public PageInfo<DuadPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<DuadPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

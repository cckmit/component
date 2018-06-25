package com.x.common.api.syspurpose.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class PurposePageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<PurposePageVo> pageInfo;

	public PageInfo<PurposePageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<PurposePageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

package com.x.common.api.syssensitive.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class SensitivePageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<SensitivePageVo> pageInfo;

	public PageInfo<SensitivePageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<SensitivePageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}

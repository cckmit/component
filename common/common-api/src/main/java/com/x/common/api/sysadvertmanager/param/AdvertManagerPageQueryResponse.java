package com.x.common.api.sysadvertmanager.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class AdvertManagerPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<AdvertManagerPageVo> pageInfo;

	public PageInfo<AdvertManagerPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<AdvertManagerPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

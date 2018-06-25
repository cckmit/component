package com.x.common.api.sysaddresseelist.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class AddresseeListPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<AddresseeListPageVo> pageInfo;

	public PageInfo<AddresseeListPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<AddresseeListPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

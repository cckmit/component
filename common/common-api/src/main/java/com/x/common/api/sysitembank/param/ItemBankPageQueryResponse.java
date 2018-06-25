package com.x.common.api.sysitembank.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class ItemBankPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<ItemBankPageVo> pageInfo;

	public PageInfo<ItemBankPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<ItemBankPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

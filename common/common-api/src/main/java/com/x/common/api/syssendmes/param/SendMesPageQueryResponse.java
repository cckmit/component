package com.x.common.api.syssendmes.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class SendMesPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<SendMesPageVo> pageInfo;

	public PageInfo<SendMesPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<SendMesPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
	
}

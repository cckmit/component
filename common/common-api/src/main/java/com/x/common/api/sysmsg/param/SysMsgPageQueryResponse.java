package com.x.common.api.sysmsg.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;

public class SysMsgPageQueryResponse extends BaseResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 分页时必填
     */
    PageInfo<SysMsgPageVo> pageInfo;
    
    
	public PageInfo<SysMsgPageVo> getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo<SysMsgPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
    
    


}

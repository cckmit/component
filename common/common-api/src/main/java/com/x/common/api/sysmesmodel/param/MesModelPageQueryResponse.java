package com.x.common.api.sysmesmodel.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class MesModelPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<MesModelPageVo> pageInfo;

	public PageInfo<MesModelPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<MesModelPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}
}

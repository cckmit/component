package com.x.common.api.sysquestions.param;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
/**
 *	查询返回结果分页 
 * @author auth
 */
public class QuestionsPageQueryResponse extends BaseResponse {
	private static final long serialVersionUID = 1L;
	
	/**
     * 分页时必填
     */
    PageInfo<QuestionsPageVo> pageInfo;

	public PageInfo<QuestionsPageVo> getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo<QuestionsPageVo> pageInfo) {
		this.pageInfo = pageInfo;
	}

}

package com.x.centra.dst.api.discountlevel.param;

import com.x.base.vo.BaseInfo;

public class DstDisCountLevelListRequest extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -521582909093869082L;

	/**
	 * 当前第几页,必填
	 */
	private Integer pageNo;

	/**
	 * 每页数据条数,必填
	 */
	private Integer pageSize;

	/**
	 * 请求条件
	 */
	private DstDiscountLevelVO dstDiscountLevelVO;

	public DstDiscountLevelVO getDstDiscountLevelVO() {
		return dstDiscountLevelVO;
	}

	public void setDstDiscountLevelVO(DstDiscountLevelVO dstDiscountLevelVO) {
		this.dstDiscountLevelVO = dstDiscountLevelVO;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}

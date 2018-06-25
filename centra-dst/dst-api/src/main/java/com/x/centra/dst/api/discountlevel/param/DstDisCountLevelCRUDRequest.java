package com.x.centra.dst.api.discountlevel.param;

import java.util.List;

import com.x.base.vo.BaseInfo;

public class DstDisCountLevelCRUDRequest extends BaseInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 保存对象
	 */
	private DstDiscountLevelVO dstDiscountLevelVO;

	/**
	 * 绑定的权益
	 */
	private List<DstDiscountInfoVO> dstDiscountInfoVOs;

	public DstDiscountLevelVO getDstDiscountLevelVO() {
		return dstDiscountLevelVO;
	}

	public void setDstDiscountLevelVO(DstDiscountLevelVO dstDiscountLevelVO) {
		this.dstDiscountLevelVO = dstDiscountLevelVO;
	}

	public List<DstDiscountInfoVO> getDstDiscountInfoVOs() {
		return dstDiscountInfoVOs;
	}

	public void setDstDiscountInfoVOs(List<DstDiscountInfoVO> dstDiscountInfoVOs) {
		this.dstDiscountInfoVOs = dstDiscountInfoVOs;
	}

}

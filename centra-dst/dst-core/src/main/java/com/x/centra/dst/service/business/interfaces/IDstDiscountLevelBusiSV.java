package com.x.centra.dst.service.business.interfaces;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.PageInfo;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelCRUDRequest;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelCRUDResponse;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListRequest;
import com.x.centra.dst.api.discountlevel.param.DstDiscountLevelVO;

public interface IDstDiscountLevelBusiSV {
	public PageInfo<DstDiscountLevelVO> queryDstDiscountLevel(DstDisCountLevelListRequest request)
			throws BusinessException, SystemException;

	public DstDisCountLevelCRUDResponse addDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException;

	public DstDisCountLevelCRUDResponse updateDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException;

	public DstDisCountLevelCRUDResponse deleteDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException;

	public DstDisCountLevelCRUDResponse queryDstDiscountLevelDetail(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException;

}

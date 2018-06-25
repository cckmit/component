package com.x.centra.dst.api.discountlevel.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.centra.dst.api.discountlevel.interfaces.IDstDiscountLevelSV;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelCRUDRequest;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelCRUDResponse;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListRequest;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListResponse;
import com.x.centra.dst.api.discountlevel.param.DstDiscountLevelVO;
import com.x.centra.dst.service.business.interfaces.IDstDiscountLevelBusiSV;
import com.x.sdk.constant.ExceptCodeConstants;

@Service
@Component
public class DstDiscountLevelSVImpl implements IDstDiscountLevelSV {
	@Autowired
	private IDstDiscountLevelBusiSV iDstDiscountLevelBusiSV;

	@Override
	public DstDisCountLevelListResponse queryDstDiscountLevel(DstDisCountLevelListRequest request)
			throws BusinessException, SystemException {
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstants.Special.SUCCESS, "成功");
		DstDisCountLevelListResponse rep = new DstDisCountLevelListResponse();
		PageInfo<DstDiscountLevelVO> pages = iDstDiscountLevelBusiSV.queryDstDiscountLevel(request);
		rep.setPages(pages);
		rep.setResponseHeader(responseHeader);
		return rep;
	}

	@Override
	public DstDisCountLevelCRUDResponse addDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException {

		return iDstDiscountLevelBusiSV.addDstDiscountLevel(request);
	}

	@Override
	public DstDisCountLevelCRUDResponse updateDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException {
		return iDstDiscountLevelBusiSV.updateDstDiscountLevel(request);
	}

	@Override
	public DstDisCountLevelCRUDResponse deleteDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException {
		return iDstDiscountLevelBusiSV.deleteDstDiscountLevel(request);
	}

	@Override
	public DstDisCountLevelCRUDResponse queryDstDiscountLevelDetail(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException {
		return iDstDiscountLevelBusiSV.queryDstDiscountLevelDetail(request);
	}

}

package com.x.centra.dst.service.business.interfaces;

import com.x.centra.dst.api.discount.param.CustDiscountClassQueryParam;
import com.x.centra.dst.api.discount.param.CustDiscountParam;
import com.x.centra.dst.api.discount.param.CustDiscountQueryParam;
import com.x.centra.dst.api.discount.param.CustDiscountQueryResponse;
import com.x.centra.dst.api.discount.param.CustDiscountResponse;
import com.x.centra.dst.api.discount.param.CustLevelInstanceQueryParam;
import com.x.centra.dst.api.discount.param.CustLevelInstanceResponseVo;
import com.x.centra.dst.api.discount.param.DiscountClassQueryResponse;

public interface ICustDiscountSVBusiSV {

//	public BaseResponse saveCustDiscountInfo(CustDiscountVo param);
//	
//	BaseResponse activeCustDiscount(DiscountActiveVo param);
	
	CustDiscountQueryResponse queryCustDiscountInfo(CustDiscountQueryParam discountQueryParam);
	CustLevelInstanceResponseVo queryCustLevelInstance(CustLevelInstanceQueryParam queryParam);
	DiscountClassQueryResponse queryCustDiscountClass(CustDiscountClassQueryParam queryParam);
	CustDiscountResponse queryCustDiscountInfoList(CustDiscountParam discountQueryParam);
}

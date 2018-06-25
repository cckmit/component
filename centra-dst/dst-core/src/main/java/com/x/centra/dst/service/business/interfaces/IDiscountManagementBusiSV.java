package com.x.centra.dst.service.business.interfaces;

import com.x.base.vo.BaseResponse;
import com.x.centra.dst.api.discount.param.BaseParamQueryVo;
import com.x.centra.dst.api.discount.param.BaseParamResponse;
import com.x.centra.dst.api.discount.param.DiscountClassQueryParam;
import com.x.centra.dst.api.discount.param.DiscountClassQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountClassVo;
import com.x.centra.dst.api.discount.param.DiscountDeleteParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountInfoVo;
import com.x.centra.dst.api.discount.param.DiscountVerifyVo;
import com.x.centra.dst.api.discount.param.ExistParamRequest;
import com.x.centra.dst.api.discount.param.ExistParamResponse;

/**
 * 	
 * @author wangluyang
 *
 */
public interface IDiscountManagementBusiSV {
	public int saveDiscountInfo(DiscountInfoVo param);
	public BaseResponse verifyDiscountInfo(DiscountVerifyVo param);
	public DiscountClassQueryResponse queryDiscountClass(DiscountClassQueryParam infoQueryParam);
	public DiscountInfoQueryResponse queryDiscountInfo(DiscountInfoQueryParam infoQueryParam);
	public BaseResponse deleteDiscountInfo(DiscountDeleteParam param);
	public BaseResponse saveDiscountClass(DiscountClassVo param);
	public ExistParamResponse existClassCode(ExistParamRequest param);
	public ExistParamResponse existDiscountCode(ExistParamRequest param);
	public ExistParamResponse existLevelCode(ExistParamRequest param);
	public BaseParamResponse queryBaseParam(BaseParamQueryVo param);
}

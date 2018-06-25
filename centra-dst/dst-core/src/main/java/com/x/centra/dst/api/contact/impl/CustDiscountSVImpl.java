package com.x.centra.dst.api.contact.impl;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.centra.dst.api.discount.param.CustLevelInstanceQueryParam;
import com.x.centra.dst.api.discount.param.CustLevelInstanceResponseVo;
import com.x.centra.dst.api.discount.param.DiscountClassQueryResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.GenericException;
import com.x.centra.dst.api.discount.interfaces.ICustDiscountSV;
import com.x.centra.dst.api.discount.param.CustDiscountClassQueryParam;
import com.x.centra.dst.api.discount.param.CustDiscountParam;
import com.x.centra.dst.api.discount.param.CustDiscountQueryParam;
import com.x.centra.dst.api.discount.param.CustDiscountQueryResponse;
import com.x.centra.dst.api.discount.param.CustDiscountResponse;
import com.x.centra.dst.constants.ExceptCodeConstants;
import com.x.centra.dst.service.business.interfaces.ICustDiscountSVBusiSV;

@Service
@Component
public class CustDiscountSVImpl implements ICustDiscountSV {

	private static final Logger LOG = LogManager.getLogger(CustDiscountSVImpl.class);
	
	@Autowired
	private ICustDiscountSVBusiSV custDiscountSVBusiSV;
	
	@Override
	public CustDiscountQueryResponse queryCustDiscountInfo(CustDiscountQueryParam discountQueryParam)
			throws GenericException {
		// TODO Auto-generated method stub
		if(discountQueryParam==null){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "新增参数不能为空");
		}
		if(StringUtils.isBlank(discountQueryParam.getTenantId())){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "租户Id不能为空");
		}
		
		return custDiscountSVBusiSV.queryCustDiscountInfo(discountQueryParam);
	}

	@Override
	public CustLevelInstanceResponseVo queryCustLevelInstance(CustLevelInstanceQueryParam queryParam) throws BusinessException, SystemException {
		if(queryParam==null){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "新增参数不能为空");
		}
		if(StringUtils.isBlank(queryParam.getTenantId())){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
		}
		if(StringUtils.isBlank(queryParam.getInstanceId())){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "InstanceId不能为空");
		}

		return custDiscountSVBusiSV.queryCustLevelInstance(queryParam);
	}

	@Override
	public DiscountClassQueryResponse queryCustDiscountClass(CustDiscountClassQueryParam queryParam)
			throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(queryParam==null){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "新增参数不能为空");
		}
		if(StringUtils.isBlank(queryParam.getTenantId())){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
		}
		if(StringUtils.isBlank(queryParam.getCustId())){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "客户id不能为空");
		}
		return custDiscountSVBusiSV.queryCustDiscountClass(queryParam);
	}

	@Override
	public CustDiscountResponse queryCustDiscountInfoList(CustDiscountParam discountQueryParam)
			throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(discountQueryParam==null){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "新增参数不能为空");
		}
		if(StringUtils.isBlank(discountQueryParam.getTenantId())){
			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "租户Id不能为空");
		}
//		if(!StringUtils.isBlank(discountQueryParam.getClassCode()) && StringUtils.isBlank(discountQueryParam.getCustId())) {
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "classCode不为空时客户id必填");
//		}
		return custDiscountSVBusiSV.queryCustDiscountInfoList(discountQueryParam);
	}

//	private void validateParam(CustDiscountVo param){
//		if(param==null){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "新增参数不能为空");
//		}
//		if(StringUtils.isBlank(param.getTenantId())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "租户Id不能为空");
//		}
//		if(StringUtils.isBlank(param.getCustId())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "客户id不能为空");
//		}
//		if(StringUtils.isBlank(param.getDiscountId())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益活动id不能为空");
//		}
//		if(StringUtils.isBlank(param.getDiscountCode())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益活动编码不能为空");
//		}
//		if(StringUtils.isBlank(param.getDiscountPayFee())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "购买金额不能为空");
//		}
//		if(param.getDiscountPayDate() == null){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "购买时间不能为空");
//		}
//		if(param.getEffectiveDate() == null){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益生效日期不能为空");
//		}
//		if(param.getExpirationDate() == null){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益失效日期不能为空");
//		}
//		
//		if(param.getInfoInstanceVo()==null){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益信息不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getCustId())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "客户id不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getDiscountId())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益活动id不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getEffectiveTime())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益有效时长不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getEffectiveUnit())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "有效时长单位不能为空");
//		}
//		if(param.getInfoInstanceVo().getStartDate() == null){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益活动开始时间不能为空");
//		}
//		if(param.getInfoInstanceVo().getEndDate() == null){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益活动结束时间不能为空");
//		}
//		
//		if(param.getInfoInstanceVo().getRuleInstanceVo()==null){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益规则实体类不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getRuleInstanceVo().getDiscountType())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益规则客户id不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getRuleInstanceVo().getPrice())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "价格不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getRuleInstanceVo().getPriceUnitCode())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "价格单位编码不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getRuleInstanceVo().getPriceUnitName())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "价格单位名称不能为空");
//		}
//		
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getRuleInstanceVo().getPolicyUnitCode())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益活动id不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getRuleInstanceVo().getPolicyUnitName())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "权益有效时长不能为空");
//		}
//		if(StringUtils.isBlank(param.getInfoInstanceVo().getRuleInstanceVo().getPolicyTypeCode())){
//			throw new GenericException(ExceptCodeConstants.PARAM_IS_NULL, "有效时长单位不能为空");
//		}
//	
//	}
	
}

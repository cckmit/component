package com.x.centra.dst.api.contact.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.centra.dst.api.discount.interfaces.IDiscountManagementSV;
import com.x.centra.dst.api.discount.param.BaseParamQueryVo;
import com.x.centra.dst.api.discount.param.BaseParamResponse;
import com.x.centra.dst.api.discount.param.DiscountClassQueryParam;
import com.x.centra.dst.api.discount.param.DiscountClassQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountClassVo;
import com.x.centra.dst.api.discount.param.DiscountDeleteParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountInfoVo;
import com.x.centra.dst.api.discount.param.DiscountOwnerLimitVo;
import com.x.centra.dst.api.discount.param.DiscountVerifyVo;
import com.x.centra.dst.api.discount.param.ExistParamRequest;
import com.x.centra.dst.api.discount.param.ExistParamResponse;
import com.x.centra.dst.constants.ExceptCodeConstants;
import com.x.centra.dst.service.business.interfaces.IDiscountManagementBusiSV;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

@Service
@Component
public class DiscountManagementSVImpl implements IDiscountManagementSV {

	private static final Logger LOG = LogManager.getLogger(IDiscountManagementSV.class);
	
	@Autowired
	private IDiscountManagementBusiSV discountManagementBusiSV;
	
	@Override
	public BaseResponse saveDiscountInfo(DiscountInfoVo param) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		LOG.info("权限新增开始");
		if(param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
	    if(StringUtil.isBlank(param.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
	    if(StringUtil.isBlank(param.getDiscountName())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "权益名称不能为空");
	    }
	    if(StringUtil.isBlank(param.getClassCode())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "权益所属分类不能为空");
	    }
	    if(StringUtil.isBlank(param.getDiscountType())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "权益类型不能为空");
	    }
	    if(StringUtil.isBlank(param.getDiscountCode())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "权益编码不能为空");
	    }
	    if(StringUtil.isBlank(param.getEffectiveTime())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "权益有效时长不能为空");
	    }
	    if(StringUtil.isBlank(param.getEffectiveUnit())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "有效时长单位不能为空");
	    }
	    if(param.getLevelVo()!=null) {
	    		if(StringUtil.isBlank(param.getLevelVo().getLevelCode())) {
	    			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "权益级别编码不能为空");
	    		}
	    		if(StringUtil.isBlank(param.getLevelVo().getRelStatus())) {
	    			throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "关系状态不能为空");
	    		}
	    }
	    if(!CollectionUtil.isEmpty(param.getLimitVos())) {
	    		for(DiscountOwnerLimitVo vo : param.getLimitVos()) {
	    			if(StringUtil.isBlank(vo.getOwnerCode())) {
	    				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "主体编码不能为空");
	    			}
	    			if(StringUtil.isBlank(vo.getLimitStatus())) {
	    				throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "限定状态不能为空");
	    			}
	    		}
	    }
	    
	    discountManagementBusiSV.saveDiscountInfo(param);
		return new BaseResponse();
	}

	@Override
	public BaseResponse verifyDiscountInfo(DiscountVerifyVo param) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
	    if(StringUtil.isBlank(param.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
	    if(StringUtil.isBlank(param.getDiscountId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "权益ID不能为空");
	    }
	    if(StringUtil.isBlank(param.getVerifyState())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "认证状态不能为空");
	    }
		
		return discountManagementBusiSV.verifyDiscountInfo(param);
	}

	@Override
	public DiscountInfoQueryResponse queryDiscountInfo(DiscountInfoQueryParam infoQueryParam) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(infoQueryParam == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
	    if(StringUtil.isBlank(infoQueryParam.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
		
		return discountManagementBusiSV.queryDiscountInfo(infoQueryParam);
	}

	@Override
	public BaseResponse deleteDiscountInfo(DiscountDeleteParam param) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
	    if(StringUtil.isBlank(param.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
	    if(StringUtil.isBlank(param.getDiscountCode())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "权益编码不能为空");
	    }
		return discountManagementBusiSV.deleteDiscountInfo(param);
	}

	@Override
	public BaseResponse saveDiscountClass(DiscountClassVo param) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
		if(StringUtil.isBlank(param.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
		if(StringUtil.isBlank(param.getClassName())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "分类名称不能为空");
	    }
		if(StringUtil.isBlank(param.getClassCode())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "分类编码不能为空");
	    }
		
		return discountManagementBusiSV.saveDiscountClass(param);
	}

	@Override
	public DiscountClassQueryResponse queryDiscountClass(DiscountClassQueryParam infoQueryParam) 
			throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(infoQueryParam == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
		if(StringUtil.isBlank(infoQueryParam.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
		
		return discountManagementBusiSV.queryDiscountClass(infoQueryParam);
	}

	@Override
	public ExistParamResponse existClassCode(ExistParamRequest param) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
		if(StringUtil.isBlank(param.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
		if(StringUtil.isBlank(param.getParamCode())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "编码不能为空");
	    }
		return discountManagementBusiSV.existClassCode(param);
	}

	@Override
	public ExistParamResponse existDiscountCode(ExistParamRequest param) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
		if(StringUtil.isBlank(param.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
		if(StringUtil.isBlank(param.getParamCode())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "编码不能为空");
	    }
		return discountManagementBusiSV.existDiscountCode(param);
	}

	@Override
	public ExistParamResponse existLevelCode(ExistParamRequest param) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
		if(StringUtil.isBlank(param.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
		if(StringUtil.isBlank(param.getParamCode())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "编码不能为空");
	    }
		return discountManagementBusiSV.existLevelCode(param);
	}

	@Override
	public BaseParamResponse queryBaseParam(BaseParamQueryVo param) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		if(param == null) {
            throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "请求参数不能为空");
	    }
		if(StringUtil.isBlank(param.getTenantId())) {
	        throw new BusinessException(ExceptCodeConstants.PARAM_IS_NULL, "租户ID不能为空");
	    }
		return discountManagementBusiSV.queryBaseParam(param);
	}

}

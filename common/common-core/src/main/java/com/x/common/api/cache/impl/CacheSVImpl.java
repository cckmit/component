package com.x.common.api.cache.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.cache.interfaces.ICacheSV;
import com.x.common.api.cache.param.Area;
import com.x.common.api.cache.param.PhoneCond;
import com.x.common.api.cache.param.ServiceNumCache;
import com.x.common.api.cache.param.SysParam;
import com.x.common.api.cache.param.SysParamMultiCond;
import com.x.common.api.cache.param.SysParamSingleCond;
import com.x.common.api.servicenum.param.ServiceNum;
import com.x.common.constants.Constants;
import com.x.common.util.AreaCacheUtil;
import com.x.common.util.ServiceNumCacheUtil;
import com.x.common.util.SysParamUtil;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

@Service
@Component
public class CacheSVImpl implements ICacheSV {

	@Override
	public String getAreaName(String areaCode)
			throws BusinessException,SystemException {
        if (StringUtil.isBlank(areaCode)) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:区域编码不能为空");
        }
        
		return AreaCacheUtil.getAreaName( areaCode);
	}

	@Override
	public Area getArea(String areaCode)
			throws BusinessException,SystemException {
        if (StringUtil.isBlank(areaCode)) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:区域编码不能为空");
        }
        
        
		return AreaCacheUtil.getArea( areaCode);
	}

	@Override
	public List<SysParam> getSysParamList(SysParamMultiCond param) throws BusinessException, SystemException {
		if (param==null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:参数不能为空");
		}
		String tenantId=param.getTenantId();
		String typeCode=param.getTypeCode();
		String paramCode=param.getParamCode();
		
		if (StringUtil.isBlank(tenantId)) {
	            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (StringUtil.isBlank(typeCode)) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:参数类型不能为空");
        }
        if (StringUtil.isBlank(paramCode)) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:参数编码不能为空");
        }
        
        List<SysParam> listParam=SysParamUtil.getSysParams(tenantId, typeCode, paramCode);
        if(CollectionUtil.isEmpty(listParam)){
        	listParam=SysParamUtil.getSysParams(Constants.TenantId.ALL_TENANT, typeCode, paramCode);
        }
        return listParam;
	}

	@Override
	public SysParam getSysParamSingle(SysParamSingleCond param) throws BusinessException, SystemException {
		if (param==null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:参数不能为空");
		}
		String tenantId=param.getTenantId();
		String typeCode=param.getTypeCode();
		String paramCode=param.getParamCode(); 
		String columnValue=param.getColumnValue(); 
		if (StringUtil.isBlank(tenantId)) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (StringUtil.isBlank(typeCode)) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:参数类型不能为空");
        }
        if (StringUtil.isBlank(paramCode)) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:参数编码不能为空");
        }
        if (StringUtil.isBlank(columnValue)) {
            //throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:参数取值不能为空");
        	columnValue="";
        }
        
        SysParam sysParam=SysParamUtil.getSysParam(tenantId, typeCode, paramCode, columnValue);
        if(sysParam==null){
        	sysParam=SysParamUtil.getSysParam(Constants.TenantId.ALL_TENANT, typeCode, paramCode, columnValue);
        }
        
        return sysParam;
	}

	@Override
	public ServiceNumCache getServiceNum(PhoneCond cond) throws BusinessException, SystemException {
		if(cond!=null && !StringUtil.isBlank(cond.getPhone())){
			ServiceNum serviceNum=ServiceNumCacheUtil.getServiceNum(cond.getPhone());
			ServiceNumCache cache=null;
			if(serviceNum!=null){
				cache=new ServiceNumCache();
				BeanUtils.copyProperties(cache, serviceNum);
			}
			return cache;
		}
		else{
			return null;
		}
		
	}


}

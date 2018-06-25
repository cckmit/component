package com.x.common.util;

import java.util.List;

import org.springframework.util.StringUtils;

import com.x.base.exception.BusinessException;
import com.x.common.api.area.param.AreaLevel;
import com.x.common.api.area.param.GnAreaCodeCondition;
import com.x.common.api.area.param.GnAreaCondition;
import com.x.common.api.area.param.GnAreaPageCondition;
import com.x.common.api.area.param.GnAreaPageFilterCondition;
import com.x.common.api.area.param.GnAreaVo;
import com.x.common.api.servicenum.param.ServicePhoneCond;
import com.x.common.api.syscontentmanagement.param.ContentSubmitRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeSaveRequest;
import com.x.common.api.sysmailinformation.param.MailInformationRequest;
import com.x.common.api.sysorderinvoice.param.InvoiceBillMailRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceApplyRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceInspectRequest;
import com.x.common.api.sysorderinvoice.param.OrderInvoiceQueryRequest;
import com.x.common.api.systitle.param.TitleSubmitRequest;
import com.x.common.constants.Constants;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;


public final class VoValidateUtils {

    private VoValidateUtils() {
    }
   

	public static void validateGetParentAreaListByAreaCode(
			GnAreaCodeCondition condition) {
		if (condition==null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtils.isEmpty(condition.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtils.isEmpty(condition.getAreaCode())) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区域编码不能为空");
        }
	}

	public static void validateGetCityListByProviceCode(String provinceCode) {
		if (StringUtils.isEmpty(provinceCode)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "省份code不能为空");
		}
	}
	public static void validateGetCountyListByCityCode(String cityCode) {
		if (StringUtils.isEmpty(cityCode)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "地市code不能为空");
		}
	}
	public static void validateGetStreetListByCountyCode(String countyCode) {
		if (StringUtils.isEmpty(countyCode)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区县code不能为空");
		}
	}

	public static void validateGetAreaListByStreetCode(String tenantId,
			String streetCode) {
		if (StringUtils.isEmpty(tenantId)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtils.isEmpty(streetCode)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "街道code不能为空");
		}
		
	}
	public static void validateAddArea(GnAreaVo area){
		if(area==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtils.isEmpty(area.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtils.isEmpty(area.getAreaName())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区名称不能为空");
		}
		if (StringUtils.isEmpty(area.getProvinceCode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "省份编码不能为空");
		}
		if (StringUtils.isEmpty(area.getCityCode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "地市编码不能为空");
		}
		if (StringUtils.isEmpty(area.getAreaLevel())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区域级别不能为空");
		}
		if (!AreaLevel.AREA_LEVEL.getLevelValue().equals(area.getAreaLevel())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区级别必须为5");
		}
		
	}
	public static void validateModifyArea(GnAreaVo area){
		if(area==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtils.isEmpty(area.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtils.isEmpty(area.getAreaCode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区编码不能为空");
		}
		if (StringUtils.isEmpty(area.getAreaName())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区名称不能为空");
		}
		if (StringUtils.isEmpty(area.getProvinceCode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "省份编码不能为空");
		}
		if (StringUtils.isEmpty(area.getCityCode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "地市编码不能为空");
		}
		if (StringUtils.isEmpty(area.getAreaLevel())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区域级别不能为空");
		}
		if (!AreaLevel.AREA_LEVEL.getLevelValue().equals(area.getAreaLevel())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区级别必须为5");
		}
		
	}
	public static void validateDeleteArea(GnAreaCondition area){
		if(area==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtils.isEmpty(area.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtils.isEmpty(area.getAreaCode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区编码不能为空");
		}		
		if (StringUtils.isEmpty(area.getAreaLevel())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区域级别不能为空");
		}
		if (!AreaLevel.AREA_LEVEL.getLevelValue().equals(area.getAreaLevel().getLevelValue())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区级别必须为5");
		}
		
	}
	public static void validateGetAllAreaByLessThanLevel(GnAreaCondition area){
		if(area==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtils.isEmpty(area.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtils.isEmpty(area.getAreaLevel())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区域级别不能为空");
		}
	}
	public static void validateDeleteAreas(List<GnAreaCondition> areaList){
		if(areaList==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(!CollectionUtil.isEmpty(areaList)){
			for(GnAreaCondition area:areaList){
				if (StringUtils.isEmpty(area.getTenantId())) {
					throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
				}
				if (StringUtils.isEmpty(area.getAreaCode())) {
					throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区编码不能为空");
				}		
				if (StringUtils.isEmpty(area.getAreaLevel())) {
					throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区域级别不能为空");
				}
				if (!AreaLevel.AREA_LEVEL.getLevelValue().equals(area.getAreaLevel().getLevelValue())) {
					throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "小区级别必须为5");
				}				
			}
		}
		
	}
	
	public static void validateGetAreaListByPage(GnAreaPageCondition areaPage) {
		if(areaPage==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtils.isEmpty(areaPage.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (areaPage.getPageNo()<1) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageNo必须大于0");
		}
		if (areaPage.getPageSize()<1) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageSize必须大于0");
		}
		
	}

	public static void validateGetFilterAreaListByPage(GnAreaPageFilterCondition areaPage) {
		if(areaPage==null){
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtils.isEmpty(areaPage.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (areaPage.getPageNo()<1) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageNo必须大于0");
		}
		if (areaPage.getPageSize()<1) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageSize必须大于0");
		}
	}


	public static void validateGetServiceNumByIpPhone(String phone) {
		if (StringUtils.isEmpty(phone)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "手机号码不能为空");
		}
	}


	public static void validateGetIpAddrByIp(String ip) {
		if (StringUtils.isEmpty(ip)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "IP不能为空");
		}
		
	}


	public static void validateGetServiceNum(ServicePhoneCond cond) {
		
		if (null==cond) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtils.isEmpty(cond.getPhone())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "手机号码不能为空");
		}
	}
	
	/**
	 * 意见反馈列表查询参数校验 
	 */
	public static void validateSysFeedBakeQueryList(FeedBakeQueryRequest cond) {
		if (null==cond) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (cond.getPageNo()==null || (cond.getPageNo()!=null && cond.getPageNo()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageNo不能为空且必须大于0");
		}
		if (cond.getPageSize()==null || (cond.getPageSize()!=null && cond.getPageSize()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageSize不能为空且必须大于0");
		}
	}
	
	/**
	 * 意见反馈处理参数校验 
	 */
	public static void validateSysFeedBakeHandle(FeedBakeDetailQueryRequest cond) {
		if (null==cond) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(cond.getId())) {
			throw new BusinessException("意见反馈编号不能为空");
		}
		if(StringUtil.isBlank(cond.getHandlePerole())) {
			throw new BusinessException("处理人不能为空");
		}
		//
		if(!StringUtil.isBlank(cond.getRemarks()) && cond.getRemarks().length()>100) {
			throw new BusinessException("备注字数限制100字以内");
		}
	}
	
	
	/**
	 * 意见反馈处理参数校验 
	 */
	public static void validateSysFeedBakeInsert(FeedBakeSaveRequest cond) {
		if (null==cond) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(cond.getProductName())) {
			throw new BusinessException("反馈产品不能为空");
		}
		if(StringUtil.isBlank(cond.getFeedbakeSource())) {
			throw new BusinessException("反馈来源不能为空");
		}
		if(StringUtil.isBlank(cond.getProblemType())) {
			throw new BusinessException("问题类型不能为空");
		}
		if(StringUtil.isBlank(cond.getFeedbakeConten())) {
			throw new BusinessException("反馈内容不能为空");
		}else if(cond.getFeedbakeConten().length()>500){
			throw new BusinessException("反馈内容字数限制500字以内");
		}else if(cond.getFeedbakeConten().length()<10) {
			throw new BusinessException("反馈内容不得少于10字符");
		}
	}

	/**
	 * 发票管理列表参数校验
	 * @param cond
	 */
	public static void validateSysInvoiceQueryList(OrderInvoiceQueryRequest cond) {
		if (null==cond) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (cond.getPageNo()==null || (cond.getPageNo()!=null && cond.getPageNo()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageNo不能为空且必须大于0");
		}
		if (cond.getPageSize()==null || (cond.getPageSize()!=null && cond.getPageSize()<1)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageSize不能为空且必须大于0");
		}
	}
	
	/**
	 * 发票邮寄信息参数校验
	 * @param cond
	 */
	public static void validateSysMailInformationSave(MailInformationRequest cond) {
		if (null==cond) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(cond.getInvoiceTitle())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "发票抬头不能为空");
		}
	/*	if(StringUtil.isBlank(cond.getCountry())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "国家不能为空");
		}
		if(StringUtil.isBlank(cond.getProvince())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "省份不能为空");
		}
		if(StringUtil.isBlank(cond.getCnCity())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "市区不能为空");
		}*/
		if(StringUtil.isBlank(cond.getAddress())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "详细地址不能为空");
		}
		if(StringUtil.isBlank(cond.getPostcode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "邮编不能为空");
		}
		if(StringUtil.isBlank(cond.getRecipients())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "收件人不能为空");
		}
		if(StringUtil.isBlank(cond.getContactNumber())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "联系电话不能为空");
		}
		if(StringUtil.isBlank(cond.getUid())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "用户id不能为空");
		}
		//发票类型
		if(StringUtil.isBlank(cond.getInvoiceType())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "发票类型不能为空");
		}else {
			validateInvoiceType(cond);
		}
	}
	
	//增值税发票校验
	private static void validateInvoiceType(MailInformationRequest cond) {
		 if(Constants.InvoiceType.ADDED_TAX_INVOICE.equals(cond.getInvoiceType())) {
			 if(StringUtil.isBlank(cond.getTaxCertificateId())) {
					throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "税务登记证号不能为空");
			 }
			 if(StringUtil.isBlank(cond.getRegisteredPhone())) {
				 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "注册电话不能为空");
			 }
			 if(StringUtil.isBlank(cond.getRegisteredAddress())) {
				 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "注册地址不能为空");
			 }
			 if(StringUtil.isBlank(cond.getBankDeposit())) {
				 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "开户银行不能为空");
			 }
			 if(StringUtil.isBlank(cond.getBankAccount())) {
				 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "银行账号不能为空");
			 }
			 if(StringUtil.isBlank(cond.getTaxCertificateUploadId())) {
				 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "税务登记证记录号不能为空");
			 }
			 if(StringUtil.isBlank(cond.getTaxPageId())) {
				 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "税务登记条码页不能为空");
			 }
			 if(StringUtil.isBlank(cond.getTaxpayerIdentificationId())) {
				 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "一般纳税人认定书不能为空");
			 }
		 } 
	}
	
	/**
	 * 订单发票申请参数校验
	 * @param cond
	 */
	public static void validateSysInvoiceApply(OrderInvoiceApplyRequest cond) {
		if (null==cond) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(cond.getOrderNumber())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "订单号不能为空");
		}
		if(cond.getInvoiceAmount()<=0) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "发票金额须大于0");
		}
		if(StringUtil.isBlank(cond.getUsername())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "用户名不能为空");
		}
		if(StringUtil.isBlank(cond.getId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "邮寄信息Id不能为空");
		}
		if(StringUtil.isBlank(cond.getInvoiceContent())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "发票内容不能为空");
		}
	}
	
	/**
	 * 发票参数校验(审核,开票,邮寄)
	 * @param cond
	 */
	public static void validateSysInvoiceInspect(OrderInvoiceInspectRequest cond) {
		if (null==cond) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if(StringUtil.isBlank(cond.getRecipients())) {
			throw new BusinessException("收件人不能为空");
		}
		if(StringUtil.isBlank(cond.getContactNumber())) {
			throw new BusinessException("联系电话不能为空");
		}
		if(StringUtil.isBlank(cond.getAddress())) {
			throw new BusinessException("详细地址不能为空");
		}
		if(StringUtil.isBlank(cond.getInvoiceId())) {
			throw new BusinessException("订单发票id不能为空");
		}
		if(StringUtil.isBlank(cond.getState())) {
			throw new BusinessException("发票状态不能为空");
		}
		if(StringUtil.isBlank(cond.getInvoiceTitle())) {
			throw new BusinessException("发票抬头不能为空");
		}
		//发票类型
		validateInvoiceType(cond);
		if(Constants.InvoiceState.PENDING_BILLING.equals(cond.getState())) {
			if(StringUtil.isBlank(cond.getInvoiceNumber())) {
				throw new BusinessException("发票号不能为空");
			}
			if(StringUtil.isBlank(cond.getDrawer())) {
				throw new BusinessException("开票人不能为空");
			}
		}else if(Constants.InvoiceState.TO_POST.equals(cond.getState())) {
			if(StringUtil.isBlank(cond.getLogisticsCompany())) {
				throw new BusinessException("物流公司不能为空");
			}
			if(StringUtil.isBlank(cond.getLogisticsNumber())) {
				throw new BusinessException("物流单号不能为空");
			}
		}else if(Constants.InvoiceState.PENDING_AUDIT.equals(cond.getState())) {
			if(StringUtil.isBlank(cond.getAditor())) {
				throw new BusinessException("审核人为空");
			}
			if(StringUtil.isBlank(cond.getInspectSign())) {
				throw new BusinessException("审核是否通过标识不能为空");
			}else if (!(Constants.InspectSign.NOT_AUDITED.equals(cond.getInspectSign())||
					Constants.InspectSign.AUDITED.equals(cond.getInspectSign()))){
				throw new BusinessException("审核是否通过标识有误");
			}
		}
	}
	
	
		//增值税发票校验
		private static void validateInvoiceType(OrderInvoiceInspectRequest cond) {
			if(StringUtil.isBlank(cond.getInvoiceType())) {
				 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "发票类型不能为空");
			}else {
				 if(Constants.InvoiceType.ADDED_TAX_INVOICE.equals(cond.getInvoiceType())) {
					 if(StringUtil.isBlank(cond.getRegisteredPhone())) {
						 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "注册电话不能为空");
					 }
					 if(StringUtil.isBlank(cond.getRegisteredAddress())) {
						 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "注册地址不能为空");
					 }
					 if(StringUtil.isBlank(cond.getBankDeposit())) {
						 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "开户银行不能为空");
					 }
					 if(StringUtil.isBlank(cond.getBankAccount())) {
						 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "银行账号不能为空");
					 }
					 if(StringUtil.isBlank(cond.getTaxCertificateUploadId())) {
						 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "税务登记证记录号不能为空");
					 }
					 if(StringUtil.isBlank(cond.getTaxPageId())) {
						 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "税务登记条码页不能为空");
					 }
					 if(StringUtil.isBlank(cond.getTaxpayerIdentificationId())) {
						 throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "一般纳税人认定书不能为空");
					 }
				 } 
			}
		}
		
		/**
		 * 发票列表参数校验(开票,邮寄)
		 * @param cond
		 */
		public static void validateInvoiceBillMailRequest(InvoiceBillMailRequest cond) {
			if (null==cond) {
				throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
			}
			if(StringUtil.isBlank(cond.getInvoiceId())) {
				throw new BusinessException("订单发票id不能为空");
			}
			if(StringUtil.isBlank(cond.getState())) {
				throw new BusinessException("发票状态不能为空");
			}else {
				if(Constants.InvoiceState.PENDING_BILLING.equals(cond.getState())) {
					if(StringUtil.isBlank(cond.getInvoiceNumber())) {
						throw new BusinessException("发票号不能为空");
					}
					if(StringUtil.isBlank(cond.getDrawer())) {
						throw new BusinessException("开票人不能为空");
					}
				}else if(Constants.InvoiceState.TO_POST.equals(cond.getState())) {
					if(StringUtil.isBlank(cond.getLogisticsCompany())) {
						throw new BusinessException("物流公司不能为空");
					}
					if(StringUtil.isBlank(cond.getLogisticsNumber())) {
						throw new BusinessException("物流单号不能为空");
					}
				}else {
					throw new BusinessException("发票状态不符合...");
				}
			}
		}

		/**
		 * 一级标题校验
		 * @param cond
		 */
		public static void validateSysTitleRequest(TitleSubmitRequest cond) {
			if (null==cond) {
				throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
			}
			if(StringUtil.isBlank(cond.getTitle())) {
				throw new BusinessException("一级标题不能为空");
			}else {
				if(cond.getTitle().length()>8) {
					throw new BusinessException("一级标题建议在8个字以内");
				}
			}
			if(StringUtil.isBlank(cond.getRegionalLanguage())) {
				throw new BusinessException("地区语言不能为空");
			}
			if(StringUtil.isBlank(cond.getState())) {
				throw new BusinessException("状态不能为空");
			}
			if(StringUtil.isBlank(cond.getSite())) {
				throw new BusinessException("站点不能为空");
			}
			if(cond.getSort()<=0) {
				throw new BusinessException("排序必须大于0");
			}
			if(cond.getDescription().length()>500) {
				throw new BusinessException("描述字数不能大于500");
			}
		}

		/**
		 * 内容管理校验
		 * @param request
		 */
		public static void validateContentSubmitRequest(ContentSubmitRequest cond) {
			if (null==cond) {
				throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
			}
			if(StringUtil.isBlank(cond.getRegionalLanguage())) {
				throw new BusinessException("地区语言不能为空");
			}
			if(StringUtil.isBlank(cond.getTitleid())) {
				throw new BusinessException("一级标题ID不能为空");
			}
			if(StringUtil.isBlank(cond.getSubtititle())) {
				throw new BusinessException("二级标题不能为空");
			}else {
				if(cond.getSubtititle().length()>8) {
					throw new BusinessException("二级标题建议在8个字以内");
				}
			}
			if(StringUtil.isBlank(cond.getType())) {
				throw new BusinessException("类型不能为空");
			}
			if(StringUtil.isBlank(cond.getUrl())) {
				throw new BusinessException("url不能为空");
			}
			if(StringUtil.isBlank(cond.getState())) {
				throw new BusinessException("状态不能为空");
			}
			if(cond.getSort()<=0) {
				throw new BusinessException("排序必须大于0");
			}
		}
}

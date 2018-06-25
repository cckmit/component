package com.x.common.util;

import com.x.base.exception.BusinessException;
import com.x.base.vo.BaseInfo;
import com.x.common.api.menu.param.SysMenuListQueryRequest;
import com.x.common.api.office.param.OfficeChildrenListQueryRequest;
import com.x.common.api.office.param.OfficeDetailQueryRequest;
import com.x.common.api.office.param.OfficeParentListQueryRequest;
import com.x.common.api.sysuser.param.SysUserListQueryRequest;
import com.x.common.api.sysuser.param.SysUserQueryRequest;
import com.x.common.api.sysuser.param.SysUserThemeRequest;
import com.x.common.api.waitjobs.param.WaitjobsCompleteRequset;
import com.x.common.api.waitjobs.param.WaitjobsInsertRequest;
import com.x.common.api.waitjobs.param.WaitjobsVO;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.StringUtil;

public class SystemValidateUtil {
	private SystemValidateUtil() {
	}

	public static void validateQueryUserInfo(SysUserQueryRequest condition) {
		if (condition == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(condition.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtil.isBlank(condition.getNo()) && StringUtil.isBlank(condition.getPhone())
				&& StringUtil.isBlank(condition.getLoginName()) && StringUtil.isBlank(condition.getEmail())&& StringUtil.isBlank(condition.getId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "id、手机号、邮箱、工号、登录名至少有一个不可以为空");
		}
	}
	public static void validateQueryUserByOfficeId(SysUserListQueryRequest condition) {
		if (condition == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(condition.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtil.isBlank(condition.getOfficeId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "机构ID不能为空");
		}
	}
	//用户主题校验
	public static void validateQueryUserTheme(SysUserThemeRequest condition) {
		if (condition == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(condition.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtil.isBlank(condition.getId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "用户ID不能为空");
		}
	}
	public static void validateQueryOfficeDetail(OfficeDetailQueryRequest queryRequest) {
		if (queryRequest == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(queryRequest.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtil.isBlank(queryRequest.getId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "机构ID不能为空");
		}
	}
	
	public static void validateQueryParentOfficeList(OfficeParentListQueryRequest queryRequest) {
		if (queryRequest == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(queryRequest.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtil.isBlank(queryRequest.getId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "机构ID不能为空");
		}
	}
	
	public static void validateQueryChildrenOfficeList(OfficeChildrenListQueryRequest queryRequest) {
		if (queryRequest == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(queryRequest.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
		if (StringUtil.isBlank(queryRequest.getId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "机构ID不能为空");
		}
	}
	
	public static void validateQueryOfficeAll(BaseInfo queryRequest) {
		if (queryRequest == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(queryRequest.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户ID不能为空");
		}
	}
	
	public static void validateInsertWaitjobs(WaitjobsInsertRequest insertRequest) {
		if (insertRequest == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		WaitjobsVO waijobsVo = insertRequest.getWaitjobsVo();
		if (waijobsVo==null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "插入对象不能为空");
		}
		String systemId = waijobsVo.getSystemId();
		if (StringUtil.isBlank(systemId)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "systemId不能为空");
		}
		if (systemId.length()>32){
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "systemId长度大于32");
		}
		String tenantId = waijobsVo.getTenantId();
		if (StringUtil.isBlank(tenantId)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "tenantId不能为空");
		}
		if (tenantId.length()>64){
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "tenantId长度大于64");
		}
		String title = waijobsVo.getTitle();
		if (StringUtil.isBlank(title)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "title不能为空");
		}
		if (title.length()>128){
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "title长度大于128");
		}
		String userId = waijobsVo.getUserId();
		if (StringUtil.isBlank(userId)) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "userId不能为空");
		}
		if (userId.length()>64){
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "userId长度大于64");
		}
		String lastUser = waijobsVo.getLastUser();
		if (StringUtil.isBlank(lastUser)) {

			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "lastUser不能为空");
		}
		if (lastUser.length()>64){
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "lastUser长度大于64");
		}
		String presentActiviti = waijobsVo.getPresentActiviti();
		if (presentActiviti != null && presentActiviti.length() > 64){
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "presentActiviti长度大于64");
		}
		String url = waijobsVo.getUrl();
		if (url != null && url.length() > 128){
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "url长度大于128");
		}
	}
	
	public static void validateCompleteWaitjobs(WaitjobsCompleteRequset completeRequest) {
		if (completeRequest == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(completeRequest.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "tenantId不能为空");
		}
		if (StringUtil.isBlank(completeRequest.getId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "id不能为空");
		}
	}
	
	public static void validateCompleteSysMenu(SysMenuListQueryRequest completeRequest) {
		if (completeRequest == null) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "参数对象不能为空");
		}
		if (StringUtil.isBlank(completeRequest.getTenantId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "tenantId不能为空");
		}
		if (StringUtil.isBlank(completeRequest.getUserId())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "id不能为空");
		}
	}
}

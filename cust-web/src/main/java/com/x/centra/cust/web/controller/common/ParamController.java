package com.x.centra.cust.web.controller.common;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.x.centra.cust.web.model.sso.GeneralSSOClientUser;
import com.x.centra.dst.api.discount.interfaces.IDiscountManagementSV;
import com.x.centra.dst.api.discount.param.BaseParamQueryVo;
import com.x.centra.dst.api.discount.param.BaseParamResponse;
import com.x.centra.dst.api.discount.param.BaseParamVo;
import com.x.sdk.dubbo.util.DubboConsumerFactory;
import com.x.sso.client.filter.SSOClientConstants;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 数据库参数查询
 * @author wangluyang
 *
 */
@RestController
@RequestMapping("/param")
public class ParamController {

	private static final Logger LOGGER = Logger
			.getLogger(ParamController.class);
	
	
	/**
	 * 获得权益类型
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getDiscountType")
	public List<BaseParamVo> getStandardUnit(HttpServletRequest request,
			HttpServletResponse response) {
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		List<BaseParamVo> baseList = new ArrayList<BaseParamVo>();
		try {
			baseList = ParamController.getSysParams(
					user.getTenantId(), "DISCOUNT_TYPE");
		} catch (Exception e) {
			LOGGER.info("获取菜单失败", e);
		}
		return baseList;
	}
	
	/**
	 * 获得生效时长单位
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getEffectUnitCode")
	public List<BaseParamVo> getEffectUnitCode(HttpServletRequest request,
			HttpServletResponse response) {
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		List<BaseParamVo> baseList = new ArrayList<BaseParamVo>();
		try {
			baseList = ParamController.getSysParams(
					user.getTenantId(), "EFFECTIVE_UNIT_CODE");
		} catch (Exception e) {
			LOGGER.info("获取菜单失败", e);
		}
		return baseList;
	}
	
	/**
	 * 获得权益主体类型
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getDiscountOwnerLimitType")
	public List<BaseParamVo> getDiscountOwnerLimitType(HttpServletRequest request,
			HttpServletResponse response) {
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		List<BaseParamVo> baseList = new ArrayList<BaseParamVo>();
		try {
			baseList = ParamController.getSysParams(
					user.getTenantId(), "OWNER_LIMIT_TYPE");
		} catch (Exception e) {
			LOGGER.info("获取菜单失败", e);
		}
		return baseList;
	}
	
	/**
	 * 获取系统参数
	 * @param tenantId
	 * @param paramType
	 * @param tradeSeq
	 * @return
	 */
    public static List<BaseParamVo> getSysParams(String tenantId, String paramType) {
        
    	List<BaseParamVo> baseList = new ArrayList<BaseParamVo>();
    	try {
	    		IDiscountManagementSV discountManagementSV = DubboConsumerFactory.getService(IDiscountManagementSV.class);
	    		
			BaseParamQueryVo param = new BaseParamQueryVo();
			param.setTenantId(tenantId);
			param.setParamType(paramType);
			BaseParamResponse resultInfo = discountManagementSV.queryBaseParam(param);
	        if(resultInfo!=null){
	        		baseList = resultInfo.getParamVos();
	        }
    	} catch (Exception e) {
    		LOGGER.error("获取信息出错：", e);
		}
        return baseList;
    }

}

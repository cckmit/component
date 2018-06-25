package com.x.centra.cust.web.controller.discount;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.x.base.vo.PageInfo;
import com.x.centra.cust.web.controller.common.ParamController;
import com.x.centra.dst.api.discount.interfaces.ICustDiscountSV;
import com.x.centra.dst.api.discount.param.*;
import com.x.centra.dst.api.discountlevel.interfaces.IDstDiscountLevelSV;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListRequest;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListResponse;
import com.x.centra.dst.api.discountlevel.param.DstDiscountLevelVO;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.DateUtil;
import com.x.sdk.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfoResponse;
import com.x.base.vo.ResponseHeader;
import com.x.centra.cust.web.model.discount.DiscountInfoResVo;
import com.x.centra.cust.web.model.discount.DiscountInfoSaveVo;
import com.x.centra.cust.web.model.discount.DiscountOwnerLimitSaveVo;
import com.x.centra.cust.web.model.sso.GeneralSSOClientUser;
import com.x.centra.dst.api.discount.interfaces.IDiscountManagementSV;
import com.x.sdk.dubbo.util.DubboConsumerFactory;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.web.model.ResponseData;
import com.x.sso.client.filter.SSOClientConstants;

/**
 * 权益管理
 * @author wangluyang
 *
 */
@Controller
@RequestMapping("/discount")
public class DiscountController {

	private static final Logger LOG = LoggerFactory.getLogger(DiscountController.class);
	
	/**
	 * 进入页面
	 */
	@RequestMapping("/list")
	public String editQuery(Model uiModel) {
		return "discount/discountlist";
	}

	/**
	 * 客户激活权益查询
	 */
	@RequestMapping("/toCustDiscountList")
	public String queryCustDiscountList(Model uiModel) {
		return "discount/custdiscountlist";
	}

	/**
	 * 点击查询按钮调用方法-查询用户信息
	 * 
	 * @return
	 */
	@RequestMapping("/getDiscountList")
	@ResponseBody
	public ResponseData<PageInfoResponse<DiscountInfoResVo>> getDiscountList(HttpServletRequest request) {
		long queryStart = System.currentTimeMillis();
		LOG.info("====用户信息查询开始 start to in getCustomerList，当前时间戳：" + queryStart);
		IDiscountManagementSV discountManagementSV = DubboConsumerFactory.getService(IDiscountManagementSV.class);
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		
		DiscountClassQueryParam classQueryParam = new DiscountClassQueryParam();
		classQueryParam.setTenantId(user.getTenantId());
		DiscountClassQueryResponse classQueryResponse = discountManagementSV.queryDiscountClass(classQueryParam);
		Map<String, String> discountClassMap = new HashMap<>();
		if(classQueryResponse!=null && !CollectionUtil.isEmpty(classQueryResponse.getResponseVos())) {
			for(DiscountClassResponseVo responseVo : classQueryResponse.getResponseVos()) {
				discountClassMap.put(responseVo.getClassCode(), responseVo.getClassName());
			}
		}
		
		Map<String, String> discountTypeMap = new HashMap<>();
		BaseParamQueryVo param = new BaseParamQueryVo();
		param.setTenantId(user.getTenantId());
		param.setParamType("DISCOUNT_TYPE");
		BaseParamResponse resultInfo = discountManagementSV.queryBaseParam(param);
		if(resultInfo!=null && !CollectionUtil.isEmpty(resultInfo.getParamVos())) {
			for(BaseParamVo paramVo : resultInfo.getParamVos()) {
				discountTypeMap.put(paramVo.getParamCode(), paramVo.getParamName());
			}
		}
		
		ResponseData<PageInfoResponse<DiscountInfoResVo>> responseData = null;
		try {
			// 查询条件
			DiscountInfoQueryParam queryParam = new DiscountInfoQueryParam();
			queryBuilder(request, queryParam, user.getTenantId());

			queryStart = System.currentTimeMillis();
			LOG.info("开始执行权益信息查询，当前时间戳：" + queryStart);

			DiscountInfoQueryResponse result = discountManagementSV.queryDiscountInfo(queryParam);
			List<DiscountInfoResVo> responseVos = new ArrayList<DiscountInfoResVo>();

			for (int i = 0; i < result.getInfo().getResult().size(); i++) {
				DiscountInfoResVo infoResponseVo = new DiscountInfoResVo();
				BeanUtils.copyVO(infoResponseVo, result.getInfo().getResult().get(i));
				if(infoResponseVo.getCreateDate()!=null) {
					infoResponseVo.setCreateDateStr(DateUtil.getDateString(new Date(infoResponseVo.getCreateDate()), DateUtil.DATETIME_FORMAT));
				}
				if(!StringUtil.isBlank(result.getInfo().getResult().get(i).getClassCode())) {
					infoResponseVo.setClassName(discountClassMap.get(result.getInfo().getResult().get(i).getClassCode()));
				}
				if(!StringUtil.isBlank(result.getInfo().getResult().get(i).getDiscountType())) {
					infoResponseVo.setDiscountTypeName(discountTypeMap.get(result.getInfo().getResult().get(i).getDiscountType()));
				}
				responseVos.add(infoResponseVo);
			}

			PageInfoResponse<DiscountInfoResVo> custresponse = new PageInfoResponse<DiscountInfoResVo>();
			custresponse.setCount(result.getInfo().getCount());
			custresponse.setPageCount(result.getInfo().getPageCount());
			custresponse.setPageNo(result.getInfo().getPageNo());
			custresponse.setPageSize(result.getInfo().getPageSize());
			custresponse.setResponseHeader(result.getResponseHeader());
			custresponse.setResult(responseVos);

			responseData = new ResponseData<PageInfoResponse<DiscountInfoResVo>>(ResponseData.AJAX_STATUS_SUCCESS, "查询成功",
					custresponse);
		} catch (Exception e) {
			responseData = new ResponseData<PageInfoResponse<DiscountInfoResVo>>(ResponseData.AJAX_STATUS_FAILURE, "获取信息异常");
			LOG.error("获取信息出错：", e);
		}
		long finshEnd = System.currentTimeMillis();
		LOG.info("====用户查询结束 getCustomerList is finish，当前时间戳：" + finshEnd + ",用时:" + (finshEnd - queryStart) + "毫秒");
		return responseData;
	}
	
	/**
	 * 查询条件检查设置
	 */
	private void queryBuilder(HttpServletRequest request, DiscountInfoQueryParam custRequest,  String tenantId) {
		custRequest.setTenantId(tenantId);
		if (!StringUtil.isBlank(request.getParameter("discountId"))) {
			custRequest.setDiscountId(request.getParameter("discountId"));
		}
		if (!StringUtil.isBlank(request.getParameter("discountName"))) {
			custRequest.setDiscountName(request.getParameter("discountName"));
		}
		if (!StringUtil.isBlank(request.getParameter("discountCode"))) {
			custRequest.setDiscountCode(request.getParameter("discountCode"));
		}
		if (!StringUtil.isBlank(request.getParameter("discountType"))) {
			custRequest.setDiscountType(request.getParameter("discountType"));
		}
		if (!StringUtil.isBlank(request.getParameter("classCode"))) {
			custRequest.setClassCode(request.getParameter("classCode"));
		}
		if (!StringUtil.isBlank(request.getParameter("verifyState"))) {
			custRequest.setVerifyState(request.getParameter("verifyState"));
		}
		if (!StringUtil.isBlank(request.getParameter("pageNo"))) {
			custRequest.setPageNo(Integer.parseInt(request.getParameter("pageNo")));
		}
		if (!StringUtil.isBlank(request.getParameter("pageSize"))) {
			custRequest.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		}
	}

	/**
	 * 跳转到新增页面
	 *
	 * @param uiModel
	 * @return
	 */
	@RequestMapping("/add")
	public String addView(Model uiModel, HttpServletRequest request) {

		return "discount/add";
	}

	/**
	 * 跳转到修改页面
	 *
	 * @param uiModel
	 * @return
	 */
	@RequestMapping("/update/{discountCode}")
	public String update(@PathVariable("discountCode") String discountCode, Model uiModel, HttpServletRequest request) {
		IDiscountManagementSV discountManagementSV = DubboConsumerFactory.getService(IDiscountManagementSV.class);
		DiscountInfoQueryParam queryParam = new DiscountInfoQueryParam();
		queryParam.setPageNo(1);
		queryParam.setPageSize(10);
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		queryParam.setTenantId(user.getTenantId());
		if(!StringUtil.isBlank(discountCode)) {
			queryParam.setDiscountCode(discountCode);
		}
		DiscountInfoQueryResponse queryResponse = discountManagementSV.queryDiscountInfo(queryParam);
		if(queryResponse!=null && queryResponse.getInfo()!=null &&
				queryResponse.getInfo().getResult()!=null && queryResponse.getInfo().getResult().size()>0) {
			DiscountInfoResponseVo responseVo = queryResponse.getInfo().getResult().get(0);
			uiModel.addAttribute("responseVo", responseVo);
		}
		return "discount/add";
	}

	/**
	 * 跳转到查看页面
	 *
	 * @param uiModel
	 * @return
	 */
	@RequestMapping("/toView/{discountCode}")
	public String toView(@PathVariable("discountCode") String discountCode, Model uiModel, HttpServletRequest request) {
		IDiscountManagementSV discountManagementSV = DubboConsumerFactory.getService(IDiscountManagementSV.class);
		DiscountInfoQueryParam queryParam = new DiscountInfoQueryParam();
		queryParam.setPageNo(1);
		queryParam.setPageSize(10);
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		queryParam.setTenantId(user.getTenantId());
		if(!StringUtil.isBlank(discountCode)) {
			queryParam.setDiscountCode(discountCode);
		}
		DiscountInfoQueryResponse queryResponse = discountManagementSV.queryDiscountInfo(queryParam);
		if(queryResponse!=null && queryResponse.getInfo()!=null &&
				queryResponse.getInfo().getResult()!=null && queryResponse.getInfo().getResult().size()>0) {
			DiscountInfoResponseVo responseVo = queryResponse.getInfo().getResult().get(0);
			uiModel.addAttribute("responseVo", responseVo);
		}
		return "discount/view";
	}

	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@ResponseBody
	public ResponseData<String> saveDiscountInfo(String discountInfoStr, HttpServletRequest request,
			HttpSession session) {
		ResponseData<String> responseData = null;
		IDiscountManagementSV discountManagementSV = DubboConsumerFactory.getService(IDiscountManagementSV.class);

		if(StringUtil.isBlank(discountInfoStr)) {
			responseData = new ResponseData<String>(ResponseData.AJAX_STATUS_SUCCESS,
					"更新失败:入參不能为空");
		}else {
			
			DiscountInfoSaveVo discountInfoVo = JSONObject.parseObject(discountInfoStr, DiscountInfoSaveVo.class);
			DiscountInfoVo infoVo = new DiscountInfoVo();
			BeanUtils.copyVO(infoVo, discountInfoVo);
			GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
			infoVo.setTenantId(user.getTenantId());
			infoVo.setCreateDate(System.currentTimeMillis());
			infoVo.setCreateUserId(user.getUserId());
			if(discountInfoVo.getLevelVo()!=null) {
				DiscountLevelVo levelVo = new DiscountLevelVo();
				levelVo.setLevelCode(discountInfoVo.getLevelVo().getLevelCode());
				levelVo.setRelStatus(discountInfoVo.getLevelVo().getRelStatus());
				infoVo.setLevelVo(levelVo);
			}
			if(!CollectionUtil.isEmpty(discountInfoVo.getLimitVos())) {
				List<DiscountOwnerLimitVo> limitVos = new ArrayList<>();
				infoVo.setLimitVos(limitVos);
				for(DiscountOwnerLimitSaveVo limitSaveVo :discountInfoVo.getLimitVos()) {
					DiscountOwnerLimitVo limitVo = new DiscountOwnerLimitVo();
					limitVo.setOwnerCode(limitSaveVo.getOwnerCode());
					limitVo.setLimitStatus(limitSaveVo.getLimitStatus());
					limitVos.add(limitVo);
				}
				infoVo.setLimitVos(limitVos);
			}
			BaseResponse response = discountManagementSV.saveDiscountInfo(infoVo);
			if(response != null){
				ResponseHeader header = response.getResponseHeader();
				// 保存错误
				if (header != null && !header.isSuccess()) {
					responseData = new ResponseData<String>(ResponseData.AJAX_STATUS_FAILURE,
							"添加失败:" + header.getResultMessage());
					LOG.error("获取信息出错：", header.getResultMessage());
				}else{
					responseData = new ResponseData<String>(ResponseData.AJAX_STATUS_SUCCESS, "操作成功", "saaaa");
				}
			}
		}
		return responseData;
	}

	/**
	 * 删除权益信息
	 * @param discountCode
	 * @param request
	 * @return
	 */
	@RequestMapping("/deleteDiscount/{discountCode}")
	@ResponseBody
	public ResponseData<String> deleteDiscount(@PathVariable("discountCode") String discountCode, HttpServletRequest request ){
		IDiscountManagementSV discountManagementSV = DubboConsumerFactory.getService(IDiscountManagementSV.class);
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		DiscountDeleteParam deleteParam = new DiscountDeleteParam();
		deleteParam.setTenantId(user.getTenantId());
		deleteParam.setDiscountCode(discountCode);
		BaseResponse response = discountManagementSV.deleteDiscountInfo(deleteParam);
		if(response.getResponseHeader().isSuccess()){
			return new ResponseData<String>(ResponseData.AJAX_STATUS_SUCCESS, "操作成功");
		}else{
			LOG.error("获取信息出错：", response.getResponseHeader().getResultMessage());
			return new ResponseData<String>(ResponseData.AJAX_STATUS_FAILURE, response.getResponseHeader().getResultMessage());
		}
	}

	/**
	 * 点击查询按钮调用方法-客户激活权益
	 *
	 * @return
	 */
	@RequestMapping("/getCustDiscountList")
	@ResponseBody
	public ResponseData<PageInfoResponse<CustDiscountResponseVo>> getCustDiscountList(HttpServletRequest request) {
		long queryStart = System.currentTimeMillis();
		System.out.println("====客户激活权益查询开始 start to in getCustDiscountList");
		LOG.info("====客户激活权益查询开始 start to in getCustDiscountList，当前时间戳：" + queryStart);
		ICustDiscountSV custDiscountSV = DubboConsumerFactory.getService(ICustDiscountSV.class);
		ResponseData<PageInfoResponse<CustDiscountResponseVo>> responseData = null;
		try {
			GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
			String tenantId = user.getTenantId();
			// 查询条件
			CustDiscountQueryParam queryParam = new CustDiscountQueryParam();
			queryBuilder(request, queryParam);

			queryStart = System.currentTimeMillis();
			LOG.info("开始执行客户激活权益查询，当前时间戳：" + queryStart);

			CustDiscountQueryResponse result = custDiscountSV.queryCustDiscountInfo(queryParam);
			List<CustDiscountResponseVo> responseVos = new ArrayList<CustDiscountResponseVo>();

			for (int i = 0; i < result.getInfo().getResult().size(); i++) {
				CustDiscountResponseVo custDiscountResponseVo = result.getInfo().getResult().get(i);

				if (!StringUtil.isBlank(custDiscountResponseVo.getOwnerCode())){
					String owenCode = custDiscountResponseVo.getOwnerCode();
					//翻译owenCode
					String newOwenCode = translateOwenCode(owenCode,tenantId);
					if (!StringUtil.isBlank(newOwenCode)){
						custDiscountResponseVo.setOwnerCode(newOwenCode);
					}

				}

				//判断权益是否有效
                if(custDiscountResponseVo.getExpirationDate() != null && custDiscountResponseVo.getExpirationDate() != 0l){
                    Timestamp sysDate = DateUtil.getSysDate();
                    Timestamp expirationDate = DateUtil.getTimestamp(custDiscountResponseVo.getExpirationDate());
                    if (sysDate.compareTo(expirationDate)>0){
						custDiscountResponseVo.setActiveStatus("2");
					}else{
						custDiscountResponseVo.setActiveStatus("1");
					}
                }
				responseVos.add(custDiscountResponseVo);
			}

			PageInfoResponse<CustDiscountResponseVo> custresponse = new PageInfoResponse<CustDiscountResponseVo>();

			custresponse.setCount(result.getInfo().getCount());
			custresponse.setPageCount(result.getInfo().getPageCount());
			custresponse.setPageNo(result.getInfo().getPageNo());
			custresponse.setPageSize(result.getInfo().getPageSize());
			custresponse.setResponseHeader(result.getResponseHeader());
			custresponse.setResult(responseVos);

			responseData = new ResponseData<PageInfoResponse<CustDiscountResponseVo>>(ResponseData.AJAX_STATUS_SUCCESS, "查询成功",
					custresponse);
		} catch (Exception e) {
			responseData = new ResponseData<PageInfoResponse<CustDiscountResponseVo>>(ResponseData.AJAX_STATUS_FAILURE, "获取信息异常");
			LOG.error("获取信息出错：", e);
		}
		long finshEnd = System.currentTimeMillis();
		LOG.info("====客户激活权益查询结束 getCustDiscountList is finish，当前时间戳：" + finshEnd + ",用时:" + (finshEnd - queryStart) + "毫秒");
		return responseData;
	}

	/**
	 * 查询条件检查设置
	 */
	private void queryBuilder(HttpServletRequest request, CustDiscountQueryParam custRequest) {
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		custRequest.setTenantId(user.getTenantId());
		if (!StringUtil.isBlank(request.getParameter("custId"))) {
			custRequest.setCustId(request.getParameter("custId"));
		}
		if (!StringUtil.isBlank(request.getParameter("custName"))) {
			custRequest.setCustName(request.getParameter("custName"));
		}
		if (!StringUtil.isBlank(request.getParameter("ownerCode"))) {
			custRequest.setOwnerCode(request.getParameter("ownerCode"));
		}
		if (!StringUtil.isBlank(request.getParameter("ownerInstanceCode"))) {
			custRequest.setOwnerInstanceCode(request.getParameter("ownerInstanceCode"));
		}
        if (!StringUtil.isBlank(request.getParameter("discountCode"))) {
            custRequest.setDiscountCode(request.getParameter("discountCode"));
        }
        if (!StringUtil.isBlank(request.getParameter("discountName"))) {
            custRequest.setDiscountName(request.getParameter("discountName"));
        }
        //增加权益状态查询，如果前台传过来是1则查询有效权益，如果前台传过来是2怎查询无效权益
        if (!StringUtil.isBlank(request.getParameter("activeStatus"))){
            custRequest.setEffectiveStatus(request.getParameter("activeStatus"));
        }
		if (!StringUtil.isBlank(request.getParameter("pageNo"))) {
			custRequest.setPageNo(Integer.parseInt(request.getParameter("pageNo")));
		}
		if (!StringUtil.isBlank(request.getParameter("pageSize"))) {
			custRequest.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		}
	}

	/**
	 * 显示客户权益详情页面
	 *
	 * @param instanceId
	 * @return
	 */
	@RequestMapping("/{id}")
	public String custDiscountView(@PathVariable("id") String instanceId, Model uiModel, HttpServletRequest request) {
		// 标准品ID
        LOG.info("custDiscountView:instanceId:{}",instanceId);
		uiModel.addAttribute("instanceId", instanceId);
		// 根据instanceId查询客户权益实例
		ICustDiscountSV custDiscountSV = DubboConsumerFactory.getService(ICustDiscountSV.class);
		IDstDiscountLevelSV dstDiscountLevelSV = DubboConsumerFactory.getService(IDstDiscountLevelSV.class);
		try{
			GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
			String tenantId = user.getTenantId();
			CustDiscountQueryParam queryParam = new CustDiscountQueryParam();
			queryParam.setInstanceId(instanceId);
            queryParam.setTenantId(tenantId);
			CustDiscountQueryResponse result = custDiscountSV.queryCustDiscountInfo(queryParam);
			List<CustDiscountResponseVo> responseVos = new ArrayList<CustDiscountResponseVo>();

			for (int i = 0; i < result.getInfo().getResult().size(); i++) {
				responseVos.add(result.getInfo().getResult().get(i));
			}
			CustDiscountResponseVo custDiscountResponseVo;
			if (!CollectionUtil.isEmpty(responseVos)){
				custDiscountResponseVo = responseVos.get(0);
				if (!StringUtil.isBlank(custDiscountResponseVo.getOwnerCode())){
					String owenCode = custDiscountResponseVo.getOwnerCode();
					//翻译owenCode
					String newOwenCode = translateOwenCode(owenCode,tenantId);
					if (!StringUtil.isBlank(newOwenCode)){
						custDiscountResponseVo.setOwnerCode(newOwenCode);
					}

				}
				uiModel.addAttribute("custDiscountResponseVo",custDiscountResponseVo);
				if (null != custDiscountResponseVo.getDiscountPayDate()){
                    uiModel.addAttribute("discountPayDate",DateUtil.getTimestamp(custDiscountResponseVo.getDiscountPayDate()));
                }
                if (null != custDiscountResponseVo.getActiveDate()){
                    uiModel.addAttribute("activeDate",DateUtil.getTimestamp(custDiscountResponseVo.getActiveDate()));
                }
                if (null != custDiscountResponseVo.getEffectiveDate()){
                    uiModel.addAttribute("effectiveDate",DateUtil.getTimestamp(custDiscountResponseVo.getEffectiveDate()));
                }
                if (null != custDiscountResponseVo.getExpirationDate()){
                    uiModel.addAttribute("expirationDate",DateUtil.getTimestamp(custDiscountResponseVo.getExpirationDate()));
                }

			}
			/*//查询客户权益等级实例
			CustLevelInstanceQueryParam custLevelInstanceQueryParam = new CustLevelInstanceQueryParam();
			custLevelInstanceQueryParam.setTenantId(tenantId);
			custLevelInstanceQueryParam.setInstanceId(instanceId);
			CustLevelInstanceResponseVo custLevelInstanceResponseVo = custDiscountSV.queryCustLevelInstance(custLevelInstanceQueryParam);
			if (null != custLevelInstanceResponseVo){
				uiModel.addAttribute("custLevelInstanceResponseVo",custLevelInstanceResponseVo);

				//查询权益等级详情
				DstDisCountLevelListRequest disCountLevelListRequest = new DstDisCountLevelListRequest();
				DstDiscountLevelVO dstDiscountLevelVO = new DstDiscountLevelVO();
				dstDiscountLevelVO.setTenantId(tenantId);
				dstDiscountLevelVO.setLevelCode(custLevelInstanceResponseVo.getLevelCode());
                disCountLevelListRequest.setDstDiscountLevelVO(dstDiscountLevelVO);
                disCountLevelListRequest.setTenantId(tenantId);
				DstDisCountLevelListResponse response = dstDiscountLevelSV.queryDstDiscountLevel(disCountLevelListRequest);
				PageInfo<DstDiscountLevelVO> pageInfo = response.getPages();
				if (null != pageInfo){
                    List<DstDiscountLevelVO> dstDiscountLevelVOList = pageInfo.getResult();
                    if (!CollectionUtil.isEmpty(dstDiscountLevelVOList)){
                        DstDiscountLevelVO discountLevelVO = dstDiscountLevelVOList.get(0);
                        uiModel.addAttribute("discountLevelVO",discountLevelVO);
                    }
                }
			}*/

		}catch (Exception e){
			e.printStackTrace();
		}
		return "discount/custdiscountinfo";
	}
	
	/**
	 * 权益类型查询
	 * 
	 * @return
	 */
	@RequestMapping("/queryDiscountClass")
	@ResponseBody
	public ResponseData<List<DiscountClassResponseVo>> queryDiscountClass(HttpServletRequest request) {
		long queryStart = System.currentTimeMillis();
		LOG.info("====权益类型查询开始，当前时间戳：" + queryStart);
		IDiscountManagementSV discountManagementSV = DubboConsumerFactory.getService(IDiscountManagementSV.class);
		ResponseData<List<DiscountClassResponseVo>> responseData = null;
		try {
			// 查询条件
			DiscountClassQueryParam queryParam = new DiscountClassQueryParam();
			GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
			queryParam.setTenantId(user.getTenantId());
			DiscountClassQueryResponse result = discountManagementSV.queryDiscountClass(queryParam);
			responseData = new ResponseData<List<DiscountClassResponseVo>>(ResponseData.AJAX_STATUS_SUCCESS, "查询成功",
					result.getResponseVos());
		} catch (Exception e) {
			responseData = new ResponseData<List<DiscountClassResponseVo>>(ResponseData.AJAX_STATUS_FAILURE, "获取信息异常");
			LOG.error("获取信息出错：", e);
		}
		return responseData;
	}
	private String translateOwenCode(String owenCode,String tenantId){
		List<BaseParamVo> baseList = new ArrayList<BaseParamVo>();
		String newOwenCode = "";
		try {
			baseList = ParamController.getSysParams(
					tenantId, "OWNER_LIMIT_TYPE");
			if (CollectionUtil.isEmpty(baseList)){
				return newOwenCode;
			}
			for (BaseParamVo baseParamVo : baseList){
				if (owenCode.equals(baseParamVo.getParamCode())){
					newOwenCode = baseParamVo.getParamName();
					return newOwenCode;
				}
			}

		} catch (Exception e) {
			LOG.error("获取菜单失败", e);
		}

		return  newOwenCode;

	}
}

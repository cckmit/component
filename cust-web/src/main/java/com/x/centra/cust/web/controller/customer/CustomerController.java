package com.x.centra.cust.web.controller.customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfoResponse;
import com.x.centra.cust.web.model.sso.GeneralSSOClientUser;
import com.x.centra.cust.web.vo.CustFeedbackResVo;
import com.x.centra.customer.api.custncar.interfaces.ICustNCarSV;
import com.x.centra.customer.api.custncar.param.AllCustInfo;
import com.x.centra.customer.api.custncar.param.CarInfo;
import com.x.centra.customer.api.custncar.param.CarInfoResponse;
import com.x.centra.customer.api.custncar.param.CarParam;
import com.x.centra.customer.api.custncar.param.CustBaseInfoModify;
import com.x.centra.customer.api.custncar.param.CustFullInfo;
import com.x.centra.customer.api.custncar.param.CustFullInfoModify;
import com.x.centra.customer.api.custncar.param.CustFullInfoResponse;
import com.x.centra.customer.api.custncar.param.CustInfoParam;
import com.x.centra.customer.api.custncar.param.CustInfoResponse;
import com.x.centra.customer.api.custncar.param.CustQueryParam;
import com.x.centra.customer.api.feedback.params.CustFeedbackQueryParam;
import com.x.centra.customer.api.feedback.params.CustFeedbackResponse;
import com.x.centra.customer.api.feedback.interfaces.ICustFeedbackSV;
import com.x.sdk.dubbo.util.DubboConsumerFactory;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.DateUtil;
import com.x.sdk.util.StringUtil;
import com.x.sdk.web.model.ResponseData;
import com.x.sso.client.filter.SSOClientConstants;

/**
 * 标准品查询
 * 
 * @author jiawen
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
	private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

	/**
	 * 进入页面
	 */
	@RequestMapping("/list")
	public String editQuery(Model uiModel) {
		return "customer/customerlist";
	}

	/**
	 * 点击查询按钮调用方法-查询用户信息
	 * 
	 * @return
	 */
	@RequestMapping("/getCustomerList")
	@ResponseBody
	public ResponseData<PageInfoResponse<AllCustInfo>> queryCustomer(HttpServletRequest request) {
		long queryStart = System.currentTimeMillis();
		LOG.info("====用户信息查询开始 start to in getCustomerList，当前时间戳：" + queryStart);
		ICustNCarSV iCustNCarSV = DubboConsumerFactory.getService(ICustNCarSV.class);
		ResponseData<PageInfoResponse<AllCustInfo>> responseData = null;
		try {
			// 查询条件
			CustQueryParam custRequest = new CustQueryParam();
			queryBuilder(request, custRequest);
			GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
			custRequest.setTenantId(user.getTenantId());
			
			queryStart = System.currentTimeMillis();
			LOG.info("开始执行用户信息查询iCustNCarSV.queryCustInfo开始，当前时间戳：" + queryStart);

			CustInfoResponse result = iCustNCarSV.queryCustInfo(custRequest);

			long queryEnd = System.currentTimeMillis();
			LOG.info("完成执行用户信息查询iCustNCarSV.queryCustInfo，当前时间戳：" + queryEnd + ",用时:" + (queryEnd - queryStart) + "毫秒");

			List<AllCustInfo> custInfos = new ArrayList<AllCustInfo>();

			for (int i = 0; i < result.getCustInfos().getResult().size(); i++) {
				custInfos.add(result.getCustInfos().getResult().get(i));
			}

			PageInfoResponse<AllCustInfo> custresponse = new PageInfoResponse<AllCustInfo>();

			custresponse.setCount(result.getCustInfos().getCount());
			custresponse.setPageCount(result.getCustInfos().getPageCount());
			custresponse.setPageNo(result.getCustInfos().getPageNo());
			custresponse.setPageSize(result.getCustInfos().getPageSize());
			custresponse.setResponseHeader(result.getResponseHeader());
			custresponse.setResult(custInfos);

			responseData = new ResponseData<PageInfoResponse<AllCustInfo>>(ResponseData.AJAX_STATUS_SUCCESS, "查询成功",
					custresponse);
			queryEnd = System.currentTimeMillis();
			LOG.info("getNormProductList is end，当前时间戳：" + queryEnd + ",用时:" + (queryEnd - queryStart) + "毫秒");
		} catch (Exception e) {
			responseData = new ResponseData<PageInfoResponse<AllCustInfo>>(ResponseData.AJAX_STATUS_FAILURE, "获取信息异常");
			LOG.error("获取信息出错：", e);
		}
		long finshEnd = System.currentTimeMillis();
		LOG.info("====用户查询结束 getCustomerList is finish，当前时间戳：" + finshEnd + ",用时:" + (finshEnd - queryStart) + "毫秒");
		return responseData;
	}

	/**
	 * 查询条件检查设置
	 */
	private void queryBuilder(HttpServletRequest request, CustQueryParam custRequest) {
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		custRequest.setTenantId(user.getTenantId());
		if (!StringUtil.isBlank(request.getParameter("custId"))) {
			custRequest.setCustId(request.getParameter("custId"));
		}
		if (!StringUtil.isBlank(request.getParameter("custName"))) {
			custRequest.setCustName(request.getParameter("custName"));
		}
		if (!StringUtil.isBlank(request.getParameter("phone"))) {
			custRequest.setPhone(request.getParameter("phone"));
		}
		if (!StringUtil.isBlank(request.getParameter("state"))) {
			custRequest.setRealNameAuthStatus(request.getParameter("state"));
		}
		if (!StringUtil.isBlank(request.getParameter("pageNo"))) {
			custRequest.setCurPage(Integer.parseInt(request.getParameter("pageNo")));
		}
		if (!StringUtil.isBlank(request.getParameter("pageSize"))) {
			custRequest.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
		}
	}

	/**
	 * 锁定客户
	 * 
	 * @param custId
	 * @return
	 */
	@RequestMapping("/lockcustomer")
	@ResponseBody
	public ResponseData<String> lockCustomer(@PathParam("custId") String custId, @PathParam("lockDes") String lockDes,
			HttpServletRequest request) {

		ICustNCarSV iCustNCarSV = DubboConsumerFactory.getService(ICustNCarSV.class);
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		CustInfoParam custParam = new CustInfoParam();
		custParam.setCustId(custId);
		custParam.setTenantId(user.getTenantId());

		CustFullInfoResponse custFullInfo_old = iCustNCarSV.getCustInfoBycustId(custParam);
		CustFullInfo custFullInfo = custFullInfo_old.getCustFullInfo();

		custFullInfo.setLockStatus("1");
		custFullInfo.setLockReason(lockDes);

		CustFullInfoModify fullInfo = new CustFullInfoModify();
		CustBaseInfoModify baseInfo = new CustBaseInfoModify();
		BeanUtils.copyVO(baseInfo, custFullInfo);
		baseInfo.setId(custId);
		baseInfo.setTenantId(user.getTenantId());
		baseInfo.setHandlerName(user.getUserId());
		fullInfo.setCustBaseInfo(baseInfo);
		fullInfo.setCustId(custId);
		fullInfo.setTenantId(user.getTenantId());

		BaseResponse lockCustomer = iCustNCarSV.modifyCustFullInfoByCustId(fullInfo);

		if (lockCustomer.getResponseHeader().isSuccess()) {
			return new ResponseData<String>(ResponseData.AJAX_STATUS_SUCCESS, "操作成功");
		} else {
			LOG.error("获取信息出错：", lockCustomer.getResponseHeader().getResultMessage());
			return new ResponseData<String>(ResponseData.AJAX_STATUS_FAILURE,
					lockCustomer.getResponseHeader().getResultMessage());
		}

	}

	/**
	 * 解锁客户
	 * 
	 * @param custId
	 * @return
	 */
	@RequestMapping("/unlockcustomer")
	@ResponseBody
	public ResponseData<String> unlockCustomer(@PathParam("custId") String custId, HttpServletRequest request) {

		ICustNCarSV iCustNCarSV = DubboConsumerFactory.getService(ICustNCarSV.class);

		CustInfoParam custParam = new CustInfoParam();
		custParam.setCustId(custId);
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		custParam.setTenantId(user.getTenantId());

		CustFullInfoResponse custFullInfo_old = iCustNCarSV.getCustInfoBycustId(custParam);
		CustFullInfo custFullInfo = custFullInfo_old.getCustFullInfo();

		custFullInfo.setLockStatus("0");
		custFullInfo.setLockReason("");

		CustFullInfoModify fullInfo = new CustFullInfoModify();
		CustBaseInfoModify baseInfo = new CustBaseInfoModify();
		BeanUtils.copyVO(baseInfo, custFullInfo);
		baseInfo.setId(custId);
		baseInfo.setTenantId(user.getTenantId());
		fullInfo.setCustBaseInfo(baseInfo);
		fullInfo.setCustId(custId);
		fullInfo.setTenantId(user.getTenantId());

		BaseResponse lockCustomer = iCustNCarSV.modifyCustFullInfoByCustId(fullInfo);

		if (lockCustomer.getResponseHeader().isSuccess()) {
			return new ResponseData<String>(ResponseData.AJAX_STATUS_SUCCESS, "操作成功");
		} else {
			LOG.error("获取信息出错：", lockCustomer.getResponseHeader().getResultMessage());
			return new ResponseData<String>(ResponseData.AJAX_STATUS_FAILURE,
					lockCustomer.getResponseHeader().getResultMessage());
		}

	}

	/**
	 * 显示客户详情页面
	 *
	 * @param custId
	 * @return
	 */
	@RequestMapping("/{id}")
	public String customerView(@PathVariable("id") String custId, Model uiModel, HttpServletRequest request) {
		// 标准品ID
		uiModel.addAttribute("custId", custId);
		// 查询客户详细信息
		CustInfoParam custParam = new CustInfoParam();
		custParam.setCustId(custId);
		GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
		custParam.setTenantId(user.getTenantId());

		ICustNCarSV iCustNCarSV = DubboConsumerFactory.getService(ICustNCarSV.class);
		CustFullInfoResponse custFullInfoResponse = iCustNCarSV.getCustInfoBycustId(custParam);
		CustFullInfo custFullInfo = custFullInfoResponse.getCustFullInfo();
		uiModel.addAttribute("custFullInfo", custFullInfo);
		if(custFullInfo.getStateChgTime() != null) {
			uiModel.addAttribute("stateChgTime", DateUtil.getDateString(new Date(custFullInfo.getStateChgTime()), DateUtil.DATETIME_FORMAT));
		}
		if(custFullInfo.getCreateTime() != null) {
			uiModel.addAttribute("createTime", DateUtil.getDateString(new Date(custFullInfo.getCreateTime()), DateUtil.DATETIME_FORMAT));
		}
		return "customer/info";
	}

	/**
	 * 显示客户统计视图
	 *
	 * @param custId
	 * @return
	 */
	@RequestMapping("/statisticalView")
	public String statisticalView(Model uiModel) {

		return "customer/statistic";
	}

	/**
	 * 查询绑定车辆信息
	 * 
	 * @return
	 */
	@RequestMapping("/getCarList")
	@ResponseBody
	public ResponseData<PageInfoResponse<CarInfo>> queryCar(HttpServletRequest request,
			@PathParam("custId") String custId) {
		long queryStart = System.currentTimeMillis();
		LOG.info("====车辆信息查询开始 start to in queryCar，当前时间戳：" + queryStart);
		ICustNCarSV iCustNCarSV = DubboConsumerFactory.getService(ICustNCarSV.class);
		ResponseData<PageInfoResponse<CarInfo>> responseData = null;
		try {
			CarParam carParam = new CarParam();
			carParam.setCustId(custId);
			GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
			carParam.setTenantId(user.getTenantId());
			
			queryStart = System.currentTimeMillis();
			LOG.info("开始执行车辆信息查询iCustNCarSV.queryCarInfo开始，当前时间戳：" + queryStart);

			CarInfoResponse result = iCustNCarSV.queryCarInfo(carParam);

			long queryEnd = System.currentTimeMillis();
			LOG.info("完成执行车辆信息查询iCustNCarSV.queryCarInfo，当前时间戳：" + queryEnd + ",用时:" + (queryEnd - queryStart) + "毫秒");

			List<CarInfo> carInfos = new ArrayList<CarInfo>();
			
			if (result.getCarInfo()!=null) {
				for (int i = 0; i < result.getCarInfo().size(); i++) {
					carInfos.add(result.getCarInfo().get(i));
				}
			
			PageInfoResponse<CarInfo> carresponse = new PageInfoResponse<CarInfo>();

			carresponse.setCount(result.getCarInfo().size());
			carresponse.setPageCount(carresponse.getCount()%10+1);
			carresponse.setPageNo(1);
			carresponse.setPageSize(10);
			carresponse.setResponseHeader(result.getResponseHeader());
			carresponse.setResult(carInfos);

			responseData = new ResponseData<PageInfoResponse<CarInfo>>(ResponseData.AJAX_STATUS_SUCCESS, "查询成功",
					carresponse);
			}
			else {
				responseData = new ResponseData<PageInfoResponse<CarInfo>>(ResponseData.AJAX_STATUS_SUCCESS, "未查询到绑定车辆信息");
			}
			queryEnd = System.currentTimeMillis();
			LOG.info("queryCar is end，当前时间戳：" + queryEnd + ",用时:" + (queryEnd - queryStart) + "毫秒");
		} catch (Exception e) {
			responseData = new ResponseData<PageInfoResponse<CarInfo>>(ResponseData.AJAX_STATUS_FAILURE, "获取信息异常");
			LOG.error("获取信息出错：", e);
		}
		long finshEnd = System.currentTimeMillis();
		LOG.info("====车辆查询结束 queryCar is finish，当前时间戳：" + finshEnd + ",用时:" + (finshEnd - queryStart) + "毫秒");
		return responseData;
	}
	
	/**
	 * 进入意见反馈信息页面
	 * 
	 * @return
	 */
	@RequestMapping("/feedback")
	public String queryFeedback(Model uiModel) {
		return "customer/feedbacklist";
	}
	
	/**
	 * 查询客户意见反馈信息
	 * 
	 * @return
	 */
	@RequestMapping("/getFeedbackList")
	@ResponseBody
	public ResponseData<PageInfoResponse<CustFeedbackResVo>> getFeedbackList(HttpServletRequest request) {
		long queryStart = System.currentTimeMillis();
		LOG.info("====客户意见反馈信息查询开始 start to in getFeedbackList，当前时间戳：" + queryStart);
		ICustFeedbackSV iCustFeedbackSV = DubboConsumerFactory.getService(ICustFeedbackSV.class);
		ResponseData<PageInfoResponse<CustFeedbackResVo>> responseData = null;
		try {

			queryStart = System.currentTimeMillis();
			LOG.info("开始执行客户意见反馈信息查询queryCustFeedback.queryCustFeedback开始，当前时间戳：" + queryStart);
			CustFeedbackQueryParam param = new CustFeedbackQueryParam();
			GeneralSSOClientUser user = (GeneralSSOClientUser) request.getSession().getAttribute(SSOClientConstants.USER_SESSION_KEY);
			param.setTenantId(user.getTenantId());
			param.setCustId(request.getParameter("custId"));
			param.setContent(request.getParameter("content"));
			if (!StringUtil.isBlank(request.getParameter("pageNo"))) {
				param.setPageNo(Integer.parseInt(request.getParameter("pageNo")));
			}
			if (!StringUtil.isBlank(request.getParameter("pageSize"))) {
				param.setPageSize(Integer.parseInt(request.getParameter("pageSize")));
			}
			if(!StringUtil.isBlank(request.getParameter("createDateStart"))){
				String createDateStart = request.getParameter("createDateStart") + " 00:00:00";
				param.setCreateDateStart(DateUtil.getTimestamp(createDateStart, "yyyy-MM-dd HH:mm:ss").getTime());
			}
			if(!StringUtil.isBlank(request.getParameter("createDateEnd"))){
				String createDateEnd = request.getParameter("createDateEnd") + " 23:59:59";
				param.setCreateDateEnd(DateUtil.getTimestamp(createDateEnd, "yyyy-MM-dd HH:mm:ss").getTime());
			}
			CustFeedbackResponse result = iCustFeedbackSV.queryCustFeedback(param);

			long queryEnd = System.currentTimeMillis();
			LOG.info("完成执行客户意见反馈信息查询queryCustFeedback.queryCustFeedback，当前时间戳：" + queryEnd + ",用时:" + (queryEnd - queryStart) + "毫秒");

			List<CustFeedbackResVo> custFeedbacks = new ArrayList<CustFeedbackResVo>();

			if(result.getCustFeedbackVos()!=null && !CollectionUtil.isEmpty(result.getCustFeedbackVos().getResult())) {
				for (int i = 0; i < result.getCustFeedbackVos().getResult().size(); i++) {
					CustFeedbackResVo feedbackResVo = new CustFeedbackResVo();
					BeanUtils.copyVO(feedbackResVo, result.getCustFeedbackVos().getResult().get(i));
					if(result.getCustFeedbackVos().getResult().get(i).getCreateDate()!=null) {
						feedbackResVo.setCreateDateStr(DateUtil.getDateString(
								new Date(result.getCustFeedbackVos().getResult().get(i).getCreateDate()), DateUtil.DATETIME_FORMAT));
					}
					custFeedbacks.add(feedbackResVo);
				}
			}
			

			PageInfoResponse<CustFeedbackResVo> feedbackresponse = new PageInfoResponse<CustFeedbackResVo>();

			feedbackresponse.setCount(result.getCustFeedbackVos().getCount());
			feedbackresponse.setPageCount(result.getCustFeedbackVos().getPageCount());
			feedbackresponse.setPageNo(result.getCustFeedbackVos().getPageNo());
			feedbackresponse.setPageSize(result.getCustFeedbackVos().getPageSize());
			feedbackresponse.setResponseHeader(result.getResponseHeader());
			feedbackresponse.setResult(custFeedbacks);

			responseData = new ResponseData<PageInfoResponse<CustFeedbackResVo>>(ResponseData.AJAX_STATUS_SUCCESS, "查询成功",
					feedbackresponse);
			queryEnd = System.currentTimeMillis();
			LOG.info("getFeedbackList is end，当前时间戳：" + queryEnd + ",用时:" + (queryEnd - queryStart) + "毫秒");
		} catch (Exception e) {
			responseData = new ResponseData<PageInfoResponse<CustFeedbackResVo>>(ResponseData.AJAX_STATUS_FAILURE, "获取信息异常");
			LOG.error("获取信息出错：", e);
		}
		long finshEnd = System.currentTimeMillis();
		LOG.info("====用户查询结束 getFeedbackList is finish，当前时间戳：" + finshEnd + ",用时:" + (finshEnd - queryStart) + "毫秒");
		return responseData;
	}
}

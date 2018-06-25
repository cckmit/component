package com.x.centra.cust.web.controller.dstdiscountlevel;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.ParseException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.centra.cust.web.model.dstdiscountlevel.DstDiscountInfoTreeVo;
import com.x.centra.cust.web.model.dstdiscountlevel.DstDiscountevelQuaryParams;
import com.x.centra.cust.web.util.AdminUtil;
import com.x.centra.dst.api.discount.interfaces.IDiscountManagementSV;
import com.x.centra.dst.api.discount.param.DiscountClassQueryParam;
import com.x.centra.dst.api.discount.param.DiscountClassQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountClassResponseVo;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountInfoResponseVo;
import com.x.centra.dst.api.discountlevel.interfaces.IDstDiscountLevelSV;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelCRUDRequest;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelCRUDResponse;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListRequest;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListResponse;
import com.x.centra.dst.api.discountlevel.param.DstDiscountInfoVO;
import com.x.centra.dst.api.discountlevel.param.DstDiscountLevelVO;
import com.x.sdk.constant.ExceptCodeConstants;
import com.x.sdk.dubbo.util.DubboConsumerFactory;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;
import com.x.sdk.web.model.ResponseData;

/**
 * 级别定义管理
 * 
 * @author baixin
 *
 */
@Controller
@RequestMapping("/dstdiscountlevel")
public class DstDiscountLevelController {

	private static final Logger LOG = LoggerFactory.getLogger(DstDiscountLevelController.class);

	/**
	 * 进入页面
	 */
	@RequestMapping("/dstdiscountlevellist")
	public String dstdiscountlevellist(Model uiModel) {
		return "dstdiscountlevel/dstdiscountlevellist";
	}

	/**
	 * 点击查询按钮调用方法-查询用户信息
	 * 
	 * @return
	 */
	@RequestMapping("/getDstDiscountevellist")
	@ResponseBody
	public ResponseData<PageInfo<DstDiscountLevelVO>> getDstDiscountevellist(HttpServletRequest request,
			DstDiscountevelQuaryParams param) {
		IDstDiscountLevelSV iDstDiscountLevelSV = DubboConsumerFactory.getService(IDstDiscountLevelSV.class);
		ResponseData<PageInfo<DstDiscountLevelVO>> responseData = null;
		try {
			// 查询条件
			String levelCode = param.getLevelCode();
			String levelName = param.getLevelName();
			String status = param.getStatus();
			DstDisCountLevelListRequest arg0 = new DstDisCountLevelListRequest();
			arg0.setTenantId(AdminUtil.getTenantId());
			DstDiscountLevelVO dstDiscountLevelVO = new DstDiscountLevelVO();
			if (!StringUtil.isBlank(status)) {
				dstDiscountLevelVO.setStatus(status);
			}
			if (!StringUtil.isBlank(levelCode)) {
				dstDiscountLevelVO.setLevelCode(levelCode);
			}
			if (!StringUtil.isBlank(levelName)) {
				dstDiscountLevelVO.setLevelName(levelName);
			}
			arg0.setPageNo(param.getPageNo());
			arg0.setPageSize(param.getPageSize());
			arg0.setDstDiscountLevelVO(dstDiscountLevelVO);
			DstDisCountLevelListResponse result = iDstDiscountLevelSV.queryDstDiscountLevel(arg0);

			responseData = new ResponseData<PageInfo<DstDiscountLevelVO>>(ResponseData.AJAX_STATUS_SUCCESS, "查询成功",
					result.getPages());
		} catch (Exception e) {
			responseData = new ResponseData<PageInfo<DstDiscountLevelVO>>(ResponseData.AJAX_STATUS_FAILURE, "获取信息异常");
			LOG.error("获取信息出错：", e);
		}
		return responseData;
	}

	/**
	 * 删除级别信息
	 * 
	 * @param levelCode
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/deldstdiscountevelbycode/{levelCode}")
	@ResponseBody
	public ResponseData<String> deldstdiscountevelbycode(@PathVariable("levelCode") String levelCode) {
		IDstDiscountLevelSV productCatSV = DubboConsumerFactory.getService(IDstDiscountLevelSV.class);
		DstDisCountLevelCRUDRequest arg0 = new DstDisCountLevelCRUDRequest();
		arg0.setTenantId(AdminUtil.getTenantId());
		DstDiscountLevelVO vo = new DstDiscountLevelVO();
		vo.setLevelCode(levelCode);
		arg0.setDstDiscountLevelVO(vo);
		DstDisCountLevelCRUDResponse response = productCatSV.deleteDstDiscountLevel(arg0);
		return genResponse(response, null);
	}

	/**
	 * 查询级别信息
	 * 
	 * @param levelCode
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/dstdiscountevelexistbycode")
	@ResponseBody
	public String dstdiscountevelexistbycode(String levelCode, String levelId) {
		if (!StringUtil.isBlank(levelId)) {
			return "true";
		}
		IDstDiscountLevelSV iDstDiscountLevelSV = DubboConsumerFactory.getService(IDstDiscountLevelSV.class);
		DstDisCountLevelCRUDRequest arg2 = new DstDisCountLevelCRUDRequest();
		arg2.setTenantId(AdminUtil.getTenantId());
		DstDiscountLevelVO vo = new DstDiscountLevelVO();
		vo.setLevelCode(levelCode);
		arg2.setDstDiscountLevelVO(vo);
		DstDisCountLevelCRUDResponse rep2 = iDstDiscountLevelSV.queryDstDiscountLevelDetail(arg2);
		DstDiscountLevelVO voresult = rep2.getDstDiscountLevelVO();
		if (voresult != null) {
			return "false";
		}
		return "true";
	}

	/**
	 * 返回信息
	 */
	private ResponseData<String> genResponse(BaseResponse response, String statusInfo) {
		ResponseData<String> responseData = new ResponseData<String>(ResponseData.AJAX_STATUS_SUCCESS, statusInfo, "");
		ResponseHeader header = response == null ? null : response.getResponseHeader();
		if (header == null || !header.isSuccess()) {
			String errorCode = header == null ? ExceptCodeConstants.Special.SYSTEM_ERROR : header.getResultCode();
			String errMsg = header == null ? "未知错误" : header.getResultMessage();
			LOG.error("Option cat is error,errorCode:{},errorMsg:{}", errorCode, errMsg);
			responseData = new ResponseData<String>(ResponseData.AJAX_STATUS_FAILURE, errMsg);
		}
		return responseData;
	}

	/**
	 * 查询级别信息
	 * 
	 * @return
	 */
	@RequestMapping("/dstdiscountleveldetail/{levelCode}")
	public String dstdiscountleveldetail(@PathVariable("levelCode") String levelCode, Model uiModel) {
		addAttr(levelCode, uiModel);
		return "dstdiscountlevel/dstdiscountleveldetail";
	}

	/**
	 * 添加属性
	 */
	private void addAttr(String levelCode, Model uiModel) {

		IDiscountManagementSV iDiscountManagementSV = DubboConsumerFactory.getService(IDiscountManagementSV.class);
		DiscountClassQueryParam arg0 = new DiscountClassQueryParam();
		String tenantId = AdminUtil.getTenantId();
		arg0.setTenantId(tenantId);
		DiscountClassQueryResponse rep = iDiscountManagementSV.queryDiscountClass(arg0);
		List<DiscountClassResponseVo> assvos = rep.getResponseVos();
		List<DstDiscountInfoTreeVo> disinfos = null;
		if (!CollectionUtil.isEmpty(assvos)) {

			disinfos = new ArrayList<>();
			DiscountInfoQueryParam arg1 = new DiscountInfoQueryParam();
			arg1.setTenantId(tenantId);
			arg1.setPageSize(Integer.MAX_VALUE);
			arg1.setPageNo(0);
			for (DiscountClassResponseVo discountClassResponseVo : assvos) {
				DstDiscountInfoTreeVo votree = new DstDiscountInfoTreeVo();
				String classCode = discountClassResponseVo.getClassCode();
				votree.setId(classCode);
				votree.setpId("0");
				votree.setName(discountClassResponseVo.getClassName());
				votree.setType("clazz");
				disinfos.add(votree);
				arg1.setClassCode(classCode);
				DiscountInfoQueryResponse rep1 = iDiscountManagementSV.queryDiscountInfo(arg1);
				PageInfo<DiscountInfoResponseVo> pages = rep1.getInfo();
				List<DiscountInfoResponseVo> result = pages.getResult();
				if (!CollectionUtil.isEmpty(result)) {
					for (DiscountInfoResponseVo discountInfoResponseVo : result) {
						DstDiscountInfoTreeVo votree1 = new DstDiscountInfoTreeVo();
						votree1.setId(discountInfoResponseVo.getDiscountCode());
						votree1.setpId(classCode);
						votree1.setName(discountInfoResponseVo.getDiscountName());
						votree1.setType("info");
						disinfos.add(votree1);
					}
				}
			}
			uiModel.addAttribute("dstDiscountInfoTree", disinfos);
		}
		List<DstDiscountInfoVO> voss = null;
		// 类目链
		if (!StringUtil.isBlank(levelCode)) {
			IDstDiscountLevelSV iDstDiscountLevelSV = DubboConsumerFactory.getService(IDstDiscountLevelSV.class);
			DstDisCountLevelCRUDRequest arg2 = new DstDisCountLevelCRUDRequest();
			arg2.setTenantId(AdminUtil.getTenantId());
			DstDiscountLevelVO vo = new DstDiscountLevelVO();
			vo.setLevelCode(levelCode);
			arg2.setDstDiscountLevelVO(vo);
			DstDisCountLevelCRUDResponse rep2 = iDstDiscountLevelSV.queryDstDiscountLevelDetail(arg2);
			DstDiscountLevelVO dstlevel = rep2.getDstDiscountLevelVO();
			uiModel.addAttribute("DstDiscountLevelInfo", dstlevel);
			voss = rep2.getDstDiscountInfoVOs();
			uiModel.addAttribute("DstDiscountInfo", voss);
		}
		if (!CollectionUtil.isEmpty(voss) && !CollectionUtil.isEmpty(disinfos)) {

			for (DstDiscountInfoTreeVo disinfotree : disinfos) {

				for (DstDiscountInfoVO disinfo : voss) {
					if (disinfotree.getId().equals(disinfo.getDiscountCode())) {

						disinfotree.setChecked(true);

						break;

					}
				}
			}

		}

	}

	/**
	 * 编辑级别信息（页面跳转）
	 * 
	 * @return
	 */
	@RequestMapping("/dstdiscountleveledit")
	public String dstdiscountleveledit(String levelCode, Model uiModel) {
		addAttr(levelCode, uiModel);
		return "dstdiscountlevel/editdstdiscountlevel";
	}

	/**
	 * 编辑级别信息（页面跳转）
	 * 
	 * @return
	 */
	@RequestMapping("/dstdiscountclasstree")
	public String dstdiscountclasstree() {
		return "dstdiscountlevel/dstdiscountclasstree";
	}

	/**
	 * 编辑级别信息
	 * 
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/dstdiscountlevelsaveorupdate")
	@ResponseBody
	public ResponseData<String> dstdiscountlevelsaveorupdate(String dstDiscountLevelstr, String disInfoCodes,
			Model uiModel) {
		ResponseData<String> responsedata;
		IDstDiscountLevelSV iDstDiscountLevelSV = DubboConsumerFactory.getService(IDstDiscountLevelSV.class);
		DstDiscountLevelVO dstDiscountLevelVO;
		try {
			dstDiscountLevelVO = JSON.parse(dstDiscountLevelstr, DstDiscountLevelVO.class);
		} catch (ParseException e) {
			return new ResponseData<String>(ResponseData.AJAX_STATUS_FAILURE, "入参有误！");
		}
		DstDisCountLevelCRUDRequest arg0 = new DstDisCountLevelCRUDRequest();
		String tenantId = AdminUtil.getTenantId();
		Long userid = AdminUtil.getAdminId();
		dstDiscountLevelVO.setTenantId(tenantId);

		dstDiscountLevelVO.setCreateUserId(userid != null ? userid.toString() : "unknow");
		arg0.setTenantId(tenantId);
		arg0.setDstDiscountLevelVO(dstDiscountLevelVO);
		if (!StringUtil.isBlank(disInfoCodes)) {
			String[] codes = disInfoCodes.split(",");
			List<DstDiscountInfoVO> voss = new ArrayList<>();
			for (String code : codes) {
				DstDiscountInfoVO divo = new DstDiscountInfoVO();
				divo.setDiscountCode(code);
				voss.add(divo);
			}

			arg0.setDstDiscountInfoVOs(voss);
		}
		String levelId = dstDiscountLevelVO.getLevelId();
		DstDisCountLevelCRUDResponse response;
		if (StringUtil.isBlank(levelId)) {
			response = iDstDiscountLevelSV.addDstDiscountLevel(arg0);
		} else {
			response = iDstDiscountLevelSV.updateDstDiscountLevel(arg0);
		}
		responsedata = genResponse(response, null);
		return responsedata;
	}

}

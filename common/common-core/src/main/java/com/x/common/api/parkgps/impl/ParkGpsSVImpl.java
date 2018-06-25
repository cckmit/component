package com.x.common.api.parkgps.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.parkgps.interfaces.IParkGpsSV;
import com.x.common.api.parkgps.param.ParkGpsPageInfoRequest;
import com.x.common.api.parkgps.param.ParkGpsPageInfoResponse;
import com.x.common.api.parkgps.param.ParkGpsRegionRequest;
import com.x.common.api.parkgps.param.ParkGpsResponse;
import com.x.common.api.parkgps.param.ParkGpsVo;
import com.x.common.service.business.parkgps.IParkGpsBusinessService;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

@Service
@Component
public class ParkGpsSVImpl implements IParkGpsSV {

	Logger logger = LoggerFactory.getLogger(ParkGpsSVImpl.class);

	@Autowired
	private IParkGpsBusinessService iParkGpsBusinessService;

	@Override
	public ParkGpsResponse queryParkGpsById(ParkGpsVo parkgpsvo) throws BusinessException, SystemException {
		String parkId = parkgpsvo.getParkIdInner();
		if (StringUtil.isBlank(parkId)) {
			throw new BusinessException("停车id不能为空");
		}
		logger.debug("this is ParkGpsSVImpl, the parkId is {}", parkId);
		List<ParkGpsVo> vos = iParkGpsBusinessService.queryParkGpsById(parkId);

		if (CollectionUtil.isEmpty(vos)) {
			return null;
		}

		ParkGpsResponse rep = new ParkGpsResponse();
		rep.setResult(vos);
		return rep;
	}

	@Override
	public ParkGpsResponse queryParkGpsByCacAndRadius(ParkGpsRegionRequest request)
			throws BusinessException, SystemException {
		if (null == request) {
			throw new BusinessException("请求参数不能为空");
		}
		if (null == request.getGmp()) {
			throw new BusinessException("经纬度参数不能为空");
		}
		if (null == request.getGmp().getMapLat()) {
			throw new BusinessException("纬度参数不能为空");
		}
		if (null == request.getGmp().getMapLng()) {
			throw new BusinessException("经度参数不能为空");
		}
		if (null == request.getR()) {
			throw new BusinessException("距离参数不能为空");
		}
		return iParkGpsBusinessService.queryParkGpsByCacAndRadius(request);
	}

	@Override
	public ParkGpsPageInfoResponse queryParkGpsLikeParkName(ParkGpsPageInfoRequest request)
			throws BusinessException, SystemException {
		if (StringUtil.isBlank(request.getParkName())) {
			throw new BusinessException("停车场名称不能为空");
		}
		if (request.getPageNo() < 1) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageNo必须大于0");
		}
		if (request.getPageSize() < 1) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_TYPE_NOT_RIGHT, "查询页面pageSize必须大于0");
		}
		return iParkGpsBusinessService.queryParkGpsLikeParkName(request);
	}

	@Override
	public ParkGpsResponse queryParkGpsInfoById(ParkGpsVo parkgpsvo) throws BusinessException, SystemException {
		String parkId = parkgpsvo.getParkIdInner();
		if (StringUtil.isBlank(parkId)) {
			throw new BusinessException("停车id不能为空");
		}
		logger.debug("this is ParkGpsSVImpl, the parkId is {}", parkId);
		List<ParkGpsVo> vos = iParkGpsBusinessService.queryParkGpsInfoById(parkId);

		ParkGpsResponse rep = new ParkGpsResponse();
		if (CollectionUtil.isEmpty(vos)) {
			ResponseHeader responseHeader = new ResponseHeader();
			responseHeader.setResultCode(ExceptionCodeConstant.NO_RESULT);
			responseHeader.setSuccess(true);
			responseHeader.setResultMessage("未查询到结果！");
			rep.setResponseHeader(responseHeader);
			return rep;
		}

		rep.setResult(vos);
		return rep;
	}

	@Override
	public ParkGpsResponse syncParkGpsInfo(ParkGpsVo parkgpsvo) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		return null;
	}

}

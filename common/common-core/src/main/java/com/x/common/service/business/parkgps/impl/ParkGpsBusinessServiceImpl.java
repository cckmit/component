package com.x.common.service.business.parkgps.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.vo.PageInfo;
import com.x.common.api.parkfeerule.param.ParkFeeRuleVo;
import com.x.common.api.parkgps.param.ParkGpsPageInfoRequest;
import com.x.common.api.parkgps.param.ParkGpsPageInfoResponse;
import com.x.common.api.parkgps.param.ParkGpsRegionRequest;
import com.x.common.api.parkgps.param.ParkGpsResponse;
import com.x.common.api.parkgps.param.ParkGpsVo;
import com.x.common.api.parkgps.param.ParkWorkTimeVo;
import com.x.common.service.atom.parkfeerule.IParkFeeRuleAtomService;
import com.x.common.service.atom.parkgps.IParkGpsAtomService;
import com.x.common.service.atom.parkworktime.IParkWorkTimeService;
import com.x.common.service.business.parkgps.IParkGpsBusinessService;
import com.x.sdk.util.CollectionUtil;

@Service
@Transactional
public class ParkGpsBusinessServiceImpl implements IParkGpsBusinessService {

	@Autowired
	private IParkGpsAtomService iParkGpsAtomService;

	@Autowired
	private IParkWorkTimeService iParkWorkTimeService;

	@Autowired
	private IParkFeeRuleAtomService iParkFeeRuleAtomService;

	@Override
	public List<ParkGpsVo> queryParkGpsById(String parkId) {
		List<ParkGpsVo> results = iParkGpsAtomService.queryParkGpsById(parkId);
		this.setWorkTimeLevel(results);
		return results;
	}

	@Override
	public ParkGpsResponse queryParkGpsByCacAndRadius(ParkGpsRegionRequest request) {
		ParkGpsResponse rep = new ParkGpsResponse();
		List<ParkGpsVo> results = iParkGpsAtomService.queryParkGpsByCacAndRadius(request.getGmp(), request.getR());
		this.setWorkTimeLevel(results);
		rep.setResult(results);
		return rep;
	}

	@Override
	public ParkGpsPageInfoResponse queryParkGpsLikeParkName(ParkGpsPageInfoRequest request) {
		ParkGpsPageInfoResponse rep = new ParkGpsPageInfoResponse();
		PageInfo<ParkGpsVo> pages = iParkGpsAtomService.queryParkGpsPageInfoLikeParkName(request.getParkName(),
				request.getPageNo(), request.getPageSize());
		this.setWorkTimeLevel(pages.getResult());
		rep.setResult(pages);
		return rep;
	}

	private void setWorkTimeLevel(List<ParkGpsVo> results) {
		if (CollectionUtil.isEmpty(results)) {
			return;
		}
		for (ParkGpsVo parkGpsVo : results) {
			ParkWorkTimeVo worktimelevel = iParkWorkTimeService.getWorkBusyLevel(parkGpsVo.getParkIdInner());
			if (null != worktimelevel) {
				parkGpsVo.setParkWorkTimeVo(worktimelevel);
			}
		}
	}

	@Override
	public List<ParkGpsVo> queryParkGpsInfoById(String parkId) {
		List<ParkGpsVo> results = iParkGpsAtomService.queryParkGpsById(parkId);
		this.setWorkTimeLevel(results);
		this.setParkFeeRule(results);
		return results;
	}

	private void setParkFeeRule(List<ParkGpsVo> results) {
		if (CollectionUtil.isEmpty(results)) {
			return;
		}
		for (ParkGpsVo parkGpsVo : results) {
			ParkFeeRuleVo parkfeerule = iParkFeeRuleAtomService
					.queryParkFeeRuleById(Integer.valueOf(parkGpsVo.getFeeStandardId()));
			if (null != parkfeerule) {
				parkGpsVo.setParkFeeRuleVo(parkfeerule);
			}
		}
	}

}

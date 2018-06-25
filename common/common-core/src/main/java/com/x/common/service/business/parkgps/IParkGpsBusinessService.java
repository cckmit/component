package com.x.common.service.business.parkgps;

import java.util.List;

import com.x.common.api.parkgps.param.ParkGpsPageInfoRequest;
import com.x.common.api.parkgps.param.ParkGpsPageInfoResponse;
import com.x.common.api.parkgps.param.ParkGpsRegionRequest;
import com.x.common.api.parkgps.param.ParkGpsResponse;
import com.x.common.api.parkgps.param.ParkGpsVo;

public interface IParkGpsBusinessService {
	/**
	 * 查询机构详情
	 * 
	 * @param queryRequest
	 * @return
	 */
	public List<ParkGpsVo> queryParkGpsById(String parkId);

	public ParkGpsResponse queryParkGpsByCacAndRadius(ParkGpsRegionRequest request);

	public ParkGpsPageInfoResponse queryParkGpsLikeParkName(ParkGpsPageInfoRequest request);

	public List<ParkGpsVo> queryParkGpsInfoById(String parkId);
}

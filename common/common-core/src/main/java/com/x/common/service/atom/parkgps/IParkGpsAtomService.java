package com.x.common.service.atom.parkgps;

import java.math.BigDecimal;
import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.parkgps.param.GpsMapPoint;
import com.x.common.api.parkgps.param.ParkGpsVo;

public interface IParkGpsAtomService {

	public List<ParkGpsVo> queryParkGpsById(String parkId);

	public List<ParkGpsVo> queryParkGpsByCacAndRadius(GpsMapPoint point, BigDecimal r);

	public List<ParkGpsVo> queryParkGpsLikeParkName(String parkName);

	public PageInfo<ParkGpsVo> queryParkGpsPageInfoLikeParkName(String parkName, Integer pageNo, Integer pageSize);
}

package com.x.common.service.atom.parkgps.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.x.base.vo.PageInfo;
import com.x.common.api.parkgps.param.GpsMapPoint;
import com.x.common.api.parkgps.param.ParkGpsVo;
import com.x.common.constants.GpsConstants;
import com.x.common.dao.mapper.bo.ParkGps;
import com.x.common.dao.mapper.bo.ParkGpsCriteria;
import com.x.common.dao.mapper.bo.ParkGpsCriteria.Criteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.ParkGpsMapper;
import com.x.common.service.atom.parkgps.IParkGpsAtomService;
import com.x.common.util.GpsUtil;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

@Component
public class ParkGpsAtomServiceImpl implements IParkGpsAtomService {

	Logger logger = LoggerFactory.getLogger(ParkGpsAtomServiceImpl.class);

	@Override
	public List<ParkGpsVo> queryParkGpsById(String parkId) {
		if (StringUtil.isBlank(parkId)) {
			return Collections.emptyList();
		}
		ParkGpsMapper pm = MapperFactory.getParkGpsMapper();
		ParkGpsCriteria example = new ParkGpsCriteria();
		Criteria cc = example.createCriteria();
		cc.andParkIdInnerEqualTo(parkId);
		List<ParkGps> reslut = pm.selectByExample(example);
		if (CollectionUtil.isEmpty(reslut)) {
			return Collections.emptyList();
		}
		List<ParkGpsVo> reslutvos = new ArrayList<>();
		for (ParkGps parkGps : reslut) {
			ParkGpsVo vo = new ParkGpsVo();
			BeanUtils.copyVO(vo, parkGps);
			reslutvos.add(vo);
		}
		return reslutvos;
	}

	@Override
	public List<ParkGpsVo> queryParkGpsByCacAndRadius(GpsMapPoint point, BigDecimal r) {

		Map<String, GpsMapPoint> maps = GpsUtil.get4PointByCac(point, r);
		ParkGpsMapper pm = MapperFactory.getParkGpsMapper();
		ParkGpsCriteria example = new ParkGpsCriteria();
		Criteria cc = example.createCriteria();
		cc.andMapLngBetween(maps.get(GpsConstants.Rectangle.LEFT).getMapLng(),
				maps.get(GpsConstants.Rectangle.RIGHT).getMapLng());
		cc.andMapLatBetween(maps.get(GpsConstants.Rectangle.BOTTOM).getMapLat(),
				maps.get(GpsConstants.Rectangle.TOP).getMapLat());
		List<ParkGps> reslut = pm.selectByExample(example);
		if (CollectionUtil.isEmpty(reslut)) {
			return Collections.emptyList();
		}
		List<ParkGpsVo> reslutvos = new ArrayList<>();
		for (ParkGps parkGps : reslut) {
			ParkGpsVo vo = new ParkGpsVo();
			BeanUtils.copyVO(vo, parkGps);
			reslutvos.add(vo);
		}
		return reslutvos;
	}

	@Override
	public List<ParkGpsVo> queryParkGpsLikeParkName(String parkName) {

		ParkGpsMapper pm = MapperFactory.getParkGpsMapper();
		ParkGpsCriteria example = new ParkGpsCriteria();
		Criteria cc = example.createCriteria();
		cc.andParkNameLike("%" + parkName + "%");
		List<ParkGps> reslut = pm.selectByExample(example);
		if (CollectionUtil.isEmpty(reslut)) {
			return Collections.emptyList();
		}
		List<ParkGpsVo> reslutvos = new ArrayList<>();
		for (ParkGps parkGps : reslut) {
			ParkGpsVo vo = new ParkGpsVo();
			BeanUtils.copyVO(vo, parkGps);
			reslutvos.add(vo);
		}
		return reslutvos;
	}

	@Override
	public PageInfo<ParkGpsVo> queryParkGpsPageInfoLikeParkName(String parkName, Integer pageNo, Integer pageSize) {
		List<ParkGpsVo> reslutvos = new ArrayList<>();
		PageInfo<ParkGpsVo> pageResult = new PageInfo<>();
		ParkGpsMapper pm = MapperFactory.getParkGpsMapper();
		ParkGpsCriteria example = new ParkGpsCriteria();
		int limitStart = (pageNo - 1) * pageSize;
		int limitEnd = pageSize;
		example.setLimitStart(limitStart);
		example.setLimitEnd(limitEnd);
		Criteria cc = example.createCriteria();
		cc.andParkNameLike("%" + parkName + "%");
		int count = pm.countByExample(example);
		pageResult.setCount(count);
		pageResult.setPageSize(pageSize);
		pageResult.setPageNo(pageNo);
		pageResult.setResult(reslutvos);
		if (0 == count) {
			return pageResult;
		}
		List<ParkGps> resluts = pm.selectByExample(example);
		if (CollectionUtil.isEmpty(resluts)) {
			return pageResult;
		}

		for (ParkGps parkGps : resluts) {
			ParkGpsVo vo = new ParkGpsVo();
			BeanUtils.copyVO(vo, parkGps);
			reslutvos.add(vo);
		}
		return pageResult;
	}

}

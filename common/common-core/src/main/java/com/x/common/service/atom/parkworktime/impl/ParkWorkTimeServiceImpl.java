package com.x.common.service.atom.parkworktime.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.x.common.api.parkgps.param.ParkWorkTimeVo;
import com.x.common.dao.mapper.bo.ParkWorkTime;
import com.x.common.dao.mapper.bo.ParkWorkTimeCriteria;
import com.x.common.dao.mapper.bo.ParkWorkTimeCriteria.Criteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.ParkWorkTimeMapper;
import com.x.common.service.atom.parkworktime.IParkWorkTimeService;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

@Component
public class ParkWorkTimeServiceImpl implements IParkWorkTimeService {
	Logger logger = LoggerFactory.getLogger(ParkWorkTimeServiceImpl.class);

	@Override
	public ParkWorkTimeVo getWorkBusyLevel(String parkId) {
		ParkWorkTimeMapper mapper = MapperFactory.getParkWorkTimeMapper();

		ParkWorkTimeCriteria example = new ParkWorkTimeCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andParkIdInnerEqualTo(parkId);
		List<ParkWorkTime> results = mapper.selectByExample(example);
		if (CollectionUtil.isEmpty(results)) {
			return null;
		}

		ParkWorkTime bo = results.get(0);
		ParkWorkTimeVo vo = new ParkWorkTimeVo();
		BeanUtils.copyVO(vo, bo);
		return vo;
	}

}

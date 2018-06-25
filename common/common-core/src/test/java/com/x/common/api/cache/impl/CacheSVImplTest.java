package com.x.common.api.cache.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.x.base.vo.PageInfo;
import com.x.common.api.area.param.AreaLevel;
import com.x.common.api.area.param.GnAreaCondition;
import com.x.common.api.area.param.GnAreaResponse;
import com.x.common.api.cache.interfaces.ICacheSV;
import com.x.common.api.parkgps.interfaces.IParkGpsSV;
import com.x.common.api.parkgps.param.ParkGpsPageInfoRequest;
import com.x.common.api.parkgps.param.ParkGpsPageInfoResponse;
import com.x.common.api.parkgps.param.ParkGpsRequest;
import com.x.common.api.parkgps.param.ParkGpsResponse;
import com.x.common.api.parkgps.param.ParkGpsVo;
import com.x.common.service.atom.area.IGnAreaAtomService;
import com.x.common.service.business.area.IGnAreaBusinessService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:context/core-context.xml")
public class CacheSVImplTest {

	@Autowired
	private transient ICacheSV iCacheSV;

	@Autowired
	private transient IParkGpsSV iParkGpsSV;

	@Autowired
	private transient IGnAreaBusinessService iGnAreaBusinessService;

	@Autowired
	private transient IGnAreaAtomService iGnAreaAtomService;

	@Test
	public void testGetAreaName() {
		System.out.println(iCacheSV.getAreaName("00"));
	}

	@Test
	public void testGetArea() {
		ParkGpsPageInfoRequest request = new ParkGpsPageInfoRequest();
		request .setParkName("%北门%");
		ParkGpsPageInfoResponse rep = iParkGpsSV.queryParkGpsLikeParkName(request);
		PageInfo<ParkGpsVo> results = rep.getResult();
		System.out.println(JSON.toJSONString(results));
	}

	@Test
	public void testGetSysParamList() {
		iGnAreaAtomService.getAreaListByLessThanLevel("2");
	}

	@Test
	public void testGetSysParamSingle() {
		GnAreaCondition condition = new GnAreaCondition();
		condition.setAreaLevel(AreaLevel.COUNTY_LEVEL);
		System.out.println(JSON.toJSONString(condition));
		GnAreaResponse vos = iGnAreaBusinessService.getAllAreaByLessThanLevel(condition);
		System.out.println(JSON.toJSONString(vos));
	}

	@Test
	public void testGetServiceNum() {
		fail("Not yet implemented");
	}

}

package com.x.common.api.cache.impl;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.x.common.api.area.interfaces.IGnAreaQuerySV;
import com.x.common.api.area.param.GnAreaVo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/applicationContextTest/dubbo-consumer-context.xml" })
public class CacheSVImplDubboTest {
	
	@Autowired
	protected ApplicationContext ctx;

	@Test
	public void testGetAreaName() {
		IGnAreaQuerySV iCacheSV = ctx.getBean(IGnAreaQuerySV.class);
		GnAreaVo areaCode = new GnAreaVo();
		areaCode.setAreaCode("");
		System.out.println(iCacheSV.queryGnArea(areaCode));
	}

	@Test
	public void testGetArea() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSysParamList() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSysParamSingle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetServiceNum() {
		fail("Not yet implemented");
	}

}

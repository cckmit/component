package com.x.sdk.appserver;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.x.common.api.area.param.GnAreaVo;

public class CacheServiceStartTest {

	public static void main(String[] args) {
		GnAreaVo vo = new GnAreaVo();
		vo.setAreaCode("34");
		List<GnAreaVo> childGnreas = new ArrayList<>();
		GnAreaVo element = new GnAreaVo();
		element.setAreaCode("340");
		childGnreas.add(element);
		GnAreaVo element1 = new GnAreaVo();
		element1.setAreaCode("341");
		childGnreas.add( element1);
		vo.setChildGnreas(childGnreas);
		
		System.out.println(JSON.toJSON(vo));
	}

}

package com.x.common.api.area.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.gson.Gson;
import com.x.base.exception.BusinessException;
import com.x.base.vo.PageInfo;
import com.x.common.api.area.interfaces.IGnAreaQuerySV;
import com.x.common.api.area.param.GnAreaCodeCondition;
import com.x.common.api.area.param.GnAreaCondition;
import com.x.common.api.area.param.GnAreaPageCondition;
import com.x.common.api.area.param.GnAreaPageFilterCondition;
import com.x.common.api.area.param.GnAreaResponse;
import com.x.common.api.area.param.GnAreaVo;
import com.x.common.dao.mapper.bo.GnArea;
import com.x.common.service.business.area.IGnAreaBusinessService;
import com.x.common.util.VoValidateUtils;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

@Service
@Component
public class GnAreaQuerySVImpl implements IGnAreaQuerySV {

	@Autowired
	private IGnAreaBusinessService iGnAreaBusinessService;

	@Override
	public GnAreaVo selectByID(GnAreaCondition condition) {
		if (StringUtils.isEmpty(condition.getAreaCode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区域编码不能为空");
		}
		Gson gson = new Gson();
		return gson.fromJson(gson.toJson(iGnAreaBusinessService.selectByID(condition.getAreaCode())), GnAreaVo.class);
	}

	@Override
	public GnAreaResponse queryGnArea(GnAreaVo areaCode) {
		if (StringUtils.isEmpty(areaCode.getAreaCode())) {
			throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "区域编码不能为空");
		}
		Gson gson = new Gson();

		GnAreaVo vo = gson.fromJson(gson.toJson(iGnAreaBusinessService.selectByID(areaCode.getAreaCode())),
				GnAreaVo.class);
		List<GnAreaVo> vos = new ArrayList<>();
		if (null != vo) {
			vos.add(vo);
		}
		GnAreaResponse rep = new GnAreaResponse();
		rep.setGnareas(vos);
		return rep;
	}

	@Override
	public GnAreaResponse getProvinceList() {
		List<GnArea> dbList = iGnAreaBusinessService.getProvinceList();
		List<GnAreaVo> resultList = null;
		if (!CollectionUtil.isEmpty(dbList)) {
			resultList = new ArrayList<>();
			for (GnArea area : dbList) {
				GnAreaVo areavo = new GnAreaVo();
				BeanUtils.copyProperties(areavo, area);
				resultList.add(areavo);
			}
		}
		GnAreaResponse rep = new GnAreaResponse();
		rep.setGnareas(resultList);
		return rep;
	}

	@Override
	public GnAreaResponse getParentAreaListByAreaCode(GnAreaCodeCondition condition) {
		VoValidateUtils.validateGetParentAreaListByAreaCode(condition);
		List<GnArea> dbList = iGnAreaBusinessService.getParentAreaListByAreaCode(condition);
		List<GnAreaVo> resultList = null;
		if (!CollectionUtil.isEmpty(dbList)) {
			resultList = new ArrayList<>();
			for (GnArea area : dbList) {
				GnAreaVo areavo = new GnAreaVo();
				BeanUtils.copyProperties(areavo, area);
				resultList.add(areavo);
			}
		}
		GnAreaResponse rep = new GnAreaResponse();
		rep.setGnareas(resultList);
		return rep;
	}

	@Override
	public GnAreaResponse getCityListByProviceCode(GnAreaVo provinceCode) {
		VoValidateUtils.validateGetCityListByProviceCode(provinceCode.getProvinceCode());
		List<GnArea> dbList = iGnAreaBusinessService.getCityListByProviceCode(provinceCode.getProvinceCode());
		List<GnAreaVo> resultList = null;
		if (!CollectionUtil.isEmpty(dbList)) {
			resultList = new ArrayList<>();
			for (GnArea area : dbList) {
				GnAreaVo areavo = new GnAreaVo();
				BeanUtils.copyProperties(areavo, area);
				resultList.add(areavo);
			}
		}
		GnAreaResponse rep = new GnAreaResponse();
		rep.setGnareas(resultList);
		return rep;
	}

	@Override
	public GnAreaResponse getCountyListByCityCode(GnAreaVo cityCode) {
		VoValidateUtils.validateGetCountyListByCityCode(cityCode.getCityCode());
		List<GnArea> dbList = iGnAreaBusinessService.getCountyListByCityCode(cityCode.getCityCode());
		List<GnAreaVo> resultList = null;
		if (!CollectionUtil.isEmpty(dbList)) {
			resultList = new ArrayList<>();
			for (GnArea area : dbList) {
				GnAreaVo areavo = new GnAreaVo();
				BeanUtils.copyProperties(areavo, area);
				resultList.add(areavo);
			}
		}
		GnAreaResponse rep = new GnAreaResponse();
		rep.setGnareas(resultList);
		return rep;
	}

	@Override
	public List<GnAreaVo> getStreetListByCountyCode(String countyCode) {
		VoValidateUtils.validateGetStreetListByCountyCode(countyCode);
		List<GnArea> dbList = iGnAreaBusinessService.getStreetListByCountyCode(countyCode);
		List<GnAreaVo> resultList = null;
		if (!CollectionUtil.isEmpty(dbList)) {
			resultList = new ArrayList<>();
			for (GnArea area : dbList) {
				GnAreaVo areavo = new GnAreaVo();
				BeanUtils.copyProperties(areavo, area);
				resultList.add(areavo);
			}
		}

		return resultList;
	}

	@Override
	public PageInfo<GnAreaVo> getAreaListByPage(GnAreaPageCondition areaPage) {
		VoValidateUtils.validateGetAreaListByPage(areaPage);
		return iGnAreaBusinessService.getAreaListByPage(areaPage);
	}

	@Override
	public List<GnAreaVo> getNationList() {
		List<GnArea> dbList = iGnAreaBusinessService.getNationList();
		List<GnAreaVo> resultList = null;
		if (!CollectionUtil.isEmpty(dbList)) {
			resultList = new ArrayList<>();
			for (GnArea area : dbList) {
				GnAreaVo areavo = new GnAreaVo();
				BeanUtils.copyProperties(areavo, area);
				resultList.add(areavo);
			}
		}

		return resultList;
	}

	@Override
	public PageInfo<GnAreaVo> getFilterAreaListByPage(GnAreaPageFilterCondition areaPage) {
		VoValidateUtils.validateGetFilterAreaListByPage(areaPage);
		return iGnAreaBusinessService.getFilterAreaListByPage(areaPage);
	}

	@Override
	public List<GnAreaVo> getAreaByName(GnAreaCondition condition) {
		List<GnArea> dbList = iGnAreaBusinessService.selectByName(condition);
		List<GnAreaVo> resultList = null;
		if (!CollectionUtil.isEmpty(dbList)) {
			resultList = new ArrayList<>();
			for (GnArea area : dbList) {
				GnAreaVo areavo = new GnAreaVo();
				BeanUtils.copyProperties(areavo, area);
				resultList.add(areavo);
			}
		}
		return resultList;
	}

	@Override
	public GnAreaResponse getAllAreaByLessThanLevel(GnAreaCondition condition) {
		VoValidateUtils.validateGetAllAreaByLessThanLevel(condition);

		return iGnAreaBusinessService.getAllAreaByLessThanLevel(condition);
	}

	@Override
	public GnAreaResponse getAllAreaByLessThanOrEqualLevel(GnAreaCondition condition) {
		VoValidateUtils.validateGetAllAreaByLessThanLevel(condition);

		return iGnAreaBusinessService.getAllAreaByLessThanOrEqualLevel(condition);
	}
}

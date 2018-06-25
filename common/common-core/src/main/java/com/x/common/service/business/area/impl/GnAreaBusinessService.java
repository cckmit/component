package com.x.common.service.business.area.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.vo.PageInfo;
import com.x.common.api.area.param.GnAreaCodeCondition;
import com.x.common.api.area.param.GnAreaCondition;
import com.x.common.api.area.param.GnAreaPageCondition;
import com.x.common.api.area.param.GnAreaPageFilterCondition;
import com.x.common.api.area.param.GnAreaResponse;
import com.x.common.api.area.param.GnAreaVo;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.GnArea;
import com.x.common.service.atom.area.impl.GnAreaAtomServiceImpl;
import com.x.common.service.business.area.IGnAreaBusinessService;
import com.x.common.util.AreaCacheUtil;
import com.x.common.util.CommonSeqUtil;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

@Component
@Transactional
public class GnAreaBusinessService implements IGnAreaBusinessService {

	@Autowired
	private GnAreaAtomServiceImpl gnAreaAtomService;

	@Override
	public List<GnArea> select(GnAreaCondition condition) {
		return gnAreaAtomService.select(condition);
	}

	@Override
	public GnArea selectByID(String areaCode) {
		return gnAreaAtomService.selectByID(areaCode);
	}

	@Override
	public List<GnArea> getProvinceList() {
		return gnAreaAtomService.getProvinceList();
	}

	@Override
	public List<GnArea> getParentAreaListByAreaCode(GnAreaCodeCondition condition) {
		return gnAreaAtomService.getParentAreaListByAreaCode(condition);
	}

	@Override
	public List<GnArea> getCityListByProviceCode(String provinceCode) {
		return gnAreaAtomService.getCityListByProviceCode(provinceCode);
	}

	@Override
	public List<GnArea> getCountyListByCityCode(String cityCode) {
		return gnAreaAtomService.getCountyListByCityCode(cityCode);
	}

	@Override
	public List<GnArea> getStreetListByCountyCode(String countyCode) {
		return gnAreaAtomService.getStreetListByCountyCode(countyCode);
	}

	@Override
	public List<GnArea> getAreaListByStreetCode(String streetCode) {
		return gnAreaAtomService.getAreaListByStreetCode(streetCode);
	}

	@Override
	public String addArea(GnAreaVo area) {
		GnArea bo = new GnArea();
		BeanUtils.copyProperties(bo, area);
		bo.setAreaCode(CommonSeqUtil.getAreaCode());
		bo.setState(Constants.AreaState.ACTIVITY);
		String areaCode = gnAreaAtomService.addArea(bo);
		AreaCacheUtil.updateAreaCacheData(bo);
		return areaCode;
	}

	@Override
	public void modifyArea(GnAreaVo area) {
		GnArea bo = new GnArea();
		BeanUtils.copyProperties(bo, area);
		gnAreaAtomService.modifyArea(bo);
		GnArea newbo = gnAreaAtomService.selectByID(area.getAreaCode());
		AreaCacheUtil.updateAreaCacheData(newbo);
	}

	@Override
	public void deleteArea(GnAreaCondition gnAreaCondition) {
		gnAreaAtomService.deleteArea(gnAreaCondition);
	}

	@Override
	public void deleteAreas(List<GnAreaCondition> gnAreaCondition) {
		gnAreaAtomService.deleteAreas(gnAreaCondition);
	}

	@Override
	public PageInfo<GnAreaVo> getAreaListByPage(GnAreaPageCondition areaPage) {
		PageInfo<GnAreaVo> pageResult = new PageInfo<>();
		PageInfo<GnArea> pageInfo = gnAreaAtomService.getAreaListByPage(areaPage);
		pageResult.setCount(pageInfo.getCount());
		pageResult.setPageSize(pageInfo.getPageSize());
		pageResult.setPageNo(pageInfo.getPageNo());
		List<GnAreaVo> areaVoList = new ArrayList<>();
		if (pageInfo.getResult() != null && !CollectionUtil.isEmpty(pageInfo.getResult())) {
			for (GnArea area : pageInfo.getResult()) {
				GnAreaVo areaVo = new GnAreaVo();
				BeanUtils.copyProperties(areaVo, area);
				areaVoList.add(areaVo);
			}
			pageResult.setResult(areaVoList);
		}
		return pageResult;
	}

	@Override
	public List<GnArea> getNationList() {
		return gnAreaAtomService.getNationList();
	}

	@Override
	public PageInfo<GnAreaVo> getFilterAreaListByPage(GnAreaPageFilterCondition areaPage) {
		PageInfo<GnAreaVo> pageResult = new PageInfo<>();
		PageInfo<GnArea> pageInfo = gnAreaAtomService.getFilterAreaListByPage(areaPage);
		pageResult.setCount(pageInfo.getCount());
		pageResult.setPageSize(pageInfo.getPageSize());
		pageResult.setPageNo(pageInfo.getPageNo());
		List<GnAreaVo> areaVoList = new ArrayList<>();
		if (pageInfo.getResult() != null && !CollectionUtil.isEmpty(pageInfo.getResult())) {
			for (GnArea area : pageInfo.getResult()) {
				GnAreaVo areaVo = new GnAreaVo();
				BeanUtils.copyProperties(areaVo, area);
				areaVoList.add(areaVo);
			}
			pageResult.setResult(areaVoList);
		}
		return pageResult;
	}

	@Override
	public List<GnArea> selectByName(GnAreaCondition condition) {
		return gnAreaAtomService.selectByName(condition);
	}

	@Override
	public GnAreaResponse getAllAreaByLessThanLevel(GnAreaCondition condition) {
		GnAreaResponse rep = new GnAreaResponse();
		String areaLevelStr = condition.getAreaLevel().getLevelValue();
		String rootAreaCode = condition.getAreaCode();
		List<GnArea> areas = gnAreaAtomService.getAreaListByLessThanLevel(areaLevelStr);
		if (CollectionUtil.isEmpty(areas)) {
			return rep;
		}

		List<GnAreaVo> gnareas = new ArrayList<>();

		if (!CollectionUtil.isEmpty(areas)) {
			for (GnArea bo : areas) {
				GnAreaVo vo = new GnAreaVo();
				this.bo2vo(vo, bo);
				gnareas.add(vo);
			}
		}

		rep.setGnareas(createTreeMenus(gnareas, StringUtil.isBlank(rootAreaCode) ? "00" : rootAreaCode));
		return rep;
	}

	public List<GnAreaVo> createTreeMenus(List<GnAreaVo> menus, String rootAreaCode) {
		List<GnAreaVo> treeMenus = null;
		if (null != menus && !menus.isEmpty()) {
			// 创建根节点
			GnAreaVo root = new GnAreaVo();
			// 组装Map数据
			Map<String, GnAreaVo> dataMap = new HashMap<>();
			for (GnAreaVo menu : menus) {
				dataMap.put(menu.getAreaCode(), menu);
			}

			// 组装树形结构
			Set<Entry<String, GnAreaVo>> entrySet = dataMap.entrySet();
			for (Entry<String, GnAreaVo> entry : entrySet) {
				GnAreaVo menu = entry.getValue();
				if (rootAreaCode.equals(menu.getAreaCode())) {
					root.getChildGnreas().add(menu);
				} else {
					GnAreaVo parentMenu = dataMap.get(menu.getParentAreaCode());
					if (null != parentMenu) {
						parentMenu.getChildGnreas().add(menu);
					}
				}
			}

			// 对树形结构进行二叉树排序,需要自己实现排序方法
			/*** root.sortChildren(); */
			treeMenus = root.getChildGnreas();
		}
		return treeMenus;
	}

	private void bo2vo(GnAreaVo vo, GnArea bo) {
		vo.setAreaCode(bo.getAreaCode());
		vo.setAreaLevel(bo.getAreaLevel());
		vo.setAreaName(bo.getAreaName());
		vo.setCityCode(bo.getCityCode());
		vo.setParentAreaCode(bo.getParentAreaCode());
		vo.setProvinceCode(bo.getProvinceCode());
		vo.setSortId(bo.getSortId());
		vo.setTenantId(bo.getTenantId());
	}

	@Override
	public GnAreaResponse getAllAreaByLessThanOrEqualLevel(GnAreaCondition condition) {
		GnAreaResponse rep = new GnAreaResponse();
		String areaLevelStr = condition.getAreaLevel().getLevelValue();
		String rootAreaCode = condition.getAreaCode();
		List<GnArea> areas = gnAreaAtomService.getAreaListByLessThanOrEqualLevel(areaLevelStr);
		if (CollectionUtil.isEmpty(areas)) {
			return rep;
		}

		List<GnAreaVo> gnareas = new ArrayList<>();

		if (!CollectionUtil.isEmpty(areas)) {
			for (GnArea bo : areas) {
				GnAreaVo vo = new GnAreaVo();
				this.bo2vo(vo, bo);
				gnareas.add(vo);
			}
		}

		rep.setGnareas(createTreeMenus(gnareas, StringUtil.isBlank(rootAreaCode) ? "00" : rootAreaCode));
		return rep;
	}

}

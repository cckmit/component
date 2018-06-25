package com.x.common.api.area.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.PageInfo;
import com.x.common.api.area.param.GnAreaCodeCondition;
import com.x.common.api.area.param.GnAreaCondition;
import com.x.common.api.area.param.GnAreaPageCondition;
import com.x.common.api.area.param.GnAreaPageFilterCondition;
import com.x.common.api.area.param.GnAreaResponse;
import com.x.common.api.area.param.GnAreaVo;

/**
 * 区域查询服务<br>
 * Date: 2016年5月30日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 *
 * @author auth
 */
@Path("/areaquery")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IGnAreaQuerySV {

	/**
	 * 根据区域编码获取详细信息.
	 * <p/>
	 * 根据传入的区域ID来查询详情,如果传入的区域ID为空，则抛出异常.
	 *
	 * @param condition
	 * @return
	 * @throws BusinessException,SystemException
	 * @ApiDocMethod
	 * @ApiCode GN_0101
	 * @RestRelativeURL areaquery/selectByID
	 */
	@POST
	@Path("/selectByID")
	GnAreaVo selectByID(GnAreaCondition condition);

	/**
	 * 根据地域编码获取地域信息
	 * 
	 * @param areaCode
	 *            地域编码
	 * @return 地域信息
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode CTR_COMMON_AREA_001
	 * @RestRelativeURL areaquery/queryGnArea
	 */
	@POST
	@Path("/queryGnArea")
	GnAreaResponse queryGnArea(GnAreaVo areaCode);

	/**
	 * 获取所有的省份列表.
	 *
	 * @return 所有省份列表
	 * @throws BusinessException,SystemException
	 * @ApiDocMethod
	 * @ApiCode CTR_COMMON_AREA_002
	 * @RestRelativeURL areaquery/getProvinceList
	 */
	@POST
	@Path("/getProvinceList")
	GnAreaResponse getProvinceList();

	/**
	 * 根据小区编码获取对应的所有上级区域列表
	 * 
	 * @return
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode GN_0104
	 * @RestRelativeURL areaquery/getParentAreaListByAreaCode
	 */
	@POST
	@Path("/getParentAreaListByAreaCode")
	GnAreaResponse getParentAreaListByAreaCode(GnAreaCodeCondition condition);

	/**
	 * 根据省份code，查找所有的城市列表
	 * 
	 * @param provinceCode
	 *            省份code
	 * @return
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode CTR_COMMON_AREA_003
	 * @RestRelativeURL areaquery/getCityListByProviceCode
	 */
	@POST
	@Path("/getCityListByProviceCode")
	GnAreaResponse getCityListByProviceCode(GnAreaVo provinceCode);

	/**
	 * 根据城市code，查找所有的区县列表
	 * 
	 * @param cityCode
	 *            城市code
	 * @return
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode CTR_COMMON_AREA_004
	 * @RestRelativeURL areaquery/getCountyListByCityCode
	 */
	@POST
	@Path("/getCountyListByCityCode")
	GnAreaResponse getCountyListByCityCode(GnAreaVo cityCode);

	/**
	 * 根据区县code，查找所有的街道列表
	 * 
	 * @param countyCode
	 *            区县code
	 * @return
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode GN_0107
	 * @RestRelativeURL areaquery/getStreetListByCountyCode
	 */
	@POST
	@Path("/getStreetListByCountyCode")
	List<GnAreaVo> getStreetListByCountyCode(String countyCode);

	/**
	 * 分页查询
	 * 
	 * @param areaPage
	 * @return
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode GN_0109
	 * @RestRelativeURL areaquery/getAreaListByPage
	 */
	@POST
	@Path("/getAreaListByPage")
	PageInfo<GnAreaVo> getAreaListByPage(GnAreaPageCondition areaPage);

	/**
	 * 获取全国列表
	 * 
	 * @return
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode GN_0110
	 * @RestRelativeURL areaquery/getNationList
	 */
	@POST
	@Path("/getNationList")
	List<GnAreaVo> getNationList();

	/**
	 * 小区（街道下的小区）分页查询(可过滤指定areacodeList)
	 * 
	 * @param areaPage
	 * @return
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode GN_0111
	 * @RestRelativeURL areaquery/getFilterAreaListByPage
	 */
	@POST
	@Path("/getFilterAreaListByPage")
	PageInfo<GnAreaVo> getFilterAreaListByPage(GnAreaPageFilterCondition areaPage);

	/**
	 * 根据省份名称、级别查询数据
	 * 
	 * @param condition
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode
	 * @RestRelativeURL areaquery/getAreaByName
	 */
	@POST
	@Path("/getAreaByName")
	List<GnAreaVo> getAreaByName(GnAreaCondition condition);

	/**
	 * 根据省份名称、级别查询数据
	 * 
	 * @param condition
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode CTR_COMMON_AREA_005
	 * @RestRelativeURL areaquery/getAllAreaByLessThanLevel
	 */
	@POST
	@Path("/getAllAreaByLessThanLevel")
	GnAreaResponse getAllAreaByLessThanLevel(GnAreaCondition condition);

	/**
	 * 根据省份名称、级别查询数据
	 * 
	 * @param condition
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode CTR_COMMON_AREA_006
	 * @RestRelativeURL areaquery/getAllAreaByLessThanOrEqualLevel
	 */
	@POST
	@Path("/getAllAreaByLessThanOrEqualLevel")
	GnAreaResponse getAllAreaByLessThanOrEqualLevel(GnAreaCondition condition);
}

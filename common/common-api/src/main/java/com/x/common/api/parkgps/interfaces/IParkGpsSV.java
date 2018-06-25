package com.x.common.api.parkgps.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.parkgps.param.ParkGpsPageInfoRequest;
import com.x.common.api.parkgps.param.ParkGpsPageInfoResponse;
import com.x.common.api.parkgps.param.ParkGpsRegionRequest;
import com.x.common.api.parkgps.param.ParkGpsResponse;
import com.x.common.api.parkgps.param.ParkGpsVo;

/**
 * 公共域-停车场相关<br>
 * Date: 2018年2月7日 <br>
 * Copyright (c) 2018 bonc.com.cn <br>
 * 
 * @author auth
 */
@Path("/parkgps")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IParkGpsSV {
	/**
	 * 根据停车场id查询停车场位置信息
	 * 
	 * @param parkId
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode CTR_COMMON_PARK_002
	 * @ApiDocMethod
	 * @RestRelativeURL parkgps/queryParkGpsById
	 */
	@POST
	@Path("/queryParkGpsById")
	ParkGpsResponse queryParkGpsById(ParkGpsVo parkgpsvo) throws BusinessException, SystemException;

	/**
	 * 查询指定坐标和半径范围内的停车点坐标信息。
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode CTR_COMMON_PARK_003
	 * @ApiDocMethod
	 * @RestRelativeURL parkgps/queryParkGpsByCacAndRadius
	 */
	@POST
	@Path("/queryParkGpsByCacAndRadius")
	ParkGpsResponse queryParkGpsByCacAndRadius(ParkGpsRegionRequest request) throws BusinessException, SystemException;

	/**
	 * 根据停车场信息模糊查询停车场列表。
	 * 
	 * @param request
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode CTR_COMMON_PARK_004
	 * @ApiDocMethod
	 * @RestRelativeURL parkgps/queryParkGpsLikeParkName
	 */
	@POST
	@Path("/queryParkGpsLikeParkName")
	ParkGpsPageInfoResponse queryParkGpsLikeParkName(ParkGpsPageInfoRequest request)
			throws BusinessException, SystemException;

	/**
	 * 根据停车场id查询停车场详细信息
	 * 
	 * @param parkId
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode CTR_COMMON_PARK_005
	 * @ApiDocMethod
	 * @RestRelativeURL parkgps/queryParkGpsInfoById
	 */
	@POST
	@Path("/queryParkGpsInfoById")
	ParkGpsResponse queryParkGpsInfoById(ParkGpsVo parkgpsvo) throws BusinessException, SystemException;

	/**
	 * 车场信息同步<br>
	 * 逻辑如下：<br>
	 * 1.根据parkIdOuter判断停车场信息是否已存在；<br>
	 * 2.存在则更新；<br>
	 * 3.不存在则新增；<br>
	 * 4.更新规则：属性赋值则更新，不赋值则不更新。
	 * 
	 * @param parkgpsvo
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode CTR_COMMON_PARK_006
	 * @ApiDocMethod
	 * @RestRelativeURL parkgps/syncParkGpsInfo
	 */
	@POST
	@Path("/syncParkGpsInfo")
	ParkGpsResponse syncParkGpsInfo(ParkGpsVo parkgpsvo) throws BusinessException, SystemException;
}

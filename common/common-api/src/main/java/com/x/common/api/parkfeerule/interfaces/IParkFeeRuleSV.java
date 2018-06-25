package com.x.common.api.parkfeerule.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.parkfeerule.param.ParkFeeRuleResponse;
import com.x.common.api.parkfeerule.param.ParkFeeRuleVo;

/**
 * 公共域-停车场费用相关<br>
 * Date: 2018年2月7日 <br>
 * Copyright (c) 2018 bonc.com.cn <br>
 * 
 * @author auth
 */
@Path("/parkfeerule")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IParkFeeRuleSV {
	/**
	 * 查询停车场费用信息
	 * 
	 * @param feeStandardId
	 * @return
	 * @throws BusinessException
	 * @throws SystemException
	 * @author auth
	 * @ApiCode CTR_COMMON_PARK_001
	 * @ApiDocMethod
	 * @RestRelativeURL parkfeerule/queryParkFeeRuleById
	 */
	@POST
	@Path("/queryParkFeeRuleById")
	ParkFeeRuleResponse queryParkFeeRuleById(ParkFeeRuleVo parkFeeRuleVo) throws BusinessException, SystemException;

}

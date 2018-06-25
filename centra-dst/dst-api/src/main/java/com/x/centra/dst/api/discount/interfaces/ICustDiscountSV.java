package com.x.centra.dst.api.discount.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.centra.dst.api.discount.param.CustDiscountClassQueryParam;
import com.x.centra.dst.api.discount.param.CustDiscountParam;
import com.x.centra.dst.api.discount.param.CustDiscountQueryParam;
import com.x.centra.dst.api.discount.param.CustDiscountQueryResponse;
import com.x.centra.dst.api.discount.param.CustDiscountResponse;
import com.x.centra.dst.api.discount.param.CustLevelInstanceQueryParam;
import com.x.centra.dst.api.discount.param.CustLevelInstanceResponseVo;
import com.x.centra.dst.api.discount.param.DiscountClassQueryResponse;

@Path("/custDiscount")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ICustDiscountSV {
	
	/**
     * 客户权益信息查询（分页）
     * 
     * @param CustDiscountQueryParam
     * @return CustDiscountQueryResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode ICustDiscountSV_001
     * @RestRelativeURL custDiscount/queryCustDiscountInfo
     */
	@POST
    @Path("/queryCustDiscountInfo")
	CustDiscountQueryResponse queryCustDiscountInfo(CustDiscountQueryParam discountQueryParam) throws BusinessException, SystemException;

	/**
	 * 客户权益等级查询
	 *
	 * @param queryParam
	 * @return CustLevelInstanceResponseVo
	 * @throws BusinessException, SystemException
	 * @author wubo
	 * @ApiDocMethod
	 * @ApiCode ICustDiscountSV_002
	 * @RestRelativeURL custDiscount/queryCustLevelInstance
	 */
	@POST
	@Path("/queryCustLevelInstance")
	CustLevelInstanceResponseVo queryCustLevelInstance(CustLevelInstanceQueryParam queryParam) throws BusinessException, SystemException;
	
	/**
	 * 客户权益类型查询
	 *
	 * @param CustDiscountClassQueryParam
	 * @return DiscountClassQueryResponse
	 * @throws BusinessException, SystemException
	 * @author wangly
	 * @ApiDocMethod
	 * @ApiCode ICustDiscountSV_003
	 * @RestRelativeURL custDiscount/queryCustDiscountClass
	 */
	@POST
	@Path("/queryCustDiscountClass")
	DiscountClassQueryResponse queryCustDiscountClass(CustDiscountClassQueryParam queryParam) throws BusinessException, SystemException;
	
	/**
     * 客户权益信息查询
     * 
     * @param CustDiscountParam
     * @return CustDiscountResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode ICustDiscountSV_004
     * @RestRelativeURL custDiscount/queryCustDiscountInfoList
     */
	@POST
    @Path("/queryCustDiscountInfoList")
	CustDiscountResponse queryCustDiscountInfoList(CustDiscountParam discountQueryParam) throws BusinessException, SystemException;
}

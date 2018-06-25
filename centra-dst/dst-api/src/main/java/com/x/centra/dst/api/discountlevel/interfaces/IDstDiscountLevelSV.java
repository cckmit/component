package com.x.centra.dst.api.discountlevel.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelCRUDRequest;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelCRUDResponse;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListRequest;
import com.x.centra.dst.api.discountlevel.param.DstDisCountLevelListResponse;

@Path("/dstDiscountLevel")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IDstDiscountLevelSV {

	/**
	 * 客户级别定义信息查询
	 * 
	 * @param CustDiscountQueryParam
	 * @return CustDiscountQueryResponse
	 * @throws BusinessException
	 * @throws SystemException
	 * @author baixin
	 * @ApiDocMethod
	 * @ApiCode IDstDiscountLevelSV_001
	 * @RestRelativeURL dstDiscountLevel/queryDstDiscountLevel
	 */
	@POST
	@Path("/queryDstDiscountLevel")
	DstDisCountLevelListResponse queryDstDiscountLevel(DstDisCountLevelListRequest request)
			throws BusinessException, SystemException;

	/**
	 * 客户级别定义信息查询
	 * 
	 * @param CustDiscountQueryParam
	 * @return CustDiscountQueryResponse
	 * @throws BusinessException
	 * @throws SystemException
	 * @author baixin
	 * @ApiDocMethod
	 * @ApiCode IDstDiscountLevelSV_002
	 * @RestRelativeURL dstDiscountLevel/addDstDiscountLevel
	 */
	@POST
	@Path("/addDstDiscountLevel")
	DstDisCountLevelCRUDResponse addDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException;

	/**
	 * 客户级别定义信息更新
	 * 
	 * @param CustDiscountQueryParam
	 * @return CustDiscountQueryResponse
	 * @throws BusinessException
	 * @throws SystemException
	 * @author baixin
	 * @ApiDocMethod
	 * @ApiCode IDstDiscountLevelSV_003
	 * @RestRelativeURL dstDiscountLevel/updateDstDiscountLevel
	 */
	@POST
	@Path("/updateDstDiscountLevel")
	public DstDisCountLevelCRUDResponse updateDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException;

	/**
	 * 客户级别定义信息删除
	 * 
	 * @param CustDiscountQueryParam
	 * @return CustDiscountQueryResponse
	 * @throws BusinessException
	 * @throws SystemException
	 * @author baixin
	 * @ApiDocMethod
	 * @ApiCode IDstDiscountLevelSV_004
	 * @RestRelativeURL dstDiscountLevel/deleteDstDiscountLevel
	 */
	@POST
	@Path("/deleteDstDiscountLevel")
	public DstDisCountLevelCRUDResponse deleteDstDiscountLevel(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException;

	/**
	 * 客户级别定义信息查询明细
	 * 
	 * @param CustDiscountQueryParam
	 * @return CustDiscountQueryResponse
	 * @throws BusinessException
	 * @throws SystemException
	 * @author baixin
	 * @ApiDocMethod
	 * @ApiCode IDstDiscountLevelSV_005
	 * @RestRelativeURL dstDiscountLevel/queryDstDiscountLevelDetail
	 */
	@POST
	@Path("/queryDstDiscountLevelDetail")
	public DstDisCountLevelCRUDResponse queryDstDiscountLevelDetail(DstDisCountLevelCRUDRequest request)
			throws BusinessException, SystemException;
}

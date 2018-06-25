package com.x.centra.dst.api.discount.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.centra.dst.api.discount.param.BaseParamQueryVo;
import com.x.centra.dst.api.discount.param.BaseParamResponse;
import com.x.centra.dst.api.discount.param.DiscountClassQueryParam;
import com.x.centra.dst.api.discount.param.DiscountClassQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountClassVo;
import com.x.centra.dst.api.discount.param.DiscountDeleteParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryParam;
import com.x.centra.dst.api.discount.param.DiscountInfoQueryResponse;
import com.x.centra.dst.api.discount.param.DiscountInfoVo;
import com.x.centra.dst.api.discount.param.DiscountVerifyVo;
import com.x.centra.dst.api.discount.param.ExistParamRequest;
import com.x.centra.dst.api.discount.param.ExistParamResponse;

@Path("/discount")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IDiscountManagementSV {

	
	/**
     * 新增/修改权益类型
     * 
     * @param DiscountClassVo
     * @return BaseResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_001
     * @RestRelativeURL custDiscount/saveDiscountClass
     */
	@POST
    @Path("/saveDiscountClass")
	BaseResponse saveDiscountClass(DiscountClassVo param) throws BusinessException, SystemException;
	
	/**
     * 新增/修改权益信息
     * 
     * @param DiscountInfoVo
     * @return BaseResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_002
     * @RestRelativeURL discount/saveDiscountInfo
     */
	@POST
    @Path("/saveDiscountInfo")
	BaseResponse saveDiscountInfo(DiscountInfoVo param) throws BusinessException, SystemException;
	
	/**
     * 权益信息审核
     * 
     * @param DiscountVerifyVo
     * @return BaseResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_003
     * @RestRelativeURL discount/verifyDiscountInfo
     */
	@POST
    @Path("/verifyDiscountInfo")
	BaseResponse verifyDiscountInfo(DiscountVerifyVo param) throws BusinessException, SystemException;
	
	/**
     * 权益类型查询
     * 
     * @param DiscountClassQueryParam
     * @return DiscountClassQueryResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_004
     * @RestRelativeURL discount/queryDiscountClass
     */
	@POST
    @Path("/queryDiscountClass")
	DiscountClassQueryResponse queryDiscountClass(DiscountClassQueryParam infoQueryParam) throws BusinessException, SystemException;
	
	/**
     * 权益信息查询，支持分页
     * 
     * @param DiscountInfoQueryParam
     * @return DiscountInfoQueryResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_005
     * @RestRelativeURL discount/queryDiscountInfo
     */
	@POST
    @Path("/queryDiscountInfo")
	DiscountInfoQueryResponse queryDiscountInfo(DiscountInfoQueryParam infoQueryParam) throws BusinessException, SystemException;
	
	/**
     * 删除权益信息
     * 
     * @param DiscountDeleteParam
     * @return BaseResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_006
     * @RestRelativeURL discount/deleteDiscountInfo
     */
	@POST
    @Path("/deleteDiscountInfo")
	BaseResponse deleteDiscountInfo(DiscountDeleteParam param) throws BusinessException, SystemException;
	
	/**
     * 验证权益分类编码是否重复
     * 
     * @param ExistParamRequest
     * @return ExistParamResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_007
     * @RestRelativeURL discount/existClassCode
     */
	@POST
    @Path("/existClassCode")
	ExistParamResponse existClassCode(ExistParamRequest param) throws BusinessException, SystemException;
	
	/**
     * 验证权益编码是否重复
     * 
     * @param ExistParamRequest
     * @return ExistParamResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_008
     * @RestRelativeURL discount/existDiscountCode
     */
	@POST
    @Path("/existDiscountCode")
	ExistParamResponse existDiscountCode(ExistParamRequest param) throws BusinessException, SystemException;
	
	/**
     * 验证权益级别编码是否重复
     * 
     * @param ExistParamRequest
     * @return ExistParamResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_009
     * @RestRelativeURL discount/existLevelCode
     */
	@POST
    @Path("/deleteDiscountInfo")
	ExistParamResponse existLevelCode(ExistParamRequest param) throws BusinessException, SystemException;
	
	/**
     * 基本参数查询
     * 
     * @param queryBaseParam
     * @return BaseParamResponse
     * @throws BusinessException, SystemException
     * @author wangly
     * @ApiDocMethod
     * @ApiCode IDiscountManagementSV_010
     * @RestRelativeURL discount/queryBaseParam
     */
	@POST
    @Path("/queryBaseParam")
	BaseParamResponse queryBaseParam(BaseParamQueryVo param) throws BusinessException, SystemException;
}

package com.x.common.api.office.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseInfo;
import com.x.common.api.office.param.OfficeAllQueryResponse;
import com.x.common.api.office.param.OfficeChildrenListQueryRequest;
import com.x.common.api.office.param.OfficeChildrenListQueryResponse;
import com.x.common.api.office.param.OfficeDetailQueryRequest;
import com.x.common.api.office.param.OfficeDetailQueryResponse;
import com.x.common.api.office.param.OfficeParentListQueryRequest;
import com.x.common.api.office.param.OfficeParentListQueryResponse;

/**
 * 组织机构对外接口
 * @author auth
 *
 */
@Path("/officeservice")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface ISysOfficeQuerySV {
	/**
	 * 通过id查询组织机构信息
	 * @param queryRequest id必填 tenantId必填
	 * @return 组织机构信息
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiCode PLAT_004
	 * @RestRelativeURL officeservice/queryOfficeDetail
	 */
	@POST
	@Path("/queryOfficeDetail")
	OfficeDetailQueryResponse queryOfficeDetail(OfficeDetailQueryRequest queryRequest) throws BusinessException,SystemException;
	
	/**
	 * 通过id查询所属组织机构信息(上级及本身)
	 * @param queryRequest id必填 tenantId必填
	 * @return 组织机构List信息
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiCode PLAT_005
	 * @RestRelativeURL officeservice/queryParentOfficeList
	 */
	@POST
	@Path("/queryParentOfficeList")
	OfficeParentListQueryResponse queryParentOfficeList(OfficeParentListQueryRequest queryRequest) throws BusinessException,SystemException;

	/**
	 * 通过id查询子组织机构信息(下级所有)
	 * @param queryRequest id必填 tenantId必填
	 * @return 组织机构List信息
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiCode PLAT_006
	 * @RestRelativeURL officeservice/queryChildrenOfficeList
	 */
	@POST
	@Path("/queryChildrenOfficeList")
	OfficeChildrenListQueryResponse queryChildrenOfficeList(OfficeChildrenListQueryRequest queryRequest) throws BusinessException,SystemException;

	
	/**
	 * 查询当前租户所有组织机构信息
	 * @param queryRequest 租户id必填
	 * @return 组织机构信息
	 * @throws BusinessException,SystemException
	 * @author auth
	 * @ApiCode PLAT_007
	 * @RestRelativeURL officeservice/queryOfficeAll
	 */
	@POST
	@Path("/queryOfficeAll")
	OfficeAllQueryResponse queryOfficeAll(BaseInfo queryRequest) throws BusinessException,SystemException;

}

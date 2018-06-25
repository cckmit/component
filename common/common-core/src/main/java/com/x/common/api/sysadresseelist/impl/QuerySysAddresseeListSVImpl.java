package com.x.common.api.sysadresseelist.impl;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysaddresseelist.interfaces.IQuerySysAddresseeListSV;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageQueryRequest;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageQueryResponse;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageVo;
import com.x.common.api.sysaddresseelist.param.AddresseeListQueryResponse;
import com.x.common.api.sysaddresseelist.param.DeleteSysAddressee;
import com.x.common.api.sysaddresseelist.param.DeleteSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.QueryAllSysAddresseeReq;
import com.x.common.api.sysaddresseelist.param.SaveSysAddressee;
import com.x.common.api.sysaddresseelist.param.SaveSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.SysAddresseePageResponse;
import com.x.common.api.sysaddresseelist.param.SysAddresseeQueryRequest;
import com.x.common.api.sysaddresseelist.param.SysAddresseeResp;
import com.x.common.service.business.sysaddresseelist.IQuerySysAddresseeListBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;

/**
 * @Description: 收件人列表管理
 * @author auth
 * @version V1.0
 */
@Service
@Component
public class QuerySysAddresseeListSVImpl implements IQuerySysAddresseeListSV {
	private static final Logger logger = Logger.getLogger(QuerySysAddresseeListSVImpl.class);
	@Autowired
	private transient IQuerySysAddresseeListBusiSV iQuerySysAdresseeListBusiSV;
	
	
	
	@Override
	public AddresseeListPageQueryResponse queryAddresseeListPage(AddresseeListPageQueryRequest param)
			throws BusinessException, SystemException {
		AddresseeListPageQueryResponse addresseeListPageQueryResponse = new AddresseeListPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<AddresseeListPageVo> pageInfo = iQuerySysAdresseeListBusiSV.queryAddresseeListPage(param);
            addresseeListPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("查询成功");
            addresseeListPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            addresseeListPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
        	logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("查询失败");
            addresseeListPageQueryResponse.setResponseHeader(responseHeader);
        }
		return addresseeListPageQueryResponse;
	}
	@Override
	public BaseResponse saveSysAddresseeList(SaveSysAddresseeList req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			Integer saveSysAddresseeList = iQuerySysAdresseeListBusiSV.saveSysAddresseeList(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage(saveSysAddresseeList.toString());
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加失败");
		}
		return response;
	}
	@Override
	public Integer deleteSysAddresseeList(DeleteSysAddresseeList param)
			throws BusinessException, SystemException, Exception {
		return iQuerySysAdresseeListBusiSV.deleteSysAddresseeList(param.getListId());

	}
	@Override
	public Integer queryCounyByListId(DeleteSysAddresseeList param)
			throws BusinessException, SystemException, Exception {
		return iQuerySysAdresseeListBusiSV.queryCounyByListId(param.getListId());

	}
	@Override
	public SysAddresseePageResponse queryManByListId(SysAddresseeQueryRequest param)
			throws BusinessException, SystemException {
		if (param==null){
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "请求参数不能为空");
        }
        if (param.getListId()==null){
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "请求参数iD不能为空");
        }
        return iQuerySysAdresseeListBusiSV.queryManByListId(param);
	}
	@Override
	public BaseResponse saveSysAddressee(SaveSysAddressee req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysAdresseeListBusiSV.saveSysAddressee(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加失败");
		}
		return response;
	}
	@Override
	public Integer deleteSysAddressee(DeleteSysAddressee param) throws BusinessException, SystemException, Exception {
		return iQuerySysAdresseeListBusiSV.deleteSysAddressee(param.getId());

	}
	@Override
	public BaseResponse updateSysAddressee(SaveSysAddressee req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysAdresseeListBusiSV.updateSysAddressee(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			logger.error(ExceptionCodeConstant.SYSTEM_ERROR, e);
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改失败");
		}
		return response;
	}
	@Override
	public AddresseeListQueryResponse queryAddresseeList() throws BusinessException, SystemException {
		AddresseeListQueryResponse addresseeListQueryResponse = new AddresseeListQueryResponse();
		List<AddresseeListPageVo> questionsPapersVoList = iQuerySysAdresseeListBusiSV.queryAddresseeList();
		addresseeListQueryResponse.setAddresseeListPageVo(questionsPapersVoList);
		return addresseeListQueryResponse;
	}
	@Override
	public SaveSysAddresseeList queryNameById(DeleteSysAddresseeList param)
			throws BusinessException, SystemException, Exception {
		return iQuerySysAdresseeListBusiSV.queryNameById(param);
	}
	@Override
	public SysAddresseeResp queryAllByListId(QueryAllSysAddresseeReq param) throws BusinessException, SystemException {
		return iQuerySysAdresseeListBusiSV.queryAllByListId(param);
	}
	
	
	
}

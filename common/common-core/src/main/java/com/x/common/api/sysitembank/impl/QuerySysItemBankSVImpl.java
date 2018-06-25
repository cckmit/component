package com.x.common.api.sysitembank.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.BaseResponse;
import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysitembank.interfaces.IQuerySysItemBankSV;
import com.x.common.api.sysitembank.param.CheckDuad;
import com.x.common.api.sysitembank.param.DeleteSysItemBank;
import com.x.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.x.common.api.sysitembank.param.ItemBankPageQueryResponse;
import com.x.common.api.sysitembank.param.ItemBankPageVo;
import com.x.common.api.sysitembank.param.SaveSysItemBank;
import com.x.common.service.business.sysitembank.IQuerySysItemBankBusiSV;
import com.x.sdk.constant.ExceptionCodeConstant;

/**
 * @Description: 题库服务
 * @author auth
 * @date 2016年11月1日 下午6:28:30 
 * @version V1.0
 */
@Service
@Component
public class QuerySysItemBankSVImpl implements IQuerySysItemBankSV {
	
	@Autowired
	private transient IQuerySysItemBankBusiSV iQuerySysItemBankBusiSV;

	
	@Override
	public ItemBankPageQueryResponse queryItemBankPage(ItemBankPageQueryRequest param)
			throws BusinessException, SystemException {
		
		ItemBankPageQueryResponse itemBankPageQueryResponse = new ItemBankPageQueryResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
            PageInfo<ItemBankPageVo> pageInfo = iQuerySysItemBankBusiSV.queryItemBankPage(param);
            itemBankPageQueryResponse.setPageInfo(pageInfo);
            responseHeader.setSuccess(true);
            responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
            responseHeader.setResultMessage("题库列表查询成功");
            itemBankPageQueryResponse.setResponseHeader(responseHeader);
        }catch (BusinessException businessException){
            responseHeader.setResultCode(businessException.getErrorCode());
            responseHeader.setResultMessage(businessException.getErrorMessage());
            itemBankPageQueryResponse.setResponseHeader(responseHeader);
        }catch (Exception e){
            responseHeader.setResultCode(ExceptionCodeConstant.SYSTEM_ERROR);
            responseHeader.setResultMessage("题库列表查询失败");
            itemBankPageQueryResponse.setResponseHeader(responseHeader);
        }
		return itemBankPageQueryResponse;
	}


	@Override
	public BaseResponse saveSysItemBank(SaveSysItemBank req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysItemBankBusiSV.saveSysItemBank(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("添加题库成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"添加题库失败");
		}
		return response;
	}


	@Override
	public Integer deleteSysItemBank(DeleteSysItemBank param) throws BusinessException, SystemException {
		return iQuerySysItemBankBusiSV.deleteSysItemBank(param.getBid());
	}


	@Override
	public BaseResponse updateSysItemBank(SaveSysItemBank req) throws BusinessException, SystemException {
		BaseResponse response = new BaseResponse();
		ResponseHeader responseHeader = new ResponseHeader();
		try {
			iQuerySysItemBankBusiSV.updateSysItemBank(req);
			responseHeader.setSuccess(true);
			responseHeader.setResultCode(ExceptionCodeConstant.SUCCESS);
			responseHeader.setResultMessage("修改题库成功");
			response.setResponseHeader(responseHeader);
		}catch (Exception e) {
			throw new SystemException(ExceptionCodeConstant.SYSTEM_ERROR,"修改题库失败");
		}
		return response;
	}


	@Override
	public Integer checkDuadCn(CheckDuad param) throws BusinessException, SystemException {
		return iQuerySysItemBankBusiSV.checkDuadCn(param);
	}



}

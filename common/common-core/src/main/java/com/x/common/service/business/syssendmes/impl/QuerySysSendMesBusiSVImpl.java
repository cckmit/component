package com.x.common.service.business.syssendmes.impl;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.syssendmes.param.DeleteSysSendMes;
import com.x.common.api.syssendmes.param.QueryStateSendingResponse;
import com.x.common.api.syssendmes.param.SaveSysMesAddressee;
import com.x.common.api.syssendmes.param.SaveSysSendMes;
import com.x.common.api.syssendmes.param.SendMesPageQueryRequest;
import com.x.common.api.syssendmes.param.SendMesPageVo;
import com.x.common.api.syssendmes.param.SysMesAddresseeAllResponseInfo;
import com.x.common.api.syssendmes.param.SysMesAddresseePageResponse;
import com.x.common.api.syssendmes.param.SysMesAddresseeQueryRequest;
import com.x.common.api.syssendmes.param.SysMesAddresseeResponse;
import com.x.common.api.syssendmes.param.UpdateSysMesAddresseeState;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysMesAddressee;
import com.x.common.dao.mapper.bo.SysSendMes;
import com.x.common.service.atom.syssendmes.ISysSendMesAtomSV;
import com.x.common.service.business.syssendmes.IQuerySysSendMesBusiSV;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
@Service
public class QuerySysSendMesBusiSVImpl implements IQuerySysSendMesBusiSV {
	private static final Logger log=LoggerFactory.getLogger(QuerySysSendMesBusiSVImpl.class);

	@Autowired 
	private transient ISysSendMesAtomSV  iSysSendMesAtomSV;
	@Override
	public PageInfo<SendMesPageVo> querySendMesPage(SendMesPageQueryRequest param) {
		PageInfo<SendMesPageVo> sendMesPageInfo = iSysSendMesAtomSV.querySendMesPage(param);
		return sendMesPageInfo;
	}
	@Override
	public Integer doSendMes(SaveSysSendMes req) {
		SysSendMes sysSendMes = new SysSendMes();
		BeanUtils.copyProperties(sysSendMes,req);
		Long id = SeqUtil.getNewId(Constants.SEQ.SENDMES_MESID_SEQ);
		sysSendMes.setMesId(id.toString());
		iSysSendMesAtomSV.doSendMes(sysSendMes);
		return Integer.parseInt(id.toString());
	}
	@Override
	public Integer deleteSysSendMes(String mesId) {
		return iSysSendMesAtomSV.deleteSysSendMes(mesId);
	}
	@Override
	public Integer doMesAddressee(SaveSysMesAddressee req) {
		SysMesAddressee sysMesAddressee = new SysMesAddressee();
		BeanUtils.copyProperties(sysMesAddressee,req);
		Long id = SeqUtil.getNewId(Constants.SEQ.MESADDRESSEE_ID_SEQ);
		sysMesAddressee.setId(id.toString());
		iSysSendMesAtomSV.doMesAddressee(sysMesAddressee);
		return Integer.parseInt(id.toString());
	}
	@Override
	public SysMesAddresseePageResponse queryMesAddresseeByMesId(SysMesAddresseeQueryRequest param) {
		SysMesAddresseePageResponse response = new SysMesAddresseePageResponse();
		List<SysMesAddresseeAllResponseInfo> sysMesAddresseeAllResponseInfo = null;
		PageInfo<SysMesAddresseeResponse> sysMesAddresseeResponseInfo = new PageInfo<SysMesAddresseeResponse>();
		List<SysMesAddresseeResponse> list = new ArrayList<SysMesAddresseeResponse>();
		ResponseHeader header = null;
		try{
			int count = iSysSendMesAtomSV.getSysMesAddresseeCount(param);
			int pageCount = count / param.getPageNo() + (count % param.getPageSize() > 0 ? 1 : 0);
			sysMesAddresseeAllResponseInfo = iSysSendMesAtomSV.queryMesAddresseeByMesId(param);
			if(sysMesAddresseeAllResponseInfo!=null){
				for(int i=0;i<sysMesAddresseeAllResponseInfo.size();i++){
					SysMesAddresseeResponse sysMesAddresseeResponses = new SysMesAddresseeResponse();
					SysMesAddresseeAllResponseInfo sysMesAddresseeAllResponseInfo2 = sysMesAddresseeAllResponseInfo.get(i);
					BeanUtils.copyProperties(sysMesAddresseeResponses, sysMesAddresseeAllResponseInfo2);
					list.add(sysMesAddresseeResponses);
				}
			}
			sysMesAddresseeResponseInfo.setResult(list);
			sysMesAddresseeResponseInfo.setPageNo(param.getPageNo());
			sysMesAddresseeResponseInfo.setPageSize(param.getPageSize());
			sysMesAddresseeResponseInfo.setCount(count);
			sysMesAddresseeResponseInfo.setPageCount(pageCount);
			response.setPageInfo(sysMesAddresseeResponseInfo);
			header = new ResponseHeader(true, ExceptionCodeConstant.SUCCESS, "查询成功");
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptionCodeConstant.SYSTEM_ERROR, "查询失败");
			log.error("查询失败");
		}
		response.setResponseHeader(header);
		return response;
	}
	@Override
	public Integer updateStateEr(UpdateSysMesAddresseeState param) {
		return iSysSendMesAtomSV.updateStateEr(param);
	}
	@Override
	public Integer updateStateSu(UpdateSysMesAddresseeState param) {
		return iSysSendMesAtomSV.updateStateSu(param);
	}
	@Override
	public SaveSysSendMes queryTimeById(DeleteSysSendMes param) {
		return iSysSendMesAtomSV.queryTimeById(param);
	}
	@Override
	public QueryStateSendingResponse queryStateSending() {
		QueryStateSendingResponse queryStateSendingResponse = new QueryStateSendingResponse();
		List<SysMesAddresseeResponse> sysMesAddresseeResponses = new ArrayList<SysMesAddresseeResponse>();
		List<SysMesAddressee> queryStateSending = iSysSendMesAtomSV.queryStateSending();
		if (!CollectionUtil.isEmpty(queryStateSending)) {
			sysMesAddresseeResponses = new ArrayList<SysMesAddresseeResponse>();
			for (int i = 0; i < queryStateSending.size(); i++) {
				if(queryStateSending.get(i) != null){
					SysMesAddresseeResponse sysMesAddresseeResponse = new SysMesAddresseeResponse();
					BeanUtils.copyProperties(sysMesAddresseeResponse, queryStateSending.get(i));
					sysMesAddresseeResponses.add(sysMesAddresseeResponse);
				}
			}
			queryStateSendingResponse.setMesAddresseeInfo(sysMesAddresseeResponses);
		}
		return queryStateSendingResponse;
	}
	
	
	
	
}

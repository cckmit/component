package com.x.common.service.business.sysaddresseelist.impl;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageQueryRequest;
import com.x.common.api.sysaddresseelist.param.AddresseeListPageVo;
import com.x.common.api.sysaddresseelist.param.DeleteSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.QueryAllSysAddresseeReq;
import com.x.common.api.sysaddresseelist.param.SaveSysAddressee;
import com.x.common.api.sysaddresseelist.param.SaveSysAddresseeList;
import com.x.common.api.sysaddresseelist.param.SysAddresseeAllResponseInfo;
import com.x.common.api.sysaddresseelist.param.SysAddresseePageResponse;
import com.x.common.api.sysaddresseelist.param.SysAddresseeQueryRequest;
import com.x.common.api.sysaddresseelist.param.SysAddresseeResp;
import com.x.common.api.sysaddresseelist.param.SysAddresseeResponse;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysAddressee;
import com.x.common.dao.mapper.bo.SysAddresseeList;
import com.x.common.service.atom.sysadresseelist.ISysAddresseeListAtomSV;
import com.x.common.service.business.sysaddresseelist.IQuerySysAddresseeListBusiSV;
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
public class QuerySysAddresseeListBusiSVImpl implements IQuerySysAddresseeListBusiSV {
	private static final Logger log = LoggerFactory.getLogger(QuerySysAddresseeListBusiSVImpl.class);
	@Autowired 
	private transient ISysAddresseeListAtomSV  iSysAddresseeListAtomSV;
	
	@Override
	public PageInfo<AddresseeListPageVo> queryAddresseeListPage(AddresseeListPageQueryRequest param) {
		PageInfo<AddresseeListPageVo> addresseeListPageInfo = iSysAddresseeListAtomSV.queryAddresseeListPage(param);
		return addresseeListPageInfo;
	}
	@Override
	public Integer saveSysAddresseeList(SaveSysAddresseeList req) {
		SysAddresseeList sysAddresseeList = new SysAddresseeList();
		BeanUtils.copyProperties(sysAddresseeList,req);
		Long id = SeqUtil.getNewId(Constants.SEQ.ADDRESSEELIST_LISTID_SEQ);
		sysAddresseeList.setListId(id.toString());
		iSysAddresseeListAtomSV.saveSysAddresseeList(sysAddresseeList);
		return Integer.parseInt(id.toString());
	}
	@Override
	public Integer deleteSysAddresseeList(String listId) {
		return iSysAddresseeListAtomSV.deleteSysAddresseeList(listId);
	}
	@Override
	public Integer queryCounyByListId(String listId) {
		return iSysAddresseeListAtomSV.queryCounyByListId(listId);

	}
	@Override
	public SysAddresseePageResponse queryManByListId(SysAddresseeQueryRequest param) {
		SysAddresseePageResponse response = new SysAddresseePageResponse();
		List<SysAddresseeAllResponseInfo> sysAddresseeAllResponseInfo = null;
		PageInfo<SysAddresseeResponse> sysAddresseeResponseInfo = new PageInfo<SysAddresseeResponse>();
		List<SysAddresseeResponse> list = new ArrayList<SysAddresseeResponse>();
		ResponseHeader header = null;
		try{
			int count = iSysAddresseeListAtomSV.getSysAddresseeCount(param);
			int pageCount = count / param.getPageNo() + (count % param.getPageSize() > 0 ? 1 : 0);
			sysAddresseeAllResponseInfo = iSysAddresseeListAtomSV.queryManByListId(param);
			if(sysAddresseeAllResponseInfo!=null){
				for(int i=0;i<sysAddresseeAllResponseInfo.size();i++){
					SysAddresseeResponse sysAddresseeResponses = new SysAddresseeResponse();
					SysAddresseeAllResponseInfo addresseeQueryAllPageInfo2 = sysAddresseeAllResponseInfo.get(i);
					BeanUtils.copyProperties(sysAddresseeResponses, addresseeQueryAllPageInfo2);
					list.add(sysAddresseeResponses);
				}
			}
			sysAddresseeResponseInfo.setResult(list);
			sysAddresseeResponseInfo.setPageNo(param.getPageNo());
			sysAddresseeResponseInfo.setPageSize(param.getPageSize());
			sysAddresseeResponseInfo.setCount(count);
			sysAddresseeResponseInfo.setPageCount(pageCount);
			response.setPageInfo(sysAddresseeResponseInfo);
			header = new ResponseHeader(true, ExceptionCodeConstant.SUCCESS, "查询成功");
		}catch(Exception e){
			header = new ResponseHeader(false, ExceptionCodeConstant.SYSTEM_ERROR, "查询失败");
			log.error("查询失败");	
		}
		response.setResponseHeader(header);
		return response;
	}
	@Override
	public Integer saveSysAddressee(SaveSysAddressee req) {
		SysAddressee sysAddressee = new SysAddressee();
		BeanUtils.copyProperties(sysAddressee,req);
		Long id = SeqUtil.getNewId(Constants.SEQ.ADDRESSEE_ID_SEQ);
		sysAddressee.setId(id.toString());
		Integer saveSysAddressee = iSysAddresseeListAtomSV.saveSysAddressee(sysAddressee);
		return saveSysAddressee;
	}
	@Override
	public Integer deleteSysAddressee(String id) {
		return iSysAddresseeListAtomSV.deleteSysAddressee(id);

	}
	@Override
	public Integer updateSysAddressee(SaveSysAddressee req) {
		SysAddressee sysAddressee = new SysAddressee();
		BeanUtils.copyProperties(sysAddressee,req);
		return iSysAddresseeListAtomSV.updateSysAddressee(sysAddressee);
	}
	@Override
	public List<AddresseeListPageVo> queryAddresseeList() {
		List<AddresseeListPageVo> addresseeListPageVos = new ArrayList<AddresseeListPageVo>();
		List<SysAddresseeList> queryAddresseeList = iSysAddresseeListAtomSV.queryAddresseeList();
		if (!CollectionUtil.isEmpty(queryAddresseeList)) {
			addresseeListPageVos = new ArrayList<AddresseeListPageVo>();
			for (int i = 0; i < queryAddresseeList.size(); i++) {
				if(queryAddresseeList.get(i) != null){
					AddresseeListPageVo addresseeListPageVoResponse = new AddresseeListPageVo();
					BeanUtils.copyProperties(addresseeListPageVoResponse, queryAddresseeList.get(i));
					addresseeListPageVos.add(addresseeListPageVoResponse);
				}
			}
		}
		return addresseeListPageVos;
	}
	@Override
	public SaveSysAddresseeList queryNameById(DeleteSysAddresseeList param) {
		return iSysAddresseeListAtomSV.queryNameById(param);
	}
	
	@Override
	public SysAddresseeResp queryAllByListId(QueryAllSysAddresseeReq param) {
		SysAddresseeResp sysAddresseeResp = new SysAddresseeResp();
		List<SysAddresseeResponse> list = new ArrayList<SysAddresseeResponse>();
		List<SysAddressee> queryAllByListId =  iSysAddresseeListAtomSV.queryAllByListId(param);
		if(queryAllByListId!=null){
			for(int i=0;i<queryAllByListId.size();i++){
				SysAddresseeResponse sysAddresseeResponses = new SysAddresseeResponse();
				BeanUtils.copyProperties(sysAddresseeResponses, queryAllByListId.get(i));
				list.add(sysAddresseeResponses);
			}
		}
		sysAddresseeResp.setSysAddresseeResponse(list);
		return sysAddresseeResp;
	}
	
	
}

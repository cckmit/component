package com.x.common.service.business.office.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.x.base.vo.BaseInfo;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.office.param.OfficeAllQueryResponse;
import com.x.common.api.office.param.OfficeChildrenListQueryRequest;
import com.x.common.api.office.param.OfficeChildrenListQueryResponse;
import com.x.common.api.office.param.OfficeDetailQueryRequest;
import com.x.common.api.office.param.OfficeDetailQueryResponse;
import com.x.common.api.office.param.OfficeParentListQueryRequest;
import com.x.common.api.office.param.OfficeParentListQueryResponse;
import com.x.common.api.office.param.OfficeVO;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysOffice;
import com.x.common.service.atom.office.ISysOfficeAtomService;
import com.x.common.service.business.office.ISysOfficeBusinessService;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.JsonUtil;

@Service
@Transactional
public class SysOfficeBusinessService implements ISysOfficeBusinessService{
	private static final Logger log=LoggerFactory.getLogger(SysOfficeBusinessService.class);

	@Autowired
	private ISysOfficeAtomService iSysOfficeAtomService;
	
	@Override
	public OfficeDetailQueryResponse queryOfficeDetail(OfficeDetailQueryRequest queryRequest) {
		SysOffice sysOfficeInfo = iSysOfficeAtomService.selectSysOfficeInfo(queryRequest.getId(), queryRequest.getTenantId());
		OfficeDetailQueryResponse queryResponse = new OfficeDetailQueryResponse();
		if(sysOfficeInfo != null){
			OfficeVO officeVo = new OfficeVO();
			BeanUtils.copyProperties(officeVo,sysOfficeInfo);
			queryResponse.setOfficeVo(officeVo );
			ResponseHeader responseHeader=new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功");
			queryResponse.setResponseHeader(responseHeader);
		}else{
			ResponseHeader responseHeader=new ResponseHeader(true, ResultCodeConstants.NULL_CODE, "无数据");
			queryResponse.setResponseHeader(responseHeader);
		}
		return queryResponse;
	}

	@Override
	public OfficeParentListQueryResponse queryParentOfficeList(OfficeParentListQueryRequest queryRequest) {
		SysOffice sysOfficeInfo = iSysOfficeAtomService.selectSysOfficeInfo(queryRequest.getId(), queryRequest.getTenantId());
		OfficeParentListQueryResponse queryResponse = new OfficeParentListQueryResponse();
		if(sysOfficeInfo != null){
			List<OfficeVO> officeList = new LinkedList<>();
			String parentIds = sysOfficeInfo.getParentIds();
			//转换返回类型
			OfficeVO officeVoSelf = new OfficeVO();
			BeanUtils.copyProperties(officeVoSelf,sysOfficeInfo);
			//添加父组织列表
			if(!StringUtils.isBlank(parentIds)){
				String[] officeIdArray = parentIds.split(",");
				List<String> officeIdList = new ArrayList<>();
				for(String officeId : officeIdArray){
					officeIdList.add(officeId);
				}
				List<SysOffice> selectSysOfficeList = iSysOfficeAtomService.selectSysOfficeList(officeIdList);
				if(selectSysOfficeList != null){
					String officeListJson = null;
					try {
						officeListJson = JsonUtil.toJson(selectSysOfficeList);
					} catch (Exception e) {
						log.error("查询本身及上级组织机构失败,{},{}",queryRequest.getId(), queryRequest.getTenantId());
					}
					Gson gson = new Gson();
					List<OfficeVO> parentOffices = gson.fromJson(officeListJson, new TypeToken<List<OfficeVO>>(){}.getType());
					officeList.addAll(parentOffices);
				}
			}
			//添加自身组织
			officeList.add(officeVoSelf);
			queryResponse.setOfficeList(officeList);
			ResponseHeader responseHeader=new ResponseHeader(true, ResultCodeConstants.SUCCESS_CODE, "查询成功");
			queryResponse.setResponseHeader(responseHeader);
		}else{
			ResponseHeader responseHeader=new ResponseHeader(true, ResultCodeConstants.NULL_CODE, "无数据");
			queryResponse.setResponseHeader(responseHeader);
		}
		return queryResponse;
	}

	@Override
	public OfficeChildrenListQueryResponse queryChildrenOfficeList(
			OfficeChildrenListQueryRequest queryRequest) {
		List<SysOffice> sysOfficeList = iSysOfficeAtomService.selectChildrenOfficeList(queryRequest.getId(),queryRequest.getTenantId());
		OfficeChildrenListQueryResponse queryResponse = new OfficeChildrenListQueryResponse();
		if(!CollectionUtil.isEmpty(sysOfficeList)){
			String officeListJson = null;
			try {
				officeListJson = JsonUtil.toJson(sysOfficeList);
			} catch (Exception e) {
				log.error("查询下级组织机构失败,{},{}",queryRequest.getId(),queryRequest.getTenantId());
			}
			Gson gson = new Gson();
			List<OfficeVO> childrenOffices = gson.fromJson(officeListJson, new TypeToken<List<OfficeVO>>(){}.getType());
			queryResponse.setOfficeList(childrenOffices);
			ResponseHeader responseHeader = new ResponseHeader(true,
					ResultCodeConstants.SUCCESS_CODE, "查询成功");
			queryResponse.setResponseHeader(responseHeader);
		} else {
			ResponseHeader responseHeader = new ResponseHeader(true,
					ResultCodeConstants.NULL_CODE, "无数据");
			queryResponse.setResponseHeader(responseHeader);
		}
		return queryResponse;
	}

	@Override
	public OfficeAllQueryResponse queryOfficeAll(BaseInfo queryRequest) {
		OfficeAllQueryResponse officeAllQueryResponse = new OfficeAllQueryResponse();
		// 获取叶子节点
		List<SysOffice> allOfficeList = iSysOfficeAtomService
				.selectSysOfficeAll(queryRequest.getTenantId());
		if (!CollectionUtil.isEmpty(allOfficeList)) {
			String allOfficeListJson = null;
			try {
				allOfficeListJson = JsonUtil.toJson(allOfficeList);
			} catch (Exception e) {
				log.error("查询租户id下所有组织机构失败,{}",queryRequest.getTenantId());
			}
			Gson gson = new Gson();
			List<OfficeVO> allOffice = gson.fromJson(allOfficeListJson,
					new TypeToken<List<OfficeVO>>() {
					}.getType());
			officeAllQueryResponse.setAllOffice(allOffice);
			ResponseHeader responseHeader = new ResponseHeader(true,
					ResultCodeConstants.SUCCESS_CODE, "查询成功");
			officeAllQueryResponse.setResponseHeader(responseHeader);
		} else {
			ResponseHeader responseHeader = new ResponseHeader(true,
					ResultCodeConstants.NULL_CODE, "无数据");
			officeAllQueryResponse.setResponseHeader(responseHeader);
		}
		return officeAllQueryResponse;
	}
}

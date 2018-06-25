package com.x.common.service.business.menu.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.vo.ResponseHeader;
import com.x.common.api.menu.param.SysMenuListQueryRequest;
import com.x.common.api.menu.param.SysMenuListQueryResponse;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysMenu;
import com.x.common.service.atom.menu.ISysMenuAtomService;
import com.x.common.service.business.menu.ISysMenuBusinessService;
import com.x.sdk.util.CollectionUtil;

@Service
@Transactional
public class SysMenuBusinessService implements ISysMenuBusinessService{

	@Autowired
	private ISysMenuAtomService iSysMenuAtomService;
	
	@Override
	public SysMenuListQueryResponse queryMenuByUserId(SysMenuListQueryRequest request) {
		List<SysMenu> menuList =iSysMenuAtomService.findByUserId(request.getUserId());
		SysMenuListQueryResponse queryResponse = new SysMenuListQueryResponse();
		if(!CollectionUtil.isEmpty(menuList)){
			List<String> hrefList =new ArrayList<String>();
			for(SysMenu menu:menuList){
				if(menu.getHref() !=null && !menu.getHref().isEmpty())
					hrefList.add(menu.getHref());
			}
			queryResponse.setMenuList(hrefList);
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

}

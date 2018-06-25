package com.x.common.service.business.sysuser.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.sysuser.param.SysUserListQueryRequest;
import com.x.common.api.sysuser.param.SysUserListQueryResponse;
import com.x.common.api.sysuser.param.SysUserQueryRequest;
import com.x.common.api.sysuser.param.SysUserQueryResponse;
import com.x.common.api.sysuser.param.SysUserThemeRequest;
import com.x.common.api.sysuser.param.SysUserThemeResponse;
import com.x.common.api.sysuser.param.SysUserVO;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysUser;
import com.x.common.service.atom.sysuser.ISysUserAtomSV;
import com.x.common.service.business.sysuser.ISysUserBusiSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.JsonUtil;
import com.x.sdk.util.StringUtil;
@Service
@Transactional
public class SysUserBusiSVImpl implements ISysUserBusiSV {   
	private static final Logger log=LoggerFactory.getLogger(SysUserBusiSVImpl.class);
	@Autowired
	ISysUserAtomSV iSysUserAtomSV;
	@Override
	public SysUserQueryResponse queryUser(SysUserQueryRequest request) {
		SysUser userRequest = new SysUser();
		SysUserQueryResponse  response;
	    BeanUtils.copyProperties(userRequest, request);
		SysUser user=iSysUserAtomSV.queryUser(userRequest);
		if(user!=null){
			response =new SysUserQueryResponse();
			BeanUtils.copyProperties(response, user);
			ResponseHeader responseHeader = new ResponseHeader();
		    responseHeader.setSuccess(true);
		    responseHeader.setResultCode(ResultCodeConstants.SUCCESS_CODE);
		    responseHeader.setResultMessage("查询成功");
		    response.setResponseHeader(responseHeader);
		}else{
			response =new SysUserQueryResponse();
			ResponseHeader responseHeader = new ResponseHeader();
		    responseHeader.setSuccess(true);
		    responseHeader.setResultCode(ResultCodeConstants.NULL_CODE);
		    responseHeader.setResultMessage("无数据");
		    response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public SysUserThemeResponse queryUserTheme(SysUserThemeRequest request) {
		String theme = iSysUserAtomSV.queryUserTheme(request.getId(),request.getTenantId());
		SysUserThemeResponse response;
		if(!StringUtil.isBlank(theme)){
			response =new SysUserThemeResponse();
			response.setTheme(theme);
			ResponseHeader responseHeader = new ResponseHeader();
		    responseHeader.setSuccess(true);
		    responseHeader.setResultCode(ResultCodeConstants.SUCCESS_CODE);
		    responseHeader.setResultMessage("查询成功");
		    response.setResponseHeader(responseHeader);
		}else{
			response =new SysUserThemeResponse();
			ResponseHeader responseHeader = new ResponseHeader();
		    responseHeader.setSuccess(true);
		    responseHeader.setResultCode(ResultCodeConstants.NULL_CODE);
		    responseHeader.setResultMessage("无数据");
		    response.setResponseHeader(responseHeader);
		}
		return response;
	}

	@Override
	public SysUserListQueryResponse queryUserByOfficeId(SysUserListQueryRequest request) {
		SysUserListQueryResponse  response;
		List<SysUser> list = iSysUserAtomSV.selectSysUserByOfficeId(request.getTenantId(), request.getOfficeId());
		if(!CollectionUtil.isEmpty(list)){
			response = new SysUserListQueryResponse();
			String sysuserListJson = null;
			try {
				sysuserListJson = JsonUtil.toJson(list);
			} catch (Exception e) {
				log.error("查询用户失败.");
			}
			Gson gson = new Gson();
			List<SysUserVO> useres = gson.fromJson(sysuserListJson, new TypeToken<List<SysUserVO>>(){}.getType());
			response.setSysUserList(useres);
			ResponseHeader responseHeader = new ResponseHeader(true,
					ResultCodeConstants.SUCCESS_CODE, "查询成功");
			response.setResponseHeader(responseHeader);
		}else{
			response = new SysUserListQueryResponse();
			ResponseHeader responseHeader = new ResponseHeader(true,
					ResultCodeConstants.NULL_CODE, "无数据");
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

}

package com.x.common.service.business.sysmail.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysmail.param.SysMailInfo;
import com.x.common.api.sysmail.param.SysMailRequest;
import com.x.common.dao.mapper.bo.SysMail;
import com.x.common.service.atom.sysmail.impl.SysMailAtomServiceImpl;
import com.x.common.service.business.sysmail.ISysMailBusiService;
import com.x.sdk.util.BeanUtils;
@Service
public class SysMailBusiServiceImpl implements ISysMailBusiService {

	@Autowired
	private SysMailAtomServiceImpl sysMailAtomSV;
	
	@Override
	public PageInfo<SysMailInfo> getSysMailPageList(SysMailRequest request) {
		int count = sysMailAtomSV.count(request);
		PageInfo<SysMailInfo> pageInfo = new PageInfo<SysMailInfo>();
		pageInfo.setCount(count);
		List<SysMail> sysMailList = sysMailAtomSV.getSysMailPageList(request);
		List<SysMailInfo> sysMailInfoList = new ArrayList<SysMailInfo>();
		for (SysMail sysMail : sysMailList) {
			SysMailInfo sysMailInfo = new SysMailInfo();
			BeanUtils.copyProperties(sysMailInfo, sysMail);
			sysMailInfoList.add(sysMailInfo);
		}
		pageInfo.setResult(sysMailInfoList);
		int pageNo = null == request.getPageInfo() ? 1 : request.getPageInfo().getPageNo();
		int pageSize = null == request.getPageInfo() ? 10 : request.getPageInfo().getPageSize();
		pageInfo.setPageCount((count + pageSize - 1) / pageSize);
		pageInfo.setPageNo(pageNo);
		pageInfo.setPageSize(pageSize);
		
		return pageInfo;
	}

	@Override
	public int updateSysMail(SysMailRequest request) {
		SysMail record = new SysMail();
		BeanUtils.copyProperties(record, request);
		return sysMailAtomSV.updateSysMail(record);
	}

	@Override
	public int deleteSysMail(SysMailRequest request) {
		return sysMailAtomSV.deleteSysMail(request);
	}

	@Override
	public int count(SysMailRequest request) {
		return sysMailAtomSV.count(request);
	}

}

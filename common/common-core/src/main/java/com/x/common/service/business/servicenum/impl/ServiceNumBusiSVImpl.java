package com.x.common.service.business.servicenum.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.x.common.api.servicenum.param.ServiceNum;
import com.x.common.dao.mapper.bo.GnServiceNum;
import com.x.common.service.atom.servicenum.IServiceNumAtomSV;
import com.x.common.service.business.servicenum.IServiceNumBusiSV;
import com.x.sdk.util.BeanUtils;
@Component
@Transactional
public class ServiceNumBusiSVImpl implements IServiceNumBusiSV {

	@Autowired
	private IServiceNumAtomSV serviceNumAtomSV ;
	
	@Override
	public ServiceNum getServiceNumByPhone(String phone) {
		ServiceNum serviceNum=null;
		GnServiceNum gnServiceNum=serviceNumAtomSV.getServiceNumByPhone(phone);
		if(gnServiceNum!=null){
			serviceNum=new ServiceNum();
			BeanUtils.copyProperties(serviceNum, gnServiceNum);
		}
		return serviceNum;
	}

}

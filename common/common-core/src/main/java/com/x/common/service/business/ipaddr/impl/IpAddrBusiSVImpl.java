package com.x.common.service.business.ipaddr.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.x.common.api.ipaddr.param.IpAddr;
import com.x.common.dao.mapper.bo.GnIpAddr;
import com.x.common.service.atom.ipaddr.IIpAddrAtomSV;
import com.x.common.service.business.ipaddr.IIpAddrBusiSV;
import com.x.sdk.util.BeanUtils;

@Component
@Transactional
public class IpAddrBusiSVImpl implements IIpAddrBusiSV {

	@Autowired
	private IIpAddrAtomSV ipAddrAtomSV;
	@Override
	public IpAddr getIpAddrByIp(String ip) {
		IpAddr ipAddr=null;
		GnIpAddr gnIpAddr=ipAddrAtomSV.getIpAddrByIp(ip);
		if(gnIpAddr!=null){
			ipAddr=new IpAddr();
			BeanUtils.copyProperties(ipAddr, gnIpAddr);
		}
		
		return ipAddr;
	}

}

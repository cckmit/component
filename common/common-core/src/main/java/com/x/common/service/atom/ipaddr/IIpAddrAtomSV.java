package com.x.common.service.atom.ipaddr;

import com.x.common.dao.mapper.bo.GnIpAddr;

public interface IIpAddrAtomSV {
	GnIpAddr getIpAddrByIp(String ip);
}

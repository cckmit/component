package com.x.common.service.atom.sysconfig;

import com.x.common.dao.mapper.bo.SysConfig;

/**
 * @author auth
 * @date 2016年11月1日 下午5:16:13 
 * @version V1.0
 */
public interface ISysConfigAtomSV {
	
	SysConfig selectOne();
	SysConfig changeOne();
	Integer saveSysConfig(SysConfig sysConfig);

}

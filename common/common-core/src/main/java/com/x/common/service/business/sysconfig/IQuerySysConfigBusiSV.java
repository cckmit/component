package com.x.common.service.business.sysconfig;

import com.x.common.api.sysconfig.param.SaveSysConfig;
import com.x.common.dao.mapper.bo.SysConfig;

/**
 * @author auth
 * @date 2016年11月1日 下午5:14:49 
 * @version V1.0
 */
public interface IQuerySysConfigBusiSV {
	
	SysConfig getSysCong();

	Integer saveSysConfig(SaveSysConfig req);

	/**
	 * 更新缓存
	 */
	void updateCache();

}

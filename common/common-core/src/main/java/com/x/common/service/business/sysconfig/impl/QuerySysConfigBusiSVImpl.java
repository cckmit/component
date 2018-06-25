package com.x.common.service.business.sysconfig.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.sysconfig.param.SaveSysConfig;
import com.x.common.dao.mapper.bo.SysConfig;
import com.x.common.service.atom.sysconfig.ISysConfigAtomSV;
import com.x.common.service.business.sysconfig.IQuerySysConfigBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;

/**
 * @author auth
 * @date 2016年11月1日 下午5:14:43 
 * @version V1.0
 */
@Service
public class QuerySysConfigBusiSVImpl implements IQuerySysConfigBusiSV{
	private static final Logger logger = Logger.getLogger(QuerySysConfigBusiSVImpl.class);
	@Autowired
	private transient ISysConfigAtomSV iSysConfigAtomSV;

	@Override
	public SysConfig getSysCong() {
		
		return iSysConfigAtomSV.selectOne();
	}

	@Override
	public Integer saveSysConfig(SaveSysConfig req) {
		SysConfig sysConfig = new SysConfig();
		BeanUtils.copyProperties(sysConfig,req);
		logger.info("Busis保存基本设置》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》"+sysConfig);
		int updateNum = iSysConfigAtomSV.saveSysConfig(sysConfig);
		updateCache();
		return updateNum;
	}

	/**
	 * 更新缓存
	 */
	@Override
	public void updateCache() {
		SysConfig sysConfig = iSysConfigAtomSV.selectOne();
		if (sysConfig == null)
			sysConfig = new SysConfig();
		//获取公共信息
		List<ICacheClient> cacheClientList = CacheFactoryUtil.getCacheClientList();
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.set(CacheKey.NOTICE_PC,  sysConfig.getPcNotice());
			cacheClient.set(CacheKey.NOTICE_WAP, sysConfig.getWapNotice());
		}
	}

}

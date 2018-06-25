package com.x.common.service.business.sysadvertmanager.impl;



import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.x.base.vo.PageInfo;
import com.x.common.api.cache.param.AdvertCache;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageQueryRequest;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageVo;
import com.x.common.api.sysadvertmanager.param.SaveSysAdvertManager;
import com.x.common.constants.CacheNSMapper;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysAdvertManager;
import com.x.common.service.atom.sysadvertmanager.ISysAdvertManagerAtomSV;
import com.x.common.service.business.sysadvertmanager.IQuerySysAdvertManagerBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;

/**
 * @author auth
 * @date 2017年6月2日 
 */
@Service
public class QuerySysAdvertManagerBusiSVImpl implements IQuerySysAdvertManagerBusiSV {
	private static final Logger logger = Logger.getLogger(QuerySysAdvertManagerBusiSVImpl.class);
	@Autowired 
	private transient ISysAdvertManagerAtomSV  iSysAdvertManagerAtomSV;
	
	@Override
	public List<SysAdvertManager> querySysAdvertList() {
		return iSysAdvertManagerAtomSV.querySysAdvertList(Constants.ZH_CN,Constants.SITE);
	}
	
	
	@Override
	public PageInfo<AdvertManagerPageVo> queryAdvertManagerPage(AdvertManagerPageQueryRequest param) {
		PageInfo<AdvertManagerPageVo> advertManagerPageInfo = iSysAdvertManagerAtomSV.queryAdvertManagerPage(param);
		return advertManagerPageInfo;
	}
	@Override
	public Integer saveSysAdvertManager(SaveSysAdvertManager req) throws Exception {
		SysAdvertManager sysAdvertManager = new SysAdvertManager();
		BeanUtils.copyProperties(sysAdvertManager,req);
		Long id = SeqUtil.getNewId(Constants.SEQ.ADVERTMANAGER_ID_SEQ);
		sysAdvertManager.setId(id.toString());
		Integer saveSysAdvertManager = iSysAdvertManagerAtomSV.saveSysAdvertManager(sysAdvertManager);
		logger.info("更新缓存数据...");
		QuerySysAdvertManagerBusiSVImpl.this.write();
		return saveSysAdvertManager;
	}
	@Override
	public Integer deleteSysAdvertManager(String id) throws Exception {
		Integer deleteSysAdvertManager = iSysAdvertManagerAtomSV.deleteSysAdvertManager(id);
		logger.info("更新缓存数据...");
		QuerySysAdvertManagerBusiSVImpl.this.write();
		return deleteSysAdvertManager;
	}
	@Override
	public Integer updateSysAdvertManager(SaveSysAdvertManager req) throws Exception {
		SysAdvertManager sysAdvertManager = new SysAdvertManager();
		BeanUtils.copyProperties(sysAdvertManager,req);
		Integer updateSysAdvertManager = iSysAdvertManagerAtomSV.updateSysAdvertManager(sysAdvertManager);
		logger.info("更新缓存数据...");
		QuerySysAdvertManagerBusiSVImpl.this.write();
		return updateSysAdvertManager;
	}
	@Override
	public SaveSysAdvertManager querySysAdvertById(String id) {
		SysAdvertManager querySysAdvertById = iSysAdvertManagerAtomSV.querySysAdvertById(id);
		SaveSysAdvertManager saveSysAdvertManager = new SaveSysAdvertManager();
		BeanUtils.copyProperties(saveSysAdvertManager, querySysAdvertById);
		return saveSysAdvertManager;
	}
	
	@Override
	public void write() throws Exception {
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_ADVERTMANAGER_RULE);
				cacheClientList.add(cacheClient);
			}
		}
		updateAdCache(Constants.ZH,Constants.SITE,cacheClientList);
		updateAdCache(Constants.EN,Constants.SITE,cacheClientList);
		updateAdCache(Constants.ZH,Constants.SITE2,cacheClientList);
		updateAdCache(Constants.EN,Constants.SITE2,cacheClientList);
	}

	private void updateAdCache(String local,String site,List<ICacheClient> cacheClientList){
		List<SysAdvertManager> advertmanagers = iSysAdvertManagerAtomSV.querySysAdvertList(local,site);
		for (SysAdvertManager sysAdver:advertmanagers) {
			List<SysAdvertManager> advertmanagerList = iSysAdvertManagerAtomSV.querySysAdvertLists(
					local,site,sysAdver.getAdvertisingPosition());
			String Advert_D = local+"&"+site+"&"+sysAdver.getAdvertisingPosition();
			List<AdvertCache> adCacheList = new ArrayList<AdvertCache>();
			for (SysAdvertManager advertManager:advertmanagerList) {
				AdvertCache advertCache = new AdvertCache();
				BeanUtils.copyProperties(advertCache,advertManager);
				advertCache.setImgType(".png");//设置为默认，若后期有问题，可修改。
				adCacheList.add(advertCache);
			}
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.ADVERTMANAGER_D_KEY, Advert_D,JSON.toJSONString(adCacheList));
			}
		}
	}

}

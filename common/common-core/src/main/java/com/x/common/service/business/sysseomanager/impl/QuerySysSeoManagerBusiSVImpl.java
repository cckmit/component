package com.x.common.service.business.sysseomanager.impl;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.x.base.vo.PageInfo;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.sysseomanager.param.CheckSysSeoManager;
import com.x.common.api.sysseomanager.param.QuerySysSeoByIdRes;
import com.x.common.api.sysseomanager.param.SaveSysSeoManager;
import com.x.common.api.sysseomanager.param.SeoManagerPageQueryRequest;
import com.x.common.api.sysseomanager.param.SeoManagerPageVo;
import com.x.common.constants.CacheNSMapper;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysSeoManager;
import com.x.common.service.atom.sysseomanager.ISysSeoManagerAtomSV;
import com.x.common.service.business.sysseomanager.IQuerySysSeoManagerBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
@Service
public class QuerySysSeoManagerBusiSVImpl implements IQuerySysSeoManagerBusiSV {
	private static final Logger logger = LoggerFactory.getLogger(QuerySysSeoManagerBusiSVImpl.class);
	@Autowired 
	private transient ISysSeoManagerAtomSV  iSysSeoManagerAtomSV;
	
	
	@Override
	public List<SysSeoManager> querySysSeoManagerList() {
		return iSysSeoManagerAtomSV.querySysSeoManagerList();
	}
	
	@Override
	public PageInfo<SeoManagerPageVo> querySeoManagerPage(SeoManagerPageQueryRequest param) {
		PageInfo<SeoManagerPageVo> seoManagerPageInfo = iSysSeoManagerAtomSV.querySeoManagerPage(param);
		return seoManagerPageInfo;
	}
	@Override
	public Integer saveSysSeoManager(SaveSysSeoManager req) throws Exception {
		SysSeoManager sysSeoManager = new SysSeoManager();
		BeanUtils.copyProperties(sysSeoManager,req);
		Long id = SeqUtil.getNewId(Constants.SEQ.SEOMANAGER_ID_SEQ);
		sysSeoManager.setId(id.toString());
		Integer saveSysSeoManager = iSysSeoManagerAtomSV.saveSysSeoManager(sysSeoManager);
		logger.info("更新缓存数据...");
		QuerySysSeoManagerBusiSVImpl.this.write();
		return saveSysSeoManager;
	}
	@Override
	public Integer deleteSysSeoManager(String id) throws Exception {
		Integer deleteSysSeoManager = iSysSeoManagerAtomSV.deleteSysSeoManager(id);
		QuerySysSeoManagerBusiSVImpl.this.write();
		return deleteSysSeoManager;
	}
	@Override
	public Integer updateSysSeoManager(SaveSysSeoManager req) throws Exception {
		SysSeoManager sysSeoManager = new SysSeoManager();
		BeanUtils.copyProperties(sysSeoManager,req);
		Integer updateSysSeoManager = iSysSeoManagerAtomSV.updateSysSeoManager(sysSeoManager);
		QuerySysSeoManagerBusiSVImpl.this.write();
		return updateSysSeoManager;
	}
	@Override
	public Integer checkSysSeoManager(CheckSysSeoManager param) {
		return iSysSeoManagerAtomSV.checkSysSeoManager(param);
	}

	@Override
	public void write() throws Exception {
		logger.info("刷新数据start");
		List<SysSeoManager> seomanagers = iSysSeoManagerAtomSV.querySysSeoManagerList();
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_SEOMANAGER_RULE);
				cacheClientList.add(cacheClient);
			}
		}
		logger.info("需要刷新数据=="+JSON.toJSONString(cacheClientList));
		for(SysSeoManager seomanager:seomanagers){
			String SEOMANAGER_D = seomanager.getRegionalLanguage()+"&"+seomanager.getSite()+"&"+seomanager.getPageLocation();
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.SEOMANAGER_D_KEY, SEOMANAGER_D,JSON.toJSONString(seomanager));
				logger.info("刷新数据=="+JSON.toJSONString(seomanager));
			}
		}
	}

	@Override
	public QuerySysSeoByIdRes querySysSeoById(String id) {
		SysSeoManager querySysSeoById = iSysSeoManagerAtomSV.querySysSeoById(id);
		QuerySysSeoByIdRes QuerySysSeoByIdRes = new QuerySysSeoByIdRes();
		BeanUtils.copyProperties(QuerySysSeoByIdRes, querySysSeoById);
		return QuerySysSeoByIdRes;
	}
	
}

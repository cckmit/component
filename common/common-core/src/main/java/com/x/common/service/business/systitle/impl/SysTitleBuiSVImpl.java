package com.x.common.service.business.systitle.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.x.base.exception.BusinessException;
import com.x.base.vo.PageInfo;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.systitle.param.SysTitleSearchInfo;
import com.x.common.api.systitle.param.TitleCache;
import com.x.common.api.systitle.param.TitleQueryDetailRequest;
import com.x.common.api.systitle.param.TitleQueryDetailResponse;
import com.x.common.api.systitle.param.TitleQueryInfo;
import com.x.common.api.systitle.param.TitleQueryListRequest;
import com.x.common.api.systitle.param.TitleQueryListResponse;
import com.x.common.api.systitle.param.TitleQueryResponse;
import com.x.common.api.systitle.param.TitleSortCheckRequest;
import com.x.common.api.systitle.param.TitleSortCheckResponse;
import com.x.common.api.systitle.param.TitleSubmitRequest;
import com.x.common.constants.CacheNSMapper;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysContentManagement;
import com.x.common.dao.mapper.bo.SysTitle;
import com.x.common.service.atom.syscontentmanagement.ISysContentManagementAtomSV;
import com.x.common.service.atom.systitle.ISysTitleAtomSV;
import com.x.common.service.business.systitle.ISysTitleBuiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.common.util.SequenceUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.DateUtil;

@Service
@Transactional
public class SysTitleBuiSVImpl implements ISysTitleBuiSV {
	
	private static final Logger log=LoggerFactory.getLogger(SysTitleBuiSVImpl.class);
	
	@Autowired
	private ISysTitleAtomSV sysTitleAtomSV;
	@Autowired
	private ISysContentManagementAtomSV contentManagementAtomSV;

	@Override
	public TitleQueryListResponse queryList(TitleQueryListRequest request) {
		TitleQueryListResponse response=new TitleQueryListResponse();
		PageInfo<SysTitleSearchInfo> pageInfo=new PageInfo<SysTitleSearchInfo>();
		//查询数量
		int count = sysTitleAtomSV.count(request);
		//一级标题信息
		List<SysTitle> queryList = sysTitleAtomSV.queryList(request);
		List<SysTitleSearchInfo> result=new ArrayList<SysTitleSearchInfo>();
		if(!CollectionUtil.isEmpty(queryList)) {
			for (SysTitle sysTitle : queryList) {
				SysTitleSearchInfo info=new SysTitleSearchInfo();
				BeanUtils.copyProperties(info, sysTitle);
				result.add(info);
			}
		}
		pageInfo.setCount(count);
		//总页数
		pageInfo.setPageCount((count + request.getPageSize() - 1) / request.getPageSize());
		pageInfo.setPageNo(request.getPageNo());
		pageInfo.setPageSize(request.getPageSize());
		pageInfo.setResult(result);
		response.setPageInfo(pageInfo);
		return response;
	}

	@Override
	public TitleQueryDetailResponse queryDetail(TitleQueryDetailRequest request) {
		TitleQueryDetailResponse response=new TitleQueryDetailResponse();
		SysTitle sysTitle = sysTitleAtomSV.selectById(request.getId());
		if(sysTitle!=null) {
			BeanUtils.copyProperties(response, sysTitle);
		}
		return response;
	}

	@Override
	public void save(TitleSubmitRequest request) throws Exception {
		//
		SysTitle sysTitle=new SysTitle();
		BeanUtils.copyProperties(sysTitle, request);
		//
		String sysTitleId = SequenceUtil.createSysTitleId();
		sysTitle.setId(sysTitleId);
		//创建时间
		sysTitle.setCreateTime(DateUtil.getSysDate());
		sysTitleAtomSV.insert(sysTitle);
		log.info("更新缓存数据...");
		SysTitleBuiSVImpl.this.write();
		
	}

	@Override
	public void edit(TitleSubmitRequest request) throws Exception {
		SysTitle sysTitle = sysTitleAtomSV.selectById(request.getId());
		if(sysTitle==null) {
			log.error("一级标题信息不存在,id:"+request.getId());
			throw new BusinessException("一级标题信息不存在");
		}
		String aditor = sysTitle.getAditor();
		BeanUtils.copyProperties(sysTitle, request);
		sysTitle.setAditor(aditor);
		sysTitleAtomSV.update(sysTitle);
		log.info("更新缓存数据...");
		SysTitleBuiSVImpl.this.write();
	}

	@Override
	public void delete(String id) throws Exception {
		List<SysContentManagement> contents = contentManagementAtomSV.queryByTitleId(id);
		if(!CollectionUtil.isEmpty(contents)) {
			throw new BusinessException("存在对应的二级标题,不能删除");
		}else {
			int deleteSign = sysTitleAtomSV.delete(id);
			if(deleteSign==0) {
				throw new BusinessException("删除失败,id:"+id);
			}
			log.info("更新缓存数据...");
			SysTitleBuiSVImpl.this.write();
		}
	}

	@Override
	public TitleSortCheckResponse duplicateCheck(TitleSortCheckRequest request) {
		TitleSortCheckResponse response=new TitleSortCheckResponse();
		//查询重复数量
		int count = sysTitleAtomSV.duplicateCheck(request);
		response.setCount(count);
		return response;
	}

	@Override
	public TitleQueryResponse queryTitle(String regionalLanguage) {
		TitleQueryResponse response=new TitleQueryResponse();
		List<TitleQueryInfo> titleList=new ArrayList<TitleQueryInfo>();
		//查询重复数量
		List<SysTitle> sysTitles=sysTitleAtomSV.queryTitle(regionalLanguage);
		if(!CollectionUtil.isEmpty(sysTitles)) {
			for (SysTitle sysTitle : sysTitles) {
				TitleQueryInfo info=new TitleQueryInfo();
				BeanUtils.copyProperties(info, sysTitle);
				titleList.add(info);
			}
		}
		response.setTitleList(titleList);
		return response;
	}
	
	
	@Override
	public void write() throws Exception {
		log.info("更新缓存......");
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_TITLE_RULE);
				cacheClientList.add(cacheClient);
			}
		}
		updateTilteCache(Constants.ZH,Constants.SITE,cacheClientList);
		updateTilteCache(Constants.EN,Constants.SITE,cacheClientList);
	}

	private void updateTilteCache(String local,String site,List<ICacheClient> cacheClientList){
		List<SysTitle> sysTitles = sysTitleAtomSV.querySysTitleList(local,site);
		String titleSecondKey = site+"&"+local;
		List<TitleCache> titleCacheList = new ArrayList<TitleCache>();
		for (SysTitle sysTitle:sysTitles) {
			TitleCache titleCache = new TitleCache();
			BeanUtils.copyProperties(titleCache,sysTitle);
			titleCacheList.add(titleCache);
		}
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.TITLE_D_KEY, titleSecondKey,JSON.toJSONString(titleCacheList));
		}
	}
}

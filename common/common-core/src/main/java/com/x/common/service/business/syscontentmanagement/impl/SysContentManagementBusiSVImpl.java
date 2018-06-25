package com.x.common.service.business.syscontentmanagement.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.x.base.exception.BusinessException;
import com.x.base.vo.PageInfo;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.syscontentmanagement.param.ContentManagementCache;
import com.x.common.api.syscontentmanagement.param.ContentQueryDetailRequest;
import com.x.common.api.syscontentmanagement.param.ContentQueryDetailResponse;
import com.x.common.api.syscontentmanagement.param.ContentQueryListRequest;
import com.x.common.api.syscontentmanagement.param.ContentQueryListResponse;
import com.x.common.api.syscontentmanagement.param.ContentSearchInfo;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckRequest;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckResponse;
import com.x.common.api.syscontentmanagement.param.ContentSubmitRequest;
import com.x.common.constants.CacheNSMapper;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysContentManagement;
import com.x.common.dao.mapper.bo.SysTitle;
import com.x.common.service.atom.syscontentmanagement.ISysContentManagementAtomSV;
import com.x.common.service.atom.systitle.ISysTitleAtomSV;
import com.x.common.service.business.syscontentmanagement.ISysContentManagementBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.common.util.SequenceUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.DateUtil;

@Service
@Transactional
public class SysContentManagementBusiSVImpl implements ISysContentManagementBusiSV {
	
	private static final Logger log=LoggerFactory.getLogger(SysContentManagementBusiSVImpl.class);
	
	@Autowired
	private ISysContentManagementAtomSV contentManagementAtomSV;
	@Autowired
	private ISysTitleAtomSV sysTitleAtomSV;

	@Override
	public ContentQueryListResponse queryList(ContentQueryListRequest request) {
		ContentQueryListResponse response=new ContentQueryListResponse();
		PageInfo<ContentSearchInfo> pageInfo=new PageInfo<ContentSearchInfo>();
		//查询数量
		int count = contentManagementAtomSV.count(request);
		//一级标题信息
		List<SysContentManagement> queryList = contentManagementAtomSV.queryList(request);
		List<ContentSearchInfo> result=new ArrayList<ContentSearchInfo>();
		if(!CollectionUtil.isEmpty(queryList)) {
			for (SysContentManagement management : queryList) {
				//查询一级标题名称
				SysTitle title = sysTitleAtomSV.selectById(management.getTitleid());
				if(title==null) {
					throw new BusinessException("一级标题信息不存在");
				}
				ContentSearchInfo info=new ContentSearchInfo();
				BeanUtils.copyProperties(info, management);
				info.setTitleName(title.getTitle());
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
	public ContentQueryDetailResponse queryDetail(ContentQueryDetailRequest request) {
		ContentQueryDetailResponse response=new ContentQueryDetailResponse();
		SysContentManagement management = contentManagementAtomSV.selectById(request.getId());
		if(management!=null) {
			BeanUtils.copyProperties(response, management);
			SysTitle title = sysTitleAtomSV.selectById(management.getTitleid());
			if(title==null) {
				throw new BusinessException("一级标题信息不存在");
			}
			response.setTitleName(title.getTitle());
		}
		return response;
	}

	@Override
	public void save(ContentSubmitRequest request) throws Exception {
		//
		SysContentManagement management=new SysContentManagement();
		BeanUtils.copyProperties(management, request);
		//
		String contentId = SequenceUtil.createContentId();
		management.setId(contentId);
		//创建时间
		management.setCreateTime(DateUtil.getSysDate());
		contentManagementAtomSV.insert(management);
		log.info("更新缓存数据...");
		SysContentManagementBusiSVImpl.this.write();
		
	}

	@Override
	public void edit(ContentSubmitRequest request) throws Exception {
		SysContentManagement management=contentManagementAtomSV.selectById(request.getId());
		if(management==null) {
			log.error("内容管理信息不存在,id:"+request.getId());
			throw new BusinessException("内容管理信息不存在");
		}
		String aditor = management.getAditor();
		BeanUtils.copyProperties(management, request);
		management.setAditor(aditor);
		contentManagementAtomSV.update(management);
		log.info("更新缓存数据...");
		SysContentManagementBusiSVImpl.this.write();
		
	}

	@Override
	public void delete(String id) throws Exception {
		int deleteSign = contentManagementAtomSV.delete(id);
		if(deleteSign==0) {
			throw new BusinessException("删除失败,id:"+id);
		}
		log.info("更新缓存数据...");
		SysContentManagementBusiSVImpl.this.write();
	}

	@Override
	public ContentSortCheckResponse duplicateCheck(ContentSortCheckRequest request) {
		ContentSortCheckResponse response=new ContentSortCheckResponse();
		//查询重复数量
		int count = contentManagementAtomSV.duplicateCheck(request);
		response.setCount(count);
		return response;
	}
	
	@Override
	public void write() throws Exception {
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_CONTENTMANAGEMENT_RULE);
				//删除
				cacheClient.del(CacheKey.CONTENTMANAGER_D_KEY);
				cacheClientList.add(cacheClient);
			}
		}
		updateContentCache(Constants.ZH,cacheClientList);
		updateContentCache(Constants.EN,cacheClientList);
	}

	private void updateContentCache(String local,List<ICacheClient> cacheClientList){
		//查询不同的数据地区语言
		List<SysContentManagement> sysContentManagements = contentManagementAtomSV.
				querySysContentManagementList(local);
		Set<String> titleSet=new HashSet<String>();
		//根据一级标题区分
		for (SysContentManagement content:sysContentManagements) {
			if(titleSet.contains(content.getTitleid())) {
				continue;
			}
			List<SysContentManagement> contentBytitleIds = contentManagementAtomSV.
					queryContentBytitleId(content.getTitleid(),local);
			List<ContentManagementCache> contentCacheList = new ArrayList<ContentManagementCache>();
			for (SysContentManagement sysContentManagement : contentBytitleIds) {
				ContentManagementCache contentCache = new ContentManagementCache();
				BeanUtils.copyProperties(contentCache,sysContentManagement);
				contentCacheList.add(contentCache);
			}
			String contentKey =content.getTitleid();
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.CONTENTMANAGER_D_KEY, contentKey,JSON.toJSONString(contentCacheList));
			}
			titleSet.add(content.getTitleid());
		}
	}

}

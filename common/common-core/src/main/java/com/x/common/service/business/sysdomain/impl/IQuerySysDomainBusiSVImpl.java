package com.x.common.service.business.sysdomain.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.x.base.vo.PageInfo;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.sysdomain.param.CheckDomainCn;
import com.x.common.api.sysdomain.param.DeleteSysDomain;
import com.x.common.api.sysdomain.param.DomainPageVo;
import com.x.common.api.sysdomain.param.DomainQueryRequest;
import com.x.common.api.sysdomain.param.SaveSysDomain;
import com.x.common.constants.CacheNSMapper;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysDomain;
import com.x.common.service.atom.sysdomain.ISysDomainAtomSV;
import com.x.common.service.business.sysdomain.IQuerySysDomainBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;

/**
 * @author auth
 * @date 2016年11月1日 下午5:58:51 
 * @version V1.0
 */
@Service
public class IQuerySysDomainBusiSVImpl implements IQuerySysDomainBusiSV {
	
	@Autowired
	private transient ISysDomainAtomSV iSysDomainAtomSV;

	@Override
	public List<SysDomain> querySysDomainList(String language) {
		return iSysDomainAtomSV.querySysDomainList(language);
	}

	@Override
	public SysDomain querySysDomainDetails(String domainId) {
		return iSysDomainAtomSV.selectByPrimaryKey(domainId);
	}

	@Override
	public PageInfo<DomainPageVo> queryDomainPage(DomainQueryRequest param) {
		PageInfo<DomainPageVo> domainPageInfo = iSysDomainAtomSV.queryDomainPage(param);
		return domainPageInfo;
	}

	@Override
	public Integer saveSysDomain(SaveSysDomain req) throws Exception {
		SysDomain sysDomain = new SysDomain();
		Long domainId = SeqUtil.getNewId(Constants.SEQ.DOMAIN_ID_SEQ);
		sysDomain.setDomainId(String.valueOf(domainId));
		sysDomain.setLanguage(req.getLanguage());
		sysDomain.setDomainCn(req.getDomainCn());
		sysDomain.setDomainEn(req.getDomainEn());
		sysDomain.setRemarks(req.getRemarks());
		sysDomain.setSite(req.getSite());
		sysDomain.setSort(req.getSort());
		sysDomain.setState(req.getState());
		sysDomain.setUpdatetime(req.getUpdatetime());
		sysDomain.setCreateOperator(req.getCreateOperator());
		sysDomain.setCreateOperatorId(req.getCreateOperatorId());
		Integer saveSysDomain = iSysDomainAtomSV.saveSysDomain(sysDomain);
		IQuerySysDomainBusiSVImpl.this.write();
		return saveSysDomain;
	}

	@Override
	public Integer deleteSysDomain(String domainId) throws Exception {
		Integer deleteSysDomain = iSysDomainAtomSV.deleteSysDomain(domainId);
		IQuerySysDomainBusiSVImpl.this.write();
		return deleteSysDomain;
	}

	@Override
	public SysDomain querySysDomainById(DeleteSysDomain param) {
		return iSysDomainAtomSV.querySysDomainById(param);
	}

	@Override
	public Integer updateSysDomain(SaveSysDomain req) throws Exception {
		SysDomain sysDomain = new SysDomain();
		BeanUtils.copyProperties(sysDomain,req);
		Integer updateSysDomain = iSysDomainAtomSV.updateSysDomain(sysDomain);
		IQuerySysDomainBusiSVImpl.this.write();
		return updateSysDomain;
	}

	@Override
	public Integer checkDomainCn(CheckDomainCn param) {
		return iSysDomainAtomSV.checkDomainCn(param);
	}
	
	@Override
	public void write() throws Exception {
	    List<SysDomain> domains =	iSysDomainAtomSV.querySysDomainList(Constants.ZH_CN);
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_DOMAIN_RULE);
				cacheClientList.add(cacheClient);
			}
		}
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.DOMAIN_L_KEY,CacheKey.DOMAIN_L_KEY,JSON.toJSONString(domains));
		}
		for(SysDomain domain:domains){
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.DOMAIN_D_KEY, domain.getDomainId(),JSON.toJSONString(domain));
			}
		}
	}

	@Override
	public List<DomainPageVo> querySysDomainByIdFlag(DeleteSysDomain param) {
		return iSysDomainAtomSV.querySysDomainByIdFlag(param);
	}

}

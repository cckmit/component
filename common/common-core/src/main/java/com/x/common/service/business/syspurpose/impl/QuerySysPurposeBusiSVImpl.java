package com.x.common.service.business.syspurpose.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.x.base.vo.PageInfo;
import com.x.common.api.cachekey.key.CacheKey;
import com.x.common.api.syspurpose.param.CheckPurposeCn;
import com.x.common.api.syspurpose.param.DeleteSysPurpose;
import com.x.common.api.syspurpose.param.PurposePageQueryRequest;
import com.x.common.api.syspurpose.param.PurposePageVo;
import com.x.common.api.syspurpose.param.SaveSysPurpose;
import com.x.common.constants.CacheNSMapper;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysPurpose;
import com.x.common.service.atom.syspurpose.ISysPurposeAtomSV;
import com.x.common.service.business.syspurpose.IQuerySysPurposeBusiSV;
import com.x.common.util.CacheFactoryUtil;
import com.x.common.util.PaaSConfUtil;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.BeanUtils;

/**
 * @author auth
 * @date 2016年11月1日 下午6:33:45 
 * @version V1.0
 */
@Service
public class QuerySysPurposeBusiSVImpl implements IQuerySysPurposeBusiSV {
	private static final Logger logger = Logger.getLogger(QuerySysPurposeBusiSVImpl.class);
	@Autowired 
	private transient ISysPurposeAtomSV  iSysPurposeAtomSV;

	@Override
	public List<SysPurpose> querySysPurposeList(String language) {
		
		return iSysPurposeAtomSV.querySysPurposeList(language);
	}

	@Override
	public SysPurpose querySysPurposeDetails(String purposeId) {

		return iSysPurposeAtomSV.selectByPrimaryKey(purposeId);
	}

	@Override
	public PageInfo<PurposePageVo> queryPurposePage(PurposePageQueryRequest param) {
		logger.info("Busis查询用途》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
		PageInfo<PurposePageVo> purposePageInfo = iSysPurposeAtomSV.queryPurposePage(param);
		return purposePageInfo;
	}

	@Override
	public Integer saveSysPurpose(SaveSysPurpose req) throws Exception {
		SysPurpose sysPurpose = new SysPurpose();
		Long purposeId = SeqUtil.getNewId(Constants.SEQ.PURPOSE_ID_SEQ);
		sysPurpose.setPurposeId(String.valueOf(purposeId));
		sysPurpose.setLanguage(req.getLanguage());
		sysPurpose.setNamedFlag(req.getNamedFlag());
		sysPurpose.setPurposeCn(req.getPurposeCn());
		sysPurpose.setPurposeEn(req.getPurposeEn());
		sysPurpose.setRemarks(req.getRemarks());
		sysPurpose.setSite(req.getSite());
		sysPurpose.setSort(req.getSort());
		sysPurpose.setState(req.getState());
		sysPurpose.setUpdatetime(req.getUpdatetime());
		sysPurpose.setCreateOperator(req.getCreateOperator());
		sysPurpose.setCreateOperatorId(req.getCreateOperatorId());
		logger.info("Busis添加查询用途》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》"+sysPurpose);
		Integer saveSysPurpose = iSysPurposeAtomSV.saveSysPurpose(sysPurpose);
		QuerySysPurposeBusiSVImpl.this.write();
		return saveSysPurpose;
	}

	@Override
	public Integer deleteSysPurpose(String purposeId) throws Exception {
		Integer deleteSysPurpose = iSysPurposeAtomSV.deleteSysPurpose(purposeId);
		QuerySysPurposeBusiSVImpl.this.write();
		return deleteSysPurpose;
	}

	@Override
	public SysPurpose querySysPurposeById(DeleteSysPurpose param) {
		return iSysPurposeAtomSV.querySysPurposeById(param);
	}

	@Override
	public Integer updateSysPurpose(SaveSysPurpose req) throws Exception {
		SysPurpose sysPurpose = new SysPurpose();
		BeanUtils.copyProperties(sysPurpose,req);
		Integer updateSysPurpose = iSysPurposeAtomSV.updateSysPurpose(sysPurpose);
		QuerySysPurposeBusiSVImpl.this.write();
		return updateSysPurpose;
	}

	@Override
	public Integer checkPurposeCn(CheckPurposeCn param) {
		return iSysPurposeAtomSV.checkPurposeCn(param);
	}
	
	@Override
	public void write() throws Exception {
		List<SysPurpose> purposes =	iSysPurposeAtomSV.querySysPurposeList(Constants.ZH_CN);
		List<ICacheClient> cacheClientList = new ArrayList<ICacheClient>();
		String[] areas = PaaSConfUtil.getAllSrvArea();
		if (areas != null && areas.length > 0) {
			for (String srvarea : areas) {
				ICacheClient cacheClient = CacheFactoryUtil.getCacheClient(srvarea + "."+ CacheNSMapper.CACHE_SYS_PURPOSE_RULE);
				cacheClientList.add(cacheClient);
			}
		}
		for (ICacheClient cacheClient : cacheClientList) {
			cacheClient.hset(CacheKey.PURPOSE_L_KEY, CacheKey.PURPOSE_L_KEY,JSON.toJSONString(purposes));
		}
		for(SysPurpose purpose:purposes){
			for (ICacheClient cacheClient : cacheClientList) {
				cacheClient.hset(CacheKey.PURPOSE_D_KEY, purpose.getPurposeId(),JSON.toJSONString(purpose));
			}
		}
	}

	@Override
	public List<PurposePageVo> querySysPurposeByIdFlag(DeleteSysPurpose param) {
		return iSysPurposeAtomSV.querySysPurposeByIdFlag(param);
	}

}

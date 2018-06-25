package com.x.common.service.business.sysduad.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysduad.param.CheckDuadCn;
import com.x.common.api.sysduad.param.DuadPageQueryRequest;
import com.x.common.api.sysduad.param.DuadPageVo;
import com.x.common.api.sysduad.param.QuerySysDuadById;
import com.x.common.api.sysduad.param.SaveSysDuad;
import com.x.common.cache.SysduadCache;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysDuad;
import com.x.common.service.atom.sysduad.ISysDuadAtomSV;
import com.x.common.service.business.sysduad.IQuerySysDuadBusiSV;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.util.BeanUtils;

/**
 * @author auth
 * @date 2016年11月1日 下午7:49:12 
 * @version V1.0
 */
@Service
public class QuerySysDuadBusiSVImpl implements IQuerySysDuadBusiSV{
	private static final Logger logger = Logger.getLogger(QuerySysDuadBusiSVImpl.class);
	@Autowired
	private transient ISysDuadAtomSV iSysDuadAtomSV;
	
	@Autowired
	private transient SysduadCache sysduadCache;

	@Override
	public List<SysDuad> querySysDuadList(String language, String orderType) {
		
		return iSysDuadAtomSV.querySysDuadList(language, orderType);
	}

	@Override
	public SysDuad querySysDuadDetails(String duadId) {
		return iSysDuadAtomSV.querySysDuadDetails(duadId);
	}

	@Override
	public PageInfo<DuadPageVo> queryDuadPage(DuadPageQueryRequest param) {
		logger.info("Busis查询语言对》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
		PageInfo<DuadPageVo> duadPageInfo = iSysDuadAtomSV.queryDuadPage(param);
		return duadPageInfo;
	}

	@Override
	public Integer saveSysDuad(SaveSysDuad req) throws Exception {
		SysDuad sysDuad = new SysDuad();
		Long duadId = SeqUtil.getNewId(Constants.SEQ.DUAD_ID_SEQ);
		BeanUtils.copyProperties(sysDuad, req);
		sysDuad.setDuadId(String.valueOf(duadId));
		logger.info("Busis添加语言对》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》"+sysDuad);
		Integer iSysDuadAtomSV2 = iSysDuadAtomSV.iSysDuadAtomSV(sysDuad);
		sysduadCache.write();
		return iSysDuadAtomSV2;
	}

	@Override
	public List<DuadPageVo> querySysDuadById(QuerySysDuadById param) {
		return iSysDuadAtomSV.querySysDuadById(param);
	}

	@Override
	public Integer updateSysDuad(SaveSysDuad req) throws Exception {
		SysDuad sysDuad = new SysDuad();
		BeanUtils.copyProperties(sysDuad, req);
		Integer updateSysDuad = iSysDuadAtomSV.updateSysDuad(sysDuad);
		sysduadCache.write();
		return updateSysDuad;
	}

	@Override
	public Integer checkDuadCn(CheckDuadCn param) {
		return iSysDuadAtomSV.checkDuadCn(param);
	}
}

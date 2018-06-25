package com.x.common.service.business.syssensitive.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.syssensitive.param.SaveSysSensitive;
import com.x.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.x.common.api.syssensitive.param.SensitivePageVo;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysSensitive;
import com.x.common.service.atom.syssensitive.ISysSensitiveAtomSV;
import com.x.common.service.business.syssensitive.IQuerySysSensitiveBusiSV;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
public class QuerySysSensitiveBusiSVImpl implements IQuerySysSensitiveBusiSV {
	private static final Logger logger = Logger.getLogger(QuerySysSensitiveBusiSVImpl.class);
	@Autowired 
	private transient ISysSensitiveAtomSV  iSysSensitiveAtomSV;


	@Override
	public PageInfo<SensitivePageVo> querySensitivePage(SensitivePageQueryRequest param) {
		PageInfo<SensitivePageVo> questionsPageInfo = iSysSensitiveAtomSV.querySensitivePage(param);
		return questionsPageInfo;
	}


	@Override
	public Integer saveSysSensitive(SaveSysSensitive req) {
		SysSensitive sysSensitive = new SysSensitive();
		BeanUtils.copyProperties(sysSensitive,req);
		Long id = SeqUtil.getNewId(Constants.SEQ.SENSITIVE_ID_SEQ);
		sysSensitive.setId(id.toString());
		logger.info("Busis添加敏感词》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
		return iSysSensitiveAtomSV.saveSysItemBank(sysSensitive);
	}


	@Override
	public Integer deleteSysSensitive(String id) {
			return iSysSensitiveAtomSV.deleteSysSensitive(id);
	}


	@Override
	public Integer updateSysSensitive(SaveSysSensitive req) {
		SysSensitive sysSensitive = new SysSensitive();
		BeanUtils.copyProperties(sysSensitive,req);
		return iSysSensitiveAtomSV.updateSysSensitive(sysSensitive);	
	}


	@Override
	public List<SensitivePageVo> querySysSensitiveList() {
		List<SensitivePageVo> sensitivePageVos = new ArrayList<SensitivePageVo>();
		 List<SysSensitive> querySensitive = iSysSensitiveAtomSV.querySysSensitiveList();
		if (!CollectionUtil.isEmpty(querySensitive)) {
			sensitivePageVos = new ArrayList<SensitivePageVo>();
			for (int i = 0; i < querySensitive.size(); i++) {
				if(querySensitive.get(i) != null){
					SensitivePageVo sensitivePageVoResponse = new SensitivePageVo();
					BeanUtils.copyProperties(sensitivePageVoResponse, querySensitive.get(i));
					sensitivePageVos.add(sensitivePageVoResponse);
				}
			}
		}
		return sensitivePageVos;
	}

}

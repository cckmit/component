package com.x.common.service.business.sysitembank.impl;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysitembank.param.CheckDuad;
import com.x.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.x.common.api.sysitembank.param.ItemBankPageVo;
import com.x.common.api.sysitembank.param.SaveSysItemBank;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysItembank;
import com.x.common.service.atom.sysitembank.ISysItemBankAtomSV;
import com.x.common.service.business.sysitembank.IQuerySysItemBankBusiSV;
import com.x.sdk.component.sequence.util.SeqUtil;
import com.x.sdk.util.BeanUtils;

/**
 * @author auth
 * @date 
 * @version V1.0
 */
@Service
public class QuerySysItemBankBusiSVImpl implements IQuerySysItemBankBusiSV {
	private static final Logger logger = Logger.getLogger(QuerySysItemBankBusiSVImpl.class);
	@Autowired 
	private transient ISysItemBankAtomSV  iSysItemBankAtomSV;


	@Override
	public PageInfo<ItemBankPageVo> queryItemBankPage(ItemBankPageQueryRequest param) {
		PageInfo<ItemBankPageVo> itemBankPageInfo = iSysItemBankAtomSV.queryItemBankPage(param);
		return itemBankPageInfo;
	}


	@Override
	public Integer saveSysItemBank(SaveSysItemBank req) {
		SysItembank sysItembank = new SysItembank();
		BeanUtils.copyProperties(sysItembank,req);
		Long bId = SeqUtil.getNewId(Constants.SEQ.ITEMBANK_BID_SEQ);
		sysItembank.setBid(String.valueOf(bId));
		logger.info("Busis添加查询题目》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》"+sysItembank);
		return iSysItemBankAtomSV.saveSysItemBank(sysItembank);
	}


	@Override
	public Integer deleteSysItemBank(String bid) {
		return iSysItemBankAtomSV.deleteSysItemBank(bid);
	}


	@Override
	public Integer updateSysItemBank(SaveSysItemBank req) {
		SysItembank sysItembank = new SysItembank();
		BeanUtils.copyProperties(sysItembank,req);
		return iSysItemBankAtomSV.updateSysItemBank(sysItembank);
	}


	@Override
	public Integer checkDuadCn(CheckDuad param) {
		return iSysItemBankAtomSV.checkDuadCn(param);
	}
}

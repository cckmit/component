package com.x.common.service.business.sysitembank;


import com.x.base.vo.PageInfo;
import com.x.common.api.sysitembank.param.CheckDuad;
import com.x.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.x.common.api.sysitembank.param.ItemBankPageVo;
import com.x.common.api.sysitembank.param.SaveSysItemBank;

/**
 * @author auth
 * @date 
 * @version V1.0
 */
public interface IQuerySysItemBankBusiSV {

	PageInfo<ItemBankPageVo> queryItemBankPage(ItemBankPageQueryRequest param);

	Integer saveSysItemBank(SaveSysItemBank req);

	Integer deleteSysItemBank(String bid);

	Integer updateSysItemBank(SaveSysItemBank req);

	Integer checkDuadCn(CheckDuad param);

}

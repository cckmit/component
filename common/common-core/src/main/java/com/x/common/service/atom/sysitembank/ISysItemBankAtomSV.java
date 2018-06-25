package com.x.common.service.atom.sysitembank;


import com.x.base.vo.PageInfo;
import com.x.common.api.sysitembank.param.CheckDuad;
import com.x.common.api.sysitembank.param.ItemBankPageQueryRequest;
import com.x.common.api.sysitembank.param.ItemBankPageVo;
import com.x.common.dao.mapper.bo.SysItembank;

/**
 * @author auth
 * @date 
 * @version V1.0
 */
public interface ISysItemBankAtomSV {
	

	PageInfo<ItemBankPageVo> queryItemBankPage(ItemBankPageQueryRequest param);

	Integer deleteSysItemBank(String bid);

	Integer saveSysItemBank(SysItembank sysItembank);

	Integer updateSysItemBank(SysItembank sysItembank);

	Integer checkDuadCn(CheckDuad param);

}

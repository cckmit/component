package com.x.common.service.atom.syssendmes;


import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.syssendmes.param.DeleteSysSendMes;
import com.x.common.api.syssendmes.param.SaveSysSendMes;
import com.x.common.api.syssendmes.param.SendMesPageQueryRequest;
import com.x.common.api.syssendmes.param.SendMesPageVo;
import com.x.common.api.syssendmes.param.SysMesAddresseeAllResponseInfo;
import com.x.common.api.syssendmes.param.SysMesAddresseeQueryRequest;
import com.x.common.api.syssendmes.param.UpdateSysMesAddresseeState;
import com.x.common.dao.mapper.bo.SysMesAddressee;
import com.x.common.dao.mapper.bo.SysSendMes;

/**
 * @author auth
 * @date 2017年6月16日 
 * @version V1.0
 */
public interface ISysSendMesAtomSV {

	PageInfo<SendMesPageVo> querySendMesPage(SendMesPageQueryRequest param);

	Integer doSendMes(SysSendMes sysSendMes);

	Integer deleteSysSendMes(String mesId);

	Integer doMesAddressee(SysMesAddressee sysMesAddressee);

	int getSysMesAddresseeCount(SysMesAddresseeQueryRequest param);

	List<SysMesAddresseeAllResponseInfo> queryMesAddresseeByMesId(SysMesAddresseeQueryRequest param);

	Integer updateStateEr(UpdateSysMesAddresseeState param);

	Integer updateStateSu(UpdateSysMesAddresseeState param);

	SaveSysSendMes queryTimeById(DeleteSysSendMes param);

	List<SysMesAddressee> queryStateSending();


}

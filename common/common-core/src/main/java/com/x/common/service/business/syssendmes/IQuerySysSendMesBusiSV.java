package com.x.common.service.business.syssendmes;



import com.x.base.vo.PageInfo;
import com.x.common.api.syssendmes.param.DeleteSysSendMes;
import com.x.common.api.syssendmes.param.QueryStateSendingResponse;
import com.x.common.api.syssendmes.param.SaveSysMesAddressee;
import com.x.common.api.syssendmes.param.SaveSysSendMes;
import com.x.common.api.syssendmes.param.SendMesPageQueryRequest;
import com.x.common.api.syssendmes.param.SendMesPageVo;
import com.x.common.api.syssendmes.param.SysMesAddresseePageResponse;
import com.x.common.api.syssendmes.param.SysMesAddresseeQueryRequest;
import com.x.common.api.syssendmes.param.UpdateSysMesAddresseeState;

/**
 * @author auth
 * @date 2017年6月2日
 * @version V1.0
 */
public interface IQuerySysSendMesBusiSV {

	PageInfo<SendMesPageVo> querySendMesPage(SendMesPageQueryRequest param);

	Integer doSendMes(SaveSysSendMes req);

	Integer deleteSysSendMes(String mesId);

	Integer doMesAddressee(SaveSysMesAddressee req);

	SysMesAddresseePageResponse queryMesAddresseeByMesId(SysMesAddresseeQueryRequest param);

	Integer updateStateEr(UpdateSysMesAddresseeState param);

	Integer updateStateSu(UpdateSysMesAddresseeState param);

	SaveSysSendMes queryTimeById(DeleteSysSendMes param);

	QueryStateSendingResponse queryStateSending();


}

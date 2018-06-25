package com.x.common.service.business.sysmsg;


import java.util.List;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.PageInfo;
import com.x.common.api.sendemailjobs.param.SendEmailRequest;
import com.x.common.api.sysmsg.param.DeleteSysMsgRequest;
import com.x.common.api.sysmsg.param.QueryMessageDetailRequest;
import com.x.common.api.sysmsg.param.QueryMessageDetailResponse;
import com.x.common.api.sysmsg.param.QueryMessageInfoRequest;
import com.x.common.api.sysmsg.param.SendMessageInfoRequest;
import com.x.common.api.sysmsg.param.SendPrivateLetterRequest;
import com.x.common.api.sysmsg.param.SysMsgPageQueryRequest;
import com.x.common.api.sysmsg.param.SysMsgPageVo;
import com.x.common.api.sysmsg.param.UpdateMessageInfoRequest;
import com.x.common.dao.mapper.bo.SysMsg;
import com.x.common.dao.mapper.bo.SysMsgReceiver;

public interface ISysMsgBusiSV {
	
	public String saveSysMsg(SysMsg sysMsg);
	
	public Integer deleteSysMsg(String id);
	
	PageInfo<SysMsgPageVo> querySysMsgPage(SysMsgPageQueryRequest request);
	
	public Integer updateSysMsg(SysMsg sysMsg);
	
	int deleteSysMsgReceiverBytMsgId(SysMsgReceiver record);

	int addSysMsgReceiver(SysMsgReceiver record);
	
	int addJobTest();
	
	int batchDelSysMsg(DeleteSysMsgRequest request);
	
	List<SysMsgReceiver> querySysMsgReceiverByMsgId(String msgId);
	
	int sendEmailJob(SendEmailRequest request);
	
	PageInfo<SysMsgPageVo> queryMessageInfo(QueryMessageInfoRequest request) throws BusinessException,SystemException;
	
	QueryMessageDetailResponse queryMessageDetail(QueryMessageDetailRequest request) throws BusinessException,SystemException;
	
	public PageInfo<SysMsgPageVo> queryMessagePageList(SysMsgPageQueryRequest request) throws BusinessException,SystemException; 
	
	int sendPrivateLetter(SendPrivateLetterRequest request) throws BusinessException, SystemException;


	int sendMessageInfo(SendMessageInfoRequest request) throws BusinessException,SystemException;
	
	int updateMessageInfo(UpdateMessageInfoRequest request) throws BusinessException, SystemException;
}

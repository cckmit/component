package com.x.common.dao.mapper.attach;

import com.x.common.api.sysmsg.param.SysMsgPageQueryRequest;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

public class MessageQueryPageList {

	public String getNotAllUserMessageList(SysMsgPageQueryRequest param){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select msg.ID,msg.STATE,msg.SEND_TIME,msg.TITLE, msg.SEND_CONTEN from sys_msg msg,sys_msg_receiver receiver where msg.ID = receiver.MSG_ID and receiver.SEND_STATUS='2'");
		
		if(!CollectionUtil.isEmpty(param.getMsgIdList())) {
			stringBuffer.append(" and receiver.MSG_ID in (");
			for (int i = 0; i < param.getMsgIdList().size(); i++) {
				stringBuffer.append("'" +param.getMsgIdList().get(i) + "'");
				if(i == param.getMsgIdList().size() - 1){
					stringBuffer.append(")");
				}else {
					stringBuffer.append(",");
				}
				
			}
		}
		if(!StringUtil.isBlank(param.getUserId())) {
			stringBuffer.append(" and receiver.USER_ID = '" + param.getUserId() + "'");
		}
		
		return stringBuffer.toString();
	}
	
}

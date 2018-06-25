package com.x.common.service.elasticjob;
//package com.x.common.service.elasticjob;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import com.x.centra.sdk.component.sequence.util.SeqUtil;
//import com.x.centra.sdk.dubbo.util.DubboConsumerFactory;
//import com.x.centra.sdk.util.BeanUtils;
//import com.x.centra.sdk.util.CollectionUtil;
//import com.x.common.constants.Constants;
//import com.x.common.dao.mapper.bo.SysMail;
//import com.x.common.dao.mapper.bo.SysMsg;
//import com.x.common.dao.mapper.bo.SysMsgCriteria;
//import com.x.common.dao.mapper.bo.SysMsgReceiver;
//import com.x.common.dao.mapper.bo.SysMsgReceiverCriteria;
//import com.x.common.dao.mapper.factory.MapperFactory;
//import com.x.user.api.userservice.interfaces.IYCUserServiceSV;
//import com.x.user.api.userservice.param.YCUserInfoResponse;
//import com.dangdang.ddframe.job.api.ShardingContext;
//import com.dangdang.ddframe.job.api.simple.SimpleJob;
//
///**
// * 
// * @author auth
// *
// */
//@Service
//public class SendMessageJob implements SimpleJob {
//	private static final Logger LOGGER = LoggerFactory.getLogger(SendMesJob.class);
//
//	/**
//	 * 执行作业.
//	 * 
//	 * @param shardingContext
//	 *            分片上下文
//	 */
//	@Override
//	public void execute(ShardingContext shardingContext) {
//		SysMsg sysMsg = new SysMsg();
//		String msgId = shardingContext.getJobParameter();
//		// 查询接收人信息
//		try{
//		// 查询消息表
//		SysMsgCriteria sysMsgCriteria = new SysMsgCriteria();
//		sysMsgCriteria.createCriteria().andIdEqualTo(msgId);
//		List<SysMsg> sysMsgs = MapperFactory.getSysMsgMapper().selectByExample(sysMsgCriteria);
//		if (!CollectionUtil.isEmpty(sysMsgs)) {
//			BeanUtils.copyProperties(sysMsg, sysMsgs.get(0));
//		}
//		//判断是否全站
//		if(sysMsg.getAllUser()){
//			IYCUserServiceSV iycUserServiceSV = DubboConsumerFactory.getService(IYCUserServiceSV.class);
//		      List<YCUserInfoResponse> ycUserInfoResponses = iycUserServiceSV.getAllUserInfo();
//		      for (YCUserInfoResponse ycUserInfoResponse : ycUserInfoResponses) {
//		    	  SysMail sysMail = new SysMail();
//		    	  String mailId = SeqUtil.getNewId("SYS$SYSMAIL$ID", 8).toString();
//		    	  sysMail.setId(mailId);
//		    	  sysMail.setSysMsgId(sysMsg.getId());
//		    	  sysMail.setSendUserId(Constants.OperationCode.OPERATION_CODE);
//		    	  sysMail.setUserId(ycUserInfoResponse.getUserId());
//		    	  sysMail.setTitle(sysMsg.getTitle());
//		    	  sysMail.setSendConten(sysMsg.getSendConten());
//		    	  sysMail.setStatus(Constants.ReadCode.NOTREAD);
//		    	  sysMail.setReceiveDate(com.x.centra.sdk.util.DateUtil.getSysDate());
//		    	  MapperFactory.getSysMailMapper().insertSelective(sysMail);
//		      	}
//		}else{
//			SysMsgReceiverCriteria sysMsgReceiverCriteria = new SysMsgReceiverCriteria();
//			sysMsgReceiverCriteria.createCriteria().andMsgIdEqualTo(msgId);
//			List<SysMsgReceiver> sysMsgReceivers = MapperFactory.getSysMsgReceiverMapper().selectByExample(sysMsgReceiverCriteria);
//			if (!CollectionUtil.isEmpty(sysMsgReceivers)) {
//			for (SysMsgReceiver sysMsgReceiver : sysMsgReceivers) {
//				SysMail record = new SysMail();
//				BeanUtils.copyProperties(record, sysMsg);
//				String mailId = SeqUtil.getNewId("SYS$SYSMAIL$ID", 8).toString();
//				record.setId(mailId);
//				record.setSysMsgId(msgId);
//				record.setSendUserId(Constants.OperationCode.OPERATION_CODE);
//				record.setTitle(sysMsg.getTitle());
//				record.setSendConten(sysMsg.getSendConten());
//				record.setUserId(sysMsgReceiver.getUserId());
//				record.setStatus(Constants.ReadCode.NOTREAD);
//				record.setReceiveDate(com.x.centra.sdk.util.DateUtil.getSysDate());
//				MapperFactory.getSysMailMapper().insertSelective(record);
//
//				// 更新接收人状态
//				SysMsgReceiverCriteria example = new SysMsgReceiverCriteria();
//				example.createCriteria().andIdEqualTo(sysMsgReceiver.getId());
//				SysMsgReceiver receiver = new SysMsgReceiver();
//				receiver.setSendDate(com.x.centra.sdk.util.DateUtil.getSysDate());
//				receiver.setSendStatus(Constants.RecieveSendState.SEND);
//				MapperFactory.getSysMsgReceiverMapper().updateByExampleSelective(receiver, example);
//				}
//			}
//		}
//		}catch(Exception e){
//			LOGGER.error("定时发送任务发送错误",e);
//		}finally {
//			// 更新消息表
//			SysMsg msg = new SysMsg();
//			msg.setState(Constants.SendState.SEND);
//			msg.setSendTime(com.x.centra.sdk.util.DateUtil.getSysDate());
//			SysMsgCriteria example = new SysMsgCriteria();
//			example.createCriteria().andIdEqualTo(msgId);
//			MapperFactory.getSysMsgMapper().updateByExampleSelective(msg, example);
//		}
//	}
//}

package com.x.centra.dst.service.task;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.x.centra.dst.constants.DiscountConstants;
import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstance;
import com.x.centra.dst.dao.mapper.bo.DstDiscountRemind;
import com.x.centra.dst.service.atom.interfaces.IDstCustDiscountInstanceAtomSV;
import com.x.centra.dst.util.DateUtils;
import com.x.centra.dst.util.RandomCodeUtils;
import com.x.centra.dst.vo.DstRemindSendVo;
import com.x.sdk.component.mds.IMessageSender;
import com.x.sdk.component.mds.MDSClientFactory;
import com.x.sdk.mcs.MCSClientFactory;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.mds.vo.BusinessMessage;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * 定时更新
 * @author wangluyang
 *
 */
@Component
@Transactional
public class CustDiscountManagementTask {

	private static final Logger LOG = LoggerFactory.getLogger(CustDiscountManagementTask.class);
	
	@Autowired
	private IDstCustDiscountInstanceAtomSV custDiscountInstanceAtomSV;
	
	private static IMessageSender messageSender = null;
	
	private static ICacheClient cacheClient = null;
	
	/**
	 * 遍历discountInstances表并发送提醒数据，每5分钟执行一次
	 */
	@Scheduled(cron = "0 0/5 * * * ?")
	public void CustActiveDiscountManagement() {
		
		LOG.info("**********开始遍历并发送提醒消息");
		
		ICacheClient cacheClient = getCacheClient();
		String discountRemindStr = cacheClient.get(DiscountConstants.DISCOUNT_CACHE_REMIND_MAP_KEY_STR);
		if(StringUtils.isBlank(discountRemindStr)) {
			CustDiscountInitDataTask.init();
			discountRemindStr = cacheClient.get(DiscountConstants.DISCOUNT_CACHE_REMIND_MAP_KEY_STR);
		}
		if(!StringUtils.isBlank(discountRemindStr)) {
			JSONObject discountRemindMap = JSONObject.parseObject(discountRemindStr);
			if(discountRemindMap!=null && discountRemindMap.size()>0) {
				List<String> discountCodeKeys = new ArrayList<String>(discountRemindMap.keySet());
				List<DstCustDiscountInstance> discountInstances = custDiscountInstanceAtomSV.queryByRemindInstance(DiscountConstants.RemindState.EFFECTIVE, discountCodeKeys);
				Timestamp currentTime = new Timestamp(System.currentTimeMillis());
				if(!CollectionUtil.isEmpty(discountInstances)) {
					for(DstCustDiscountInstance discountInstance : discountInstances) {
						JSONObject remindMap = (JSONObject) discountRemindMap.get(discountInstance.getDiscountCode());
						String sortIndex = discountInstance.getRemindIndex();
						if(remindMap.get(sortIndex) == null) {
							//设置remindState为失效
							custDiscountInstanceAtomSV.updateRemindState(discountInstance.getInstanceId(), DiscountConstants.RemindState.INVALID);
						}else {
							String discountRemindObjStr = remindMap.getString(sortIndex);
							DstDiscountRemind discountRemind = JSONObject.parseObject(discountRemindObjStr, DstDiscountRemind.class);
							if(StringUtils.equals(DiscountConstants.DiscountRemindState.EFFECTIVE, discountRemind.getRemindState())) {
								Timestamp remindTime = DateUtils.getTimeByUnit(discountInstance.getExpirationDate(), 
										discountRemind.getRemindTimeUnit(), -Integer.valueOf(discountRemind.getRemindTime()));
								if(currentTime.after(remindTime) || currentTime.equals(remindTime)) {
									//发消息并提醒
									sendKafkaMsg(discountInstance, discountRemind);
									String remindIndex = String.valueOf(Integer.valueOf(sortIndex)+1);
									custDiscountInstanceAtomSV.updateRemindIndex(discountInstance.getInstanceId(), remindIndex);
								}
							}else if(StringUtils.equals(DiscountConstants.DiscountRemindState.INVALID, discountRemind.getRemindState())) {
								Timestamp remindTime = DateUtils.getTimeByUnit(discountInstance.getExpirationDate(), 
										discountRemind.getRemindTimeUnit(), Integer.valueOf(discountRemind.getRemindTime()));
								if(currentTime.after(remindTime) || currentTime.equals(remindTime)) {
									//发消息并提醒
									sendKafkaMsg(discountInstance, discountRemind);
									String remindIndex = String.valueOf(Integer.valueOf(sortIndex)+1);
									custDiscountInstanceAtomSV.updateRemindIndex(discountInstance.getInstanceId(), remindIndex);
								}
							}
							
						}
					}
				}
				
			}else {
				LOG.error("**********未查询到提醒数据");
			}
		}else {
			LOG.error("**********未查询到缓存数据");
		}
		
		LOG.info("遍历custDiscount表发现已激活并已失效的权益数据的删除并存入历史表完成+time："+DateUtils.getCurrentTime()); 
	}
	
	private void sendKafkaMsg(DstCustDiscountInstance discountInstance, DstDiscountRemind discountRemind) {
		
		IMessageSender messageSender = getMessageSender();
		BusinessMessage message = new BusinessMessage(); 
		String verifyId = System.currentTimeMillis()+RandomCodeUtils.generateVerifyCode(4);
		message.setMsgID(verifyId);
		message.setMsgVersion(DiscountConstants.MDS_MSG_VERSION);
		message.setBusiType(DiscountConstants.MDS_PATH_REMIND_DISCOUNT);
		message.setCreateTime(new Timestamp(System.currentTimeMillis()));
		
		DstRemindSendVo sendVo = new DstRemindSendVo();
		sendVo.setCustId(discountInstance.getCustId());
		sendVo.setDiscountCode(discountInstance.getDiscountCode());
		sendVo.setInstanceId(discountInstance.getInstanceId());
		sendVo.setOwnerCode(discountInstance.getOwnerCode());
		sendVo.setOwnerInstanceCode(discountInstance.getOwnerInstanceCode());
		if(!StringUtil.isBlank(discountRemind.getRemindInfo())){
			sendVo.setRemindInfo(String.format(discountRemind.getRemindInfo(), discountInstance.getOwnerInstanceCode()));
		}else {
			sendVo.setRemindInfo(discountRemind.getRemindInfo());
		}
		sendVo.setCreateTime(System.currentTimeMillis());
		message.setData(JSONObject.toJSONString(sendVo));
		messageSender.send(message, System.currentTimeMillis()%2);
		LOG.info(">>>>>>>>>>>发送提醒消息完成"+JSONObject.toJSONString(message));
	}
	
	public static IMessageSender getMessageSender() {
		if(messageSender == null) {
			synchronized(CustDiscountManagementTask.class) {
				messageSender = MDSClientFactory.getSenderClient(DiscountConstants.MDS_PATH_REMIND_DISCOUNT);
			}
		}
		return messageSender;
	}
	
	public static ICacheClient getCacheClient() {
		if(cacheClient == null) {
			synchronized(CustDiscountManagementTask.class) {
				cacheClient = MCSClientFactory.getCacheClient(DiscountConstants.CACHE_NAMESPACE);
			}
		}
		return cacheClient;
	}
	
}

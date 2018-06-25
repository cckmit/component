package com.x.common.service.elasticjob;
//package com.x.common.service.elasticjob;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.x.centra.sdk.dubbo.util.DubboConsumerFactory;
//import com.x.common.api.syssendmes.interfaces.IQuerySysSendMesSV;
//import com.x.common.api.syssendmes.param.QueryStateSendingResponse;
//import com.x.common.api.syssendmes.param.SysMesAddresseeResponse;
//import com.x.common.api.syssendmes.param.UpdateSysMesAddresseeState;
//import com.x.common.util.PropertiesUtil;
//import com.dangdang.ddframe.job.api.ShardingContext;
//import com.dangdang.ddframe.job.api.simple.SimpleJob;
//import com.order.cc.sms.AccessType;
//import com.order.cc.sms.SmsQuery;
//import com.order.cc.sms.entity.Body;
//import com.order.cc.sms.entity.Condition;
//import com.order.cc.sms.entity.FocusSms;
//import com.order.cc.sms.entity.Head;
//import com.order.cc.sms.entity.Message;
//
///**
// * Created by shancc 2017/6/14.
// */
//public class SendMesJob implements SimpleJob {
//    private static final Logger LOGGER = LoggerFactory.getLogger(SendMesJob.class);
//    /**
//     * 执行作业.
//     * @param shardingContext 分片上下文
//     */
//    @Override
//    public void execute(ShardingContext shardingContext) {
//    	
//    	LOGGER.info("定时查询短信状态开始.....................");
//    	IQuerySysSendMesSV iQuerySysSendMesSV = DubboConsumerFactory.getService(IQuerySysSendMesSV.class);
//    	try {
//    		//查询状态为发送中的信息
//			QueryStateSendingResponse queryStateSending = iQuerySysSendMesSV.queryStateSending();
//			if(queryStateSending.getMesAddresseeInfo()!=null){
//				List<SysMesAddresseeResponse> mesAddresseeInfo = queryStateSending.getMesAddresseeInfo();
//				//循环查询短信网关返回的状态，进行更改
//				for (SysMesAddresseeResponse sysMesAddresseeResponse : mesAddresseeInfo) {
//					SmsQuery query=new SmsQuery();
//					Head head=new Head();
//					head.setRequestType("query");
//					head.setSystemId("4");
//					head.setStatus("0");
//					String yeecloudUser = PropertiesUtil.getStringByKey("yeecloudUser");
//					head.setUser(yeecloudUser);
//					String yeecloudPassword = PropertiesUtil.getStringByKey("yeecloudPassword");
//					head.setPassword(yeecloudPassword);
//					head.setErrorCode("0000");
//					head.setErrorMessage("处理成功");
//					
//					Condition condition=new Condition();
//					condition.setMessageTo(sysMesAddresseeResponse.getPhoneNum());
//					//当前时间的前5天
//					/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			        Calendar c = Calendar.getInstance();  
//			        c.add(Calendar.DATE, - 5);  
//					condition.setQueryBeginTime(sdf.format(c.getTime()));*/
//					//当前时间
//					/*condition.setQueryEndTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));*/
//					//标识
//					condition.setBusinessData1(sysMesAddresseeResponse.getId());
//					//发送人ID
//					condition.setMessageFrom("1");
//					condition.setNumPerPage(10);
//					condition.setPageNum(1);
//					
//					Body body=new Body();
//					body.setCondition(condition);
//					FocusSms f=new FocusSms();
//					f.setBody(body);
//					f.setHead(head);
//					query.setFocusSms(f);
//					FocusSms focus=query.query(AccessType.HTTP_TYPE);
//					if(focus.getHead().getResult()){
//						System.out.println(focus.getHead().getRequestType());
//						System.out.println(focus.getHead().getErrorMessage());
//						System.out.println(focus.getBody().getCondition().getTotalPageNum());
//						for(Message message:focus.getBody().getMessages().getMessageList()){
//							//System.out.println(message.getMessageId());
//							if(message.getStatus()=="3"){
//								UpdateSysMesAddresseeState param = new UpdateSysMesAddresseeState();
//								param.setId(message.getBusinessData1());
//								iQuerySysSendMesSV.updateStateSu(param);
//							}else if(message.getStatus()=="4"){
//								UpdateSysMesAddresseeState param = new UpdateSysMesAddresseeState();
//								param.setId(message.getBusinessData1());
//								iQuerySysSendMesSV.updateStateEr(param);
//							}
//						}
//					}
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    	LOGGER.info("定时查询短信状态结束.....................");
//    }
//    
//}

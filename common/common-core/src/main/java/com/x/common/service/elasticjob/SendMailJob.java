package com.x.common.service.elasticjob;
//package com.x.common.service.elasticjob;
//
//import com.x.base.vo.BaseResponse;
//import com.x.centra.sdk.dubbo.util.DubboConsumerFactory;
//import com.x.common.api.sendemailjobs.interfaces.ISendEmailJobSV;
//import com.x.common.api.sendemailjobs.param.SendEmailRequest;
//import com.alibaba.fastjson.JSON;
//import com.dangdang.ddframe.job.api.ShardingContext;
//import com.dangdang.ddframe.job.api.simple.SimpleJob;
//import com.dangdang.ddframe.job.lite.internal.schedule.JobRegistry;
//
//import java.util.List;
//import java.util.Properties;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.mail.MailException;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//import org.springframework.mail.javamail.MimeMessageHelper;
//
///**
// * 发送邮件测试
// * Created by jackieliu on 2017/6/14.
// */
//public class SendMailJob implements SimpleJob {
//    private static final Logger LOGGER = LoggerFactory.getLogger(SendMailJob.class);
//    /**
//     * 执行作业.
//     *
//     * @param shardingContext 分片上下文
//     */
//    @Override
//    public void execute(ShardingContext shardingContext) {
//        LOGGER.info("{}任务执行了",shardingContext.getJobName());
//        ISendEmailJobSV iSendEmailJobSV = DubboConsumerFactory.getService(ISendEmailJobSV.class);
//        SendEmailRequest request = new SendEmailRequest();
//        String jobParameter = shardingContext.getJobParameter();
//		String[] jobParameters = jobParameter.split("\\;");
//        request.setId(jobParameters[0]);
//        request.setLogoUrl(jobParameters[1]);
//        request.setErmaUrl(jobParameters[2]);
//        LOGGER.info("入参："+JSON.toJSONString(request));
////        iSendEmailJobSV.test();
//        BaseResponse resp = iSendEmailJobSV.sendEmailJob(request);
//       
//        System.out.println("我执行了，哈哈,这是["+shardingContext.getJobParameter()+"]");
//    }
//    
//}

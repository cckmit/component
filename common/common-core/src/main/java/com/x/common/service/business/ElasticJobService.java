package com.x.common.service.business;
//package com.x.common.service.business;
//
//import com.x.base.exception.BusinessException;
//import com.x.centra.sdk.constant.ExceptionCodeConstant;
//import com.dangdang.ddframe.job.config.JobCoreConfiguration;
//import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
//import com.dangdang.ddframe.job.exception.JobSystemException;
//import com.dangdang.ddframe.job.lite.api.JobScheduler;
//import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
//import com.dangdang.ddframe.job.lite.internal.schedule.JobRegistry;
//import com.dangdang.ddframe.job.lite.internal.schedule.JobScheduleController;
//import com.dangdang.ddframe.job.lite.internal.storage.JobNodePath;
//import com.dangdang.ddframe.job.lite.lifecycle.api.JobSettingsAPI;
//import com.dangdang.ddframe.job.lite.lifecycle.domain.JobSettings;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
//import com.x.centra.sdk.util.StringUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
///**
// * 定时任务操作
// * Created by jackieliu on 2017/6/19.
// */
//@Component
//public class ElasticJobService {
//    private static final Logger LOGGER = LoggerFactory.getLogger(ElasticJobService.class);
//    @Autowired
//    ZookeeperRegistryCenter zookeeperRegistryCenter;
//
//    @Autowired
//    JobSettingsAPI jobSettingsAPI;
//
//    /**
//     * 添加/更新定时任务。
//     * @param jobName
//     * @param cron
//     * @param jobClass
//     */
//    public void saveJobCron(String jobName, String cron,String jobClass,String jobParameter){
//        LOGGER.info("任务名称:{},newCron:{}",jobName,cron);
//        try {
//            // 判断任务是否已设置
//            String nodePath = zookeeperRegistryCenter
//                    .get(new JobNodePath(jobName).getConfigNodePath());
//            LOGGER.info("nodePath:{}",nodePath);
//            // 若已设置，则变更时间
//            if (StringUtils.isNotBlank(nodePath)) {
//                // 获取已存在设置
//                JobSettings jobSettings = jobSettingsAPI.getJobSettings(jobName);
//                LOGGER.info("{}的设置信息：{}",jobName, jobSettings.getCron());
//                jobSettings.setCron(cron);
//                jobSettingsAPI.updateJobSettings(jobSettings);
//            }
//            // 判断本地是否存在
//            JobScheduleController jobScheduleController = JobRegistry.getInstance()
//                    .getJobScheduleController(jobName);
//            LOGGER.info("本地job是否：",jobScheduleController==null?"否":"是");
//            // 本地不存在则直接添加
//            if (jobScheduleController == null) {
//                JobCoreConfiguration coreConfig = JobCoreConfiguration.newBuilder(jobName, cron, 1)
//                        .jobParameter(jobParameter).build();
//                SimpleJobConfiguration simpleJobConfig = new SimpleJobConfiguration(coreConfig,
//                        jobClass);
//                JobScheduler jobScheduler = new JobScheduler(zookeeperRegistryCenter,
//                        LiteJobConfiguration.newBuilder(simpleJobConfig).build());
//
//                jobScheduler.init();
//            }//若本地已存在，则重新设置
//            else if(jobScheduleController != null ){
//                LOGGER.info("oldCron:{}",jobScheduleController.getNextFireTime());
//                jobScheduleController.rescheduleJob(cron);
//                jobScheduleController.scheduleJob(cron);
//            }
//        } catch (JobSystemException e) {
//            LOGGER.error("更新任务失败", e);
//            throw new BusinessException(ExceptionCodeConstant.SYSTEM_ERROR,"更新定时任务失败");
//        }
//    }
//}

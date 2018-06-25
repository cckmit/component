package com.x.centra.dst.service.kafka;

import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.x.centra.dst.constants.DiscountConstants;
import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstance;
import com.x.centra.dst.dao.mapper.bo.DstCustLevelInstance;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfo;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfoCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelation;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfoCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.util.DateUtils;
import com.x.centra.dst.util.DstSeqUtil;
import com.x.centra.dst.vo.DstActiveProcessorVo;
import com.x.sdk.component.mds.IMessageProcessor;
import com.x.sdk.component.mds.vo.MessageAndMetadata;
import com.x.sdk.mds.vo.BusinessMessage;
import com.x.sdk.util.CollectionUtil;

@Component
@Transactional
public class DstActiveMessageProcessorImpl implements IMessageProcessor {

	private static final Logger LOG = LoggerFactory.getLogger(DstActiveMessageProcessorImpl.class);
	
	@Override
	public void process(MessageAndMetadata message) throws Exception {
		// TODO Auto-generated method stub
		
		// 消息
		String msg = new String(message.getMessage(), "UTF-8");
		// topic
		String topic = message.getTopic();
		// 消息格式
		LOG.debug("********** 消息中心开始消费消息。消息内容：" + msg);
		LOG.debug("********** 消息中心开始消费消息。topic内容：" + topic);

		BusinessMessage businessMessage = JSONObject.parseObject(message.getMessage(), BusinessMessage.class);
		String data = businessMessage.getData();
		if(StringUtils.isBlank(data)) {
			LOG.error(">>>>>>>>>>> 数据为空");
		}else {
			DstActiveProcessorVo processorVo = JSONObject.parseObject(data, DstActiveProcessorVo.class);
			String verificationMsg = verification(processorVo);
			if(!StringUtils.equals("0", verificationMsg)) {
				LOG.error(">>>>>>>>>>> 参数验证失败，异常消息：" + verificationMsg);
			}else {
				
				DstDiscountInfo discountInfo = getDiscountInfoByDiscountCode(processorVo.getTenantId(), processorVo.getDiscountCode());
				if(discountInfo==null) {
					LOG.error(">>>>>>>>>>> 参数验证失败，未查询到权益信息：");
				}else {
					
					DstCustDiscountInstance custDiscountInstance = new DstCustDiscountInstance();
					String instanceId = DstSeqUtil.getDiscountInstanceId();
					if(processorVo.getActiveDate()!=null) {
						custDiscountInstance.setActiveDate(new Timestamp(processorVo.getActiveDate()));
					}
					custDiscountInstance.setActiveStatus(processorVo.getActiveStatus());
					custDiscountInstance.setCreateDate(new Timestamp(processorVo.getActiveDate()));
					custDiscountInstance.setCreateUserId(processorVo.getCreateUserId());
					custDiscountInstance.setCustId(processorVo.getCustId());
					custDiscountInstance.setCustName(processorVo.getCustName());
					custDiscountInstance.setDiscountCode(discountInfo.getDiscountCode());
					custDiscountInstance.setDiscountId(discountInfo.getDiscountId());
					custDiscountInstance.setDiscountName(discountInfo.getDiscountName());
					if(processorVo.getDiscountPayDate()!=null) {
						custDiscountInstance.setDiscountPayDate(new Timestamp(processorVo.getDiscountPayDate()));
					}
					
					custDiscountInstance.setEffectiveDate(new Timestamp(processorVo.getActiveDate()));
					custDiscountInstance.setExpirationDate(DateUtils.getTimeByUnit(
							new Timestamp(processorVo.getActiveDate()), discountInfo.getEffectiveUnit(), Integer.valueOf(discountInfo.getEffectiveTime())));
					
					custDiscountInstance.setInstanceId(instanceId);
					custDiscountInstance.setOwnerCode(processorVo.getOwnerCode());
					custDiscountInstance.setOwnerInstanceCode(processorVo.getOwnerInstanceCode());
					custDiscountInstance.setRemark(processorVo.getRemark());
					custDiscountInstance.setStatus(DiscountConstants.Status.EFFECTIVE);
					custDiscountInstance.setTenantId(processorVo.getTenantId());
					custDiscountInstance.setRemindIndex(DiscountConstants.RemindIndex.NON_REMIND);
					custDiscountInstance.setRemindState(DiscountConstants.RemindState.EFFECTIVE);
					MapperFactory.getDstCustDiscountInstanceMapper().insert(custDiscountInstance);
					
					DstDiscountLevelRelation discountLevelRelation = getLevelRelationByDiscountCode(processorVo.getTenantId(), discountInfo.getDiscountCode());
					String levelCode = discountLevelRelation.getLevelCode();
					DstCustLevelInstance custLevelInstance = new DstCustLevelInstance();
					custLevelInstance.setCreateDate(new Timestamp(processorVo.getActiveDate()));
					custLevelInstance.setInstanceId(instanceId);
					custLevelInstance.setCustId(processorVo.getCustId());
					custLevelInstance.setEffectiveDate(new Timestamp(processorVo.getActiveDate()));
					custLevelInstance.setExpirationDate(DateUtils.getTimeByUnit(
							new Timestamp(processorVo.getActiveDate()), discountInfo.getEffectiveUnit(), Integer.valueOf(discountInfo.getEffectiveTime())));
					custLevelInstance.setLevelCode(levelCode);
					custLevelInstance.setRemark(processorVo.getRemark());
					custLevelInstance.setTenantId(processorVo.getTenantId());
					MapperFactory.getDstCustLevelInstanceMapper().insert(custLevelInstance);
					
				}
			}
		}
		
	}

	/**
	 * 验证方法
	 */
	private String verification(DstActiveProcessorVo processorVo) {

		LOG.debug("********** 消息中心，开始验证processorVo参数格式。参数信息："+JSONObject.toJSONString(processorVo));
		
		if (StringUtils.isBlank(processorVo.getTenantId())) {
			return "租户ID为空。";
		}
		if (StringUtils.isBlank(processorVo.getCustId())) {
			return "客户ID为空。";
		}
		if (StringUtils.isBlank(processorVo.getOwnerCode())) {
			return "主体编码为空。";
		}
		if (StringUtils.isBlank(processorVo.getOwnerInstanceCode())) {
			return "主体实例编码为空。";
		}
		if (StringUtils.isBlank(processorVo.getDiscountCode())) {
			return "权益编码为空。";
		}
		if (processorVo.getActiveDate() == null) {
			return "激活日期为空。";
		}
		if (processorVo.getDiscountPayDate() == null) {
			return "购买日期为空。";
		}
		return "0";
	}
	
	public DstDiscountInfo getDiscountInfoByDiscountCode(String tenantId, String discountCode) {
		// TODO Auto-generated method stub
		DstDiscountInfoCriteria example = new DstDiscountInfoCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId)
				.andDiscountCodeEqualTo(discountCode);
		List<DstDiscountInfo> discountInfos = MapperFactory.getDstDiscountInfoMapper().selectByExample(example);
		return CollectionUtil.isEmpty(discountInfos)?null:discountInfos.get(0);
	}
	
	public DstDiscountLevelRelation getLevelRelationByDiscountCode(String tenantId, String discountCode) {
		// TODO Auto-generated method stub
		
		DstDiscountLevelRelationCriteria example = new DstDiscountLevelRelationCriteria();
		com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria.Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId)
				.andDiscountCodeEqualTo(discountCode);
		List<DstDiscountLevelRelation> relations = MapperFactory.getDstDiscountLevelRelationMapper().selectByExample(example);
		return CollectionUtil.isEmpty(relations)?null:relations.get(0);
	}
}

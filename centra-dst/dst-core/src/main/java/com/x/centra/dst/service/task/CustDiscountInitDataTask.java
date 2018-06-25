package com.x.centra.dst.service.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.x.centra.dst.constants.DiscountConstants;
import com.x.centra.dst.dao.mapper.bo.DstDiscountRemind;
import com.x.centra.dst.dao.mapper.bo.DstDiscountRemindCriteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.sdk.mcs.MCSClientFactory;
import com.x.sdk.mcs.interfaces.ICacheClient;
import com.x.sdk.util.CollectionUtil;

/**
 * 初始化数据
 * @author wangluyang
 *
 */
@Component
@Transactional
public class CustDiscountInitDataTask implements ApplicationListener<ContextRefreshedEvent>{

	private static final Logger LOG = LoggerFactory.getLogger(CustDiscountInitDataTask.class);
	
	public CustDiscountInitDataTask() {
		
	}
	
	public static void init() {
		LOG.info("**********开始初始化数据");
		initRemindData();
	}
	
	public static void initRemindData() {
		
		LOG.info("**********开始初始化权益提醒数据到缓存");
		ICacheClient cacheClient = MCSClientFactory.getCacheClient(DiscountConstants.CACHE_NAMESPACE);
		DstDiscountRemindCriteria example = new DstDiscountRemindCriteria();
		
		List<DstDiscountRemind> discountReminds = MapperFactory.getDstDiscountRemindMapper().selectByExample(example);
		Map<String, Map<String, DstDiscountRemind>> discountRemindMap = new HashMap<>();
		 
		if(!CollectionUtil.isEmpty(discountReminds)) {
			for(DstDiscountRemind discountRemind:discountReminds) {
				Map<String, DstDiscountRemind> map = discountRemindMap.get(discountRemind.getDiscountCode());
				if(map == null) {
					map = new HashMap<>();
				}
				map.put(discountRemind.getSortIndex(), discountRemind);
				discountRemindMap.put(discountRemind.getDiscountCode(), map);
			}
		}else {
			LOG.info(">>>>>>>>>>>未查询到权益提醒数据");
		}
		cacheClient.set(DiscountConstants.DISCOUNT_CACHE_REMIND_MAP_KEY_STR, JSON.toJSONString(discountRemindMap));
		LOG.info(">>>>>>>>>>>权益数据加载到缓存完成"+JSON.toJSONString(discountRemindMap));
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	
}

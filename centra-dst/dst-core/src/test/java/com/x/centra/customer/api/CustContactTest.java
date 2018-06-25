package com.x.centra.customer.api;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.x.centra.dst.api.discount.param.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.x.centra.dst.api.discount.interfaces.ICustDiscountSV;
import com.x.centra.dst.api.discount.interfaces.IDiscountManagementSV;
import com.x.centra.dst.constants.DiscountConstants;
import com.x.centra.dst.util.DateUtils;
import com.x.centra.dst.vo.DstActiveProcessorVo;
import com.x.sdk.component.mds.IMessageSender;
import com.x.sdk.component.mds.MDSClientFactory;
import com.x.sdk.mds.vo.BusinessMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:/context/core-context.xml"})
public class CustContactTest {

	@Autowired
	private ICustDiscountSV custDiscountSV;
	
	@Autowired
	private IDiscountManagementSV discountManagementSV;

	
	/*@Test
	public void addDiscountInfo() {
		DiscountInfoVo param = new DiscountInfoVo();
		param.setTenantId("1");
		param.setCarLimit("");
//		param.setDiscountId(discountId);
		param.setDiscountName("包月优惠");
		param.setEffectiveTime("2");
		param.setEffectiveUnit(DiscountConstants.TimeUnit.WEEK);
		param.setStartDate(DateUtils.getTimeByUnit(new Timestamp(System.currentTimeMillis()), 
				DiscountConstants.TimeUnit.WEEK, -1).getTime());
		param.setEndDate(DateUtils.getTimeByUnit(new Timestamp(System.currentTimeMillis()), 
				DiscountConstants.TimeUnit.WEEK, 2).getTime());
		param.setMemberCap("10");
		param.setMemberLimit("0");
		param.setRemark("新增");
		param.setVerifyState("");
		
		DiscountRuleVo ruleVo = new DiscountRuleVo();
		ruleVo.setDiscountType("pdyh");
		ruleVo.setPrice("100");
		ruleVo.setPriceUnitCode("yuan/tian");
		ruleVo.setPriceUnitName("元/天");
		ruleVo.setPolicyTypeCode("");
		ruleVo.setPolicyUnitCode("");
		ruleVo.setPolicyUnitName("");
		ruleVo.setPolicyValue("");
//		param.setRuleVo(ruleVo);
		
		System.out.println(JSONObject.toJSONString(param));
		discountManagementSV.saveDiscountInfo(param);
	}
	
	@Test
	public void addCustDiscount() {
		CustDiscountVo param = new CustDiscountVo();
		param.setCustId("111");
		param.setCustLevel("2");
		param.setDiscountId("0000000010");
		param.setDiscountPayDate(DateUtils.getTimeByUnit(new Timestamp(System.currentTimeMillis()), 
				DiscountConstants.TimeUnit.WEEK, 0).getTime());
		param.setDiscountPayFee("10");
//		param.setEffectiveDate();
//		param.setExpirationDate();
		param.setRemark("用户权益购买");
		param.setTenantId("1");
		custDiscountSV.saveCustDiscountInfo(param);
	}
	
	@Test
	public void queryDiscount() {
		DiscountInfoQueryParam param = new DiscountInfoQueryParam();
		param.setPageNo(1);
		param.setPageSize(10);
		param.setTenantId("1");
		discountManagementSV.queryDiscountInfo(param);
		System.out.println();
	}
	
	@Test
	public void queryCustDiscountInfo() {
		CustDiscountQueryParam discountQueryParam = new CustDiscountQueryParam();
		discountQueryParam.setCustId("1");
		discountQueryParam.setTenantId("1");
		discountQueryParam.setCustLevel("1");
		discountQueryParam.setDiscountTypeCode("1");
		discountQueryParam.setActiveStatus("1");
		custDiscountSV.queryCustDiscountInfo(discountQueryParam);
		System.out.println();
	}
	
	@Test
	public void activeCustDiscountInfo() {
//		DiscountActiveVo param = new DiscountActiveVo();
//		param.setCustId("0000012151");
//		param.setTenantId("1");
//		param.setActiveDate(1521018269856L);
//		param.setCarId("aaa");
//		param.setCarNum("1111");
//		param.setEffectiveDate(1521018269856L);
//		param.setInstanceId("0000000022");
//		custDiscountSV.activeCustDiscount(param);
		
		IMessageSender messageSender = MDSClientFactory.getSenderClient(DiscountConstants.MDS_PROCESSOR_PATH);
		
		BusinessMessage message = new BusinessMessage();
		message.setMsgID("1");
		message.setMsgVersion("1.1");
		message.setBusiType("111");
		message.setCreateTime(new Timestamp(System.currentTimeMillis()));
		
		DstActiveProcessorVo processorVo = new DstActiveProcessorVo();
		processorVo.setCarId("111");
		processorVo.setCarNum("111");
		processorVo.setActiveDate(System.currentTimeMillis());
		processorVo.setCustId("123");
		processorVo.setCustLevel("1");
		processorVo.setDiscountId("00001");
		processorVo.setDiscountPayDate(System.currentTimeMillis());
		processorVo.setDiscountPayFee("11111");
		processorVo.setEffectiveDate(System.currentTimeMillis());
		processorVo.setExpirationDate(System.currentTimeMillis());
		message.setData(JSONObject.toJSONString(processorVo));
		
		messageSender.send(JSONObject.toJSONString(message), System.currentTimeMillis()%2);
		System.out.println();
	}*/
	
//	public static void main(String[] args) {
//		System.out.println(DateUtils.getTimeByUnit(new Timestamp(System.currentTimeMillis()),
//				DiscountConstants.TimeUnit.WEEK, -2));
//
//	}

	@Test
	public void queryCustDiscountInfoTest(){
		CustDiscountQueryParam param  = new CustDiscountQueryParam();
		param.setTenantId("pubgo");
		param.setCustId("user001");
		param.setOwnerCode("car");
		param.setOwnerInstanceCode("京aasdad");
		CustDiscountQueryResponse response = custDiscountSV.queryCustDiscountInfo(param);
		//System.out.println(JSON.toJSON(response));
	}
}

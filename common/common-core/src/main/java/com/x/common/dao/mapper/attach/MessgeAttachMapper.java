package com.x.common.dao.mapper.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.x.common.api.sysmsg.param.SysMsgPageQueryRequest;
import com.x.common.api.sysmsg.param.SysMsgPageVo;

public interface MessgeAttachMapper {

	@Select("select msg.ID from sys_msg msg where 1 = 1 and msg.STATE in('1','3') and msg.TYPE = '0' and msg.ALL_USER = false")
	@Results({
		  @Result(property = "id", column = "ID", javaType = String.class),
	})
	public List<String> getNotAllUserMessageId();
	
	@Select("select msg.ID,msg.STATE,msg.SEND_TIME,msg.TITLE, msg.SEND_CONTEN from sys_msg msg where 1 = 1 and msg.STATE in('1','3') and msg.TYPE = '0' and msg.ALL_USER = true")
	@Results({
		  @Result(property = "id", column = "ID", javaType = String.class),
		  @Result(property = "state", column = "STATE", javaType = String.class),
		  @Result(property = "sendConten", column = "SEND_CONTEN", javaType = String.class),
		  @Result(property ="title",column = "TITLE",javaType = String.class),
		  @Result(property ="sendTime",column = "SEND_TIME",javaType = Timestamp.class),
	})
	public List<SysMsgPageVo> getAllUserMessageList();
	
	@SelectProvider(type = MessageQueryPageList.class, method = "getNotAllUserMessageList")
	@Results({
		  @Result(property = "id", column = "ID", javaType = String.class),
		  @Result(property = "state", column = "STATE", javaType = String.class),
		  @Result(property = "sendConten", column = "SEND_CONTEN", javaType = String.class),
		  @Result(property ="title",column = "TITLE",javaType = String.class),
		  @Result(property ="sendTime",column = "SEND_TIME",javaType = Timestamp.class),
	})
	public List<SysMsgPageVo> getNotAllUserMessageList(SysMsgPageQueryRequest param);
	
}

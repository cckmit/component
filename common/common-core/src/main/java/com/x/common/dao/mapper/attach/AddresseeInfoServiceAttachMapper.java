package com.x.common.dao.mapper.attach;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.x.common.api.sysaddresseelist.param.SysAddresseeAllResponseInfo;
import com.x.common.api.sysaddresseelist.param.SysAddresseeQueryRequest;

public interface AddresseeInfoServiceAttachMapper {

	@SelectProvider(type=AddresseeQueryAllList.class,method="queryAddresseeAllCount")
	public int getSysAddresseeCount(SysAddresseeQueryRequest param);

	@SelectProvider(type = AddresseeQueryAllList.class, method = "queryAddresseeAll")
	@Results({
		  @Result(property = "id", column = "ID", javaType = String.class),
		  @Result(property = "listId", column = "LIST_ID", javaType = String.class),
		  @Result(property = "phoneNum", column = "PHONE_NUM", javaType = String.class),
          @Result(property ="code",column = "CODE",javaType = String.class),
		  @Result(property ="creatTime",column = "CREAT_TIME",javaType = Timestamp.class),
	})
	public List<SysAddresseeAllResponseInfo> queryManByListId(SysAddresseeQueryRequest param);
	

}

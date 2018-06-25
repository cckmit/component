package com.x.common.dao.mapper.attach;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;

import com.x.common.api.syssendmes.param.SysMesAddresseeAllResponseInfo;
import com.x.common.api.syssendmes.param.SysMesAddresseeQueryRequest;

public interface MesAddresseeInfoServiceAttachMapper {

	
	@SelectProvider(type=MesAddresseeQueryAllList.class,method="queryMesAddresseeAllCount")
	public int getSysMesAddresseeCount(SysMesAddresseeQueryRequest param);
	
	@SelectProvider(type = MesAddresseeQueryAllList.class, method = "queryMesAddresseeAll")
	@Results({
		  @Result(property = "id", column = "ID", javaType = String.class),
		  @Result(property = "mesId", column = "MES_ID", javaType = String.class),
		  @Result(property = "phoneNum", column = "PHONE_NUM", javaType = String.class),
          @Result(property ="code",column = "CODE",javaType = String.class),
          @Result(property ="state",column = "STATE",javaType = String.class),
	})
	public List<SysMesAddresseeAllResponseInfo> queryMesAddresseeByMesId(SysMesAddresseeQueryRequest param);
	

}

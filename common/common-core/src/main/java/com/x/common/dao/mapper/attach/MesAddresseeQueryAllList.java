package com.x.common.dao.mapper.attach;

import com.x.common.api.syssendmes.param.SysMesAddresseeQueryRequest;

public class MesAddresseeQueryAllList {
	
	public String queryMesAddresseeAllCount(SysMesAddresseeQueryRequest param){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select count(*) from sys_mes_addressee where ");
		if(param.getPhoneAndCode()!=null&&!"".equals(param.getPhoneAndCode())){
			stringBuffer.append("(CODE like '%"+param.getPhoneAndCode()+"%' OR PHONE_NUM like '%"+param.getPhoneAndCode()+"%') and ");
		}
		if(param.getMesId()!=null&&!"".equals(param.getMesId())){
			stringBuffer.append("MES_ID = '"+param.getMesId()+"'");
		}
		stringBuffer.append(" and 1 = 1") ;
		return stringBuffer.toString();
	}
	
	public String queryMesAddresseeAll(SysMesAddresseeQueryRequest param){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select * from sys_mes_addressee where ");
		if(param.getPhoneAndCode()!=null&&!"".equals(param.getPhoneAndCode())){
			stringBuffer.append("(CODE like '%"+param.getPhoneAndCode()+"%' OR PHONE_NUM like '%"+param.getPhoneAndCode()+"%') and ");
		}
		if(param.getMesId()!=null&&!"".equals(param.getMesId())){
			stringBuffer.append("MES_ID = '"+param.getMesId()+"'");
		}
		stringBuffer.append(" and 1=1 ") ;
		int limitStart = (param.getPageNo()-1)*param.getPageSize();
		int limitEnd = param.getPageSize();
		stringBuffer.append(" limit "+limitStart+","+limitEnd);
		return stringBuffer.toString();
	}
	
}

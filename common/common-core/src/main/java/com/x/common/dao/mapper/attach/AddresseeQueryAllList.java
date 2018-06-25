package com.x.common.dao.mapper.attach;

import com.x.common.api.sysaddresseelist.param.SysAddresseeQueryRequest;

public class AddresseeQueryAllList {
	
	public String queryAddresseeAll(SysAddresseeQueryRequest param){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select * from sys_addressee where ");
		if(param.getPhoneAndCode()!=null&&!"".equals(param.getPhoneAndCode())){
			stringBuffer.append("(CODE like '%"+param.getPhoneAndCode()+"%' OR PHONE_NUM like '%"+param.getPhoneAndCode()+"%') and ");
		}
		if(param.getListId()!=null&&!"".equals(param.getListId())){
			stringBuffer.append("LIST_ID = '"+param.getListId()+"'");
		}
		stringBuffer.append(" and 1=1 ") ;
		int limitStart = (param.getPageNo()-1)*param.getPageSize();
		int limitEnd = param.getPageSize();
		stringBuffer.append(" limit "+limitStart+","+limitEnd);
		return stringBuffer.toString();
	}
	
	public String queryAddresseeAllCount(SysAddresseeQueryRequest param){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("select count(*) from sys_addressee where ");
		if(param.getPhoneAndCode()!=null&&!"".equals(param.getPhoneAndCode())){
			stringBuffer.append("(CODE like '%"+param.getPhoneAndCode()+"%' OR PHONE_NUM like '%"+param.getPhoneAndCode()+"%') and ");
		}
		if(param.getListId()!=null&&!"".equals(param.getListId())){
			stringBuffer.append("LIST_ID = '"+param.getListId()+"'");
		}
		stringBuffer.append(" and 1 = 1") ;
		return stringBuffer.toString();
	}
	
	
	
}

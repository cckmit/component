package com.x.common.service.atom.sysmsg;


import com.x.base.vo.PageInfo;
import com.x.common.api.sysmsg.param.SysMsgPageQueryRequest;
import com.x.common.api.sysmsg.param.SysMsgPageVo;
import com.x.common.dao.mapper.bo.SysMsg;

public interface ISysMsgAtomSV {
	
	PageInfo<SysMsgPageVo> querySysMsgPage(SysMsgPageQueryRequest request);
	
	Integer deleteSysMsg(String Id);
	
	Integer updateSysMsg(SysMsg sysMsg);
	
	String saveSysMsg(SysMsg sysMsg);
	
	SysMsg selectByPrimaryKey(String Id);
	
	PageInfo<SysMsgPageVo> queryMessagePageList(SysMsgPageQueryRequest request);
	
	
	
	

}

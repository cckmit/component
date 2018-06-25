package com.x.common.service.atom.syspurpose;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.syspurpose.param.CheckPurposeCn;
import com.x.common.api.syspurpose.param.DeleteSysPurpose;
import com.x.common.api.syspurpose.param.PurposePageQueryRequest;
import com.x.common.api.syspurpose.param.PurposePageVo;
import com.x.common.dao.mapper.bo.SysPurpose;

/**
 * @author auth
 * @date 2016年11月1日 下午6:35:25 
 * @version V1.0
 */
public interface ISysPurposeAtomSV {
	
	/**
	 * 查询页面显示的用途
	 */
	List<SysPurpose> querySysPurposeList(String language);
	
	SysPurpose selectByPrimaryKey(String purposeId);

	PageInfo<PurposePageVo> queryPurposePage(PurposePageQueryRequest param);

	Integer saveSysPurpose(SysPurpose sysPurpose);

	Integer deleteSysPurpose(String purposeId);

	SysPurpose querySysPurposeById(DeleteSysPurpose param);

	Integer updateSysPurpose(SysPurpose sysPurpose);

	Integer checkPurposeCn(CheckPurposeCn param);

	List<PurposePageVo> querySysPurposeByIdFlag(DeleteSysPurpose param);

}

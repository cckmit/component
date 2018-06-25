package com.x.common.service.business.syspurpose;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.syspurpose.param.CheckPurposeCn;
import com.x.common.api.syspurpose.param.DeleteSysPurpose;
import com.x.common.api.syspurpose.param.PurposePageQueryRequest;
import com.x.common.api.syspurpose.param.PurposePageVo;
import com.x.common.api.syspurpose.param.SaveSysPurpose;
import com.x.common.dao.mapper.bo.SysPurpose;

/**
 * @author auth
 * @date 2016年11月1日 下午6:32:12 
 * @version V1.0
 */
public interface IQuerySysPurposeBusiSV {
	
	/**
	 * 查询页面显示的用途
	 */
	List<SysPurpose> querySysPurposeList(String language);
	
	SysPurpose querySysPurposeDetails(String purposeId);

	PageInfo<PurposePageVo> queryPurposePage(PurposePageQueryRequest param);

	Integer saveSysPurpose(SaveSysPurpose req) throws Exception;

	Integer deleteSysPurpose(String purposeId) throws Exception;

	SysPurpose querySysPurposeById(DeleteSysPurpose param);

	Integer updateSysPurpose(SaveSysPurpose req) throws Exception;

	Integer checkPurposeCn(CheckPurposeCn param);

	void write() throws Exception;

	List<PurposePageVo> querySysPurposeByIdFlag(DeleteSysPurpose param);

}

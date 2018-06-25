package com.x.common.service.business.sysseomanager;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysseomanager.param.CheckSysSeoManager;
import com.x.common.api.sysseomanager.param.QuerySysSeoByIdRes;
import com.x.common.api.sysseomanager.param.SaveSysSeoManager;
import com.x.common.api.sysseomanager.param.SeoManagerPageQueryRequest;
import com.x.common.api.sysseomanager.param.SeoManagerPageVo;
import com.x.common.dao.mapper.bo.SysSeoManager;

/**
 * @author auth
 * @date 2017年6月2日
 * @version V1.0
 */
public interface IQuerySysSeoManagerBusiSV {

	PageInfo<SeoManagerPageVo> querySeoManagerPage(SeoManagerPageQueryRequest param);

	Integer saveSysSeoManager(SaveSysSeoManager req) throws Exception;

	Integer deleteSysSeoManager(String id) throws Exception;

	Integer updateSysSeoManager(SaveSysSeoManager req) throws Exception;

	Integer checkSysSeoManager(CheckSysSeoManager param);

	List<SysSeoManager> querySysSeoManagerList();

	void write() throws Exception;

	QuerySysSeoByIdRes querySysSeoById(String id);
	

}

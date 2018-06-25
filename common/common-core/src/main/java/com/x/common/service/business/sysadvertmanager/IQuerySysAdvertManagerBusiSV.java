package com.x.common.service.business.sysadvertmanager;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageQueryRequest;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageVo;
import com.x.common.api.sysadvertmanager.param.SaveSysAdvertManager;
import com.x.common.dao.mapper.bo.SysAdvertManager;

/**
 * @author auth
 * @date 2017年6月2日
 * @version V1.0
 */
public interface IQuerySysAdvertManagerBusiSV {

	PageInfo<AdvertManagerPageVo> queryAdvertManagerPage(AdvertManagerPageQueryRequest param);

	Integer saveSysAdvertManager(SaveSysAdvertManager req) throws Exception;

	Integer deleteSysAdvertManager(String id) throws Exception;

	Integer updateSysAdvertManager(SaveSysAdvertManager req) throws Exception;

	SaveSysAdvertManager querySysAdvertById(String id);

	List<SysAdvertManager> querySysAdvertList();

	void write() throws Exception;


}

package com.x.common.service.atom.sysadvertmanager;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageQueryRequest;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageVo;
import com.x.common.dao.mapper.bo.SysAdvertManager;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
public interface ISysAdvertManagerAtomSV {

	PageInfo<AdvertManagerPageVo> queryAdvertManagerPage(AdvertManagerPageQueryRequest param);

	Integer saveSysAdvertManager(SysAdvertManager sysAdvertManager);

	Integer deleteSysAdvertManager(String id);

	Integer updateSysAdvertManager(SysAdvertManager sysAdvertManager);

	SysAdvertManager querySysAdvertById(String id);

	List<SysAdvertManager> querySysAdvertList(String regionalLanguage, String site);

	List<SysAdvertManager> querySysAdvertLists(String zh, String site, String advertisingPosition);


}

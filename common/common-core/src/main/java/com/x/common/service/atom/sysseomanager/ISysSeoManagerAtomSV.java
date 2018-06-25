package com.x.common.service.atom.sysseomanager;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysseomanager.param.CheckSysSeoManager;
import com.x.common.api.sysseomanager.param.SeoManagerPageQueryRequest;
import com.x.common.api.sysseomanager.param.SeoManagerPageVo;
import com.x.common.dao.mapper.bo.SysSeoManager;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
public interface ISysSeoManagerAtomSV {

	PageInfo<SeoManagerPageVo> querySeoManagerPage(SeoManagerPageQueryRequest param);

	Integer saveSysSeoManager(SysSeoManager sysSeoManager);

	Integer deleteSysSeoManager(String id);

	Integer updateSysSeoManager(SysSeoManager sysSeoManager);

	Integer checkSysSeoManager(CheckSysSeoManager param);

	List<SysSeoManager> querySysSeoManagerList();

	SysSeoManager querySysSeoById(String id);
	

}

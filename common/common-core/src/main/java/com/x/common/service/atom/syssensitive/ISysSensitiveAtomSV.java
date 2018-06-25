package com.x.common.service.atom.syssensitive;


import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.x.common.api.syssensitive.param.SensitivePageVo;
import com.x.common.dao.mapper.bo.SysSensitive;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
public interface ISysSensitiveAtomSV {

	PageInfo<SensitivePageVo> querySensitivePage(SensitivePageQueryRequest param);

	Integer saveSysItemBank(SysSensitive sysSensitive);

	Integer updateSysSensitive(SysSensitive sysSensitive);

	Integer deleteSysSensitive(String id);

	List<SysSensitive> querySysSensitiveList();
	
}

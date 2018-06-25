package com.x.common.service.business.syssensitive;


import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.syssensitive.param.SaveSysSensitive;
import com.x.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.x.common.api.syssensitive.param.SensitivePageVo;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
public interface IQuerySysSensitiveBusiSV {

	PageInfo<SensitivePageVo> querySensitivePage(SensitivePageQueryRequest param);

	Integer saveSysSensitive(SaveSysSensitive req);

	Integer updateSysSensitive(SaveSysSensitive req);

	Integer deleteSysSensitive(String id);

	List<SensitivePageVo> querySysSensitiveList();
}

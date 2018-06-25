package com.x.common.service.atom.sysduad;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysduad.param.CheckDuadCn;
import com.x.common.api.sysduad.param.DuadPageQueryRequest;
import com.x.common.api.sysduad.param.DuadPageVo;
import com.x.common.api.sysduad.param.QuerySysDuadById;
import com.x.common.dao.mapper.bo.SysDuad;

public interface ISysDuadAtomSV {
	
	/**
	 * 获取页面显示的
	 */
	List<SysDuad> querySysDuadList(String language,String orderType);
	
	SysDuad querySysDuadDetails(String duadId);

	PageInfo<DuadPageVo> queryDuadPage(DuadPageQueryRequest param);

	Integer iSysDuadAtomSV(SysDuad sysDuad);

	List<DuadPageVo> querySysDuadById(QuerySysDuadById param);

	Integer updateSysDuad(SysDuad sysDuad);

	Integer checkDuadCn(CheckDuadCn param);
}

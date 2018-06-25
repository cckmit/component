package com.x.common.service.business.sysduad;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysduad.param.CheckDuadCn;
import com.x.common.api.sysduad.param.DuadPageQueryRequest;
import com.x.common.api.sysduad.param.DuadPageVo;
import com.x.common.api.sysduad.param.QuerySysDuadById;
import com.x.common.api.sysduad.param.SaveSysDuad;
import com.x.common.dao.mapper.bo.SysDuad;

/**
 * @author auth
 * @date 2016年11月1日 下午7:43:52 
 * @version V1.0
 */
public interface IQuerySysDuadBusiSV {
	
	/**
	 * 获取页面显示的
	 */
	List<SysDuad> querySysDuadList(String language,String orderType);
	
	SysDuad querySysDuadDetails(String duadId);

	PageInfo<DuadPageVo> queryDuadPage(DuadPageQueryRequest param);

	Integer saveSysDuad(SaveSysDuad req) throws Exception;

	List<DuadPageVo> querySysDuadById(QuerySysDuadById param);

	Integer updateSysDuad(SaveSysDuad req) throws Exception;

	Integer checkDuadCn(CheckDuadCn param);
}

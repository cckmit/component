package com.x.common.service.business.sysdomain;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysdomain.param.CheckDomainCn;
import com.x.common.api.sysdomain.param.DeleteSysDomain;
import com.x.common.api.sysdomain.param.DomainPageVo;
import com.x.common.api.sysdomain.param.DomainQueryRequest;
import com.x.common.api.sysdomain.param.SaveSysDomain;
import com.x.common.dao.mapper.bo.SysDomain;

/**
 * @author auth
 * @date 2016年11月1日 下午5:57:26 
 * @version V1.0
 */
public interface IQuerySysDomainBusiSV {
	
	List<SysDomain> querySysDomainList(String language);
	
	SysDomain querySysDomainDetails(String domainId);

	PageInfo<DomainPageVo> queryDomainPage(DomainQueryRequest param);

	Integer saveSysDomain(SaveSysDomain req) throws Exception;

	Integer deleteSysDomain(String domainId) throws Exception;

	SysDomain querySysDomainById(DeleteSysDomain param);

	Integer updateSysDomain(SaveSysDomain req) throws Exception;

	Integer checkDomainCn(CheckDomainCn param);

	void write() throws Exception;

	List<DomainPageVo> querySysDomainByIdFlag(DeleteSysDomain param);

}

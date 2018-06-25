package com.x.common.service.atom.sysdomain;

import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysdomain.param.CheckDomainCn;
import com.x.common.api.sysdomain.param.DeleteSysDomain;
import com.x.common.api.sysdomain.param.DomainPageVo;
import com.x.common.api.sysdomain.param.DomainQueryRequest;
import com.x.common.dao.mapper.bo.SysDomain;

/**
 * @author auth
 * @date 2016年11月1日 下午6:10:06 
 * @version V1.0
 */
public interface ISysDomainAtomSV {
	
	/**
	 * 获取显示的列表
	 */
	List<SysDomain> querySysDomainList(String language);
	
	SysDomain selectByPrimaryKey(String domainId);

	PageInfo<DomainPageVo> queryDomainPage(DomainQueryRequest param);

	Integer saveSysDomain(SysDomain sysDomain);

	Integer deleteSysDomain(String domainId);

	SysDomain querySysDomainById(DeleteSysDomain param);

	Integer updateSysDomain(SysDomain sysDomain);

	Integer checkDomainCn(CheckDomainCn param);

	List<DomainPageVo> querySysDomainByIdFlag(DeleteSysDomain param);

}

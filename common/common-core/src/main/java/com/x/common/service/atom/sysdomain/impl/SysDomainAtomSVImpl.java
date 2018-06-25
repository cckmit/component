package com.x.common.service.atom.sysdomain.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysdomain.param.CheckDomainCn;
import com.x.common.api.sysdomain.param.DeleteSysDomain;
import com.x.common.api.sysdomain.param.DomainPageVo;
import com.x.common.api.sysdomain.param.DomainQueryRequest;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysDomain;
import com.x.common.dao.mapper.bo.SysDomainCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysDomainMapper;
import com.x.common.service.atom.sysdomain.ISysDomainAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * @author auth
 * @date 2016年11月1日 下午6:11:57
 * @version V1.0
 */
@Service
@Transactional
public class SysDomainAtomSVImpl implements ISysDomainAtomSV {

	/**
	 * 获取显示的列表
	 */
	@Override
	public List<SysDomain> querySysDomainList(String language) {
		SysDomainCriteria example = new SysDomainCriteria();
		SysDomainCriteria.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.SysConfig.STATE_SHOW);
		criteria.andFlagEqualTo("1");
		if (!StringUtil.isBlank(language)) {
			criteria.andLanguageEqualTo(language);
		}
		example.setOrderByClause("sort DESC ,updatetime DESC");
		return MapperFactory.getSysDomainMapper().selectByExample(example);
	}

	@Override
	public SysDomain selectByPrimaryKey(String domainId) {
		return MapperFactory.getSysDomainMapper().selectByPrimaryKey(domainId);
	}

	@Override
	public PageInfo<DomainPageVo> queryDomainPage(DomainQueryRequest param) {
		List<DomainPageVo> domainPageVos = new ArrayList<DomainPageVo>();
		SysDomainCriteria sysDomainCriteria = new SysDomainCriteria();
		SysDomainCriteria.Criteria criteria = sysDomainCriteria.createCriteria();
		String orderByClause = "sort DESC ,updatetime DESC";
		sysDomainCriteria.setOrderByClause(orderByClause);
		if (!StringUtil.isBlank(param.getDomainCn())) {
			criteria.andDomainCnLike("%" + param.getDomainCn().trim() + "%");
		}
		if (!StringUtil.isBlank(param.getSite())) {
			criteria.andSiteEqualTo(param.getSite());
		}
		if (!StringUtil.isBlank(param.getState())) {
			criteria.andStateEqualTo(param.getState());
		}
		if (!StringUtil.isBlank(param.getCreateOperator())) {
			criteria.andCreateOperatorLike("%" + param.getCreateOperator().trim() + "%");
		}
		criteria.andFlagEqualTo("1");
		PageInfo<DomainPageVo> pageInfo = new PageInfo<DomainPageVo>();
		SysDomainMapper mapper = MapperFactory.getSysDomainMapper();
		pageInfo.setCount(mapper.countByExample(sysDomainCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20 : param.getPageInfo().getPageSize());
			sysDomainCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysDomainCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysDomain> domainListPage = mapper.selectByExample(sysDomainCriteria);

		if (!CollectionUtil.isEmpty(domainListPage)) {

			for (int i = 0; i < domainListPage.size(); i++) {
				DomainPageVo domainPageVo = new DomainPageVo();
				BeanUtils.copyProperties(domainPageVo, domainListPage.get(i));
				domainPageVos.add(domainPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(domainPageVos);
		return pageInfo;
	}

	@Override
	public Integer saveSysDomain(SysDomain sysDomain) {
		SysDomainMapper mapper = MapperFactory.getSysDomainMapper();
		sysDomain.setFlag("1");
		int insert = mapper.insert(sysDomain);
		return insert;
	}

	@Override
	public Integer deleteSysDomain(String domainId) {
		SysDomainCriteria sysDomainCriteria = new SysDomainCriteria();
		SysDomainCriteria.Criteria criteria = sysDomainCriteria.createCriteria();
		criteria.andDomainIdEqualTo(domainId);
		SysDomainMapper mapper = MapperFactory.getSysDomainMapper();
		SysDomain sysDomain = new SysDomain();
		sysDomain.setFlag("0");
		return mapper.updateByExampleSelective(sysDomain, sysDomainCriteria);
	}

	@Override
	public SysDomain querySysDomainById(DeleteSysDomain param) {
		return MapperFactory.getSysDomainMapper().selectByPrimaryKey(param.getDomainId());
	}

	@Override
	public Integer updateSysDomain(SysDomain sysDomain) {
		SysDomainCriteria sysDomainCriteria = new SysDomainCriteria();
		SysDomainCriteria.Criteria criteria = sysDomainCriteria.createCriteria();
		criteria.andDomainIdEqualTo(sysDomain.getDomainId());
		SysDomainMapper mapper = MapperFactory.getSysDomainMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysDomain, sysDomainCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public Integer checkDomainCn(CheckDomainCn param) {
		SysDomainCriteria sysDomainCriteria = new SysDomainCriteria();
		SysDomainCriteria.Criteria criteria = sysDomainCriteria.createCriteria();
		if(!StringUtil.isBlank(param.getLanguage())){
			criteria.andLanguageEqualTo(param.getLanguage());
		}
		if (!StringUtil.isBlank(param.getDomainCn())) {
			criteria.andDomainCnEqualTo(param.getDomainCn());
		}
		SysDomainMapper mapper = MapperFactory.getSysDomainMapper();
		int countByExample = mapper.countByExample(sysDomainCriteria);
		return countByExample;
	}

	@Override
	public List<DomainPageVo> querySysDomainByIdFlag(DeleteSysDomain param) {
		List<DomainPageVo> domainPageVos = new ArrayList<DomainPageVo>();
		SysDomainCriteria sysDomainCriteria = new SysDomainCriteria();
		SysDomainCriteria.Criteria criteria = sysDomainCriteria.createCriteria();
		criteria.andDomainIdEqualTo(param.getDomainId());
		criteria.andFlagEqualTo("1");
		SysDomainMapper mapper = MapperFactory.getSysDomainMapper();
		List<SysDomain> sysDomains = mapper.selectByExample(sysDomainCriteria);
		if (!CollectionUtil.isEmpty(sysDomains)) {
			domainPageVos = new ArrayList<DomainPageVo>();
			for (int i = 0; i < sysDomains.size(); i++) {
				DomainPageVo domainPageVo = new DomainPageVo();
				BeanUtils.copyProperties(domainPageVo, sysDomains.get(i));
				domainPageVos.add(domainPageVo);
			}
		}
		return domainPageVos;
	}

}

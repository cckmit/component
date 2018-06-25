package com.x.common.service.atom.sysduad.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysduad.param.CheckDuadCn;
import com.x.common.api.sysduad.param.DuadPageQueryRequest;
import com.x.common.api.sysduad.param.DuadPageVo;
import com.x.common.api.sysduad.param.QuerySysDuadById;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysDuad;
import com.x.common.dao.mapper.bo.SysDuadCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysDuadMapper;
import com.x.common.service.atom.sysduad.ISysDuadAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * @author auth
 * @date 2016年11月1日 下午7:54:25 
 * @version V1.0
 */
@Service
public class SysDuadAtomSVImpl implements ISysDuadAtomSV {

	@Override
	public List<SysDuad> querySysDuadList(String language, String orderType) {
		SysDuadCriteria example = new SysDuadCriteria();
		SysDuadCriteria.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.SysDuad.STATE_SHOW);
		if(!StringUtil.isBlank(language)){
			criteria.andLanguageEqualTo(language);
		}
		if(!StringUtil.isBlank(orderType)){
			criteria.andOrderTypeEqualTo(orderType);
		}
		example.setOrderByClause("sort DESC ,updatetime DESC");
		return MapperFactory.getSysDuadMapper().selectByExample(example);
	}

	@Override
	public SysDuad querySysDuadDetails(String duadId) {
		return  MapperFactory.getSysDuadMapper().selectByPrimaryKey(duadId);
	}

	@Override
	public PageInfo<DuadPageVo> queryDuadPage(DuadPageQueryRequest param) {
		List<DuadPageVo> duadPageVos = new ArrayList<DuadPageVo>();
		SysDuadCriteria sysDuadCriteria = new SysDuadCriteria();
		SysDuadCriteria.Criteria criteria = sysDuadCriteria.createCriteria();
		String orderByClause = "updatetime desc";
		sysDuadCriteria.setOrderByClause(orderByClause);
		if(!StringUtil.isBlank(param.getDuadId())){
			criteria.andDuadIdEqualTo(param.getDuadId());
		}
		if (!StringUtil.isBlank(param.getLanguage())) {
			criteria.andLanguageEqualTo(param.getLanguage());
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
		PageInfo<DuadPageVo> pageInfo = new PageInfo<DuadPageVo>();
		SysDuadMapper mapper = MapperFactory.getSysDuadMapper();
		pageInfo.setCount(mapper.countByExample(sysDuadCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysDuadCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysDuadCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysDuad> duadListPage = mapper.selectByExample(sysDuadCriteria);

		if (!CollectionUtil.isEmpty(duadListPage)) {

			for (int i = 0; i < duadListPage.size(); i++) {
				DuadPageVo duadPageVo = new DuadPageVo();
				BeanUtils.copyProperties(duadPageVo, duadListPage.get(i));
				duadPageVos.add(duadPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(duadPageVos);
		return pageInfo;
	}

	@Override
	public Integer iSysDuadAtomSV(SysDuad sysDuad) {
		SysDuadMapper mapper = MapperFactory.getSysDuadMapper();
		int insert = mapper.insert(sysDuad);
		return insert;
	}

	@Override
	public List<DuadPageVo> querySysDuadById(QuerySysDuadById param) {
		List<DuadPageVo> duadPageVos = new ArrayList<DuadPageVo>();
		SysDuadCriteria sysDuadCriteria = new SysDuadCriteria();
		SysDuadCriteria.Criteria criteria = sysDuadCriteria.createCriteria();
		criteria.andDuadIdEqualTo(param.getDuadId());
		SysDuadMapper mapper = MapperFactory.getSysDuadMapper();
		List<SysDuad> sysDuads = mapper.selectByExample(sysDuadCriteria);
		if (!CollectionUtil.isEmpty(sysDuads)) {
			duadPageVos = new ArrayList<DuadPageVo>();
			for (int i = 0; i < sysDuads.size(); i++) {
				DuadPageVo duadPageVo = new DuadPageVo();
				BeanUtils.copyProperties(duadPageVo, sysDuads.get(i));
				duadPageVos.add(duadPageVo);
			}
		}
		return duadPageVos;
	}

	@Override
	public Integer updateSysDuad(SysDuad sysDuad) {
		SysDuadCriteria sysDuadCriteria = new SysDuadCriteria();
		SysDuadCriteria.Criteria criteria = sysDuadCriteria.createCriteria();
		criteria.andDuadIdEqualTo(sysDuad.getDuadId());
		SysDuadMapper mapper = MapperFactory.getSysDuadMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysDuad, sysDuadCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public Integer checkDuadCn(CheckDuadCn param) {
		SysDuadCriteria sysDuadCriteria = new SysDuadCriteria();
		SysDuadCriteria.Criteria criteria = sysDuadCriteria.createCriteria();
		if(!StringUtil.isBlank(param.getDuadId())){
			criteria.andDuadIdNotEqualTo(param.getDuadId());
		}
		if(!StringUtil.isBlank(param.getLanguage())){
			criteria.andLanguageEqualTo(param.getLanguage());
		}
		if (!StringUtil.isBlank(param.getSourceCn())) {
			criteria.andSourceCnEqualTo(param.getSourceCn());
		}
		if (!StringUtil.isBlank(param.getTargetCn())) {
			criteria.andTargetCnEqualTo(param.getTargetCn());
		}
		SysDuadMapper mapper = MapperFactory.getSysDuadMapper();
		int countByExample = mapper.countByExample(sysDuadCriteria);
		return countByExample;
	}
}

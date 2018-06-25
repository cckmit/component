package com.x.common.service.atom.syspurpose.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.PageInfo;
import com.x.common.api.syspurpose.param.CheckPurposeCn;
import com.x.common.api.syspurpose.param.DeleteSysPurpose;
import com.x.common.api.syspurpose.param.PurposePageQueryRequest;
import com.x.common.api.syspurpose.param.PurposePageVo;
import com.x.common.constants.Constants;
import com.x.common.dao.mapper.bo.SysPurpose;
import com.x.common.dao.mapper.bo.SysPurposeCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysPurposeMapper;
import com.x.common.service.atom.syspurpose.ISysPurposeAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * @author auth
 * @date 2016年11月1日 下午6:36:32 
 * @version V1.0
 */
@Service
public class SysPurposeAtomSVImpl implements ISysPurposeAtomSV{

	/**
	 * 查询页面显示的用途
	 */
	@Override
	public List<SysPurpose> querySysPurposeList(String language) {
		SysPurposeCriteria example = new SysPurposeCriteria();
		SysPurposeCriteria.Criteria criteria = example.createCriteria();
		criteria.andStateEqualTo(Constants.SysPurpose.STATE_SHOW);
		criteria.andFlagEqualTo("1");
		if(!StringUtil.isBlank(language)){
			criteria.andLanguageEqualTo(language);
		}
		example.setOrderByClause("sort DESC ,updatetime DESC");
		return MapperFactory.getSysPurposeMapper().selectByExample(example);
	}

	@Override
	public SysPurpose selectByPrimaryKey(String purposeId) {
		return MapperFactory.getSysPurposeMapper().selectByPrimaryKey(purposeId);
	}

	@Override
	public PageInfo<PurposePageVo> queryPurposePage(PurposePageQueryRequest param) throws BusinessException, SystemException{
		List<PurposePageVo> purposePageVos = new ArrayList<PurposePageVo>();
		SysPurposeCriteria sysPurposeCriteria = new SysPurposeCriteria();
		SysPurposeCriteria.Criteria criteria = sysPurposeCriteria.createCriteria();
		String orderByClause = "updatetime desc";
		sysPurposeCriteria.setOrderByClause(orderByClause);
		if (!StringUtil.isBlank(param.getPurposeCn())) {
			criteria.andPurposeCnLike("%" + param.getPurposeCn().trim() + "%");
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
		PageInfo<PurposePageVo> pageInfo = new PageInfo<PurposePageVo>();
		SysPurposeMapper mapper = MapperFactory.getSysPurposeMapper();
		pageInfo.setCount(mapper.countByExample(sysPurposeCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysPurposeCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysPurposeCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysPurpose> purposeListPage = mapper.selectByExample(sysPurposeCriteria);

		if (!CollectionUtil.isEmpty(purposeListPage)) {

			for (int i = 0; i < purposeListPage.size(); i++) {
				PurposePageVo purposePageVo = new PurposePageVo();
				BeanUtils.copyProperties(purposePageVo, purposeListPage.get(i));
				purposePageVos.add(purposePageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(purposePageVos);
		return pageInfo;
	}

	@Override
	public Integer saveSysPurpose(SysPurpose sysPurpose) {
		SysPurposeMapper mapper = MapperFactory.getSysPurposeMapper();
		sysPurpose.setFlag("1");
		int insert = mapper.insert(sysPurpose);
		return insert;
	}

	@Override
	public Integer deleteSysPurpose(String purposeId) {
		SysPurposeCriteria sysPurposeCriteria = new SysPurposeCriteria();
		SysPurposeCriteria.Criteria criteria = sysPurposeCriteria.createCriteria();
		criteria.andPurposeIdEqualTo(purposeId);
		SysPurposeMapper mapper = MapperFactory.getSysPurposeMapper();
		SysPurpose sysPurpose = new SysPurpose();
		sysPurpose.setFlag("0");
		return mapper.updateByExampleSelective(sysPurpose, sysPurposeCriteria);
	}

	@Override
	public SysPurpose querySysPurposeById(DeleteSysPurpose param) {
		return  MapperFactory.getSysPurposeMapper().selectByPrimaryKey(param.getPurposeId());
	}

	@Override
	public Integer updateSysPurpose(SysPurpose sysPurpose) {
		SysPurposeCriteria sysPurposeCriteria = new SysPurposeCriteria();
		SysPurposeCriteria.Criteria criteria = sysPurposeCriteria.createCriteria();
		criteria.andPurposeIdEqualTo(sysPurpose.getPurposeId());
		SysPurposeMapper mapper = MapperFactory.getSysPurposeMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysPurpose, sysPurposeCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public Integer checkPurposeCn(CheckPurposeCn param) {
		SysPurposeCriteria sysPurposeCriteria = new SysPurposeCriteria();
		SysPurposeCriteria.Criteria criteria = sysPurposeCriteria.createCriteria();
		if (!StringUtil.isBlank(param.getLanguage())) {
			criteria.andLanguageEqualTo(param.getLanguage());
		}
		if(!StringUtil.isBlank(param.getPurposeCn())){
			criteria.andPurposeCnEqualTo(param.getPurposeCn());
		}
		SysPurposeMapper mapper = MapperFactory.getSysPurposeMapper();
		int countByExample = mapper.countByExample(sysPurposeCriteria);
		return countByExample;
	}

	@Override
	public List<PurposePageVo> querySysPurposeByIdFlag(DeleteSysPurpose param) {
		List<PurposePageVo> purposePageVos = new ArrayList<PurposePageVo>();
		SysPurposeCriteria sysPurposeCriteria = new SysPurposeCriteria();
		SysPurposeCriteria.Criteria criteria = sysPurposeCriteria.createCriteria();
		criteria.andPurposeIdEqualTo(param.getPurposeId());
		criteria.andFlagEqualTo("1");
		SysPurposeMapper mapper = MapperFactory.getSysPurposeMapper();
		List<SysPurpose> sysPurPoses = mapper.selectByExample(sysPurposeCriteria);
		if (!CollectionUtil.isEmpty(sysPurPoses)) {
			purposePageVos = new ArrayList<PurposePageVo>();
			for (int i = 0; i < sysPurPoses.size(); i++) {
				PurposePageVo purposePageVo = new PurposePageVo();
				BeanUtils.copyProperties(purposePageVo, sysPurPoses.get(i));
				purposePageVos.add(purposePageVo);
			}
		}
		return purposePageVos;
	}
	
	
	
	
	

}

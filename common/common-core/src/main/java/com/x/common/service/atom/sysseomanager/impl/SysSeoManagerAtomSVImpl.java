package com.x.common.service.atom.sysseomanager.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysseomanager.param.CheckSysSeoManager;
import com.x.common.api.sysseomanager.param.SeoManagerPageQueryRequest;
import com.x.common.api.sysseomanager.param.SeoManagerPageVo;
import com.x.common.dao.mapper.bo.SysSeoManager;
import com.x.common.dao.mapper.bo.SysSeoManagerCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysSeoManagerMapper;
import com.x.common.service.atom.sysseomanager.ISysSeoManagerAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
@Service
public class SysSeoManagerAtomSVImpl implements ISysSeoManagerAtomSV{

	/**
	 * 查询页面显示的SEO
	 */
	@Override
	public List<SysSeoManager> querySysSeoManagerList() {
		SysSeoManagerCriteria sysSeoManagerCriteria = new SysSeoManagerCriteria();
		sysSeoManagerCriteria.setOrderByClause("create_time DESC");
		return MapperFactory.getSysSeoManagerMapper().selectByExample(sysSeoManagerCriteria);
	}

	
	
	@Override
	public PageInfo<SeoManagerPageVo> querySeoManagerPage(SeoManagerPageQueryRequest param) {
		List<SeoManagerPageVo> seoManagerPageVos = new ArrayList<SeoManagerPageVo>();
		SysSeoManagerCriteria sysSeoManagerCriteria = new SysSeoManagerCriteria();
		SysSeoManagerCriteria.Criteria criteria = sysSeoManagerCriteria.createCriteria();
		String orderByClause = "create_time desc";
		sysSeoManagerCriteria.setOrderByClause(orderByClause);
		if (!StringUtil.isBlank(param.getTitile())) {
			criteria.andTitileLike("%" + param.getTitile().trim() + "%");
		}
		if (!StringUtil.isBlank(param.getSite())) {
			criteria.andSiteEqualTo(param.getSite());
		}
		if (!StringUtil.isBlank(param.getPageLocation())) {
			criteria.andPageLocationEqualTo(param.getPageLocation());
		}
		if (!StringUtil.isBlank(param.getAditor())) {
			criteria.andAditorLike("%" + param.getAditor().trim() + "%");
		}
		PageInfo<SeoManagerPageVo> pageInfo = new PageInfo<SeoManagerPageVo>();
		SysSeoManagerMapper mapper = MapperFactory.getSysSeoManagerMapper();
		pageInfo.setCount(mapper.countByExample(sysSeoManagerCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysSeoManagerCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysSeoManagerCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysSeoManager> selectByExample = mapper.selectByExample(sysSeoManagerCriteria);

		if (!CollectionUtil.isEmpty(selectByExample)) {

			for (int i = 0; i < selectByExample.size(); i++) {
				SeoManagerPageVo seoManagerPageVo = new SeoManagerPageVo();
				BeanUtils.copyProperties(seoManagerPageVo, selectByExample.get(i));
				seoManagerPageVos.add(seoManagerPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(seoManagerPageVos);
		return pageInfo;
	}

	@Override
	public Integer saveSysSeoManager(SysSeoManager sysSeoManager) {
		SysSeoManagerMapper mapper = MapperFactory.getSysSeoManagerMapper();
		int insert = mapper.insert(sysSeoManager);
		return insert;
	}

	@Override
	public Integer deleteSysSeoManager(String id) {
		SysSeoManagerMapper mapper = MapperFactory.getSysSeoManagerMapper();
		int deleteByPrimaryKey = mapper.deleteByPrimaryKey(id);
		return deleteByPrimaryKey;
	}

	@Override
	public Integer updateSysSeoManager(SysSeoManager sysSeoManager) {
		SysSeoManagerCriteria sysSeoManagerCriteria = new SysSeoManagerCriteria();
		SysSeoManagerCriteria.Criteria criteria = sysSeoManagerCriteria.createCriteria();
		criteria.andIdEqualTo(sysSeoManager.getId());
		SysSeoManagerMapper mapper = MapperFactory.getSysSeoManagerMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysSeoManager, sysSeoManagerCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public Integer checkSysSeoManager(CheckSysSeoManager param) {
		SysSeoManagerCriteria sysSeoManagerCriteria = new SysSeoManagerCriteria();
		SysSeoManagerCriteria.Criteria criteria = sysSeoManagerCriteria.createCriteria();
		if(!StringUtil.isBlank(param.getId())){
			criteria.andIdNotEqualTo(param.getId());
		}
		if (!StringUtil.isBlank(param.getRegionalLanguage())) {
			criteria.andRegionalLanguageEqualTo(param.getRegionalLanguage());
		}
		if(!StringUtil.isBlank(param.getPageLocation())){
			criteria.andPageLocationEqualTo(param.getPageLocation());
		}
		SysSeoManagerMapper mapper = MapperFactory.getSysSeoManagerMapper();
		int countByExample = mapper.countByExample(sysSeoManagerCriteria);
		return countByExample;
	}



	@Override
	public SysSeoManager querySysSeoById(String id) {
		SysSeoManagerMapper mapper = MapperFactory.getSysSeoManagerMapper();
		SysSeoManager selectByPrimaryKey = mapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

}

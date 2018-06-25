package com.x.common.service.atom.sysadvertmanager.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.base.vo.PageInfo;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageQueryRequest;
import com.x.common.api.sysadvertmanager.param.AdvertManagerPageVo;
import com.x.common.dao.mapper.attach.AdvertAttachMapper;
import com.x.common.dao.mapper.bo.SysAdvertManager;
import com.x.common.dao.mapper.bo.SysAdvertManagerCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysAdvertManagerMapper;
import com.x.common.service.atom.sysadvertmanager.ISysAdvertManagerAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * @author auth
 * @date 2017年6月2日 
 * @version V1.0
 */
@Service
public class SysAdvertManagerAtomSVImpl implements ISysAdvertManagerAtomSV{
	@Autowired 
	private transient AdvertAttachMapper  advertAttachMapper;
	@Override
	public List<SysAdvertManager> querySysAdvertList(String regionalLanguage, String site) {
		return advertAttachMapper.querySysAdvertList(regionalLanguage,site);
	}

	@Override
	public List<SysAdvertManager> querySysAdvertLists(String zh, String site, String advertisingPosition) {
		SysAdvertManagerCriteria sysAdvertManagerCriteria = new SysAdvertManagerCriteria();
		SysAdvertManagerCriteria.Criteria criteria = sysAdvertManagerCriteria.createCriteria();
		criteria.andStateEqualTo("1");
		criteria.andRegionalLanguageEqualTo(zh);
		criteria.andSiteEqualTo(site);
		criteria.andAdvertisingPositionEqualTo(advertisingPosition);
		sysAdvertManagerCriteria.setOrderByClause("sort DESC");
		return MapperFactory.getSysAdvertManagerMapper().selectByExample(sysAdvertManagerCriteria);
	}
	
	@Override
	public PageInfo<AdvertManagerPageVo> queryAdvertManagerPage(AdvertManagerPageQueryRequest param) {
		List<AdvertManagerPageVo> advertManagerPageVos = new ArrayList<AdvertManagerPageVo>();
		SysAdvertManagerCriteria sysAdvertManagerCriteria = new SysAdvertManagerCriteria();
		SysAdvertManagerCriteria.Criteria criteria = sysAdvertManagerCriteria.createCriteria();
		String orderByClause = "create_time desc";
		sysAdvertManagerCriteria.setOrderByClause(orderByClause);
		if (!StringUtil.isBlank(param.getAdvertisingName())) {
			criteria.andAdvertisingNameLike("%" + param.getAdvertisingName().trim() + "%");
		}
		if (!StringUtil.isBlank(param.getAdvertisingPosition())) {
			criteria.andAdvertisingPositionEqualTo(param.getAdvertisingPosition());
		}
		if (!StringUtil.isBlank(param.getSite())) {
			criteria.andSiteEqualTo(param.getSite());
		}
		if (!StringUtil.isBlank(param.getState())) {
			criteria.andStateEqualTo(param.getState());
		}
		if (!StringUtil.isBlank(param.getAditor())) {
			criteria.andAditorLike("%" + param.getAditor().trim() + "%");
		}
		if (!StringUtil.isBlank(param.getAdvertisingType())) {
			criteria.andAdvertisingTypeEqualTo(param.getAdvertisingType());
		}
		PageInfo<AdvertManagerPageVo> pageInfo = new PageInfo<AdvertManagerPageVo>();
		SysAdvertManagerMapper mapper = MapperFactory.getSysAdvertManagerMapper();
		pageInfo.setCount(mapper.countByExample(sysAdvertManagerCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysAdvertManagerCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysAdvertManagerCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		List<SysAdvertManager> selectByExample = mapper.selectByExample(sysAdvertManagerCriteria);

		if (!CollectionUtil.isEmpty(selectByExample)) {
			for (int i = 0; i < selectByExample.size(); i++) {
				AdvertManagerPageVo advertManagerPageVo = new AdvertManagerPageVo();
				BeanUtils.copyProperties(advertManagerPageVo, selectByExample.get(i));
				advertManagerPageVos.add(advertManagerPageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(advertManagerPageVos);
		return pageInfo;
	}

	@Override
	public Integer saveSysAdvertManager(SysAdvertManager sysAdvertManager) {
		SysAdvertManagerMapper mapper = MapperFactory.getSysAdvertManagerMapper();
		int insert = mapper.insert(sysAdvertManager);
		return insert;
	}

	@Override
	public Integer deleteSysAdvertManager(String id) {
		SysAdvertManagerMapper mapper = MapperFactory.getSysAdvertManagerMapper();
		int deleteByPrimaryKey = mapper.deleteByPrimaryKey(id);
		return deleteByPrimaryKey;
	}

	@Override
	public Integer updateSysAdvertManager(SysAdvertManager sysAdvertManager) {
		SysAdvertManagerCriteria sysAdvertManagerCriteria = new SysAdvertManagerCriteria();
		SysAdvertManagerCriteria.Criteria criteria = sysAdvertManagerCriteria.createCriteria();
		criteria.andIdEqualTo(sysAdvertManager.getId());
		SysAdvertManagerMapper mapper = MapperFactory.getSysAdvertManagerMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysAdvertManager, sysAdvertManagerCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public SysAdvertManager querySysAdvertById(String id) {
		SysAdvertManagerMapper mapper = MapperFactory.getSysAdvertManagerMapper();
		SysAdvertManager selectByPrimaryKey = mapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}



}

package com.x.common.service.atom.syssensitive.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.base.vo.PageInfo;
import com.x.common.api.syssensitive.param.SensitivePageQueryRequest;
import com.x.common.api.syssensitive.param.SensitivePageVo;
import com.x.common.dao.mapper.bo.SysSensitive;
import com.x.common.dao.mapper.bo.SysSensitiveCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysSensitiveMapper;
import com.x.common.service.atom.syssensitive.ISysSensitiveAtomSV;
import com.x.sdk.util.BeanUtils;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

/**
 * @author auth
 * @date 2017年5月16日 
 * @version V1.0.1
 */
@Service
public class SysSensitiveAtomSVImpl implements ISysSensitiveAtomSV{


	@Override
	public PageInfo<SensitivePageVo> querySensitivePage(SensitivePageQueryRequest param) throws BusinessException, SystemException{
		List<SensitivePageVo> sensitivePageVos = new ArrayList<SensitivePageVo>();
		SysSensitiveCriteria sysSensitiveCriteria = new SysSensitiveCriteria();
		SysSensitiveCriteria.Criteria criteria = sysSensitiveCriteria.createCriteria();
		String orderByClause = "CREAT_TIME desc";
		sysSensitiveCriteria.setOrderByClause(orderByClause);
		if (!StringUtil.isBlank(param.getCreatPeople())) {
			criteria.andCreatPeopleLike("%" + param.getCreatPeople().trim() + "%");
		}
		if (!StringUtil.isBlank(param.getSensitiveWords())) {
			criteria.andSensitiveWordsLike("%" + param.getSensitiveWords().trim() + "%");
		}
		if (!StringUtil.isBlank(param.getState())) {
			criteria.andStateEqualTo(param.getState());
		}
		PageInfo<SensitivePageVo> pageInfo = new PageInfo<SensitivePageVo>();
		SysSensitiveMapper mapper = MapperFactory.getSysSensitiveMapper();
		
		pageInfo.setCount(mapper.countByExample(sysSensitiveCriteria));

		if (param.getPageInfo() == null) {
			pageInfo.setPageNo(1);
			pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		} else {
			pageInfo.setPageNo(param.getPageInfo().getPageNo());
			pageInfo.setPageSize(param.getPageInfo().getPageSize() == null ? 20
					: param.getPageInfo().getPageSize());
			sysSensitiveCriteria.setLimitStart(param.getPageInfo().getStartRowIndex());
			sysSensitiveCriteria.setLimitEnd(param.getPageInfo().getPageSize());
		}
		
		List<SysSensitive> selectByExample = mapper.selectByExample(sysSensitiveCriteria);
		if (!CollectionUtil.isEmpty(selectByExample)) {
			for (int i = 0; i < selectByExample.size(); i++) {
				SensitivePageVo sensitivePageVo = new SensitivePageVo();
				BeanUtils.copyProperties(sensitivePageVo, selectByExample.get(i));
				sensitivePageVos.add(sensitivePageVo);
			}
		}
		pageInfo.setPageNo(pageInfo.getPageNo() == null ? 1 : pageInfo.getPageNo());
		pageInfo.setPageSize(pageInfo.getPageSize() == null ? 20 : pageInfo.getPageSize());
		pageInfo.setPageCount((pageInfo.getCount() + pageInfo.getPageSize() - 1) / pageInfo.getPageSize());
		pageInfo.setResult(sensitivePageVos);
		return pageInfo;
	}

	@Override
	public Integer saveSysItemBank(SysSensitive sysSensitive) {
		SysSensitiveMapper mapper = MapperFactory.getSysSensitiveMapper();
		int insert = mapper.insert(sysSensitive);
		return insert;
	}

	@Override
	public Integer deleteSysSensitive(String id) {
		SysSensitiveMapper mapper = MapperFactory.getSysSensitiveMapper();
		int deleteByPrimaryKey = mapper.deleteByPrimaryKey(id);
		return deleteByPrimaryKey;
	}

	@Override
	public Integer updateSysSensitive(SysSensitive sysSensitive) {
		SysSensitiveCriteria sysSensitiveCriteria = new SysSensitiveCriteria();
		SysSensitiveCriteria.Criteria criteria = sysSensitiveCriteria.createCriteria();
		criteria.andIdEqualTo(sysSensitive.getId());
		SysSensitiveMapper mapper = MapperFactory.getSysSensitiveMapper();
		int updateByPrimaryKey = mapper.updateByExampleSelective(sysSensitive, sysSensitiveCriteria);
		return updateByPrimaryKey;
	}

	@Override
	public List<SysSensitive> querySysSensitiveList() {
		SysSensitiveCriteria sysSensitiveCriteria = new SysSensitiveCriteria();
		SysSensitiveMapper mapper = MapperFactory.getSysSensitiveMapper();
		List<SysSensitive> selectByExample = mapper.selectByExample(sysSensitiveCriteria);
		return selectByExample;
	}

}

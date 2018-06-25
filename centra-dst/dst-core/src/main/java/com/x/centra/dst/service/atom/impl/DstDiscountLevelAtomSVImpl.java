package com.x.centra.dst.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.bo.DstDiscountLevel;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountLevelAtomSV;
import com.x.sdk.util.CollectionUtil;

@Component
public class DstDiscountLevelAtomSVImpl implements IDstDiscountLevelAtomSV {

	@Override
	public int deleteByPrimaryKey(String levelId) {

		return MapperFactory.getDstDiscountLevelMapper().deleteByPrimaryKey(levelId);
	}

	@Override
	public int insert(DstDiscountLevel record) {

		return MapperFactory.getDstDiscountLevelMapper().insert(record);
	}

	@Override
	public int updateByExample(DstDiscountLevel record, DstDiscountLevelCriteria example) {

		return MapperFactory.getDstDiscountLevelMapper().updateByExample(record, example);
	}
	
	@Override
	public int updateByExampleSelective(DstDiscountLevel record, DstDiscountLevelCriteria example) {
		
		return MapperFactory.getDstDiscountLevelMapper().updateByExampleSelective(record, example);
	}

	@Override
	public List<DstDiscountLevel> selectByExample(DstDiscountLevelCriteria example) {

		return MapperFactory.getDstDiscountLevelMapper().selectByExample(example);
	}

	@Override
	public DstDiscountLevel selectByPrimaryKey(String levelId) {

		return MapperFactory.getDstDiscountLevelMapper().selectByPrimaryKey(levelId);
	}

	@Override
	public DstDiscountLevel getByLevelCode(String tenantId, String levelCode) {

		DstDiscountLevelCriteria example = new DstDiscountLevelCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId).andLevelCodeEqualTo(levelCode);
		List<DstDiscountLevel> discountLevels = MapperFactory.getDstDiscountLevelMapper().selectByExample(example);
		return CollectionUtil.isEmpty(discountLevels) ? null : discountLevels.get(0);
	}

	@Override
	public int deleteByLevelCode(String tenantId, String levelCode) {

		DstDiscountLevelCriteria example = new DstDiscountLevelCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId).andLevelCodeEqualTo(levelCode);
		return MapperFactory.getDstDiscountLevelMapper().deleteByExample(example);
	}

	@Override
	public long countByLevelCode(String tenantId, String levelCode) {
		DstDiscountLevelCriteria example = new DstDiscountLevelCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId).andLevelCodeEqualTo(levelCode);
		return MapperFactory.getDstDiscountLevelMapper().countByExample(example);
	}

	@Override
	public int countByExample(DstDiscountLevelCriteria example) {
		return MapperFactory.getDstDiscountLevelMapper().countByExample(example);
	}

}

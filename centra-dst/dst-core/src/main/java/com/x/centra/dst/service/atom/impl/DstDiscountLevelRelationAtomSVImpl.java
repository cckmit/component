package com.x.centra.dst.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelation;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountLevelRelationAtomSV;
import com.x.sdk.util.CollectionUtil;

@Component
public class DstDiscountLevelRelationAtomSVImpl implements IDstDiscountLevelRelationAtomSV {

	@Override
	public int deleteByExample(DstDiscountLevelRelationCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountLevelRelationMapper().deleteByExample(example);
	}

	@Override
	public int insert(DstDiscountLevelRelation record) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountLevelRelationMapper().insert(record);
	}

	@Override
	public List<DstDiscountLevelRelation> selectByExample(DstDiscountLevelRelationCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountLevelRelationMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(DstDiscountLevelRelation record, DstDiscountLevelRelationCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountLevelRelationMapper().updateByExample(record, example);
	}
	@Override
	public int updateByExampleSelective(DstDiscountLevelRelation record, DstDiscountLevelRelationCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountLevelRelationMapper().updateByExampleSelective(record, example);
	}

	@Override
	public DstDiscountLevelRelation getByDiscountCode(String tenantId, String discountCode) {
		// TODO Auto-generated method stub
		
		DstDiscountLevelRelationCriteria example = new DstDiscountLevelRelationCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId)
				.andDiscountCodeEqualTo(discountCode);
		List<DstDiscountLevelRelation> relations = MapperFactory.getDstDiscountLevelRelationMapper().selectByExample(example);
		return CollectionUtil.isEmpty(relations)?null:relations.get(0);
	}

}

package com.x.centra.dst.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.bo.DstDiscountClass;
import com.x.centra.dst.dao.mapper.bo.DstDiscountClassCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountClassCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountClassAtomSV;

@Component
public class DstDiscountClassAtomSVImpl implements IDstDiscountClassAtomSV {

	@Override
	public int insert(DstDiscountClass record) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountClassMapper().insert(record);
	}

	@Override
	public List<DstDiscountClass> selectByExample(DstDiscountClassCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountClassMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(DstDiscountClass record, DstDiscountClassCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountClassMapper().updateByExample(record, example);
	}

	@Override
	public int deleteByExample(DstDiscountClassCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountClassMapper().deleteByExample(example);
	}

	@Override
	public int countByClassCode(String tenantId, String classCode) {
		// TODO Auto-generated method stub
		DstDiscountClassCriteria example = new DstDiscountClassCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId)
				.andClassCodeEqualTo(classCode);
		return MapperFactory.getDstDiscountClassMapper().countByExample(example);
	}

	@Override
	public List<DstDiscountClass> selectByClassCodes(String tenantId, List<String> classCodes) {
		// TODO Auto-generated method stub
		DstDiscountClassCriteria example = new DstDiscountClassCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andClassCodeIn(classCodes);
		return MapperFactory.getDstDiscountClassMapper().selectByExample(example);
	}
	
}

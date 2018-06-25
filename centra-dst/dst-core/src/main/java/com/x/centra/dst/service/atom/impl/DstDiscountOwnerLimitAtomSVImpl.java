package com.x.centra.dst.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.bo.DstDiscountOwnerLimit;
import com.x.centra.dst.dao.mapper.bo.DstDiscountOwnerLimitCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountOwnerLimitCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountOwnerLimitAtomSV;

@Component
public class DstDiscountOwnerLimitAtomSVImpl implements IDstDiscountOwnerLimitAtomSV {

	@Override
	public int deleteByExample(DstDiscountOwnerLimitCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountOwnerLimitMapper().deleteByExample(example);
	}

	@Override
	public int insert(DstDiscountOwnerLimit record) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountOwnerLimitMapper().insert(record);
	}

	@Override
	public List<DstDiscountOwnerLimit> selectByExample(DstDiscountOwnerLimitCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountOwnerLimitMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(DstDiscountOwnerLimit record, DstDiscountOwnerLimitCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstDiscountOwnerLimitMapper().updateByExample(record, example);
	}

	@Override
	public int deleteByDiscountCode(String tenantId, String discountCode) {
		// TODO Auto-generated method stub
		DstDiscountOwnerLimitCriteria example = new DstDiscountOwnerLimitCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId)
				.andDiscountCodeEqualTo(discountCode);
		return MapperFactory.getDstDiscountOwnerLimitMapper().deleteByExample(example);
	}

	@Override
	public List<DstDiscountOwnerLimit> selectByDiscountCode(String tenantId, String discountCode) {
		// TODO Auto-generated method stub
		DstDiscountOwnerLimitCriteria example = new DstDiscountOwnerLimitCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId)
				.andDiscountCodeEqualTo(discountCode);
		return MapperFactory.getDstDiscountOwnerLimitMapper().selectByExample(example);
	}

}

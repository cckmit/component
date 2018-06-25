package com.x.centra.dst.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.bo.DstDiscountInfo;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfoCriteria;
import com.x.centra.dst.dao.mapper.bo.DstDiscountInfoCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.service.atom.interfaces.IDstDiscountInfoAtomSV;
import com.x.sdk.util.CollectionUtil;

@Component
public class DstDiscountInfoAtomSVImpl implements IDstDiscountInfoAtomSV {

	@Override
	public int insert(DstDiscountInfo record) {

		return MapperFactory.getDstDiscountInfoMapper().insert(record);
	}

	@Override
	public int updateByExample(DstDiscountInfo record, DstDiscountInfoCriteria example) {

		return MapperFactory.getDstDiscountInfoMapper().updateByExample(record, example);
	}

	@Override
	public List<DstDiscountInfo> selectByExample(DstDiscountInfoCriteria example) {

		return MapperFactory.getDstDiscountInfoMapper().selectByExample(example);
	}

	@Override
	public int deleteByExample(DstDiscountInfoCriteria example) {
		return MapperFactory.getDstDiscountInfoMapper().deleteByExample(example);
	}

	@Override
	public int updateByPrimaryKey(DstDiscountInfo record) {
		return MapperFactory.getDstDiscountInfoMapper().updateByPrimaryKey(record);
	}

	@Override
	public int updateByExampleSelective(DstDiscountInfo record, DstDiscountInfoCriteria example) {
		return MapperFactory.getDstDiscountInfoMapper().updateByExampleSelective(record, example);
	}

	@Override
	public int countByExample(DstDiscountInfoCriteria example) {
		return MapperFactory.getDstDiscountInfoMapper().countByExample(example);
	}

	@Override
	public DstDiscountInfo getByDiscountId(String tenantId, String discountId) {

		DstDiscountInfoCriteria example = new DstDiscountInfoCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId).andDiscountIdEqualTo(discountId);
		List<DstDiscountInfo> discountInfos = MapperFactory.getDstDiscountInfoMapper().selectByExample(example);
		return CollectionUtil.isEmpty(discountInfos) ? null : discountInfos.get(0);
	}

	@Override
	public int countByDiscountCode(String tenantId, String discountCode) {
		DstDiscountInfoCriteria example = new DstDiscountInfoCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId).andDiscountCodeEqualTo(discountCode);
		return MapperFactory.getDstDiscountInfoMapper().countByExample(example);
	}

	@Override
	public DstDiscountInfo getByDiscountCode(String tenantId, String discountCode) {
		DstDiscountInfoCriteria example = new DstDiscountInfoCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId).andDiscountCodeEqualTo(discountCode).andStatusEqualTo("1");
		List<DstDiscountInfo> discountInfos = MapperFactory.getDstDiscountInfoMapper().selectByExample(example);
		return CollectionUtil.isEmpty(discountInfos) ? null : discountInfos.get(0);
	}

	@Override
	public List<DstDiscountInfo> getByDiscountCodes(String tenantId, List<String> discountCode) {
		// TODO Auto-generated method stub
		DstDiscountInfoCriteria example = new DstDiscountInfoCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andDiscountCodeIn(discountCode);
		return MapperFactory.getDstDiscountInfoMapper().selectByExample(example);
	}

}

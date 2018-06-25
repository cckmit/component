package com.x.centra.dst.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstance;
import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstanceCriteria;
import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstanceCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.service.atom.interfaces.IDstCustDiscountInstanceAtomSV;

@Component
public class DstCustDiscountInstanceAtomSVImpl implements IDstCustDiscountInstanceAtomSV {

	@Override
	public int deleteByExample(DstCustDiscountInstanceCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustDiscountInstanceMapper().deleteByExample(example);
	}

	@Override
	public int insert(DstCustDiscountInstance record) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustDiscountInstanceMapper().insert(record);
	}

	@Override
	public List<DstCustDiscountInstance> selectByExample(DstCustDiscountInstanceCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustDiscountInstanceMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(DstCustDiscountInstance record, DstCustDiscountInstanceCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustDiscountInstanceMapper().updateByExample(record, example);
	}

	@Override
	public int countByExample(DstCustDiscountInstanceCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustDiscountInstanceMapper().countByExample(example);
	}

	@Override
	public List<DstCustDiscountInstance> queryByRemindInstance(String remindState, List<String> discountCodes) {
		// TODO Auto-generated method stub
		DstCustDiscountInstanceCriteria example = new DstCustDiscountInstanceCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andRemindStateEqualTo(remindState);
		criteria.andDiscountCodeIn(discountCodes);
		return MapperFactory.getDstCustDiscountInstanceMapper().selectByExample(example);
	}

	@Override
	public int updateRemindState(String instanceId, String remindState) {
		// TODO Auto-generated method stub
		DstCustDiscountInstanceCriteria example = new DstCustDiscountInstanceCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andInstanceIdEqualTo(instanceId);
		
		DstCustDiscountInstance record = new DstCustDiscountInstance();
		record.setRemindState(remindState);
		
		return  MapperFactory.getDstCustDiscountInstanceMapper().updateByExampleSelective(record, example);
	}

	@Override
	public int updateRemindIndex(String instanceId, String remindIndex) {
		// TODO Auto-generated method stub
		DstCustDiscountInstanceCriteria example = new DstCustDiscountInstanceCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andInstanceIdEqualTo(instanceId);
		
		DstCustDiscountInstance record = new DstCustDiscountInstance();
		record.setRemindIndex(remindIndex);
		
		return  MapperFactory.getDstCustDiscountInstanceMapper().updateByExampleSelective(record, example);
	}

}

package com.x.centra.dst.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.bo.DstCustLevelInstance;
import com.x.centra.dst.dao.mapper.bo.DstCustLevelInstanceCriteria;
import com.x.centra.dst.dao.mapper.bo.DstCustLevelInstanceCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.service.atom.interfaces.IDstCustLevelInstanceAtomSV;
import com.x.sdk.util.CollectionUtil;

@Component
public class DstCustLevelInstanceAtomSVImpl implements IDstCustLevelInstanceAtomSV {

	@Override
	public int deleteByExample(DstCustLevelInstanceCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustLevelInstanceMapper().deleteByExample(example);
	}

	@Override
	public int insert(DstCustLevelInstance record) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustLevelInstanceMapper().insert(record);
	}

	@Override
	public List<DstCustLevelInstance> selectByExample(DstCustLevelInstanceCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustLevelInstanceMapper().selectByExample(example);
	}

	@Override
	public int updateByExample(DstCustLevelInstance record, DstCustLevelInstanceCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstCustLevelInstanceMapper().updateByExample(record, example);
	}

	@Override
	public DstCustLevelInstance getByInstanceId(String tenantId, String instanceId) {
		// TODO Auto-generated method stub
		DstCustLevelInstanceCriteria example = new DstCustLevelInstanceCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId)
				.andInstanceIdEqualTo(instanceId);
		List<DstCustLevelInstance> custLevelInstances = MapperFactory.getDstCustLevelInstanceMapper().selectByExample(example);
		return CollectionUtil.isEmpty(custLevelInstances)?null:custLevelInstances.get(0);
	}

}

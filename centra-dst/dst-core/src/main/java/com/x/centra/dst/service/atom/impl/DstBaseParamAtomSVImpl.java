package com.x.centra.dst.service.atom.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.bo.DstBaseParam;
import com.x.centra.dst.dao.mapper.bo.DstBaseParamCriteria;
import com.x.centra.dst.dao.mapper.bo.DstBaseParamCriteria.Criteria;
import com.x.centra.dst.dao.mapper.factory.MapperFactory;
import com.x.centra.dst.service.atom.interfaces.IDstBaseParamAtomSV;

@Component
public class DstBaseParamAtomSVImpl implements IDstBaseParamAtomSV {

	@Override
	public List<DstBaseParam> selectByExample(DstBaseParamCriteria example) {
		// TODO Auto-generated method stub
		return MapperFactory.getDstBaseParamMapper().selectByExample(example);
	}

	@Override
	public List<DstBaseParam> selectByParamType(String tenantId, String paramType) {
		// TODO Auto-generated method stub
		DstBaseParamCriteria example = new DstBaseParamCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId)
				.andParamTypeEqualTo(paramType);
		return MapperFactory.getDstBaseParamMapper().selectByExample(example);
	}

}

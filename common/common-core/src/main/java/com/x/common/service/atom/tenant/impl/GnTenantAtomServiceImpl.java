package com.x.common.service.atom.tenant.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.dao.mapper.bo.GnTenant;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.service.atom.tenant.IGnTenantAtomService;

@Component
public class GnTenantAtomServiceImpl implements IGnTenantAtomService {

    @Override
    public GnTenant selectTenantById(String tenantId) {
        return MapperFactory.getGnTenantMapper().selectByPrimaryKey(tenantId);
    }

	@Override
	public List<GnTenant> selectAllTenant() throws BusinessException,SystemException {
		return MapperFactory.getGnTenantMapper().selectByExample(null);
	}
}

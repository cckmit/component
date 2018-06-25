package com.x.centra.dst.service.atom.interfaces;

import java.util.List;

import com.x.centra.dst.dao.mapper.bo.DstCustLevelInstance;
import com.x.centra.dst.dao.mapper.bo.DstCustLevelInstanceCriteria;

public interface IDstCustLevelInstanceAtomSV {

    int deleteByExample(DstCustLevelInstanceCriteria example);

    int insert(DstCustLevelInstance record);

    List<DstCustLevelInstance> selectByExample(DstCustLevelInstanceCriteria example);
    
    DstCustLevelInstance getByInstanceId(String tenantId, String instanceId);

    int updateByExample(DstCustLevelInstance record, DstCustLevelInstanceCriteria example);
}

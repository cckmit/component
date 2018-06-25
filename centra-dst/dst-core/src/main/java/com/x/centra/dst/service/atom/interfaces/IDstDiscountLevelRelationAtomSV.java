package com.x.centra.dst.service.atom.interfaces;

import java.util.List;

import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelation;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria;

public interface IDstDiscountLevelRelationAtomSV {

    int deleteByExample(DstDiscountLevelRelationCriteria example);

    int insert(DstDiscountLevelRelation record);

    List<DstDiscountLevelRelation> selectByExample(DstDiscountLevelRelationCriteria example);
    
    DstDiscountLevelRelation getByDiscountCode(String tenantId, String discountCode);

    int updateByExample(DstDiscountLevelRelation record, DstDiscountLevelRelationCriteria example);

	int updateByExampleSelective(DstDiscountLevelRelation record, DstDiscountLevelRelationCriteria example);
}

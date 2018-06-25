package com.x.centra.dst.service.atom.interfaces;

import java.util.List;

import com.x.centra.dst.dao.mapper.bo.DstDiscountLevel;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelCriteria;

public interface IDstDiscountLevelAtomSV {

	int deleteByPrimaryKey(String levelId);
	
	int deleteByLevelCode(String tenantId, String levelCode);
	
    int insert(DstDiscountLevel record);
    
    int updateByExample(DstDiscountLevel record, DstDiscountLevelCriteria example);
    
    List<DstDiscountLevel> selectByExample(DstDiscountLevelCriteria example);
    
    long countByLevelCode(String tenantId, String levelCode);
    
    DstDiscountLevel getByLevelCode(String tenantId, String levelCode);
    
    DstDiscountLevel selectByPrimaryKey(String levelId);

	int countByExample(DstDiscountLevelCriteria example);

	int updateByExampleSelective(DstDiscountLevel record, DstDiscountLevelCriteria example);
}

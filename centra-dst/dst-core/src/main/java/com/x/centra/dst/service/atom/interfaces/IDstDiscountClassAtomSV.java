package com.x.centra.dst.service.atom.interfaces;

import java.util.List;

import com.x.centra.dst.dao.mapper.bo.DstDiscountClass;
import com.x.centra.dst.dao.mapper.bo.DstDiscountClassCriteria;

public interface IDstDiscountClassAtomSV {

	int insert(DstDiscountClass record);
	
	List<DstDiscountClass> selectByExample(DstDiscountClassCriteria example);
	
	List<DstDiscountClass> selectByClassCodes(String tenantId, List<String> classCodes);
	
	int updateByExample(DstDiscountClass record, DstDiscountClassCriteria example);
	
	int deleteByExample(DstDiscountClassCriteria example);
	
	int countByClassCode(String tenantId, String classCode);
}

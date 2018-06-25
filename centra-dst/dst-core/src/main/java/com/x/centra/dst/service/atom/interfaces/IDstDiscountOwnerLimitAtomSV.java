package com.x.centra.dst.service.atom.interfaces;

import java.util.List;

import com.x.centra.dst.dao.mapper.bo.DstDiscountOwnerLimit;
import com.x.centra.dst.dao.mapper.bo.DstDiscountOwnerLimitCriteria;

public interface IDstDiscountOwnerLimitAtomSV {

    int deleteByExample(DstDiscountOwnerLimitCriteria example);

    int deleteByDiscountCode(String tenantId, String discountCode);
    
    int insert(DstDiscountOwnerLimit record);

    List<DstDiscountOwnerLimit> selectByExample(DstDiscountOwnerLimitCriteria example);
    
    List<DstDiscountOwnerLimit> selectByDiscountCode(String tenantId, String discountCode);

    int updateByExample(DstDiscountOwnerLimit record, DstDiscountOwnerLimitCriteria example);
}

package com.x.centra.dst.service.atom.interfaces;

import java.util.List;

import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstance;
import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstanceCriteria;

public interface IDstCustDiscountInstanceAtomSV {

    int deleteByExample(DstCustDiscountInstanceCriteria example);

    int insert(DstCustDiscountInstance record);

    List<DstCustDiscountInstance> selectByExample(DstCustDiscountInstanceCriteria example);
    
    List<DstCustDiscountInstance> queryByRemindInstance(String remindState, List<String> discountCodes);

    int updateByExample(DstCustDiscountInstance record, DstCustDiscountInstanceCriteria example);
    
    int updateRemindState(String instanceId, String remindState);
    
    int updateRemindIndex(String instanceId, String remindIndex);

    public int countByExample(DstCustDiscountInstanceCriteria example);

}

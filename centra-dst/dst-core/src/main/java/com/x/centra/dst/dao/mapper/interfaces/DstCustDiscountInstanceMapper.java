package com.x.centra.dst.dao.mapper.interfaces;

import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstance;
import com.x.centra.dst.dao.mapper.bo.DstCustDiscountInstanceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstCustDiscountInstanceMapper {
    int countByExample(DstCustDiscountInstanceCriteria example);

    int deleteByExample(DstCustDiscountInstanceCriteria example);

    int insert(DstCustDiscountInstance record);

    int insertSelective(DstCustDiscountInstance record);

    List<DstCustDiscountInstance> selectByExample(DstCustDiscountInstanceCriteria example);

    int updateByExampleSelective(@Param("record") DstCustDiscountInstance record, @Param("example") DstCustDiscountInstanceCriteria example);

    int updateByExample(@Param("record") DstCustDiscountInstance record, @Param("example") DstCustDiscountInstanceCriteria example);
}
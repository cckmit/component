package com.x.centra.dst.dao.mapper.interfaces;

import com.x.centra.dst.dao.mapper.bo.DstDiscountOwnerLimit;
import com.x.centra.dst.dao.mapper.bo.DstDiscountOwnerLimitCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstDiscountOwnerLimitMapper {
    int countByExample(DstDiscountOwnerLimitCriteria example);

    int deleteByExample(DstDiscountOwnerLimitCriteria example);

    int insert(DstDiscountOwnerLimit record);

    int insertSelective(DstDiscountOwnerLimit record);

    List<DstDiscountOwnerLimit> selectByExample(DstDiscountOwnerLimitCriteria example);

    int updateByExampleSelective(@Param("record") DstDiscountOwnerLimit record, @Param("example") DstDiscountOwnerLimitCriteria example);

    int updateByExample(@Param("record") DstDiscountOwnerLimit record, @Param("example") DstDiscountOwnerLimitCriteria example);
}
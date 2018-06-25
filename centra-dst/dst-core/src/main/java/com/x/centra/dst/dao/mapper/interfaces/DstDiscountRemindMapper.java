package com.x.centra.dst.dao.mapper.interfaces;

import com.x.centra.dst.dao.mapper.bo.DstDiscountRemind;
import com.x.centra.dst.dao.mapper.bo.DstDiscountRemindCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstDiscountRemindMapper {
    int countByExample(DstDiscountRemindCriteria example);

    int deleteByExample(DstDiscountRemindCriteria example);

    int insert(DstDiscountRemind record);

    int insertSelective(DstDiscountRemind record);

    List<DstDiscountRemind> selectByExample(DstDiscountRemindCriteria example);

    int updateByExampleSelective(@Param("record") DstDiscountRemind record, @Param("example") DstDiscountRemindCriteria example);

    int updateByExample(@Param("record") DstDiscountRemind record, @Param("example") DstDiscountRemindCriteria example);
}
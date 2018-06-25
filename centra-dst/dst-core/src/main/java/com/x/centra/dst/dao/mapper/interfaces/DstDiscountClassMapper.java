package com.x.centra.dst.dao.mapper.interfaces;

import com.x.centra.dst.dao.mapper.bo.DstDiscountClass;
import com.x.centra.dst.dao.mapper.bo.DstDiscountClassCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstDiscountClassMapper {
    int countByExample(DstDiscountClassCriteria example);

    int deleteByExample(DstDiscountClassCriteria example);

    int deleteByPrimaryKey(String classId);

    int insert(DstDiscountClass record);

    int insertSelective(DstDiscountClass record);

    List<DstDiscountClass> selectByExample(DstDiscountClassCriteria example);

    DstDiscountClass selectByPrimaryKey(String classId);

    int updateByExampleSelective(@Param("record") DstDiscountClass record, @Param("example") DstDiscountClassCriteria example);

    int updateByExample(@Param("record") DstDiscountClass record, @Param("example") DstDiscountClassCriteria example);

    int updateByPrimaryKeySelective(DstDiscountClass record);

    int updateByPrimaryKey(DstDiscountClass record);
}
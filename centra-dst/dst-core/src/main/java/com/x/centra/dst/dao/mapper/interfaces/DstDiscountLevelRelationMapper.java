package com.x.centra.dst.dao.mapper.interfaces;

import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelation;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelRelationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstDiscountLevelRelationMapper {
    long countByExample(DstDiscountLevelRelationCriteria example);

    int deleteByExample(DstDiscountLevelRelationCriteria example);

    int insert(DstDiscountLevelRelation record);

    int insertSelective(DstDiscountLevelRelation record);

    List<DstDiscountLevelRelation> selectByExample(DstDiscountLevelRelationCriteria example);

    int updateByExampleSelective(@Param("record") DstDiscountLevelRelation record, @Param("example") DstDiscountLevelRelationCriteria example);

    int updateByExample(@Param("record") DstDiscountLevelRelation record, @Param("example") DstDiscountLevelRelationCriteria example);
}
package com.x.centra.dst.dao.mapper.interfaces;

import com.x.centra.dst.dao.mapper.bo.DstDiscountLevel;
import com.x.centra.dst.dao.mapper.bo.DstDiscountLevelCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstDiscountLevelMapper {
	int countByExample(DstDiscountLevelCriteria example);

    int deleteByExample(DstDiscountLevelCriteria example);

    int deleteByPrimaryKey(String levelId);

    int insert(DstDiscountLevel record);

    int insertSelective(DstDiscountLevel record);

    List<DstDiscountLevel> selectByExample(DstDiscountLevelCriteria example);

    DstDiscountLevel selectByPrimaryKey(String levelId);

    int updateByExampleSelective(@Param("record") DstDiscountLevel record, @Param("example") DstDiscountLevelCriteria example);

    int updateByExample(@Param("record") DstDiscountLevel record, @Param("example") DstDiscountLevelCriteria example);

    int updateByPrimaryKeySelective(DstDiscountLevel record);

    int updateByPrimaryKey(DstDiscountLevel record);
}
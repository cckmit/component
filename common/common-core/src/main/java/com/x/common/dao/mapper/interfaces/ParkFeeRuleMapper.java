package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.ParkFeeRule;
import com.x.common.dao.mapper.bo.ParkFeeRuleCriteria;

public interface ParkFeeRuleMapper {
    int countByExample(ParkFeeRuleCriteria example);

    int deleteByExample(ParkFeeRuleCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParkFeeRule record);

    int insertSelective(ParkFeeRule record);

    List<ParkFeeRule> selectByExample(ParkFeeRuleCriteria example);

    ParkFeeRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParkFeeRule record, @Param("example") ParkFeeRuleCriteria example);

    int updateByExample(@Param("record") ParkFeeRule record, @Param("example") ParkFeeRuleCriteria example);

    int updateByPrimaryKeySelective(ParkFeeRule record);

    int updateByPrimaryKey(ParkFeeRule record);
}
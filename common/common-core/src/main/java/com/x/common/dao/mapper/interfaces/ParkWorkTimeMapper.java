package com.x.common.dao.mapper.interfaces;

import com.x.common.dao.mapper.bo.ParkWorkTime;
import com.x.common.dao.mapper.bo.ParkWorkTimeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkWorkTimeMapper {
    int countByExample(ParkWorkTimeCriteria example);

    int deleteByExample(ParkWorkTimeCriteria example);

    int insert(ParkWorkTime record);

    int insertSelective(ParkWorkTime record);

    List<ParkWorkTime> selectByExample(ParkWorkTimeCriteria example);

    int updateByExampleSelective(@Param("record") ParkWorkTime record, @Param("example") ParkWorkTimeCriteria example);

    int updateByExample(@Param("record") ParkWorkTime record, @Param("example") ParkWorkTimeCriteria example);
}
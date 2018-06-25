package com.x.common.dao.mapper.interfaces;

import com.x.common.dao.mapper.bo.ParkGps;
import com.x.common.dao.mapper.bo.ParkGpsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkGpsMapper {
    int countByExample(ParkGpsCriteria example);

    int deleteByExample(ParkGpsCriteria example);

    int insert(ParkGps record);

    int insertSelective(ParkGps record);

    List<ParkGps> selectByExample(ParkGpsCriteria example);

    int updateByExampleSelective(@Param("record") ParkGps record, @Param("example") ParkGpsCriteria example);

    int updateByExample(@Param("record") ParkGps record, @Param("example") ParkGpsCriteria example);
}
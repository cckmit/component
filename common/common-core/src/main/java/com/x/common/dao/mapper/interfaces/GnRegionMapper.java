package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.GnRegion;
import com.x.common.dao.mapper.bo.GnRegionCriteria;

public interface GnRegionMapper {
    int countByExample(GnRegionCriteria example);

    int deleteByExample(GnRegionCriteria example);

    int deleteByPrimaryKey(String regionCode);

    int insert(GnRegion record);

    int insertSelective(GnRegion record);

    List<GnRegion> selectByExample(GnRegionCriteria example);

    GnRegion selectByPrimaryKey(String regionCode);

    int updateByExampleSelective(@Param("record") GnRegion record, @Param("example") GnRegionCriteria example);

    int updateByExample(@Param("record") GnRegion record, @Param("example") GnRegionCriteria example);

    int updateByPrimaryKeySelective(GnRegion record);

    int updateByPrimaryKey(GnRegion record);
}
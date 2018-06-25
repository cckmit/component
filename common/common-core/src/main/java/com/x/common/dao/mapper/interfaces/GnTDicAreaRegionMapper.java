package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.GnTDicAreaRegion;
import com.x.common.dao.mapper.bo.GnTDicAreaRegionCriteria;

public interface GnTDicAreaRegionMapper {
    int countByExample(GnTDicAreaRegionCriteria example);

    int deleteByExample(GnTDicAreaRegionCriteria example);

    int deleteByPrimaryKey(String areaCode);

    int insert(GnTDicAreaRegion record);

    int insertSelective(GnTDicAreaRegion record);

    List<GnTDicAreaRegion> selectByExample(GnTDicAreaRegionCriteria example);

    GnTDicAreaRegion selectByPrimaryKey(String areaCode);

    int updateByExampleSelective(@Param("record") GnTDicAreaRegion record, @Param("example") GnTDicAreaRegionCriteria example);

    int updateByExample(@Param("record") GnTDicAreaRegion record, @Param("example") GnTDicAreaRegionCriteria example);

    int updateByPrimaryKeySelective(GnTDicAreaRegion record);

    int updateByPrimaryKey(GnTDicAreaRegion record);
}
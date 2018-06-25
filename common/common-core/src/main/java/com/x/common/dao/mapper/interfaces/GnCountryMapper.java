package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.GnCountry;
import com.x.common.dao.mapper.bo.GnCountryCriteria;

public interface GnCountryMapper {
    int countByExample(GnCountryCriteria example);

    int deleteByExample(GnCountryCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(GnCountry record);

    int insertSelective(GnCountry record);

    List<GnCountry> selectByExample(GnCountryCriteria example);

    GnCountry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GnCountry record, @Param("example") GnCountryCriteria example);

    int updateByExample(@Param("record") GnCountry record, @Param("example") GnCountryCriteria example);

    int updateByPrimaryKeySelective(GnCountry record);

    int updateByPrimaryKey(GnCountry record);
}
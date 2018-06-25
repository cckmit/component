package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysMailInformation;
import com.x.common.dao.mapper.bo.SysMailInformationCriteria;

public interface SysMailInformationMapper {
    int countByExample(SysMailInformationCriteria example);

    int deleteByExample(SysMailInformationCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysMailInformation record);

    int insertSelective(SysMailInformation record);

    List<SysMailInformation> selectByExample(SysMailInformationCriteria example);

    SysMailInformation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysMailInformation record, @Param("example") SysMailInformationCriteria example);

    int updateByExample(@Param("record") SysMailInformation record, @Param("example") SysMailInformationCriteria example);

    int updateByPrimaryKeySelective(SysMailInformation record);

    int updateByPrimaryKey(SysMailInformation record);
}
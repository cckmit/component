package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysConfig;
import com.x.common.dao.mapper.bo.SysConfigCriteria;

public interface SysConfigMapper {
    int countByExample(SysConfigCriteria example);

    int deleteByExample(SysConfigCriteria example);

    int deleteByPrimaryKey(String configId);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExample(SysConfigCriteria example);

    SysConfig selectByPrimaryKey(String configId);

    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigCriteria example);

    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigCriteria example);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}
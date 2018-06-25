package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysContentManagement;
import com.x.common.dao.mapper.bo.SysContentManagementCriteria;

public interface SysContentManagementMapper {
    int countByExample(SysContentManagementCriteria example);

    int deleteByExample(SysContentManagementCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysContentManagement record);

    int insertSelective(SysContentManagement record);

    List<SysContentManagement> selectByExample(SysContentManagementCriteria example);

    SysContentManagement selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysContentManagement record, @Param("example") SysContentManagementCriteria example);

    int updateByExample(@Param("record") SysContentManagement record, @Param("example") SysContentManagementCriteria example);

    int updateByPrimaryKeySelective(SysContentManagement record);

    int updateByPrimaryKey(SysContentManagement record);
}
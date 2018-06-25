package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysSeoManager;
import com.x.common.dao.mapper.bo.SysSeoManagerCriteria;

public interface SysSeoManagerMapper {
    int countByExample(SysSeoManagerCriteria example);

    int deleteByExample(SysSeoManagerCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysSeoManager record);

    int insertSelective(SysSeoManager record);

    List<SysSeoManager> selectByExample(SysSeoManagerCriteria example);

    SysSeoManager selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysSeoManager record, @Param("example") SysSeoManagerCriteria example);

    int updateByExample(@Param("record") SysSeoManager record, @Param("example") SysSeoManagerCriteria example);

    int updateByPrimaryKeySelective(SysSeoManager record);

    int updateByPrimaryKey(SysSeoManager record);
}
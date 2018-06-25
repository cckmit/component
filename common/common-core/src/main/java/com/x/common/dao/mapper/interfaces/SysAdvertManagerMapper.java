package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysAdvertManager;
import com.x.common.dao.mapper.bo.SysAdvertManagerCriteria;

public interface SysAdvertManagerMapper {
    int countByExample(SysAdvertManagerCriteria example);

    int deleteByExample(SysAdvertManagerCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysAdvertManager record);

    int insertSelective(SysAdvertManager record);

    List<SysAdvertManager> selectByExample(SysAdvertManagerCriteria example);

    SysAdvertManager selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAdvertManager record, @Param("example") SysAdvertManagerCriteria example);

    int updateByExample(@Param("record") SysAdvertManager record, @Param("example") SysAdvertManagerCriteria example);

    int updateByPrimaryKeySelective(SysAdvertManager record);

    int updateByPrimaryKey(SysAdvertManager record);
}
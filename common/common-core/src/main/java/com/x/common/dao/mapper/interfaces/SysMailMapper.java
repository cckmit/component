package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysMail;
import com.x.common.dao.mapper.bo.SysMailCriteria;

public interface SysMailMapper {
    int countByExample(SysMailCriteria example);

    int deleteByExample(SysMailCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysMail record);

    int insertSelective(SysMail record);

    List<SysMail> selectByExampleWithBLOBs(SysMailCriteria example);

    List<SysMail> selectByExample(SysMailCriteria example);

    SysMail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysMail record, @Param("example") SysMailCriteria example);

    int updateByExampleWithBLOBs(@Param("record") SysMail record, @Param("example") SysMailCriteria example);

    int updateByExample(@Param("record") SysMail record, @Param("example") SysMailCriteria example);

    int updateByPrimaryKeySelective(SysMail record);

    int updateByPrimaryKeyWithBLOBs(SysMail record);

    int updateByPrimaryKey(SysMail record);
}
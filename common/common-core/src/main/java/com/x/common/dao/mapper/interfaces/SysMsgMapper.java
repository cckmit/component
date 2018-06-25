package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysMsg;
import com.x.common.dao.mapper.bo.SysMsgCriteria;

public interface SysMsgMapper {
    int countByExample(SysMsgCriteria example);

    int deleteByExample(SysMsgCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    List<SysMsg> selectByExampleWithBLOBs(SysMsgCriteria example);

    List<SysMsg> selectByExample(SysMsgCriteria example);

    SysMsg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysMsg record, @Param("example") SysMsgCriteria example);

    int updateByExampleWithBLOBs(@Param("record") SysMsg record, @Param("example") SysMsgCriteria example);

    int updateByExample(@Param("record") SysMsg record, @Param("example") SysMsgCriteria example);

    int updateByPrimaryKeySelective(SysMsg record);

    int updateByPrimaryKeyWithBLOBs(SysMsg record);

    int updateByPrimaryKey(SysMsg record);
}
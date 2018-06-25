package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysPurpose;
import com.x.common.dao.mapper.bo.SysPurposeCriteria;

public interface SysPurposeMapper {
    int countByExample(SysPurposeCriteria example);

    int deleteByExample(SysPurposeCriteria example);

    int deleteByPrimaryKey(String purposeId);

    int insert(SysPurpose record);

    int insertSelective(SysPurpose record);

    List<SysPurpose> selectByExample(SysPurposeCriteria example);

    SysPurpose selectByPrimaryKey(String purposeId);

    int updateByExampleSelective(@Param("record") SysPurpose record, @Param("example") SysPurposeCriteria example);

    int updateByExample(@Param("record") SysPurpose record, @Param("example") SysPurposeCriteria example);

    int updateByPrimaryKeySelective(SysPurpose record);

    int updateByPrimaryKey(SysPurpose record);
}
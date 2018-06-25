package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysFeedbake;
import com.x.common.dao.mapper.bo.SysFeedbakeCriteria;

public interface SysFeedbakeMapper {
    int countByExample(SysFeedbakeCriteria example);

    int deleteByExample(SysFeedbakeCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysFeedbake record);

    int insertSelective(SysFeedbake record);

    List<SysFeedbake> selectByExample(SysFeedbakeCriteria example);

    SysFeedbake selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysFeedbake record, @Param("example") SysFeedbakeCriteria example);

    int updateByExample(@Param("record") SysFeedbake record, @Param("example") SysFeedbakeCriteria example);

    int updateByPrimaryKeySelective(SysFeedbake record);

    int updateByPrimaryKey(SysFeedbake record);
}
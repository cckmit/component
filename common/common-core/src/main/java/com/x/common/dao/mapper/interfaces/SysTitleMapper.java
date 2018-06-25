package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysTitle;
import com.x.common.dao.mapper.bo.SysTitleCriteria;

public interface SysTitleMapper {
    int countByExample(SysTitleCriteria example);

    int deleteByExample(SysTitleCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysTitle record);

    int insertSelective(SysTitle record);

    List<SysTitle> selectByExample(SysTitleCriteria example);

    SysTitle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysTitle record, @Param("example") SysTitleCriteria example);

    int updateByExample(@Param("record") SysTitle record, @Param("example") SysTitleCriteria example);

    int updateByPrimaryKeySelective(SysTitle record);

    int updateByPrimaryKey(SysTitle record);
}
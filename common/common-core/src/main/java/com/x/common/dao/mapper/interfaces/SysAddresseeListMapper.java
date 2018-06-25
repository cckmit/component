package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysAddresseeList;
import com.x.common.dao.mapper.bo.SysAddresseeListCriteria;

public interface SysAddresseeListMapper {
    int countByExample(SysAddresseeListCriteria example);

    int deleteByExample(SysAddresseeListCriteria example);

    int deleteByPrimaryKey(String listId);

    int insert(SysAddresseeList record);

    int insertSelective(SysAddresseeList record);

    List<SysAddresseeList> selectByExample(SysAddresseeListCriteria example);

    SysAddresseeList selectByPrimaryKey(String listId);

    int updateByExampleSelective(@Param("record") SysAddresseeList record, @Param("example") SysAddresseeListCriteria example);

    int updateByExample(@Param("record") SysAddresseeList record, @Param("example") SysAddresseeListCriteria example);

    int updateByPrimaryKeySelective(SysAddresseeList record);

    int updateByPrimaryKey(SysAddresseeList record);
}
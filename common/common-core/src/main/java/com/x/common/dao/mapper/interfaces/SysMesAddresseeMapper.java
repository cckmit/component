package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysMesAddressee;
import com.x.common.dao.mapper.bo.SysMesAddresseeCriteria;

public interface SysMesAddresseeMapper {
    int countByExample(SysMesAddresseeCriteria example);

    int deleteByExample(SysMesAddresseeCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysMesAddressee record);

    int insertSelective(SysMesAddressee record);

    List<SysMesAddressee> selectByExample(SysMesAddresseeCriteria example);

    SysMesAddressee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysMesAddressee record, @Param("example") SysMesAddresseeCriteria example);

    int updateByExample(@Param("record") SysMesAddressee record, @Param("example") SysMesAddresseeCriteria example);

    int updateByPrimaryKeySelective(SysMesAddressee record);

    int updateByPrimaryKey(SysMesAddressee record);
}
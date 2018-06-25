package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysAddressee;
import com.x.common.dao.mapper.bo.SysAddresseeCriteria;

public interface SysAddresseeMapper {
    int countByExample(SysAddresseeCriteria example);

    int deleteByExample(SysAddresseeCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysAddressee record);

    int insertSelective(SysAddressee record);

    List<SysAddressee> selectByExample(SysAddresseeCriteria example);

    SysAddressee selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAddressee record, @Param("example") SysAddresseeCriteria example);

    int updateByExample(@Param("record") SysAddressee record, @Param("example") SysAddresseeCriteria example);

    int updateByPrimaryKeySelective(SysAddressee record);

    int updateByPrimaryKey(SysAddressee record);
}
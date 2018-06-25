package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysSendMes;
import com.x.common.dao.mapper.bo.SysSendMesCriteria;

public interface SysSendMesMapper {
    int countByExample(SysSendMesCriteria example);

    int deleteByExample(SysSendMesCriteria example);

    int deleteByPrimaryKey(String mesId);

    int insert(SysSendMes record);

    int insertSelective(SysSendMes record);

    List<SysSendMes> selectByExampleWithBLOBs(SysSendMesCriteria example);

    List<SysSendMes> selectByExample(SysSendMesCriteria example);

    SysSendMes selectByPrimaryKey(String mesId);

    int updateByExampleSelective(@Param("record") SysSendMes record, @Param("example") SysSendMesCriteria example);

    int updateByExampleWithBLOBs(@Param("record") SysSendMes record, @Param("example") SysSendMesCriteria example);

    int updateByExample(@Param("record") SysSendMes record, @Param("example") SysSendMesCriteria example);

    int updateByPrimaryKeySelective(SysSendMes record);

    int updateByPrimaryKeyWithBLOBs(SysSendMes record);

    int updateByPrimaryKey(SysSendMes record);
}
package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysMesModel;
import com.x.common.dao.mapper.bo.SysMesModelCriteria;

public interface SysMesModelMapper {
    int countByExample(SysMesModelCriteria example);

    int deleteByExample(SysMesModelCriteria example);

    int deleteByPrimaryKey(String modelId);

    int insert(SysMesModel record);

    int insertSelective(SysMesModel record);

    List<SysMesModel> selectByExampleWithBLOBs(SysMesModelCriteria example);

    List<SysMesModel> selectByExample(SysMesModelCriteria example);

    SysMesModel selectByPrimaryKey(String modelId);

    int updateByExampleSelective(@Param("record") SysMesModel record, @Param("example") SysMesModelCriteria example);

    int updateByExampleWithBLOBs(@Param("record") SysMesModel record, @Param("example") SysMesModelCriteria example);

    int updateByExample(@Param("record") SysMesModel record, @Param("example") SysMesModelCriteria example);

    int updateByPrimaryKeySelective(SysMesModel record);

    int updateByPrimaryKeyWithBLOBs(SysMesModel record);

    int updateByPrimaryKey(SysMesModel record);

}
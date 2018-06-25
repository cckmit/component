package com.x.centra.dst.dao.mapper.interfaces;

import com.x.centra.dst.dao.mapper.bo.DstBaseParam;
import com.x.centra.dst.dao.mapper.bo.DstBaseParamCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstBaseParamMapper {
    int countByExample(DstBaseParamCriteria example);

    int deleteByExample(DstBaseParamCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(DstBaseParam record);

    int insertSelective(DstBaseParam record);

    List<DstBaseParam> selectByExample(DstBaseParamCriteria example);

    DstBaseParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DstBaseParam record, @Param("example") DstBaseParamCriteria example);

    int updateByExample(@Param("record") DstBaseParam record, @Param("example") DstBaseParamCriteria example);

    int updateByPrimaryKeySelective(DstBaseParam record);

    int updateByPrimaryKey(DstBaseParam record);
}
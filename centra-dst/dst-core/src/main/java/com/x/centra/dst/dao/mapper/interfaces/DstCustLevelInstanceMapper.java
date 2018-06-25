package com.x.centra.dst.dao.mapper.interfaces;

import com.x.centra.dst.dao.mapper.bo.DstCustLevelInstance;
import com.x.centra.dst.dao.mapper.bo.DstCustLevelInstanceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstCustLevelInstanceMapper {
    int countByExample(DstCustLevelInstanceCriteria example);

    int deleteByExample(DstCustLevelInstanceCriteria example);

    int insert(DstCustLevelInstance record);

    int insertSelective(DstCustLevelInstance record);

    List<DstCustLevelInstance> selectByExample(DstCustLevelInstanceCriteria example);

    int updateByExampleSelective(@Param("record") DstCustLevelInstance record, @Param("example") DstCustLevelInstanceCriteria example);

    int updateByExample(@Param("record") DstCustLevelInstance record, @Param("example") DstCustLevelInstanceCriteria example);
}
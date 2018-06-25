package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysMsgReceiver;
import com.x.common.dao.mapper.bo.SysMsgReceiverCriteria;

public interface SysMsgReceiverMapper {
    int countByExample(SysMsgReceiverCriteria example);

    int deleteByExample(SysMsgReceiverCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SysMsgReceiver record);

    int insertSelective(SysMsgReceiver record);

    List<SysMsgReceiver> selectByExample(SysMsgReceiverCriteria example);

    SysMsgReceiver selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysMsgReceiver record, @Param("example") SysMsgReceiverCriteria example);

    int updateByExample(@Param("record") SysMsgReceiver record, @Param("example") SysMsgReceiverCriteria example);

    int updateByPrimaryKeySelective(SysMsgReceiver record);

    int updateByPrimaryKey(SysMsgReceiver record);
}
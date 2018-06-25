package com.x.common.dao.mapper.interfaces;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.x.common.dao.mapper.bo.SysQuestions;
import com.x.common.dao.mapper.bo.SysQuestionsCriteria;
import com.x.common.dao.mapper.bo.SysQuestionsWithBLOBs;

public interface SysQuestionsMapper {
    int countByExample(SysQuestionsCriteria example);

    int deleteByExample(SysQuestionsCriteria example);

    int insert(SysQuestionsWithBLOBs record);

    int insertSelective(SysQuestionsWithBLOBs record);

    List<SysQuestionsWithBLOBs> selectByExampleWithBLOBs(SysQuestionsCriteria example);

    List<SysQuestions> selectByExample(SysQuestionsCriteria example);

    int updateByExampleSelective(@Param("record") SysQuestionsWithBLOBs record, @Param("example") SysQuestionsCriteria example);

    int updateByExampleWithBLOBs(@Param("record") SysQuestionsWithBLOBs record, @Param("example") SysQuestionsCriteria example);

    int updateByExample(@Param("record") SysQuestions record, @Param("example") SysQuestionsCriteria example);
}
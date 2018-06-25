package com.x.centra.dst.dao.mapper.factory;

import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.centra.dst.dao.mapper.interfaces.DstBaseParamMapper;
import com.x.centra.dst.dao.mapper.interfaces.DstCustDiscountInstanceMapper;
import com.x.centra.dst.dao.mapper.interfaces.DstCustLevelInstanceMapper;
import com.x.centra.dst.dao.mapper.interfaces.DstDiscountClassMapper;
import com.x.centra.dst.dao.mapper.interfaces.DstDiscountInfoMapper;
import com.x.centra.dst.dao.mapper.interfaces.DstDiscountLevelMapper;
import com.x.centra.dst.dao.mapper.interfaces.DstDiscountLevelRelationMapper;
import com.x.centra.dst.dao.mapper.interfaces.DstDiscountOwnerLimitMapper;
import com.x.centra.dst.dao.mapper.interfaces.DstDiscountRemindMapper;

@Component
public class MapperFactory {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private static SqlSessionTemplate st;

    @PostConstruct
    void init() {
    	setSqlSessionTemplate(sqlSessionTemplate);
    }
    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        MapperFactory.st = sqlSessionTemplate;
    }
    
    public static DstCustDiscountInstanceMapper getDstCustDiscountInstanceMapper() {
        return st.getMapper(DstCustDiscountInstanceMapper.class);
    }

    public static DstCustLevelInstanceMapper getDstCustLevelInstanceMapper() {
        return st.getMapper(DstCustLevelInstanceMapper.class);
    }
    
    public static DstDiscountClassMapper getDstDiscountClassMapper() {
        return st.getMapper(DstDiscountClassMapper.class);
    }

    public static DstDiscountInfoMapper getDstDiscountInfoMapper() {
        return st.getMapper(DstDiscountInfoMapper.class);
    }

    public static DstDiscountLevelMapper getDstDiscountLevelMapper() {
        return st.getMapper(DstDiscountLevelMapper.class);
    }

    public static DstDiscountLevelRelationMapper getDstDiscountLevelRelationMapper() {
        return st.getMapper(DstDiscountLevelRelationMapper.class);
    }

    public static DstDiscountRemindMapper getDstDiscountRemindMapper() {
        return st.getMapper(DstDiscountRemindMapper.class);
    }
    
    public static DstDiscountOwnerLimitMapper getDstDiscountOwnerLimitMapper() {
        return st.getMapper(DstDiscountOwnerLimitMapper.class);
    }

    public static DstBaseParamMapper getDstBaseParamMapper() {
        return st.getMapper(DstBaseParamMapper.class);
    }

}

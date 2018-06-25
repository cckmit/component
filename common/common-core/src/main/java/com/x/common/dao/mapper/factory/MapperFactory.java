package com.x.common.dao.mapper.factory;


import javax.annotation.PostConstruct;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.common.dao.mapper.interfaces.GnAreaMapper;
import com.x.common.dao.mapper.interfaces.GnCountryMapper;
import com.x.common.dao.mapper.interfaces.GnIndustryMapper;
import com.x.common.dao.mapper.interfaces.GnIpAddrMapper;
import com.x.common.dao.mapper.interfaces.GnRegionMapper;
import com.x.common.dao.mapper.interfaces.GnServiceNumMapper;
import com.x.common.dao.mapper.interfaces.GnSettleRuleMapper;
import com.x.common.dao.mapper.interfaces.GnSubjectFundMapper;
import com.x.common.dao.mapper.interfaces.GnSubjectMapper;
import com.x.common.dao.mapper.interfaces.GnSysParamMapper;
import com.x.common.dao.mapper.interfaces.GnTDicAreaRegionMapper;
import com.x.common.dao.mapper.interfaces.GnTenantMapper;
import com.x.common.dao.mapper.interfaces.ParkFeeRuleMapper;
import com.x.common.dao.mapper.interfaces.ParkGpsMapper;
import com.x.common.dao.mapper.interfaces.ParkWorkTimeMapper;
import com.x.common.dao.mapper.interfaces.SysAddresseeListMapper;
import com.x.common.dao.mapper.interfaces.SysAddresseeMapper;
import com.x.common.dao.mapper.interfaces.SysAdvertManagerMapper;
import com.x.common.dao.mapper.interfaces.SysConfigMapper;
import com.x.common.dao.mapper.interfaces.SysDomainMapper;
import com.x.common.dao.mapper.interfaces.SysDuadMapper;
import com.x.common.dao.mapper.interfaces.SysItembankMapper;
import com.x.common.dao.mapper.interfaces.SysMailMapper;
import com.x.common.dao.mapper.interfaces.SysMenuMapper;
import com.x.common.dao.mapper.interfaces.SysMesAddresseeMapper;
import com.x.common.dao.mapper.interfaces.SysMesModelMapper;
import com.x.common.dao.mapper.interfaces.SysMsgMapper;
import com.x.common.dao.mapper.interfaces.SysMsgReceiverMapper;
import com.x.common.dao.mapper.interfaces.SysOfficeMapper;
import com.x.common.dao.mapper.interfaces.SysPurposeMapper;
import com.x.common.dao.mapper.interfaces.SysQuestionsMapper;
import com.x.common.dao.mapper.interfaces.SysSendMesMapper;
import com.x.common.dao.mapper.interfaces.SysSensitiveMapper;
import com.x.common.dao.mapper.interfaces.SysSeoManagerMapper;
import com.x.common.dao.mapper.interfaces.SysUserMapper;
import com.x.common.dao.mapper.interfaces.SysWaitjobsMapper;

@Component
public class MapperFactory {

    private static SqlSessionTemplate sqlSessionTemplate;
    
    @Autowired
    private SqlSessionTemplate st;

    @PostConstruct
    void init() {
        setSqlSessionTemplate(st);
    }
    
    public static SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        MapperFactory.sqlSessionTemplate = sqlSessionTemplate;
    }

    public static SysOfficeMapper getSysOfficeMapper(){
    	return sqlSessionTemplate.getMapper(SysOfficeMapper.class);
    }
    public static SysMailMapper getSysMailMapper(){
    	return sqlSessionTemplate.getMapper(SysMailMapper.class);
    }
    public static SysMsgMapper getSysMsgMapper(){
    	return sqlSessionTemplate.getMapper(SysMsgMapper.class);
    }
    public static SysMsgReceiverMapper getSysMsgReceiverMapper(){
    	return sqlSessionTemplate.getMapper(SysMsgReceiverMapper.class);
    }
    
    public static SysUserMapper getSysUserMapper(){
    	return sqlSessionTemplate.getMapper(SysUserMapper.class);
    }
    
    public static SysWaitjobsMapper getSysWaitjobsMapper(){
    	return sqlSessionTemplate.getMapper(SysWaitjobsMapper.class);
    }
    
    public static GnSysParamMapper getGnSysParamMapper() {
        return sqlSessionTemplate.getMapper(GnSysParamMapper.class);
    }

    public static GnAreaMapper getGnAreaMapper() {
        return sqlSessionTemplate.getMapper(GnAreaMapper.class);
    }

    public static GnSubjectMapper getGnSubjectMapper() {
        return sqlSessionTemplate.getMapper(GnSubjectMapper.class);
    }

    public static GnSubjectFundMapper getGnSubjectFundMapper() {
        return sqlSessionTemplate.getMapper(GnSubjectFundMapper.class);
    }

    public static GnSettleRuleMapper getGnSettleRuleMapper() {
        return sqlSessionTemplate.getMapper(GnSettleRuleMapper.class);
    }
    
    public static GnTenantMapper getGnTenantMapper() {
        return sqlSessionTemplate.getMapper(GnTenantMapper.class);
    }
    public static GnIpAddrMapper getGnIpAddrMapper() {
    	return sqlSessionTemplate.getMapper(GnIpAddrMapper.class);
    }
    
    public static GnServiceNumMapper getGnServiceNumMapper() {
    	return sqlSessionTemplate.getMapper(GnServiceNumMapper.class);
    }

    public static GnIndustryMapper getGnIndustryMapper() {
        return sqlSessionTemplate.getMapper(GnIndustryMapper.class);
    }
    
    public static SysMenuMapper getSysMenuMapper() {
        return sqlSessionTemplate.getMapper(SysMenuMapper.class);
    }
    
    public static SysConfigMapper getSysConfigMapper() {
        return sqlSessionTemplate.getMapper(SysConfigMapper.class);
    }
    
    public static SysDuadMapper getSysDuadMapper() {
        return sqlSessionTemplate.getMapper(SysDuadMapper.class);
    }
    
    public static SysPurposeMapper getSysPurposeMapper() {
        return sqlSessionTemplate.getMapper(SysPurposeMapper.class);
    }
    
    public static SysItembankMapper getSysItembankMapper() {
        return sqlSessionTemplate.getMapper(SysItembankMapper.class);
    }
    
    public static SysDomainMapper getSysDomainMapper() {
        return sqlSessionTemplate.getMapper(SysDomainMapper.class);
    }
    public static GnCountryMapper getGnCountryMapper() {
        return sqlSessionTemplate.getMapper(GnCountryMapper.class);
    }

    public static GnRegionMapper getGnRegionMapper(){
        return sqlSessionTemplate.getMapper(GnRegionMapper.class);
    }
    
    public static GnTDicAreaRegionMapper getGnTDicAreaRegionMapper(){
    	return sqlSessionTemplate.getMapper(GnTDicAreaRegionMapper.class);
    }
    
    public static SysQuestionsMapper getSysQuestionsMapper() {
        return sqlSessionTemplate.getMapper(SysQuestionsMapper.class);
    }
    
    public static SysSensitiveMapper getSysSensitiveMapper() {
        return sqlSessionTemplate.getMapper(SysSensitiveMapper.class);
    }
    
    public static SysSeoManagerMapper getSysSeoManagerMapper() {
        return sqlSessionTemplate.getMapper(SysSeoManagerMapper.class);
    }
    
    public static SysAdvertManagerMapper getSysAdvertManagerMapper() {
        return sqlSessionTemplate.getMapper(SysAdvertManagerMapper.class);
    }
    
    public static SysMesModelMapper getSysMesModelMapper() {
        return sqlSessionTemplate.getMapper(SysMesModelMapper.class);
    }
    
    public static SysAddresseeListMapper getSysAddresseeListMapper() {
        return sqlSessionTemplate.getMapper(SysAddresseeListMapper.class);
    }
    
    public static SysAddresseeMapper getSysAddresseeMapper() {
        return sqlSessionTemplate.getMapper(SysAddresseeMapper.class);
    }
    
    public static SysSendMesMapper getSysSendMesMapper() {
        return sqlSessionTemplate.getMapper(SysSendMesMapper.class);
    }
    
    public static SysMesAddresseeMapper getSysMesAddresseeMapper() {
        return sqlSessionTemplate.getMapper(SysMesAddresseeMapper.class);
    }
    
    public static ParkGpsMapper getParkGpsMapper() {
    	return sqlSessionTemplate.getMapper(ParkGpsMapper.class);
    }
    public static ParkFeeRuleMapper getParkFeeRuleMapper() {
    	return sqlSessionTemplate.getMapper(ParkFeeRuleMapper.class);
    }
    public static ParkWorkTimeMapper getParkWorkTimeMapper() {
    	return sqlSessionTemplate.getMapper(ParkWorkTimeMapper.class);
    }
}

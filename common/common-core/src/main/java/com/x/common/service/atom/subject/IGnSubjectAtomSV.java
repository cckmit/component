package com.x.common.service.atom.subject;

import java.util.List;

import com.x.base.exception.BusinessException;
import com.x.base.vo.PageInfo;
import com.x.common.dao.mapper.bo.GnSubject;
import com.x.common.dao.mapper.bo.GnSubjectKey;

/**
 * 科目编码 原子服务 Date: 2015年8月19日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public interface IGnSubjectAtomSV {
    /**
     * 根据subjectId查询科目编码
     * 
     * @param subjectId
     * @return
     * @author auth
     * @ApiDocMethod
     */
    public GnSubject queryGnSubject(String tenantId, String industryCode, long subjectId);

    /**
     * 科目分页条件查询
     * @param tenantId
     * @param industryCode
     * @param subjectId
     * @param subjectType
     * @param subjectName
     * @param pageNo
     * @param pageSize
     * @return
     * @author auth
     */
    public PageInfo<GnSubject> queryGnSubject(String tenantId, String industryCode, Long subjectId,
            String subjectType, String subjectName, Integer pageNo, Integer pageSize);

    /**
     * 查询所有科目编码
     * 
     * @return
     * @author auth
     * @ApiDocMethod
     */
    public List<GnSubject> queryGnSubject();

    /**
     * 新增科目
     * 
     * @param vo
     * @throws BusinessException
     * @author auth
     * @ApiDocMethod
     * @ApiCode
     */
    public void addSubject(GnSubject vo) throws BusinessException;

    /**
     * 删除科目
     * 
     * @param key
     * @throws BusinessException
     * @author auth
     */
    public void delSubject(GnSubjectKey key) throws BusinessException;

    /**
     * 修改科目
     * 
     * @param vo
     * @param key
     * @throws BusinessException
     * @author auth
     */
    public void modSubject(GnSubject vo, GnSubjectKey key) throws BusinessException;

}

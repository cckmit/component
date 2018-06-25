package com.x.common.service.atom.subject;

import java.util.List;

import com.x.base.exception.BusinessException;
import com.x.common.dao.mapper.bo.GnSubjectFund;
import com.x.common.dao.mapper.bo.GnSubjectFundKey;

/**
 * 查询资金科目详细
 *
 * Date: 2016年1月4日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public interface IGnSubjectFundAtomSV {

    /**
     * 根据subjectId查询资金科目定义
     * 
     * @param subjectId
     * @return
     * @author auth
     * @ApiDocMethod
     */
    public GnSubjectFund queryGnSubjectFund(String tenantId,String industryCode,long subjectId);

    /**
     * 查询所有资金科目定义
     * 
     * @return
     * @author auth
     * @ApiDocMethod
     */
    public List<GnSubjectFund> queryGnSubjectFund();

    /**
     * 增加资金科目详细
     * 
     * @param vo
     * @throws BusinessException
     * @author auth
     */
    public void addSubjectFund(GnSubjectFund vo) throws BusinessException;

    /**
     * 删除资金科目详细
     * 
     * @param key
     * @throws BusinessException
     * @author auth
     */
    public void delSubjectFund(GnSubjectFundKey key) throws BusinessException;

    /**
     * 修改资金科目详细
     * 
     * @param vo
     * @param key
     * @throws BusinessException
     * @author auth
     */
    public void modSubjectFund(GnSubjectFund vo, GnSubjectFundKey key) throws BusinessException;

}

package com.x.common.service.business.industry.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.industry.param.IndustryQueryResponse;
import com.x.common.dao.mapper.bo.GnIndustry;
import com.x.common.service.atom.idustry.IIdustryAtomSV;
import com.x.common.service.business.industry.IIndustryBusiSV;

@Component
@Transactional
public class IdustryBusiSVImpl implements IIndustryBusiSV{

    @Autowired
    private IIdustryAtomSV idustryAtomSV;
    
    @Override
    public List<IndustryQueryResponse> queryIndustryList()
            throws BusinessException, SystemException {
        List<GnIndustry> list = idustryAtomSV.selectByExample(null);
        List<IndustryQueryResponse> responseList = new ArrayList<IndustryQueryResponse>();
        for (GnIndustry gnIndustry : list) {
            IndustryQueryResponse response = new IndustryQueryResponse();
            BeanUtils.copyProperties(gnIndustry, response);
            responseList.add(response);
        }
        return responseList;
    }

    @Override
    public IndustryQueryResponse queryByIndustryCode(String industryCode)
            throws BusinessException, SystemException {
        IndustryQueryResponse response = new IndustryQueryResponse();
        GnIndustry gnIndustry = idustryAtomSV.selectByPrimaryKey(industryCode);
        BeanUtils.copyProperties(gnIndustry, response);
        return response;
    }

}

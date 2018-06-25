package com.x.common.service.business.industry;

import java.util.List;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.industry.param.IndustryQueryResponse;

public interface IIndustryBusiSV {

    List<IndustryQueryResponse> queryIndustryList() throws BusinessException,SystemException;
    
    
    IndustryQueryResponse queryByIndustryCode(String industryCode)throws BusinessException,SystemException;
}

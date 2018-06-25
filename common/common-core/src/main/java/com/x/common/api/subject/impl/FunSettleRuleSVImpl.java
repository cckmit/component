package com.x.common.api.subject.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.subject.interfaces.IFunSettleRuleSV;
import com.x.common.api.subject.param.FunSettleRule;
import com.x.common.api.subject.param.SubjectIdParam;
import com.x.common.dao.mapper.bo.GnTenant;
import com.x.common.service.business.tenant.IGnTenantBusinessService;
import com.x.common.util.GnSubjectUtil;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.StringUtil;

@Service
@Component
public class FunSettleRuleSVImpl implements IFunSettleRuleSV {

    @Autowired
    private IGnTenantBusinessService gnTenantBusinessService;

    @Override
    public List<FunSettleRule> querySettleRule(SubjectIdParam param) throws BusinessException,SystemException {
        if (param == null) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:请求参数不能为空");
        }
        if (StringUtil.isBlank(param.getTenantId())) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (param.getSubjectId() == 0) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:科目ID不能为空");
        }
        // TODO 租户使用缓存时这里需要修改
        GnTenant tenant = gnTenantBusinessService.selectTenantById(param.getTenantId());
        if (tenant == null) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户不存在，请检查租户配置表");
        }
        JSONArray ruleArray = GnSubjectUtil.getGnSettleRule(tenant.getIndustryCode(),
                param.getTenantId(), param.getSubjectId());
        return ruleArray.isEmpty() ? null : JSON.parseArray(ruleArray.toJSONString(),
                FunSettleRule.class);
    }

}

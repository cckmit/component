package com.x.common.api.parkfeerule.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.parkfeerule.interfaces.IParkFeeRuleSV;
import com.x.common.api.parkfeerule.param.ParkFeeRuleResponse;
import com.x.common.api.parkfeerule.param.ParkFeeRuleVo;
import com.x.common.service.business.parkfeerule.IParkFeeRuleBusinessService;
import com.x.sdk.util.StringUtil;

@Service
@Component
public class ParkFeeRuleSVImpl implements IParkFeeRuleSV {

	Logger logger = LoggerFactory.getLogger(ParkFeeRuleSVImpl.class);

	@Autowired
	private IParkFeeRuleBusinessService iParkFeeRuleBusinessService;

	@Override
	public ParkFeeRuleResponse queryParkFeeRuleById(ParkFeeRuleVo parkFeeRuleVo)
			throws BusinessException, SystemException {
		String feeStandardId = parkFeeRuleVo.getFeeStandardId();
		if (!isInteger(feeStandardId)) {
			throw new BusinessException("费率版本不合法！");
		}
		logger.debug("feeStandardId is [{}].", feeStandardId);
		return iParkFeeRuleBusinessService.queryParkFeeRuleById(Integer.valueOf(feeStandardId));
	}

	private static boolean isInteger(String s) {
		if (StringUtil.isBlank(s)) {
			return false;
		}
		if (s.length() > 11) {
			return false;
		}
		try {
			Integer.valueOf(s);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

}

package com.x.common.service.business.parkfeerule;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.parkfeerule.param.ParkFeeRuleResponse;

public interface IParkFeeRuleBusinessService {

	public ParkFeeRuleResponse queryParkFeeRuleById(Integer feeStandardId) throws BusinessException, SystemException;

}

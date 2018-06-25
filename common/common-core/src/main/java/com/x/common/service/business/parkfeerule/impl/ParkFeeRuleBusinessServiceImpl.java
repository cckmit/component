package com.x.common.service.business.parkfeerule.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.parkfeerule.param.ParkFeeRuleResponse;
import com.x.common.service.atom.parkfeerule.IParkFeeRuleAtomService;
import com.x.common.service.business.parkfeerule.IParkFeeRuleBusinessService;

@Service
@Transactional
public class ParkFeeRuleBusinessServiceImpl implements IParkFeeRuleBusinessService {

	@Autowired
	private IParkFeeRuleAtomService iParkFeeRuleAtomService;

	@Override
	public ParkFeeRuleResponse queryParkFeeRuleById(Integer feeStandardId) throws BusinessException, SystemException {
		ParkFeeRuleResponse rep = new ParkFeeRuleResponse();
		rep.setParkFeeRule(iParkFeeRuleAtomService.queryParkFeeRuleById(feeStandardId));
		return rep;
	}

}

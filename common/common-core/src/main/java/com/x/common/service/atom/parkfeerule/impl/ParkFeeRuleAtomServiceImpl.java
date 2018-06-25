package com.x.common.service.atom.parkfeerule.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.common.api.parkfeerule.param.ParkFeeRuleVo;
import com.x.common.dao.mapper.bo.ParkFeeRule;
import com.x.common.dao.mapper.bo.ParkFeeRuleCriteria;
import com.x.common.dao.mapper.bo.ParkFeeRuleCriteria.Criteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.ParkFeeRuleMapper;
import com.x.common.service.atom.parkfeerule.IParkFeeRuleAtomService;
import com.x.sdk.util.CollectionUtil;

@Component
public class ParkFeeRuleAtomServiceImpl implements IParkFeeRuleAtomService {

	@Override
	public ParkFeeRuleVo queryParkFeeRuleById(Integer feeStandardId) {
		if (null == feeStandardId) {
			return null;
		}
		ParkFeeRuleMapper pm = MapperFactory.getParkFeeRuleMapper();
		ParkFeeRuleCriteria example = new ParkFeeRuleCriteria();
		Criteria cc = example.createCriteria();
		cc.andFeeStandardIdEqualTo(feeStandardId);
		List<ParkFeeRule> results = pm.selectByExample(example);
		if (CollectionUtil.isEmpty(results)) {
			return null;
		}
		ParkFeeRuleVo vo = new ParkFeeRuleVo();
		ParkFeeRule bo = results.get(0);
		vo.setCarTypeDesc(bo.getCarTypeDesc());
		vo.setFeeStandardDesc(bo.getFeeStandardDesc());
		vo.setFeeStandardId(String.valueOf(bo.getFeeStandardId()));
		vo.setFeeStandardLevelDesc(bo.getFeeStandardLevelDesc());
		vo.setFeeStandardLevelType(bo.getFeeStandardLevelType());
		vo.setStandardStatues(bo.getStandardStatues());
		return vo;
	}

}

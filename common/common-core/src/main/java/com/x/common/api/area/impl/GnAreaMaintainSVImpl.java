package com.x.common.api.area.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.x.base.exception.SystemException;
import com.x.common.api.area.interfaces.IGnAreaMaintainSV;
import com.x.common.api.area.param.GnAreaCondition;
import com.x.common.api.area.param.GnAreaVo;
import com.x.common.service.business.area.IGnAreaBusinessService;
import com.x.common.util.VoValidateUtils;

@Service
@Component
public class GnAreaMaintainSVImpl implements IGnAreaMaintainSV {
	@Autowired
	private IGnAreaBusinessService iGnAreaBusinessService;
	@Override
	public String addArea(GnAreaVo area) throws SystemException {
		VoValidateUtils.validateAddArea(area);
		return iGnAreaBusinessService.addArea(area);
	}

	@Override
	public void modifyArea(GnAreaVo area) throws SystemException {
		VoValidateUtils.validateModifyArea(area);
		iGnAreaBusinessService.modifyArea(area);
	}

	@Override
	public void deleteArea(GnAreaCondition gnAreaCondition)
			throws SystemException {
		VoValidateUtils.validateDeleteArea(gnAreaCondition);
		iGnAreaBusinessService.deleteArea(gnAreaCondition);
	}

	@Override
	public void deleteAreas(List<GnAreaCondition> gnAreaCondition)
			throws SystemException {
		VoValidateUtils.validateDeleteAreas(gnAreaCondition);
		iGnAreaBusinessService.deleteAreas(gnAreaCondition);

	}

}

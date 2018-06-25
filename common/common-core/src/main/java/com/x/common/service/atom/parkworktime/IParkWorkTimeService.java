package com.x.common.service.atom.parkworktime;

import com.x.common.api.parkgps.param.ParkWorkTimeVo;

public interface IParkWorkTimeService {
	public ParkWorkTimeVo getWorkBusyLevel(String parkId);
}

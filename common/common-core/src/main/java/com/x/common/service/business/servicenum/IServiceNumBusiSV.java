package com.x.common.service.business.servicenum;

import com.x.common.api.servicenum.param.ServiceNum;

public interface IServiceNumBusiSV {
	ServiceNum getServiceNumByPhone(String phone);
}

package com.x.common.api.parkfeerule.param;

import com.x.base.vo.BaseResponse;

/**
 * 查询停车场位置信息 <br>
 * Date: 2018年2月7日 <br>
 * Copyright (c) 2018 bonc.com.cn <br>
 * 
 * @author auth
 */
public class ParkFeeRuleResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;

	private ParkFeeRuleVo parkFeeRule;

	public ParkFeeRuleVo getParkFeeRule() {
		return parkFeeRule;
	}

	public void setParkFeeRule(ParkFeeRuleVo parkFeeRule) {
		this.parkFeeRule = parkFeeRule;
	}

}

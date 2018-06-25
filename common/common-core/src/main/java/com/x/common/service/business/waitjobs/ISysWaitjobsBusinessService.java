package com.x.common.service.business.waitjobs;

import com.x.base.vo.BaseResponse;
import com.x.common.api.waitjobs.param.WaitjobsCompleteRequset;
import com.x.common.api.waitjobs.param.WaitjobsInsertRequest;
import com.x.common.api.waitjobs.param.WaitjobsInsertResponse;

public interface ISysWaitjobsBusinessService {
	
	public WaitjobsInsertResponse insertWaitjobs(WaitjobsInsertRequest insertRequest);
	
	public BaseResponse completeWaitjobs(WaitjobsCompleteRequset completeRequest);

}

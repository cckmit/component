package com.x.common.service.business.sysfeedbake;

import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeDetailQueryResponse;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryRequest;
import com.x.common.api.sysfeedbake.param.FeedBakeQueryResponse;
import com.x.common.dao.mapper.bo.SysFeedbake;

public interface ISysFeedBakeBusiSV {

	FeedBakeQueryResponse queryList(FeedBakeQueryRequest request);

	FeedBakeDetailQueryResponse queryById(FeedBakeDetailQueryRequest request);
	
	void handle(SysFeedbake feedbake); 
	
	void insert(SysFeedbake feedbake);
}

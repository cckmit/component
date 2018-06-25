package com.x.common.service.atom.sysfeedbake;

import java.util.List;

import com.x.common.api.sysfeedbake.param.FeedBakeQueryRequest;
import com.x.common.dao.mapper.bo.SysFeedbake;

public interface ISysFeedBakeAtomSV {
		
	  int count(FeedBakeQueryRequest request);
	  
	  int insert(SysFeedbake record);
	  
	  List<SysFeedbake> queryList(FeedBakeQueryRequest request);

	  SysFeedbake selectById(String id);
	  
	  int update(SysFeedbake record);
}

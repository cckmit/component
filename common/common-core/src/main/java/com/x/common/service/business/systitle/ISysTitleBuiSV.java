package com.x.common.service.business.systitle;

import com.x.common.api.systitle.param.TitleQueryDetailRequest;
import com.x.common.api.systitle.param.TitleQueryDetailResponse;
import com.x.common.api.systitle.param.TitleQueryListRequest;
import com.x.common.api.systitle.param.TitleQueryListResponse;
import com.x.common.api.systitle.param.TitleQueryResponse;
import com.x.common.api.systitle.param.TitleSortCheckRequest;
import com.x.common.api.systitle.param.TitleSortCheckResponse;
import com.x.common.api.systitle.param.TitleSubmitRequest;

public interface ISysTitleBuiSV {

	TitleQueryListResponse queryList(TitleQueryListRequest request);

	TitleQueryDetailResponse queryDetail(TitleQueryDetailRequest request);

	void save(TitleSubmitRequest request) throws Exception;
	
	void edit(TitleSubmitRequest request) throws Exception;
	
	void delete(String id) throws Exception;

	TitleSortCheckResponse duplicateCheck(TitleSortCheckRequest request);

	TitleQueryResponse queryTitle(String regionalLanguage);
	
	public void write() throws Exception;


}

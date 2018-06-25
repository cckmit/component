package com.x.common.service.business.syscontentmanagement;

import com.x.common.api.syscontentmanagement.param.ContentQueryDetailRequest;
import com.x.common.api.syscontentmanagement.param.ContentQueryDetailResponse;
import com.x.common.api.syscontentmanagement.param.ContentQueryListRequest;
import com.x.common.api.syscontentmanagement.param.ContentQueryListResponse;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckRequest;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckResponse;
import com.x.common.api.syscontentmanagement.param.ContentSubmitRequest;

public interface ISysContentManagementBusiSV {

	ContentQueryListResponse queryList(ContentQueryListRequest request);

	ContentQueryDetailResponse queryDetail(ContentQueryDetailRequest request);

	void save(ContentSubmitRequest request) throws Exception;

	void edit(ContentSubmitRequest request) throws Exception;

	void delete(String id) throws Exception;

	ContentSortCheckResponse duplicateCheck(ContentSortCheckRequest request);

	void write() throws Exception;

}

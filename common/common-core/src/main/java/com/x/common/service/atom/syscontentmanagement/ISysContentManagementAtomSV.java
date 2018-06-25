package com.x.common.service.atom.syscontentmanagement;

import java.util.List;

import com.x.common.api.syscontentmanagement.param.ContentQueryListRequest;
import com.x.common.api.syscontentmanagement.param.ContentSortCheckRequest;
import com.x.common.dao.mapper.bo.SysContentManagement;

public interface ISysContentManagementAtomSV {

	SysContentManagement selectById(String id);

	int count(ContentQueryListRequest request);

	List<SysContentManagement> queryList(ContentQueryListRequest request);
	
	List<SysContentManagement> queryByTitleId(String titleid);
	
	List<SysContentManagement> queryContentManagementList();

	void insert(SysContentManagement management);

	void update(SysContentManagement management);

	int delete(String id);

	int duplicateCheck(ContentSortCheckRequest request);

	List<SysContentManagement> querySysContentManagementList(String local);

	List<SysContentManagement> queryContentBytitleId(String titleid,String local);

}

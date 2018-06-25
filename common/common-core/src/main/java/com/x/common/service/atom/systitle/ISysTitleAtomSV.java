package com.x.common.service.atom.systitle;

import java.util.List;

import com.x.common.api.systitle.param.TitleQueryListRequest;
import com.x.common.api.systitle.param.TitleSortCheckRequest;
import com.x.common.dao.mapper.bo.SysTitle;

public interface ISysTitleAtomSV {

	int count(TitleQueryListRequest request);

	List<SysTitle> queryList(TitleQueryListRequest request);

	SysTitle selectById(String id);

	void insert(SysTitle sysTitle);

	void update(SysTitle sysTitle);

	int delete(String id);

	int duplicateCheck(TitleSortCheckRequest request);

	List<SysTitle> querySysTitleList(String local, String site);

	List<SysTitle> queryTitle(String regionalLanguage);

}

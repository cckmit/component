package com.x.common.service.atom.sysmailinformation;

import java.util.List;

import com.x.common.dao.mapper.bo.SysMailInformation;

public interface ISysMailInformationAtomSV {

	void save(SysMailInformation information);

	SysMailInformation query(String id);
	
	List<SysMailInformation> queryByUid(String id);
	
	void modify(SysMailInformation mailInformation);

	void delete(String id);

}

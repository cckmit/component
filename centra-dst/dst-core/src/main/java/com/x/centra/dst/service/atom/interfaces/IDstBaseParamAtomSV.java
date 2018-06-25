package com.x.centra.dst.service.atom.interfaces;

import java.util.List;

import com.x.centra.dst.dao.mapper.bo.DstBaseParam;
import com.x.centra.dst.dao.mapper.bo.DstBaseParamCriteria;

public interface IDstBaseParamAtomSV {

	List<DstBaseParam> selectByExample(DstBaseParamCriteria example);
	
	List<DstBaseParam> selectByParamType(String tenantId, String paramType);
}

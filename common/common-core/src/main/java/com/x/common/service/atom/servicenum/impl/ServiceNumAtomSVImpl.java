package com.x.common.service.atom.servicenum.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.common.dao.mapper.bo.GnServiceNum;
import com.x.common.dao.mapper.bo.GnServiceNumCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.service.atom.servicenum.IServiceNumAtomSV;
import com.x.sdk.util.CollectionUtil;

@Component
public class ServiceNumAtomSVImpl implements IServiceNumAtomSV {

	@Override
	public GnServiceNum getServiceNumByPhone(String phone) {
		GnServiceNumCriteria cond=new GnServiceNumCriteria();
		cond.or().andServiceNumCodeEqualTo(phone);
		List<GnServiceNum> list=MapperFactory.getGnServiceNumMapper().selectByExample(cond);
		if(!CollectionUtil.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}

	@Override
	public Integer getServiceNumCount() {
		GnServiceNumCriteria sql = new GnServiceNumCriteria();
        return MapperFactory.getGnServiceNumMapper().countByExample(sql);
	}

	@Override
	public List<GnServiceNum> getServiceNumList(int pageNo, int pageSize) {
		GnServiceNumCriteria sql = new GnServiceNumCriteria();
        sql.setLimitStart((pageNo-1)*pageSize);
        sql.setLimitEnd(pageSize);
        return MapperFactory.getGnServiceNumMapper().selectByExample(sql);
	}

}

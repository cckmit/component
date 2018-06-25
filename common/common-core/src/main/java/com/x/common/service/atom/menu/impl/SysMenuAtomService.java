package com.x.common.service.atom.menu.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.common.dao.mapper.bo.SysMenu;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.service.atom.menu.ISysMenuAtomService;

@Component
public class SysMenuAtomService implements ISysMenuAtomService{


	@Override
	public List<SysMenu> findByUserId(String userId) {
		return MapperFactory.getSysMenuMapper().findByUserId(userId);
	}

	

}

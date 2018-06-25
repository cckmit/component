package com.x.common.service.atom.menu;

import java.util.List;

import com.x.common.dao.mapper.bo.SysMenu;

public interface ISysMenuAtomService {
	
	 List<SysMenu> findByUserId(String userId);
}

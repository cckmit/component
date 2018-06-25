package com.x.common.dao.mapper.attach;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.x.common.dao.mapper.bo.SysAdvertManager;
public interface AdvertAttachMapper {

	@Select("SELECT DISTINCT advertising_position FROM sys_advert_manager where site =#{site} and regional_language =#{regionalLanguage}")
	@ResultMap("com.x.common.dao.mapper.interfaces.SysAdvertManagerMapper.BaseResultMap")
	public List<SysAdvertManager> querySysAdvertList(@Param("regionalLanguage") String regionalLanguage,@Param("site") String site);
}

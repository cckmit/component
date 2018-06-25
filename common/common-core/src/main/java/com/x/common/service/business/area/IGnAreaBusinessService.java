package com.x.common.service.business.area;
        
import java.util.List;

import com.x.base.vo.PageInfo;
import com.x.common.api.area.param.GnAreaCodeCondition;
import com.x.common.api.area.param.GnAreaCondition;
import com.x.common.api.area.param.GnAreaPageCondition;
import com.x.common.api.area.param.GnAreaPageFilterCondition;
import com.x.common.api.area.param.GnAreaResponse;
import com.x.common.api.area.param.GnAreaVo;
import com.x.common.dao.mapper.bo.GnArea;

public interface IGnAreaBusinessService {
    List<GnArea> select(GnAreaCondition condition);
    GnArea selectByID(String areaCode);
    
    List<GnArea> getProvinceList() ;
    List<GnArea> getParentAreaListByAreaCode(GnAreaCodeCondition condition) ;
    List<GnArea> getNationList();
    List<GnArea> getCityListByProviceCode(String provinceCode);
    List<GnArea> getCountyListByCityCode(String cityCode);
    List<GnArea> getStreetListByCountyCode(String countyCode);
    List<GnArea> getAreaListByStreetCode(String streetCode);
    
    PageInfo<GnAreaVo> getAreaListByPage(GnAreaPageCondition areaPage);
    PageInfo<GnAreaVo> getFilterAreaListByPage(GnAreaPageFilterCondition areaPage);
    
    String addArea(GnAreaVo area);
    void modifyArea(GnAreaVo area);
    void deleteArea(GnAreaCondition gnAreaCondition);
    void deleteAreas(List<GnAreaCondition> gnAreaCondition);
    
    List<GnArea> selectByName(GnAreaCondition condition);
	GnAreaResponse getAllAreaByLessThanLevel(GnAreaCondition condition);
	GnAreaResponse getAllAreaByLessThanOrEqualLevel(GnAreaCondition condition);
    
}

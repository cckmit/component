package com.x.common.service.atom.region.impl;

import com.x.common.api.region.key.RegionCacheKey;
import com.x.common.dao.mapper.bo.GnRegion;
import com.x.common.dao.mapper.bo.GnRegionCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.service.atom.region.IGnRegionAtomSV;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by liutong on 16/12/8.
 */
@Component
public class GnRegionAtomSVImpl implements IGnRegionAtomSV {
    /**
     * 查询所有的区域信息
     *
     * @return
     */
    @Override
    public List<GnRegion> selectAllRegion() {
        GnRegionCriteria example = new GnRegionCriteria();
        return MapperFactory.getGnRegionMapper().selectByExample(example);
    }

    /**
     * 查询指定英文名的区域
     *
     * @param enName
     * @return
     */
    @Override
    public List<GnRegion> selectByEnName(String enName) {
        return null;
    }

    /**
     * 根据region_code更新区域信息
     *
     * @param gnRegion
     * @return
     */
    @Override
    public int updateByCode(GnRegion gnRegion) {
        return 0;
    }

    /**
     * 查询所有的国家区域信息
     * @return
     */
    @Override
    public List<GnRegion> selectCountry(){
        GnRegionCriteria example = new GnRegionCriteria();
        GnRegionCriteria.Criteria criteria = example.createCriteria();
        //级别为国家
        criteria.andRegionLevelEqualTo(RegionCacheKey.RegionLevel.COUNTRY);
        return MapperFactory.getGnRegionMapper().selectByExample(example);
    }
}

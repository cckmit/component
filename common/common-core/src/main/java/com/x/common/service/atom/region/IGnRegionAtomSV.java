package com.x.common.service.atom.region;

import java.util.List;

import com.x.common.dao.mapper.bo.GnRegion;

/**
 * Created by liutong on 16/12/8.
 */
public interface IGnRegionAtomSV {

    /**
     * 查询所有的区域信息
     * @return
     */
    public List<GnRegion> selectAllRegion();

    /**
     * 查询指定英文名的区域
     * @param enName
     * @return
     */
    public List<GnRegion> selectByEnName(String enName);

    /**
     * 根据region_code更新区域信息
     * @param gnRegion
     * @return
     */
    public int updateByCode(GnRegion gnRegion);

    /**
     * 查询所有的国家区域信息
     * @return
     */
    public List<GnRegion> selectCountry();
}

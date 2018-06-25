package com.x.common.service.atom.tdictarearegion;

import java.util.List;

import com.x.common.dao.mapper.bo.GnArea;
import com.x.common.dao.mapper.bo.GnTDicAreaRegion;
import com.x.common.dao.mapper.bo.SysOffice;

/**
 * Created by auth on 2017-01-09.
 */
public interface IGnTDicAreaRegionAtomSV {

    /**
     * 查询所有的区域信息
     * @return
     */
    public List<GnTDicAreaRegion> selectAllDicAreaRegion();

    /**
     * 根据areacode查询区域
     * @param enName
     * @return
     */
    public GnTDicAreaRegion selectByAreaCode(String areacode);
    /**
     * 查询所有的区域信息GnArea
     * @return
     */
    public List<GnArea> getAllGnArea();
    
    /**
     * 查询所有部门
     * @return
     */
    public List<SysOffice> getAllOffice();
}

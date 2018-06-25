package com.x.common.service.atom.idustry;

import java.util.List;

import com.x.common.dao.mapper.bo.GnIndustry;
import com.x.common.dao.mapper.bo.GnIndustryCriteria;

public interface IIdustryAtomSV {

    List<GnIndustry> selectByExample(GnIndustryCriteria example);

    GnIndustry selectByPrimaryKey(String industryCode);
}

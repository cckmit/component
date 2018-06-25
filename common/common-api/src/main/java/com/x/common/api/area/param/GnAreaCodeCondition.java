package com.x.common.api.area.param;

import com.x.base.vo.BaseInfo;

/**
 * 区域查询条件<br>
 * Date: 2016年5月30 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 *
 * @author auth
 */
public class GnAreaCodeCondition extends BaseInfo {
    private static final long serialVersionUID = 1L;

    /**
     * 区域编码
     */
    private String areaCode;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

}

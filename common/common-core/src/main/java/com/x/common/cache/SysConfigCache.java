package com.x.common.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.x.common.service.business.sysconfig.IQuerySysConfigBusiSV;
import com.x.sdk.cache.base.AbstractCache;

/**
 * 将基本设置信息进行缓存。
 * Created by jackieliu on 2017/6/14.
 */
@Component
public class SysConfigCache extends AbstractCache {

    @Autowired
    IQuerySysConfigBusiSV sysConfigBusiSV;

    @Override
    public void write() throws Exception {
        sysConfigBusiSV.updateCache();
    }
}

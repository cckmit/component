package com.x.centra.product.web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.x.common.api.cache.interfaces.ICacheSV;
import com.x.common.api.cache.param.SysParam;
import com.x.common.api.cache.param.SysParamMultiCond;
import com.x.centra.product.web.constants.ComCacheConstants;
import com.x.centra.product.web.util.AdminUtil;
import com.x.sdk.dubbo.util.DubboConsumerFactory;

/**
 * Created by jackieliu on 16/8/31.
 */
@Service
public class StorageService {
    /**
     * 获取库存状态字典信息
     * @return
     */
    public Map<String,SysParam> getStorageStatus(){
        ICacheSV cacheSV = DubboConsumerFactory.getService(ICacheSV.class);
        SysParamMultiCond multiCond = new SysParamMultiCond(AdminUtil.getTenantId(),
                ComCacheConstants.StateStorage.STORAGE_TYPR_CODE, ComCacheConstants.StateStorage.PARAM_CODE);
        List<SysParam> sysParamList = cacheSV.getSysParamList(multiCond);
        Map<String,SysParam> paramMap = new HashMap<>();
        for (SysParam sysParam:sysParamList){
            paramMap.put(sysParam.getColumnValue(),sysParam);
        }
        return paramMap;
    }
}

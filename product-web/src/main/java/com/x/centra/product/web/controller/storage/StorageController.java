package com.x.centra.product.web.controller.storage;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.x.common.api.cache.interfaces.ICacheSV;
import com.x.common.api.cache.param.SysParam;
import com.x.common.api.cache.param.SysParamSingleCond;
import com.x.base.exception.BusinessException;
import com.x.base.vo.BaseListResponse;
import com.x.base.vo.BaseMapResponse;
import com.x.base.vo.ResponseHeader;
import com.x.centra.product.api.product.interfaces.IProductSV;
import com.x.centra.product.api.product.param.SkuInfo;
import com.x.centra.product.api.product.param.SkuSetForProduct;
import com.x.centra.product.api.product.param.StoGroupInfoQuery;
import com.x.centra.product.api.product.param.StorageInfoQuery;
import com.x.centra.product.api.productcat.param.ProdCatInfo;
import com.x.centra.product.api.storage.interfaces.IStorageSV;
import com.x.centra.product.api.storage.param.SkuStorageInfo;
import com.x.centra.product.api.storage.param.StorageGroupQuery;
import com.x.centra.product.api.storage.param.StorageGroupRes;
import com.x.centra.product.api.storage.param.StorageRes;
import com.x.centra.product.api.storage.param.StorageUniQuery;
import com.x.centra.product.web.constants.ComCacheConstants;
import com.x.centra.product.web.controller.product.ProdQueryController;
import com.x.centra.product.web.service.ProdCatService;
import com.x.centra.product.web.service.StandedProdService;
import com.x.centra.product.web.service.StorageService;
import com.x.centra.product.web.util.AdminUtil;
import com.x.sdk.dubbo.util.DubboConsumerFactory;
import com.x.sdk.web.model.ResponseData;

@Controller
@RequestMapping("/storage")
public class StorageController {
    private static final Logger LOG = LoggerFactory.getLogger(ProdQueryController.class);

    @Autowired
    private ProdCatService prodCatService;
    @Autowired
    private StandedProdService standedProdService;
    @Autowired
    private StorageService storageService;

    /**
     * 显示标准品库存编辑页面
     *
     * @param standedProdId
     * @return
     */
    @RequestMapping("/{id}")
    public String storageEdit(@PathVariable("id") String standedProdId, Model uiModel) {
        //获取标准品信息
        standedProdService.getInfo(standedProdId,uiModel);

        //查询库存组和库存信息
        StorageGroupQuery storageGroupQuery = new StorageGroupQuery();
        storageGroupQuery.setTenantId(AdminUtil.getTenantId());
        storageGroupQuery.setSupplierId(AdminUtil.getSupplierId());
        storageGroupQuery.setProductId(standedProdId);
        IStorageSV storageSV = DubboConsumerFactory.getService(IStorageSV.class);
        BaseListResponse<StorageGroupRes> storageGroupResList = storageSV.queryGroupInfoByNormProdId(storageGroupQuery);
        Map<String,SysParam> paramMap = storageService.getStorageStatus();
        ICacheSV cacheSV = DubboConsumerFactory.getService(ICacheSV.class);
        SysParamSingleCond paramSingleCond = new SysParamSingleCond();
        paramSingleCond.setTenantId(AdminUtil.getTenantId());
        paramSingleCond.setTypeCode(ComCacheConstants.StateStorage.STORAGEGROUP_TYPR_CODE);
        paramSingleCond.setParamCode(ComCacheConstants.StateStorage.PARAM_CODE);
        for (StorageGroupRes storageGroupRes : storageGroupResList.getResult()) {
            // 获取库存组状态名
            paramSingleCond.setColumnValue(storageGroupRes.getState());
            String stateName = cacheSV.getSysParamSingle(paramSingleCond).getColumnDesc();
            storageGroupRes.setStateName(stateName);
            // 库存组优先级
            for (List<StorageRes> storageResList : storageGroupRes.getStorageList().values()) {
                // 获取库存状态名
                for (StorageRes storageRes : storageResList) {
                    SysParam param = paramMap.get(storageRes.getState());
                    if (param!=null){
                    	storageRes.setStateName(param.getColumnDesc());
                    }
                }
            }
        }
        uiModel.addAttribute("storGroupList", storageGroupResList.getResult());
        return "storage/storageEdit";
    }



    /**
     * 进入页面调用-加载类目
     */
    @RequestMapping(value = {"","/","/list"})
    public String editQuery(Model uiModel) {
        List<ProdCatInfo> productCatMap = prodCatService.loadRootCat();
        uiModel.addAttribute("count", productCatMap.size() - 1);
        uiModel.addAttribute("catInfoList", productCatMap);
        return "storage/storageList";
    }

    /**
     * 获取库存组的SKU
     * @param groupId
     * @return
     */
    @RequestMapping("/sku/{id}")
    @ResponseBody
    public ResponseData<SkuSetForProduct> querySku(@PathVariable("id")String groupId){
        ResponseData<SkuSetForProduct> responseData;
        IProductSV productSV = DubboConsumerFactory.getService(IProductSV.class);
        StoGroupInfoQuery infoQuery = new StoGroupInfoQuery();
        infoQuery.setTenantId(AdminUtil.getTenantId());
        infoQuery.setSupplierId(AdminUtil.getSupplierId());
        infoQuery.setGroupId(groupId);
        SkuSetForProduct skuSetForProduct = productSV.querySkuSetForGroup(infoQuery);
        ResponseHeader header = skuSetForProduct.getResponseHeader();
        //保存错误
        if (header!=null && !header.isSuccess()){
            responseData = new ResponseData<SkuSetForProduct>(
                    ResponseData.AJAX_STATUS_FAILURE, "获取信息失败 "+header.getResultMessage());
        }else{
            responseData = new ResponseData<SkuSetForProduct>(
                    ResponseData.AJAX_STATUS_SUCCESS, "OK",skuSetForProduct);
        }
        return responseData;
    }
    /**
     * 获取库存下SKU库存的信息
     * @param storageId
     * @return
     */
    @RequestMapping("/skuSto/{id}")
    @ResponseBody
    public ResponseData<SkuSetForProduct> querySkuStorage(@PathVariable("id")String storageId,String groupId){
        ResponseData<SkuSetForProduct> responseData;
        IProductSV productSV = DubboConsumerFactory.getService(IProductSV.class);
        StorageInfoQuery infoQuery = new StorageInfoQuery();
        infoQuery.setTenantId(AdminUtil.getTenantId());
        infoQuery.setSupplierId(AdminUtil.getSupplierId());
        infoQuery.setStorageId(storageId);
        SkuSetForProduct skuSetForProduct = productSV.querySkuSetForStorage(infoQuery);
        ResponseHeader header = skuSetForProduct.getResponseHeader();
        try {
            //保存错误
            if (header!=null && !header.isSuccess()){
                throw new BusinessException(header.getResultCode(),header.getResultMessage());
            }
            IStorageSV storageSV = DubboConsumerFactory.getService(IStorageSV.class);
            StorageUniQuery query = new StorageUniQuery();
            query.setTenantId(AdminUtil.getTenantId());
            query.setSupplierId(AdminUtil.getSupplierId());
            query.setStorageId(storageId);
            //获取SKU库存信息
            BaseMapResponse<String, SkuStorageInfo> mapResponse = storageSV.querySkuStorageById(query);
            header = skuSetForProduct.getResponseHeader();
            if (header!=null && !header.isSuccess()){
                throw new BusinessException(header.getResultCode(),header.getResultMessage());
            }
            Map<String, SkuStorageInfo> infoMap = mapResponse.getResult();
            List<SkuInfo> skuInfoList = skuSetForProduct.getSkuInfoList();
            for (SkuInfo skuInfo:skuInfoList){
                SkuStorageInfo info = infoMap.get(skuInfo.getSkuId());
                if (info!=null){
                	skuInfo.setTotalNum(info.getTotalNum());
                }
            }
            responseData = new ResponseData<>(
                    ResponseData.AJAX_STATUS_SUCCESS, "OK",skuSetForProduct);
        }catch (BusinessException ex){
            LOG.error("error", ex);
            responseData = new ResponseData<>(
                    ResponseData.AJAX_STATUS_FAILURE, "获取信息失败 "+ex.getMessage());
        }

        return responseData;
    }
}

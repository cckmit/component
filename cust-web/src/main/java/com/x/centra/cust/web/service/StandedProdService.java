package com.x.centra.cust.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.x.common.api.cache.interfaces.ICacheSV;
import com.x.common.api.cache.param.SysParam;
import com.x.common.api.cache.param.SysParamSingleCond;
import com.x.centra.cust.web.constants.ComCacheConstants;
import com.x.centra.cust.web.constants.ProductCatConstants;
import com.x.centra.cust.web.util.AdminUtil;
import com.x.centra.product.api.normproduct.interfaces.INormProductSV;
import com.x.centra.product.api.normproduct.param.AttrMap;
import com.x.centra.product.api.normproduct.param.AttrQuery;
import com.x.centra.product.api.normproduct.param.NormProdInfoResponse;
import com.x.centra.product.api.normproduct.param.NormProdUniqueReq;
import com.x.sdk.dubbo.util.DubboConsumerFactory;

@Service
public class StandedProdService {

    @Autowired
    private ProdCatService prodCatService;
    @Autowired
    private AttrAndValService attrAndValService;
    public NormProdInfoResponse getInfo(String standedProdId,Model uiModel){
        //标准品ID
        uiModel.addAttribute("standedProdId", standedProdId);
        //查询标准品信息
        NormProdUniqueReq normProdUniqueReq = new NormProdUniqueReq();
        normProdUniqueReq.setProductId(standedProdId);
        normProdUniqueReq.setTenantId(AdminUtil.getTenantId());
        normProdUniqueReq.setSupplierId(AdminUtil.getSupplierId());
        INormProductSV normProductSV = DubboConsumerFactory.getService(INormProductSV.class);
        NormProdInfoResponse normProdInfoResponse = normProductSV.queryProducById(normProdUniqueReq);
        uiModel.addAttribute("normProdInfo", normProdInfoResponse);
        //查询类目链
        uiModel.addAttribute("catLinkList", prodCatService.queryLink(normProdInfoResponse.getProductCatId()));
        uiModel.addAttribute("productCatId", normProdInfoResponse.getProductCatId());
        //商品类型
        SysParamSingleCond paramSingleCond = new SysParamSingleCond();
        paramSingleCond.setTenantId(AdminUtil.getTenantId());
        paramSingleCond.setTypeCode(ComCacheConstants.TypeProduct.CODE);
        paramSingleCond.setParamCode(ComCacheConstants.TypeProduct.PROD_PRODUCT_TYPE);
        paramSingleCond.setColumnValue(normProdInfoResponse.getProductType());
        ICacheSV cacheSV = DubboConsumerFactory.getService(ICacheSV.class);
        SysParam sysParam = cacheSV.getSysParamSingle(paramSingleCond);
        uiModel.addAttribute("prodType", sysParam.getColumnDesc());
        //标准品关键属性
        AttrQuery attrQuery = new AttrQuery();
        attrQuery.setTenantId(AdminUtil.getTenantId());
        attrQuery.setProductId(normProdInfoResponse.getProductId());
        attrQuery.setAttrType(ProductCatConstants.ProductCatAttr.AttrType.ATTR_TYPE_KEY);
        AttrMap attrMap = normProductSV.queryAttrByNormProduct(attrQuery);
        uiModel.addAttribute("keyAttr", attrAndValService.getAttrAndVals(attrMap));
        //查询销售属性
        attrQuery.setAttrType(ProductCatConstants.ProductCatAttr.AttrType.ATTR_TYPE_SALE);
        attrMap = normProductSV.queryAttrByNormProduct(attrQuery);
        uiModel.addAttribute("saleAttr", attrAndValService.getAttrAndVals(attrMap));

        return normProdInfoResponse;
    }
}

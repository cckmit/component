package com.x.centra.cust.web.vo;

import com.x.centra.product.api.product.param.SkuSetForProduct;

/**
 * Created by jackieliu on 16/9/28.
 */
public class SkuPriceVo extends SkuSetForProduct {
    /**
     * 是否需要更新价格
     */
    private boolean isUpPrice;

    public boolean isUpPrice() {
        return isUpPrice;
    }

    public void setUpPrice(boolean upPrice) {
        isUpPrice = upPrice;
    }
}

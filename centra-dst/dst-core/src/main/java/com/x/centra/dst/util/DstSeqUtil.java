package com.x.centra.dst.util;

import com.x.centra.dst.constants.DiscountConstants.Seq;
import com.x.sdk.component.sequence.util.SeqUtil;

/**
 * seq 工具类
 * @author wangluyang
 *
 */
public final class DstSeqUtil {

    private DstSeqUtil() {}

    /**
     * 权益信息id
     * @return
     */
    public static String getDiscountInfoId() {
        return SeqUtil.getNewId(Seq.DST_DISCOUNT_INFO_DISCOUNT_ID_SEQ,10);
    }
    
    /**
     * 权益规则id
     * @return
     */
    public static String getDiscountRuleId() {
        return SeqUtil.getNewId(Seq.DST_DISCOUNT_RULE_DISCOUNT_RULE_ID_SEQ,10);
    }
    
    /**
     * 权益类型id
     * @return
     */
    public static String getDiscountClassId() {
        return SeqUtil.getNewId(Seq.DST_DISCOUNT_CLASS_CLASS_ID_SEQ,10);
    }
    
    /**
     * 权益级别id
     * @return
     */
    public static String getDiscountLevelId() {
        return SeqUtil.getNewId(Seq.DST_DISCOUNT_LEVEL_LEVEL_ID_SEQ,10);
    }
    
    /**
     * 会员权益主体实例id
     * @return
     */
    public static String getDiscountInstanceId() {
        return SeqUtil.getNewId(Seq.DST_CUST_DISCOUNT_INSTANCE_INSTANCE_ID_SEQ,10);
    }
}

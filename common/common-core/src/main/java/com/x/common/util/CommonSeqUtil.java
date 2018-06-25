package com.x.common.util;

import com.x.common.constants.Constants;
import com.x.sdk.component.sequence.util.SeqUtil;

/**
 * 
 *
 * Date: 2015年10月20日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public final class CommonSeqUtil {

    private CommonSeqUtil() {
    }

    public static String getAreaCode() {
        return SeqUtil.getNewId(Constants.SEQ.AREA_CODE_SEQ).toString();
    }

    public static int getGnCountryId(){
        Long id = SeqUtil.getNewId(Constants.SEQ.GN_COUNTRY_ID_SEQ);
        return id.intValue();
    }
}

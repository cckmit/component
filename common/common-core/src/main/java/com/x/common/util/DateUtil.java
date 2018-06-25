package com.x.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jackieliu on 2017/6/19.
 */
public final class DateUtil {

    private static final String CRON_DATE_FORMAT = "ss mm HH dd MM ? yyyy";

    private DateUtil(){}

    /***
     * 将时间转换为cron形式
     *
     * @param date 时间
     * @return cron类型的日期
     */
    public static String getCron(final Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(CRON_DATE_FORMAT);
        String formatTimeStr = "";
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }
}

package com.x.common.api.region.key;

/**
 * Created by liutong on 16/12/8.
 */
public class RegionCacheKey {
    public final static class RegionLevel{
        private RegionLevel(){}
        /**
         * 国家
         */
        public static final int COUNTRY = 0;

        /**
         * 省份
         */
        public static final int PROVINCE = 1;

        /**
         * 城市
         */
        public static final int CITY = 2;
    }

    private static final String GN_REGION_PREFIX = "GN_REGION_PRE_";

    /**
     * 国家区域code缓存KEY
     */
    public static final String GN_REGION_COUNTRY_KEY = GN_REGION_PREFIX+"COUNTRY";
    /**
     * 区域的下级区域code缓存KEY
     */
    public static final String GN_REGION_PARENT_KEY = GN_REGION_PREFIX+"PARENT";
    /**
     * 所有区域信息的缓存KEY
     */
    public static final String GN_REGION_INFO_KEY = GN_REGION_PREFIX+"INFO";
}

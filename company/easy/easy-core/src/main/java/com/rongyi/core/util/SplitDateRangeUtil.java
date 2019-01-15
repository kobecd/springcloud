package com.rongyi.core.util;

import org.springframework.util.StringUtils;

/**
 * @author: yb
 * Description:
 * DATE: 2017/10/31 15:06
 * Package:com.rongyi.coupon.util
 * Project:easy-coupon
 */
public class SplitDateRangeUtil {
    public static final int DATE_SIZE= 2;
    public static final int INDEX_FIRST= 0;
    public static final int INDEX_SECOND= 1;
    public static final String REGEX_FIRST = "~";
    public static final String REGEX_SECOND = ",";
    public static final String REGEX_THIRD = "-";
    /**
     * 从时间范围中获取第一个或第二个时间
     * @param dateRange 时间范围
     * @param index 第几个
     * @return
     */
    public static String getDateFromDateRange(String dateRange,String  regex, int index) {
        if (StringUtils.isEmpty(dateRange) || (index != INDEX_FIRST && index != INDEX_SECOND)) {
            return null;
        }else{
            String[] dateRanges=dateRange.split(regex);
            if (dateRanges.length != DATE_SIZE) {
                return null;
            }
            return dateRanges[index];
        }
    }
}

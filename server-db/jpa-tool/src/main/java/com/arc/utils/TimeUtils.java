package com.arc.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author why
 */
public class TimeUtils {
    public static final String DD_FORMAT = "yyyy-MM-dd";
    public static final String HHMMSS_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static String getTimeStr(Date dt,String formatStr){
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(dt);
    }
}

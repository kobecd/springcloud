package com.arc.poi.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: 叶超
 * @since: 2019/2/15 9:37
 */
public class CalendarUtil {

    /**
     * 日期时间格式(yyyyMMddHHmmss)
     */
    public static final SimpleDateFormat FORMAT_DATETIME_SIMPLE_FULL = new SimpleDateFormat("yyyyMMddHHmmss");


    /**
     * 获得当天零时零分零秒
     *
     * @return
     */
    public static Date getToday() {
        return getZero(new Date());
    }

    public static Date getZero(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);// 时
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        // 分
        calendar.set(Calendar.MINUTE, 0);
        //秒
        calendar.set(Calendar.SECOND, 0);
        //毫秒
        calendar.set(Calendar.MILLISECOND, 0);

        return calendar.getTime();

    }


    /**
     * 获取指定时间内的那一天的 最后一秒
     *
     * @param now
     * @return
     */
    public static Date getEndDate(Date now) {
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        return c.getTime();
    }

    /**
     * 两个时间的间隔秒
     *
     * @param one
     * @param other
     * @return
     */
    public static int getBetweenTime(Date one, Date other) {
        return (int) (Math.abs(one.getTime() - other.getTime()) / 1000);
    }


    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date parse = simpleDateFormat.parse("2019-02-15 09:46:40.999");
        Date parse0 = simpleDateFormat.parse("2019-02-15 00:00:00.000");

        System.out.println(new Date().getTime());
        System.out.println(calendar.getTime().getTime());
        System.out.println(parse.getTime());

        System.out.println(parse0.getTime());

        Date zero = getZero(new Date());
        System.out.println(zero.getTime());

        System.out.println("------------------");

        int betweenTime = getBetweenTime(parse0, getZero(new Date()));
        System.out.println(betweenTime);
        System.out.println(24 * 60 * 60);//86400
        System.out.println("------------------");


    }
}

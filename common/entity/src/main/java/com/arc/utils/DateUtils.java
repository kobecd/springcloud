package com.arc.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期/时间工具类 该类定义一些常用的日期和时间格式
 *
 * @description 提供有关日期/时间的常用静态操作方法
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
public class DateUtils {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    /**
     * 日期格式(yyyyMMdd)
     */
    public static final SimpleDateFormat FORMAT_DATE_SIMPLE = new SimpleDateFormat("yyyyMMdd");

    /**
     * 时间格式(HHmmss)
     */
    public static final SimpleDateFormat FORMAT_TIME_SIMPLE = new SimpleDateFormat("HHmmss");

    /**
     * 小时分钟格式(HHmm)
     */
    public static final SimpleDateFormat FORMAT_HOUR_MINUTE = new SimpleDateFormat("HHmm");

    /**
     * 时间格式(HH:mm:ss)
     */
    public static final SimpleDateFormat FORMAT_TIME_COLON = new SimpleDateFormat("HH:mm:ss");

    /**
     * 日期格式(yyyy-MM-dd)
     */
    public static final SimpleDateFormat FORMAT_DATE_LINE = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 日期时间格式(yyyyMMddHHmmss)
     */
    public static final SimpleDateFormat FORMAT_DATETIME_SIMPLE_FULL = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
     * 日期格式(yyyy-MM-dd HH:mm:ss)
     */
    public static final SimpleDateFormat FORMAT_DATETIME_FULL = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 日期格式:完整日期(yyyy-MM-dd HH:mm:ss,S)
     */
    public static final SimpleDateFormat DATE_TIME_FORMAT_EXAC = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,S");

    /**
     * 日期格式:完整日期(yyyy-MM-dd 00:00:00)
     */
    public static final SimpleDateFormat DATE_TIME_FORMAT_ZERO = new SimpleDateFormat("yyyy-MM-dd 00:00:00");

    /**
     * 日期格式:完整日期(yyyy-MM-dd 23:59:59)
     */
    public static final SimpleDateFormat DATE_TIME_FORMAT_LAST = new SimpleDateFormat("yyyy-MM-dd 23:59:59");

    /**
     * 日期格式:(yyyy)
     */
    public static final SimpleDateFormat FORMAT_DATE_YEAR = new SimpleDateFormat("yyyy");

    /**
     * 将字符串转成日期
     *
     * @param source 日期字符串
     * @param format 格式
     * @return
     */
    public static Date parseDate(String source, DateFormat format) {
        if (source == null)
            return null;
        try {
            return format.parse(source);
        } catch (ParseException e) {
            logger.error("Can not be parsed to date. ", e);
        }
        return null;
    }

    /**
     * 将字符串转成日期
     *
     * @param source  日期字符串
     * @param pattern 格式字符串
     * @return
     */
    public static Date parseDate(String source, String pattern) {
        if (source == null) return null;
        try {
            return new SimpleDateFormat(pattern).parse(source);
        } catch (ParseException e) {
            logger.error("Can not be parsed to date. ", e);
        }
        return null;
    }

    /**
     * 格式化日期
     *
     * @param date   日期
     * @param format 格式
     * @return
     */
    public static String formatDate(Date date, DateFormat format) {
        if (date == null) return null;
        try {
            return format.format(date);
        } catch (Exception e) {
            logger.error("Can not be parsed to date. ", e);
        }
        return null;
    }

    /**
     * 格式化日期
     *
     * @param date   日期
     * @param format 格式
     * @return
     */
    public static String formatDate(Date date, String format) {
        if (date == null) return null;
        try {
            return new SimpleDateFormat(format).format(date);
        } catch (Exception e) {
            logger.error("Can not be parsed to date. ", e);
        }
        return null;
    }

    /**
     * 得到当前时间
     *
     * @return
     */
    public static Date currentDate() {
        return new Date();
    }

    /**
     * 以默认(yyyy-MM-dd HH:mm:ss)格式得到当前时间字符串
     *
     * @return
     */
    public static String formatCurrentDate() {
        return FORMAT_DATETIME_FULL.format(new Date());
    }

    /**
     * 以固定格式得到当前时间字符串
     *
     * @param format 格式
     * @return
     */
    public static String formatCurrentDate(DateFormat format) {
        return format.format(new Date());
    }

    /**
     * 以固定格式化字符串得到当前时间字符串
     *
     * @param format 格式
     * @return
     */
    public static String formatCurrentDate(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    /**
     * 比较两个时间
     *
     * @param source
     * @param target
     * @return 0: source=target, 1: source>target, -1: source<target
     */
    public static int compareDate(Date source, Date target) {
        return source.compareTo(target);
    }

    /**
     * 以同种格式比较两个时间字符串
     *
     * @param source
     * @param target
     * @param format
     * @return 0: source=target, 1: source>target, -1: source<target
     */
    public static int compareDate(String source, String target, DateFormat format) {
        try {
            return format.parse(source).compareTo(format.parse(target));
        } catch (ParseException e) {
            throw new RuntimeException("Exception when compare two date string. ", e);
        }
    }

    /**
     * 以同种格式比较两个时间字符串
     *
     * @param source
     * @param target
     * @param pattern
     * @return 0: source=target, 1: source>target, -1: source<target
     */
    public static int compareDate(String source, String target, String pattern) {
        DateFormat formate = new SimpleDateFormat(pattern);
        try {
            return formate.parse(source).compareTo(formate.parse(target));
        } catch (ParseException e) {
            throw new RuntimeException("Exception when compare two date string. ", e);
        }
    }

    /**
     * 以不同格式比较两个时间字符串
     *
     * @param source
     * @param sourceFormat
     * @param source
     * @param targetFormat
     * @return 0: source=target, 1: source>target, -1: source<target
     */
    public static int compareDate(String source, DateFormat sourceFormat,
                                  String target, DateFormat targetFormat) {
        try {
            return sourceFormat.parse(source).compareTo(targetFormat.parse(target));
        } catch (ParseException e) {
            throw new RuntimeException("Exception when compare two date string. ", e);
        }
    }

    /**
     * 以不同格式比较两个时间字符串
     *
     * @param source
     * @param sourcePattern
     * @param source
     * @param targetPattern
     * @return 0: source=target, 1: source>target, -1: source<target
     */
    public static int compareDate(String source, String sourcePattern,
                                  String target, String targetPattern) {
        try {
            return new SimpleDateFormat(sourcePattern).parse(source).compareTo(
                    new SimpleDateFormat(targetPattern).parse(target));
        } catch (ParseException e) {
            throw new RuntimeException("Exception when compare two date string. ", e);
        }
    }

    /**
     * 比较时间和时间字符串是否相等
     *
     * @param source
     * @param target
     * @param format
     * @return
     */
    public static boolean isEqual(Date source, String target, DateFormat format) {
        return format.format(source).equals(target);
    }

    /**
     * 比较时间和时间字符串是否相等
     *
     * @param source
     * @param target
     * @param pattern
     * @return
     */
    public static boolean isEqual(Date source, String target, String pattern) {
        return new SimpleDateFormat(pattern).format(source).equals(target);
    }

    /**
     * 增加或减少天数
     *
     * @param date
     * @param amount
     * @return
     */
    public static Date addDay(Date date, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, amount);
        return cal.getTime();
    }

    /**
     * 增加或减少天数
     *
     * @param date
     * @param amount
     * @return
     */
    public static String addDay(String date, DateFormat format, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.setTime(parseDate(date, format));
        cal.add(Calendar.DAY_OF_MONTH, amount);
        return format.format(cal.getTime());
    }

    /**
     * 增加或减少月数
     *
     * @param date
     * @param amount
     * @return
     */
    public static String addMonth(String date, DateFormat format, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.setTime(parseDate(date, format));
        cal.add(Calendar.MONTH, amount);
        return format.format(cal.getTime());
    }

    /**
     * 增加或减少日历
     *
     * @param date
     * @param calendarField
     * @param amount
     * @return
     */
    public static Date calendarAdd(Date date, int calendarField, int amount) {
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.setTime(date);
        cal.add(calendarField, amount);
        return cal.getTime();
    }

    /**
     * @param start
     * @param end
     * @return
     */
    public static boolean isMoreThan(String start, String end, long interval) {
        long startTs = DateUtils.parseDate(start, FORMAT_DATETIME_FULL).getTime();
        long endTs = DateUtils.parseDate(end, FORMAT_DATETIME_FULL).getTime();
        return endTs - startTs > interval;
    }


    /**
     * 获取指定时间的那一天的 第一秒
     *
     * @param now
     * @return
     */
    public static Date getBeginDate(Date now) {
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        c.set(Calendar.HOUR_OF_DAY, 00);
        c.set(Calendar.MINUTE, 00);
        c.set(Calendar.SECOND, 00);
        return c.getTime();
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

}

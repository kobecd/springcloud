package com.rongyi.core.util;

import com.rongyi.common.dto.LogReportInfo;
import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.lang.StringUtils;

import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/6/21
 * 数据上报
 */
public class LogReportedUtil {

    private static final String FAIL = "FAIL";
    private static final String SUCCESS = "SUCCESS";
    private static final String ERROR = "ERROR";

    public static String reportLog(LogReportInfo logReportInfo, String url){
        if(logReportInfo == null || StringUtils.isBlank(url)){
            return FAIL;
        }
        Map<String, Object> param = new BeanMap(logReportInfo);
        try{
            HttpClientUtil.sendHttpPostJson(url, param);
            return SUCCESS;
        }catch (Exception e){
            System.err.println(e.getMessage());
            return ERROR;
        }
    }
}

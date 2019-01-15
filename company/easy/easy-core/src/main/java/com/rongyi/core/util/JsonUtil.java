package com.rongyi.core.util;

import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultDefaultValueProcessor;

/**
 * User: WUH
 * Date: 2018/7/10
 */
public class JsonUtil {

    public static JsonConfig rectifyJsonConfig(){
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerDefaultValueProcessor(Integer.class, new DefaultDefaultValueProcessor() {
            public Object getDefaultValue(Class type) {
                return null;
            }
        });
        return jsonConfig;
    }
}

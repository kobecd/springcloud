package com.rongyi.common.enumeration;

/**
 * User: WUH
 * Date: 2018/7/9
 */
public enum LogThirdAppNameTypeEnum {

    WECHAT(1, "微信"),
    BAIDU(2, "百度"),
    SINA(3, "")

    ;

    private int key;
    private String desc;

    LogThirdAppNameTypeEnum(int key, String desc){
        this.key = key;
        this.desc = desc;
    }

    public int getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }
}

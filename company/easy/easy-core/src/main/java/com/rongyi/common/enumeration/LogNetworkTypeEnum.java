package com.rongyi.common.enumeration;

/**
 * User: WUH
 * Date: 2018/7/9
 */
public enum LogNetworkTypeEnum {

    NETWORK_2G(1, "2G"),
    NETWORK_3G(2, "3G"),
    NETWORK_4G(3, "4G"),
    NETWORK_WIFI(4, "WIFI"),
    NETWORK_UNKNOW(99, "未知"),
    ;

    private int key;
    private String desc;

    LogNetworkTypeEnum(int key, String desc){
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

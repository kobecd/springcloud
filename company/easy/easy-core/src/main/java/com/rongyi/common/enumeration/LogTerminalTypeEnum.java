package com.rongyi.common.enumeration;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/6/21
 */
public enum LogTerminalTypeEnum {
    ANDROID(1, "安卓"),
    IOS(2, "ios"),
    H5(3, "h5"),
    WECHAT(4, "微信"),
    SMALL_APP(5, "小程序"),
    WEB(6, "网页");

    private int key;
    private String desc;

    LogTerminalTypeEnum(int key, String desc){
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

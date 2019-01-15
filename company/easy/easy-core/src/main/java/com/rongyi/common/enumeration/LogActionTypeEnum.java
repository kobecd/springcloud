package com.rongyi.common.enumeration;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/6/21
 */
public enum  LogActionTypeEnum {
    SHOW(1, "进入、打开、浏览页面"),
    LEAVE(2, "离开页面"),
    CLICK(3, "点击页面元素"),
    SHARE(4, "分享"),
    SCAN(5, "扫码"),
    LOGIN(6, "登陆"),
    LOGOUT(7, "退出");

    private int key;
    private String desc;

    LogActionTypeEnum(int key, String desc){
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

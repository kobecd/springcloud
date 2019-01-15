package com.rongyi.common.enumeration;

/**
 * User: WUH
 * Date: 2018/7/3
 */
public enum  LogAppNameTypeEnum {
    BSOMS(1, "商家管理后台"),
    RYOMS(2, "大运营管理后台"),
    RONGYIGUAGN_APP(3, "容易逛APP"),
    MOUGOUT_APP(4, "摩购APP"),
    CMS(5, "CMS系统"),
    CRM(6, "摩店CRM系统"),
    WECHART(7, "微信体系应用"),
    OTHER(99, "其他"),
    ;

    private int key;
    private String desc;

    LogAppNameTypeEnum(int key, String desc){
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

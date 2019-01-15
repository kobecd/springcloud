package com.rongyi.core.enumerate.nercoupon;


/**
 * 账号相关错误码常量
 *
 * @author Kenny
 * @ClassName: AccountEnum
 * @Description:
 * @date 2016年10月31日 下午2:49:06
 */
public enum MerchantTypeEnum {
    HEAD(0, "总部"),
    MALL(1, "商场"),
    SHOP(2,"店铺"),
    SINGLE_SHOP(3, "单店铺"),
    ;

    private Integer code;
    private String msg;

    MerchantTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}

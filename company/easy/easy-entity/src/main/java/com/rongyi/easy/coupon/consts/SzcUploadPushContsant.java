package com.rongyi.easy.coupon.consts;

/**
 * Created by yandong on 2017/7/24.
 */
public enum SzcUploadPushContsant {

    INIT(0, "初始化"),
    SUCC(1, "成功"),
    NOT_REGISTER(2, "未注册"),
    REPEAT_PUSH(3, "重复推送"),
    NO_STOCK(5, "库存不足"),
    PUSH_ERROR(4, "推送失败"),
    INTERFACE_ERROR(6, "第三方接口调用失败"),
    ;

    private int code;

    private String msg;

    private SzcUploadPushContsant(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getValue(Integer code){
        if(code == null){
            return null;
        }
        int tempCode = code.intValue();
        SzcUploadPushContsant[] values = SzcUploadPushContsant.values();
        for(SzcUploadPushContsant value : values){
            if(value.getCode() == tempCode){
                return value.getMsg();
            }
        }
        return null;
    }
}

package com.rongyi.core.enumerate;

import com.rongyi.core.framework.exception.IErrorCode;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/12 11:45
 * Package:com.rongyi.core.enumerate
 * Project:easy-coupon
 */
public enum BaseErrorCodeEnum implements IErrorCode {
    ERROR_SYSTEM(1000001,"系统错误，请稍后重试"),
    ERROR_UNLOGIN(1000002,"对不起，请先登录"),
    ERROR_NO_INDENTITY(1000003,"对不起，您没有操作权限"),
    ERROR_REQUEST_TYPE(1000004,"对不起，您的请求类型不匹配"),
    ERROR_NULL_PARAM(1000005,"对不起，请求参数不能为空"),
    ERROR_URL_NOT_EXSIT(1000006,"对不起，您请求的地址不存在"),

    ;
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    BaseErrorCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getErrorCode() {
        return String.valueOf(code);
    }

    @Override
    public String getErrorMsg() {
        return msg;
    }
}

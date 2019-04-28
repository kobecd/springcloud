package com.arc.security.db.model.enums;

//import com.baomidou.mybatisplus.extension.api.IErrorCode;

/**
 * 错误码
 *
 * @author yechao
 * @date 2019/01/14
 */
public enum ProjectCode {


    SUCCESS(0, "测试成功编码"),
    FAILURE(9999, "测试失败编码");

    private int code;
    private String msg;

    ProjectCode(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

package com.rongyi.easy.tool.code;

/**
 * @author zhengling
 * 工具服务的错误编码
 * 说明：错误码共8位,规则：【3位】错误码前缀+【2位】具体业务编码+【1位】父系统编码+【2】子系统编码
 */
public enum ToolErrorCode {

    /**
     * 图片服务状态码,业务编码[01]
     */
    ERROR_IMAGE_SYSTEM(10001602,"服务器错误!!"),
    ERROR_IMAGE_PARAM_NULL(10701602,"参数%s不能为空!!"),
    ERROR_IMAGE_PARAM_INVALID(10801602,"参数%s的值无效!!"),

    /**
     * 邮件服务状态码,业务编码[02]
     */
    ERROR_MAIL_SYSTEM(10001602,"服务器错误!!"),
    ERROR_MAIL_PARAM_NULL(10701602,"参数%s不能为空!!"),
    ERROR_MAIL_PARAM_INVALID(10801602,"参数%s的值无效!!");

    private int code;
    private String message;

    private ToolErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 替换占位符后的提示内容
     * @param vlaues 占位符替换的值
     * @return
     */
    public String getRealMessage(Object... values){
        return String.format(message, values);
    }
}

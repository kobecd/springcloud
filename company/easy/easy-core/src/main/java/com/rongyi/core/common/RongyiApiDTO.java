package com.rongyi.core.common;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/29 11:12
 * Package:com.rongyi.roa.web.vo
 * Project:easy-common
 */
public class RongyiApiDTO<T> implements Serializable{
    private String userName;//用户
    private String password;//密码
    /**
     * 模块Id 0000（终端机），0001（app），0002（微信），0003-9999（其他，包括发码，活动等）
     */
    private String moduleId;
    private String version;//版本
    private String sign;//签名
    private String timestamp;//时间戳
    private String nonceStr;//随机字符串
    private T param;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}

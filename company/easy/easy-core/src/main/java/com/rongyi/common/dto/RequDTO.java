package com.rongyi.common.dto;

import java.io.Serializable;
import java.util.UUID;

public class RequDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String __traceId = UUID.randomUUID().toString().replaceAll("-", "");// 用于链路跟踪

    /**
     * 应用的ID
     */
    private String appId;// 在apollo系统中登记的appId

    public String get__traceId() {
        return __traceId;
    }

    public void set__traceId(String __traceId) {
        this.__traceId = __traceId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return "RequDTO [__traceId=" + __traceId + ", appId=" + appId + "]";
    }

}

package com.rongyi.core.constant;

/**
 * Description:消息中心异常统一接口
 * Author: yb
 * DATE: 2015/12/29 16:25
 * Package:com.rongyi.exception
 * Project:message-center
 */
public interface IErrorCode {
    /**
     * 获取错误码
     * @return
     */
     int getErrorNo();

    /**
    /**
     * 获取错误信息
     * @return
     */
     String getErrorMessage();
}

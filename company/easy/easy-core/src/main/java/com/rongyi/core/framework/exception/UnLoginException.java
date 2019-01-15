package com.rongyi.core.framework.exception;

import com.rongyi.core.enumerate.BaseErrorCodeEnum;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/12 11:44
 * Package:com.rongyi.core.framework
 * Project:easy-coupon
 */
public class UnLoginException extends BaseException {
    public UnLoginException() {
        super(BaseErrorCodeEnum.ERROR_UNLOGIN);
    }

    public UnLoginException(String message) {
        super(BaseErrorCodeEnum.ERROR_UNLOGIN.getCode(), message);
    }
}

package com.rongyi.core.framework.exception;

import com.rongyi.core.enumerate.BaseErrorCodeEnum;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/12 11:44
 * Package:com.rongyi.core.framework
 * Project:easy-coupon
 */
public class ErrorReqeustTypeException extends BaseException {
    public ErrorReqeustTypeException() {
        super(BaseErrorCodeEnum.ERROR_REQUEST_TYPE);
    }

    public ErrorReqeustTypeException(String message) {
        super(BaseErrorCodeEnum.ERROR_REQUEST_TYPE.getCode(), message);
    }
}

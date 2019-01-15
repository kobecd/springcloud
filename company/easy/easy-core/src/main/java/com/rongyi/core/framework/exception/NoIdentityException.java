package com.rongyi.core.framework.exception;

import com.rongyi.core.enumerate.BaseErrorCodeEnum;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/12 11:44
 * Package:com.rongyi.core.framework
 * Project:easy-coupon
 */
public class NoIdentityException extends BaseException {
    public NoIdentityException() {
        super(BaseErrorCodeEnum.ERROR_NO_INDENTITY);
    }

    public NoIdentityException(String message) {
        super(BaseErrorCodeEnum.ERROR_NO_INDENTITY.getCode(), message);
    }
}

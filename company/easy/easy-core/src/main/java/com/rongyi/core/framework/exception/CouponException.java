package com.rongyi.core.framework.exception;

/**
 * Description:
 * Author: yb
 * DATE: 2016/3/10 11:44
 * Package:com.rongyi.core.framework.exception
 * Project:easy-market
 */
public class CouponException extends BusinessException{

    public CouponException(IErrorCode iErrorCode) {
        super(iErrorCode);
    }

    public CouponException(int errorCode, String message) {
        super(errorCode,message);
    }

    public CouponException(){
        super();
    }

}

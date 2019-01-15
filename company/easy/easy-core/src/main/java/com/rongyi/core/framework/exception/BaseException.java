package com.rongyi.core.framework.exception;

import com.rongyi.core.constant.*;

/**
 * Base Exception
 *
 * @author yaoyiwei
 * @date 2016-05-09
 * @version 1.0
 */
public class BaseException extends RuntimeException {

    private int errorCode;

    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(IErrorCode iErrorCode) {
        super(iErrorCode.getErrorMsg());
        this.errorCode=Integer.parseInt(iErrorCode.getErrorCode());
    }
    public BaseException(int code, String message) {
        super(message);
        this.errorCode = code;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}

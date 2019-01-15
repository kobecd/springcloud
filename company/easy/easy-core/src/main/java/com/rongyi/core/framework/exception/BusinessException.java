package com.rongyi.core.framework.exception;

/**
 * Invalid Parameter Exception
 *
 * @author yaoyiwei
 * @date 2016-06-06
 * @version 1.0
 */
public class BusinessException extends BaseException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BusinessException() {
        super();
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(int errorCode,String message) {
        super(errorCode, message);
    }
    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(IErrorCode iErrorCode) {
        super(iErrorCode);
    }

}

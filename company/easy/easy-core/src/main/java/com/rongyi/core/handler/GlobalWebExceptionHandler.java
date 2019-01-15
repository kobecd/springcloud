package com.rongyi.core.handler;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.core.enumerate.BaseErrorCodeEnum;
import com.rongyi.core.framework.exception.BaseException;
import com.rongyi.core.framework.exception.UnLoginException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: yb
 * Description:controller层，请配置spring 扫描 当前目录
 * DATE: 2017/12/12 15:44
 * Package:com.rongyi.core.aop
 * Project:easy-coupon
 */
//@ControllerAdvice
public class GlobalWebExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger( GlobalWebExceptionHandler.class);

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public ResponseVO couponExceptionHandler(HttpServletRequest req, BaseException e) {
        log.warn("coupon business exception occurred ...", e);
        return ResponseVO.failure(e.getErrorCode(), e.getMessage());
    }
    @ExceptionHandler(value = UnLoginException.class)
    @ResponseBody
    public ResponseVO couponExceptionHandler(HttpServletRequest req, UnLoginException e) {
        log.warn("unlogin ...", e);
        return ResponseVO.failure(e.getErrorCode(), e.getMessage());
    }

    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    @ResponseBody
    public ResponseVO noParam(HttpServletRequest req, HttpMessageNotReadableException e) {
        log.warn("param is null ...", e);
        return ResponseVO.failure(BaseErrorCodeEnum.ERROR_NULL_PARAM.getCode(), BaseErrorCodeEnum.ERROR_NULL_PARAM.getMsg());
    }
    @ExceptionHandler(value = HttpMediaTypeNotSupportedException.class)
    @ResponseBody
    public ResponseVO requestTypeNotSupport(HttpServletRequest req, HttpMediaTypeNotSupportedException e) {
        log.warn("request type not support ...", e);
        return ResponseVO.failure(BaseErrorCodeEnum.ERROR_REQUEST_TYPE.getCode(), BaseErrorCodeEnum.ERROR_REQUEST_TYPE.getMsg());
    }
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseBody
    public ResponseVO requestTypeNotSupport(HttpServletRequest req, NoHandlerFoundException e) {
        log.warn("request url not exist ...", e);
        return ResponseVO.failure(BaseErrorCodeEnum.ERROR_URL_NOT_EXSIT.getCode(), BaseErrorCodeEnum.ERROR_URL_NOT_EXSIT.getMsg());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseVO defaultErrorHandler(HttpServletRequest req, Exception e) {
        log.error("Unexpected exception occurred ...", e);
        return ResponseVO.failure(BaseErrorCodeEnum.ERROR_SYSTEM.getCode(), BaseErrorCodeEnum.ERROR_SYSTEM.getMsg());
    }
    @ExceptionHandler(value = Throwable.class)
    @ResponseBody
    public ResponseVO defaultThrowableHandler(HttpServletRequest req, Throwable e) {
        log.error("Unexpected throwable occurred ...", e);
        return ResponseVO.failure(BaseErrorCodeEnum.ERROR_SYSTEM.getCode(), BaseErrorCodeEnum.ERROR_SYSTEM.getMsg());
    }

}

package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * Author: yb
 * DATE: 2017/7/20 17:43
 * Package:com.rongyi.easy.coupon.vo.szc
 * Project:easy-market
 */
public class SzcSoapParamVO<T> implements Serializable {

    private static final long serialVersionUID = 78532444389148152L;
    //方法名
    private String methodName;
    //方法参数体
    private String body;
    //方法header
    private SzcSoapHeaderVO szcSoapHeaderVO;
    //请求地址
    private String szcUrl;

    private T responseData;

    public T getResponseData() {
        return responseData;
    }

    public void setResponseData(T responseData) {
        this.responseData = responseData;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public SzcSoapHeaderVO getSzcSoapHeaderVO() {
        return szcSoapHeaderVO;
    }

    public void setSzcSoapHeaderVO(SzcSoapHeaderVO szcSoapHeaderVO) {
        this.szcSoapHeaderVO = szcSoapHeaderVO;
    }

    public String getSzcUrl() {
        return szcUrl;
    }

    public void setSzcUrl(String szcUrl) {
        this.szcUrl = szcUrl;
    }
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}

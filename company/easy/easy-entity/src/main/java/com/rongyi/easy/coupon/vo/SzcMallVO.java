package com.rongyi.easy.coupon.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/18 17:11
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-common
 */
public class SzcMallVO implements Serializable {

    private static final long serialVersionUID = -611549211150479018L;
    /** 商场id */
    private String mallId;
    /** 商场名 */
    private String mallName;

    /** 门店码 */
    private String storeCode;

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public SzcMallVO() {
    }

    public SzcMallVO(String mallId, String mallName, String storeCode) {
        this.mallId = mallId;
        this.mallName = mallName;
        this.storeCode = storeCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}

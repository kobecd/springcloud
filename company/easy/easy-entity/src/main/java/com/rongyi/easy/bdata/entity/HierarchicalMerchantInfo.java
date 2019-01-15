package com.rongyi.easy.bdata.entity;


import com.rongyi.easy.bdata.enums.MerchantTypeEnum;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/6/25
 */
public class HierarchicalMerchantInfo implements Serializable {

    /**
     * 当前商户id
     */
    private String merchantId;

    /**
     * 当前商户名
     */
    private String merchantName;

    /**
     * 当前商户父商户id
     */
    private String rootMerchantId;

    /**
     * 当前商户父商户名
     */
    private String rootMerchantName;

    /**
     * 当前商户枚举类
     */
    private MerchantTypeEnum merchantTypeEnum;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getRootMerchantId() {
        return rootMerchantId;
    }

    public void setRootMerchantId(String rootMerchantId) {
        this.rootMerchantId = rootMerchantId;
    }

    public String getRootMerchantName() {
        return rootMerchantName;
    }

    public void setRootMerchantName(String rootMerchantName) {
        this.rootMerchantName = rootMerchantName;
    }

    public MerchantTypeEnum getMerchantTypeEnum() {
        return merchantTypeEnum;
    }

    public void setMerchantTypeEnum(MerchantTypeEnum merchantTypeEnum) {
        this.merchantTypeEnum = merchantTypeEnum;
    }
}

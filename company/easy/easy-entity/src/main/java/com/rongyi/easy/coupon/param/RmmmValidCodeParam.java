package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author 张争平
 * Description ： 极速验券参数
 * time ：2015年8月19日
 * History: 变更记录
 * <author>            <time>          <version>        <desc>
 * 张争平                              2015年8月19日                      1.0           创建文件
 */
public class RmmmValidCodeParam implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String code;//券码
    private Integer codeNum;//券码数量
    private String shopId;
    private String mallId;
    private Integer verifyUserId;
    private String verifyUserName;
    private String source;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getVerifyUserId() {
        return verifyUserId;
    }

    public void setVerifyUserId(Integer verifyUserId) {
        this.verifyUserId = verifyUserId;
    }

    public String getVerifyUserName() {
        return verifyUserName;
    }

    public void setVerifyUserName(String verifyUserName) {
        this.verifyUserName = verifyUserName;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCodeNum() {
        return codeNum==null?1:codeNum;
    }

    public void setCodeNum(Integer codeNum) {
        this.codeNum = codeNum;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}

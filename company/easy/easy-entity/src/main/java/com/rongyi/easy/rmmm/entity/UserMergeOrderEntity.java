package com.rongyi.easy.rmmm.entity;

import java.io.Serializable;

/*
 * Description:  用户订单相关（购物车订单，订单，退款单）
 * Author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming     2017/9/25    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class UserMergeOrderEntity implements Serializable {

    private static final long serialVersionUID = -941286752877882627L;

    private String type;//类型

    private String ids;//记录主键id

    private String buyerId;//买家id

    private String buyerName;//买家name

    private String userPhone;//买家手机号

    public void setType(String type) {
        this.type = type;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getType() {
        return type;
    }

    public String getIds() {
        return ids;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    @Override
    public String toString() {
        return "UserMergeOrderEntity{" +
                "type='" + type + '\'' +
                ", ids='" + ids + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}

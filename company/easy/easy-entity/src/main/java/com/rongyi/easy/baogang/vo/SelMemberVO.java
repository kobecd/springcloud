package com.rongyi.easy.baogang.vo;

import java.io.Serializable;

/*
 * @description:  
 * @author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming     2018/5/4    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class SelMemberVO implements Serializable {

    private static final long serialVersionUID = -288552513397488937L;

    //会员编码
    private String cardNumber;
    //会员手机号
    private String phone;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SelMemberVO{" +
                "cardNumber='" + cardNumber + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}


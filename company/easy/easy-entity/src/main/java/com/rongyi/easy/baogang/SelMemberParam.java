package com.rongyi.easy.baogang;

import java.io.Serializable;

/*
 * @description:  根据手机号或者会员卡号查询 会员信息 参数
 * @author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming     2018/5/4    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class SelMemberParam implements Serializable {

    private static final long serialVersionUID = 1840442623853145792L;

    //会员卡号 或 会员手机号
    private String cardNumber;
    //目的渠道 1宝钢
    private Integer channel;
    //时间戳
    private Long timeStamp;
    //签名
    private String sign;
    //源渠道 1家得利
    private Integer source;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }


    @Override
    public String toString() {
        return "SelMemberParam{" +
                "cardNumber='" + cardNumber + '\'' +
                ", channel=" + channel +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                ", source=" + source +
                '}';
    }
}

package com.rongyi.easy.rpb.vo.v6;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by zengzhimin on 2017/9/6.
 */
public class PaymentStatisticEntityVo implements Serializable {

    private static final long serialVersionUID = -8426312627749811664L;


    //统计订单总数
    private Integer sumOrders;

    //统计交易总金额
    private BigDecimal tradeAmount;

    //总手续费
    private BigDecimal tradeFee;

    //实收总金额
    private BigDecimal payedAmount;

    public Integer getSumOrders() {
        return sumOrders;
    }

    public void setSumOrders(Integer sumOrders) {
        this.sumOrders = sumOrders;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public BigDecimal getTradeFee() {
        return tradeFee;
    }

    public void setTradeFee(BigDecimal tradeFee) {
        this.tradeFee = tradeFee;
    }

    public BigDecimal getPayedAmount() {

       if(tradeAmount!=null && tradeFee!=null){
           return tradeAmount.subtract(tradeFee);
       }
        if(tradeFee ==null){
            return tradeAmount;
        }
        return BigDecimal.ZERO;
    }

    public void setPayedAmount(BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
    }
}

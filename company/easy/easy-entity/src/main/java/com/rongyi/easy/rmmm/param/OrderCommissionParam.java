package com.rongyi.easy.rmmm.param;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author chenjun
 * @date 2017/6/29 17:18
 */
public class OrderCommissionParam implements Serializable{

    private String orderNo;//订单号
    private Integer commissionSettle;//分销佣金结算，1:总部扣除剩余佣金:、2:总部不扣除剩余佣金
    private BigDecimal totalCommission;//总分销佣金
    private BigDecimal promoteCommission;//分销商佣金

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCommissionSettle() {
        return commissionSettle;
    }

    public void setCommissionSettle(Integer commissionSettle) {
        this.commissionSettle = commissionSettle;
    }

    public BigDecimal getTotalCommission() {
        return totalCommission;
    }

    public void setTotalCommission(BigDecimal totalCommission) {
        this.totalCommission = totalCommission;
    }

    public BigDecimal getPromoteCommission() {
        return promoteCommission;
    }

    public void setPromoteCommission(BigDecimal promoteCommission) {
        this.promoteCommission = promoteCommission;
    }

    @Override
    public String toString() {
        return "OrderCommissionParam{" +
                "orderNo='" + orderNo + '\'' +
                ", commissionSettle=" + commissionSettle +
                ", totalCommission=" + totalCommission +
                ", promoteCommission=" + promoteCommission +
                '}';
    }
}

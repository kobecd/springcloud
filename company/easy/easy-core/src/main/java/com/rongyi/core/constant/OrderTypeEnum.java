package com.rongyi.core.constant;

/**
 *      订单类型
 *
 * @author zhuming
 * @date 2017/9/25
 */
public enum OrderTypeEnum {

    FORM("1","订单"),//order_form
    CART_FORM("2","购物车订单"),//order_cart_form
    APPEAL_FORM("3","退款单"),//appeal_form
    TRADE_ORDER("4","卡券单"),//trade_order
    TRADE_REFUND_RECORD("5","卡券退款单"),//trade_refund_record
    TRADE_USER_CODE("6","用户券码"),//trade_user_code
    TRADE_VALID_RECORD("7","验券")//trade_valid_record
    ;

    private String type;

    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    OrderTypeEnum() {
    }

    OrderTypeEnum(String type, String name) {
        this.type = type;
        this.name = name;
    }
}

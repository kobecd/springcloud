package com.rongyi.easy.baogang;

import com.rongyi.easy.code.BaseParam;

/**
 * Created by zengzhimin on 2017/11/23.
 */
public class CouponOrderDetailParam extends BaseParam {

    //商品编号
    private String code;

    //商品名称
    private String goods;

    //商品数量(2位小数)
    private String number;

    //实收金额
    private String amount;

    //商品品类
    private String category;

   //订单金额
    private String price;

    //税率【保留2位小数
    private String tax;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }
}

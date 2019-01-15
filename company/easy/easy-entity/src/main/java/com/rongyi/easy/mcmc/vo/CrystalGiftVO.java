package com.rongyi.easy.mcmc.vo;

/**
 * 晶品的第三方平台礼品信息
 */
public class CrystalGiftVO {

    /**
     * 礼品编号
     */
    private String sn;

    /**
     * 礼品名称
     */
    private String name;

    /**
     * 积分
     */
    private String point;

    /**
     * 库存数量
     */
    private String stock;

    /**
     * 生效日期
     */
    private String effectDate;

    /**
     * 失效日期
     */
    private String cutOffDate;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate;
    }

    public String getCutOffDate() {
        return cutOffDate;
    }

    public void setCutOffDate(String cutOffDate) {
        this.cutOffDate = cutOffDate;
    }
}

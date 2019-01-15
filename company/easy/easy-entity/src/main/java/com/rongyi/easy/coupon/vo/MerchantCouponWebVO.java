package com.rongyi.easy.coupon.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/19 14:40
 * Package:com.rongyi.easy.coupon.vo
 * Project:easy-common
 */
public class MerchantCouponWebVO implements Serializable {

    private static final long serialVersionUID = 8990470431695540572L;

    private String id;

    private String name;

    private Integer couponType;

    private Integer giveOutType;

    /**
     * 卡券发布渠道：大运营平台[0], 商家管理后台[1] 摩店[2]
     */
    private Integer publishChannel;

    private Integer totalCount;

    private Integer stockCount;

    private Date publishStartAt;

    private Date publishEndAt;

    private Integer preferentialType;

    private Integer isThird;
    /**
     * 关联类型
     * 代金券：集团[0],品牌[1], 商场 [2],店铺[3];导购[4]（商家后台导购建的券）;5:总部
     * 平台促销券 ：全场[0]，品牌[1]，商场[2]，店铺[3]、分类[4]，信息[5]
     */
    private Integer relatedType;

    private Integer status;

    private Date createAt;

    private String createUser;

    private Date updateAt;

    private Integer limitCount;

    private Integer limitUseCount;

    private Integer offStock;

    private Integer sended;

    private Date preheatStartAt;

    private Date preheatEndAt;

    private Integer origPrice;

    private Integer currPrice;

    private Integer created;

    public Integer getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(Integer origPrice) {
        this.origPrice = origPrice;
    }

    public Integer getCurrPrice() {
        return currPrice;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public void setCurrPrice(Integer currPrice) {
        this.currPrice = currPrice;
    }

    public Date getPreheatStartAt() {
        return preheatStartAt;
    }

    public void setPreheatStartAt(Date preheatStartAt) {
        this.preheatStartAt = preheatStartAt;
    }

    public Date getPreheatEndAt() {
        return preheatEndAt;
    }

    public void setPreheatEndAt(Date preheatEndAt) {
        this.preheatEndAt = preheatEndAt;
    }

    public Integer getOffStock() {
        return offStock;
    }

    public void setOffStock(Integer offStock) {
        this.offStock = offStock;
    }

    public Integer getSended() {
        return sended;
    }

    public void setSended(Integer sended) {
        this.sended = sended;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getGiveOutType() {
        return giveOutType;
    }

    public void setGiveOutType(Integer giveOutType) {
        this.giveOutType = giveOutType;
    }


    public Integer getPublishChannel() {
        return publishChannel;
    }

    public void setPublishChannel(Integer publishChannel) {
        this.publishChannel = publishChannel;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    public Date getPublishStartAt() {
        return publishStartAt;
    }

    public void setPublishStartAt(Date publishStartAt) {
        this.publishStartAt = publishStartAt;
    }

    public Date getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(Date publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public Integer getPreferentialType() {
        return preferentialType;
    }

    public void setPreferentialType(Integer preferentialType) {
        this.preferentialType = preferentialType;
    }

    public Integer getIsThird() {
        return isThird;
    }

    public void setIsThird(Integer isThird) {
        this.isThird = isThird;
    }

    public Integer getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Integer relatedType) {
        this.relatedType = relatedType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getLimitUseCount() {
        return limitUseCount;
    }

    public void setLimitUseCount(Integer limitUseCount) {
        this.limitUseCount = limitUseCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}

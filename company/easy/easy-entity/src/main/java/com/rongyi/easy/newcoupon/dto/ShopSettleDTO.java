package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/3
 */
@Setter
@Getter
@ToString(callSuper = true)
public class ShopSettleDTO extends BaseDTO {

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名
     */
    private String shopName;

    /**
     * 结算类型0:按金额结算；1：按比例结算
     */
    private Integer chargingType;

    /** 结算金额，单位分 */
    private Integer settlePrice;

    /** 按比例结算的比例 */
    private Double settlePercent;
}

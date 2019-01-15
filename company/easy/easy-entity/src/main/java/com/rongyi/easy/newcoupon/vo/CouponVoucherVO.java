package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/29
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CouponVoucherVO extends BaseVO{
    /** 0:固定减免金额；1：随机减免金额 */
    private Integer abateType;

    /** 固定减免金额 */
    private Double abatePrice;

    private Double minRandomPrice;

    private Double maxRandomPrice;

}

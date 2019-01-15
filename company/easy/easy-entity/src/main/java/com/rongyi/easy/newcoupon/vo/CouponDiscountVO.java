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
public class CouponDiscountVO extends BaseVO {

    private Double discountRate;
}

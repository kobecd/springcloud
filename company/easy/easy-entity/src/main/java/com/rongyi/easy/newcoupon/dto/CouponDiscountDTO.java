package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/10/30
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CouponDiscountDTO implements Serializable {

    private Double discount;
}

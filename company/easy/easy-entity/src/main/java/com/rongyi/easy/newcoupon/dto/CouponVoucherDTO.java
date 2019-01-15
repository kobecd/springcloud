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
public class CouponVoucherDTO implements Serializable {

    /** 0:固定减免金额；1：随机减免金额 */
    private Integer abateType;

    /** 固定减免金额 */
    private Double abatePrice;

    private Double minRandomPrice;

    private Double maxRandomPrice;


}

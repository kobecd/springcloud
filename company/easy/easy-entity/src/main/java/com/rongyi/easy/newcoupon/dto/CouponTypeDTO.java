package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/20 17:15
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString
public class CouponTypeDTO implements Serializable{
    private Integer id;
    private String name;
}

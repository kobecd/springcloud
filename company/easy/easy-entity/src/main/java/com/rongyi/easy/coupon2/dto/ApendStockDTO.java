package com.rongyi.easy.coupon2.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ApendStockDTO implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Long couponId;

    private Integer count;
}

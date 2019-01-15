package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: yb
 * Description:
 * DATE: 2018/1/6 14:03
 * Package:com.rongyi.easy.newcoupon.vo
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString(callSuper = true)
public class MallVipLeverVO extends BaseVO {
    private static final long serialVersionUID = -4299734335558194008L;
    private Integer id;
    private String level;
    private String name;

    public MallVipLeverVO(Integer id, String level,String name) {
        this.id = id;
        this.level = level;
        this.name = name;
    }

    public MallVipLeverVO() {
    }
}

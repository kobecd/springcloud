package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author: yb
 * Description:
 * DATE: 2017/11/30 10:37
 * Package:com.rongyi.easy.newcoupon.dto
 * Project:easy-coupon
 */
@Getter
@Setter
@ToString(callSuper=true)
public class ListCodesParamDTO extends BaseDTO {

    private static final long serialVersionUID = 9219498026175796876L;

    /** 版本号 */
    private String version;

    /** 卡券id */
    private Integer couponId;

    /** couponCode ids */
    private List<Integer> ids;
}

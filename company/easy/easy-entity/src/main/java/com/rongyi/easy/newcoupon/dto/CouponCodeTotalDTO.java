package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/12/27
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CouponCodeTotalDTO extends BaseDTO {
    private Integer id;

    private String version;
}

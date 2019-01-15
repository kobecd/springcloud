package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/14
 */
@Setter
@Getter
@ToString(callSuper = true)
public class ShopQueryDTO extends BaseDTO {
    private String merchantId;

    private String name;

    private String id;
}

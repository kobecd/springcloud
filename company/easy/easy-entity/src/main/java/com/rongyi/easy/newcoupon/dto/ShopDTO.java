package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/2
 */
@Setter
@Getter
@ToString(callSuper = true)
public class ShopDTO extends BaseDTO {

    private String shopId;

    private String shopName;

}

package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/17
 */
@Setter
@Getter
@ToString(callSuper = true)
public class ShopCategoryQueryDTO extends BaseDTO {

    private String mallId;

    private String parentId;

    /**
     * true：查询所有
     */
    private Boolean searchAll;
}

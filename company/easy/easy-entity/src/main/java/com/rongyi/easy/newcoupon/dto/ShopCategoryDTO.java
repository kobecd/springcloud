package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/1/6
 */
@Setter
@Getter
@ToString(callSuper = true)
public class ShopCategoryDTO implements Serializable {

    private String categoryId;

    private String categoryName;
}

package com.rongyi.easy.newcoupon.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2018/1/6
 */
@Setter
@Getter
@ToString(callSuper = true)
public class ShopCategoryVO extends BaseVO {

    private String categoryId;

    private String categoryName;

    private String nodeName;

    private Integer level;
}

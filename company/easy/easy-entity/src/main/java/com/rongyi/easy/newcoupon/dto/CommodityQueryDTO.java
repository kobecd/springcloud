package com.rongyi.easy.newcoupon.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/11/14
 */
@Setter
@Getter
@ToString(callSuper = true)
public class CommodityQueryDTO extends BaseDTO {
    private String merchantId;

    /**
     * 商品编码
     */
    private String commodityCode;

    /**
     * 商品名
     */
    private String commodityName;

    /**
     * 店铺名
     */
    private String shopName;

    /**
     * 分类
     */
    private String categoryId;

    private Integer minStock;

    private Integer maxStock;

    private List<String> commodityIds;

}

package com.rongyi.model.product;

import com.rongyi.model.BaseDO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 产品表
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class ProductSpu extends BaseDO {

    private static final long serialVersionUID = 1L;

    private String spuCode; // spuCode
    private String name; // spu商品名称
    private Integer price; // spu商品售价
    private String notes; // spu商品描述

    private boolean state=false; // spu商品状态
    private String image; // spu商品图片

}
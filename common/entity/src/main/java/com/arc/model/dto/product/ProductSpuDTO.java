package com.arc.model.dto.product;


import com.arc.model.entity.product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 对方的spu的dto 用于接收互道spu信息
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class ProductSpuDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String spuCode; // spuCode
    private String name; // spu商品名称
    private Integer price; // spu商品售价
    private String notes; // spu商品描述
    private String image; // spu商品图片


    private String originPlace; // 原产地【可编辑】
    private String material; // 材质【可编辑】
    private boolean state = false; // spu商品状态

    List<Product> products;//skus

}

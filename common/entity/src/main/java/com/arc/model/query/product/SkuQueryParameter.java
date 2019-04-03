package com.arc.model.query.product;


import com.arc.model.dto.BaseDTO;
import com.arc.model.entity.product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 分页实体类,封装分页的查询条件
 *
 * @author: yechao
 * @date: 2018/08/25 11:25
 * @version: V1.0
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
//Parameter
public class SkuQueryParameter extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String rfidCode; // 近场通讯编码
    private String skuCode; // SKU编码
    private String spuCode; // SPU编码
    private Integer price; // sku显示价格（100X）
    private String name; // 商品名称sku
    private String subtitle; // 商品副标题/英文名称
    private String notes; // sku商品描述
    private String image; // 默认主图default
    private boolean state = false; // 是否可以展示【可编辑】
    private String originPlace; // 原产地【可编辑】
    private String material; // 材质【可编辑】
    private String shortNotes; // 商品简介
    private Date createDate; // 创建时间
    private Date updateDate; // 更新时间
    private Integer spuId; // skuid与spuid对应关系

    private String groupCode; // 分组编号作为查询条件


    List<Product> products=new ArrayList<>(1);//sku的兄弟元素

}

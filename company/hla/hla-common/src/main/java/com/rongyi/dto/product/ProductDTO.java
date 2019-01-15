package com.rongyi.dto.product;


import com.rongyi.dto.BaseDTO;
import com.rongyi.entity.product.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 本项目传输中用的 产品dto
 * 格式化价格
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class ProductDTO extends BaseDTO {

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

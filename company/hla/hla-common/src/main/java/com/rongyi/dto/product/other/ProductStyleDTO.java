package com.rongyi.dto.product.other;


import com.rongyi.dto.BaseDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 产品dto
 * 格式化价格
 */
@Setter
@Getter
@NoArgsConstructor
public class ProductStyleDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;


    private Integer code;//商品分组ID
    private String name; // 商品分组名称
    private String type_zh_name; // 分组类型名称
    private Integer parent_code; // 父级分组ID
    private String notes; // 商品分组描述


}
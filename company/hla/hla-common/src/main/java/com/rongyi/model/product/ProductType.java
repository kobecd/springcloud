package com.rongyi.model.product;

import com.rongyi.model.BaseDO;
import lombok.Getter;
import lombok.Setter;

/**
 * 产品表
 *
 * @author: yechao
 * @date: 2018/08/07 15:27
 * @version: V1.0
 */
@Getter
@Setter
public class ProductType extends BaseDO {

    private static final long serialVersionUID = 1L;

    private Integer code;//商品分组ID

    private String name; // 商品分组名称

    private String type_zh_name; // 分组类型名称

    private Integer parent_code; // 父级分组ID

    private String notes; // 商品分组描述


}